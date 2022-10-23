package demo.singleton;

public class EnumStarvingSingleton {
    private EnumStarvingSingleton(){}
//    public static EnumStarvingSingleton getInstance(){
//        return ContainHolder.Holder.instance;
//    }
    public static enum ContainHolder{
        Holder;
        private EnumStarvingSingleton instance = null;
        private ContainHolder(){
            instance = new EnumStarvingSingleton();
        }
        public EnumStarvingSingleton getInstance(){
            return instance;
        }
    }
}
