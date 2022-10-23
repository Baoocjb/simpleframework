package demo.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance = null;
    private LazyDoubleCheckSingleton(){};

    public static LazyDoubleCheckSingleton getInstance(){
        // 第一次监测
        if (instance == null) {
            // 同步锁
            synchronized (LazyDoubleCheckSingleton.class){
                if(instance == null){
                    // memory = allocate(); // 1.分配对象内存空间
                    // instance(memory) // 2.初始化对象
                    // instance = memory; // 3.设置instance指向刚分配的内存地址,此时instance != null,所以要用volatile修饰防止初始化的顺序不同
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
