package org.simpleframework.core;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.simpleframework.core.annotation.Component;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.core.annotation.Repository;
import org.simpleframework.core.annotation.Service;
import org.simpleframework.util.ClassUtil;
import org.simpleframework.util.ValidationUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BeanContainer {
    /**
     * 存放被标记后加载的bean实例
     */
    private final ConcurrentHashMap<Class<?>, Object> beanMap = new ConcurrentHashMap<>();
    private static final Collection<Class<? extends Annotation>> BEAN_ANNOTATION =
            Arrays.asList(Component.class, Controller.class, Service.class, Repository.class);

    public static BeanContainer getInstance(){
        return ContainHolder.HOLDER.instance;
    }
    private enum ContainHolder{
        HOLDER;
        private BeanContainer instance;
        ContainHolder(){
            instance = new BeanContainer();
        }
    }

    /**
     *
     * @return 获取已加载注解标记的类的数量
     */
    public int beanSize(){
        return beanMap.size();
    }

    private boolean loaded = false;

    /**
     * @return 判断容器是否被加载过
     */
    public boolean getloaded(){
        return loaded;
    }

    /**
     * 加载被注解修饰的类放入beanMap中
     * @param packageName 指定的包名
     */
    public synchronized void loadBeans(String packageName){
        if(getloaded()){
            log.warn("BeanContainer has been loaded");
            return;
        }
        // 提取指定包名中的类
        Set<Class<?>> classSet = ClassUtil.extractPackageClass(packageName);
        if(ValidationUtil.isEmpty(classSet)){
            log.warn("extract nothing from : " + packageName);
            return;
        }

        // 将包内提取到的类中被指定注解修饰的类提取出来
        for(Class<?> clazz : classSet){
            for(Class<? extends Annotation> annotation : BEAN_ANNOTATION){
                if (clazz.isAnnotationPresent(annotation)) {
                    // 将目标类本身为键,目标类实例作为值,放入到beanMap中
                    beanMap.put(clazz, ClassUtil.newInstance(clazz, true));
                }
            }
        }
        loaded = true;
    }

}
