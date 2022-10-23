package demo.pattern.factory.entity;

public class IBMKeyBoard implements KeyBoard{
    @Override
    public void sayHello() {
        System.out.println("IBM键盘say hello!");
    }
}
