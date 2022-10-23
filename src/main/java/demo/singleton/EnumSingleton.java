package demo.singleton;

public enum EnumSingleton {
    SINGLETON;
    private EnumSingleton instance;
    EnumSingleton(){
//        instance = new EnumSingleton();
    }
}
