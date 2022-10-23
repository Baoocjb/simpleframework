package demo.singleton;

public class StarvingSingleton {
    // private : 防止被 类.starvingSingleton
    // final : 防止被修改
    // static : 确保其唯一性
    private static final StarvingSingleton starvingSingleton = new StarvingSingleton();

    private StarvingSingleton(){}
    public static StarvingSingleton getInstance(){
        return starvingSingleton;
    }
}
