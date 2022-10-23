package org.simpleframework.util;


import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class ClassUtil {

    public static final String FILE_PROTOCOL = "file";

    /**
     * 创建类型所对应的示例
     * @param clazz Class
     * @param accessible 是否支持创建私有class对象的实例
     * @param <T> class的类型
     * @return 类的实例化
     */
    public static <T> T newInstance(Class<?> clazz, boolean accessible){
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(accessible);
            return (T) constructor.newInstance();
        } catch (Exception e) {
            log.error("newInstance error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取指定包下所有类
     * @param packageName 用户指定的包名
     * @return
     */
    public static Set<Class<?>> extractPackageClass(String packageName){
        // 获取类的加载器
        ClassLoader classLoader = getClassLoader();
        // 通过类加载器获取所需的资源对象
        URL url = classLoader.getResource(packageName.replace('.', '/'));
        if(url == null){
            log.warn("unable to retrieve anything from package: " + packageName);
            return null;
        }

        Set<Class<?>> classSet = null;
        // 如果协议类型为文件
        if(url.getProtocol().equalsIgnoreCase(FILE_PROTOCOL)){
            classSet = new HashSet<>();
            // 获取请求文件路径
            File file = new File(url.getPath());
            // 扫描文件下的包和子包并将其添加至classSet
            extractDirctoryClass(file, classSet, packageName);
        }
        // TODO 此处可以处理其他类型的资源
        return classSet;
    }

    /**
     * 递归遍历文件下的所有目录将其类都装入Set中
     * @param fileSource
     * @param emptyClassSet
     * @param packageName
     */
    private static void extractDirctoryClass(File fileSource, Set<Class<?>> emptyClassSet, String packageName) {
        if(!fileSource.isDirectory()){
            return;
        }

        File[] files = fileSource.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {// 过滤掉一些无用文件
                if(file.isDirectory()){
                    return true;
                }else {
                    String absolutePath = file.getAbsolutePath();
                    if(absolutePath.endsWith(".class")){// 类型为.class
                        addToClassSet(absolutePath);
                    }
                }
                return false;
            }
            private void addToClassSet(String absolutePath) {
                // D:\my_workspace\slmpleframework\src\main\java\com\bao\entity\bo\HeadLine.java
                // 需要截取包名 + 类名
                // 把操作系统适配的分隔符换成'.'
                absolutePath = absolutePath.replace(File.separator, ".");
                String classPath = absolutePath.substring(absolutePath.indexOf(packageName), absolutePath.lastIndexOf(".class"));
                Class targetClass = loadClass(classPath);
                emptyClassSet.add(targetClass);
            }
        });
        // 必须要判空
        if(files != null){
            for (File f : files){
                extractDirctoryClass(f, emptyClassSet, packageName);
            }
        }
    }

    /**
     * 根据名字获取类名
     * @param classPath
     * @return
     */
    public static Class<?> loadClass(String classPath){
        try {
            return Class.forName(classPath);
        } catch (ClassNotFoundException e) {
            log.warn("load class error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取当前线程的类加载器
     * @return
     */
    private static ClassLoader getClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }

    public static void main(String[] args) {
        Set<Class<?>> classSet = extractPackageClass("com.bao.entity");
        for (Class c : classSet){
            System.out.println(c.getName());
        }
    }
}
