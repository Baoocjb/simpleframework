package demo.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 普通单例模式可以通过反射获取
//        System.out.println(StarvingSingleton.getInstance());
//        Class<StarvingSingleton> starvingSingletonClass = StarvingSingleton.class;
//        Constructor<StarvingSingleton> declaredConstructor = starvingSingletonClass.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        System.out.println(declaredConstructor.newInstance());
//        EnumStarvingSingleton instance = EnumStarvingSingleton.getInstance();
//
//        EnumStarvingSingleton instance = EnumStarvingSingleton.getInstance();
//        System.out.println(instance);
//        Class clazz = EnumStarvingSingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        EnumStarvingSingleton enumStarvingSingleton = (EnumStarvingSingleton) constructor.newInstance();
//        System.out.println(enumStarvingSingleton == instance);

        System.out.println(EnumStarvingSingleton.ContainHolder.Holder.getInstance());
        Constructor<EnumStarvingSingleton> declaredConstructor = EnumStarvingSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        EnumStarvingSingleton enumStarvingSingleton = declaredConstructor.newInstance();
        System.out.println(enumStarvingSingleton);
        System.out.println(declaredConstructor.newInstance());
    }
}
