package demo.pattern.factory.entity;

public class LenovoKeyBoard  implements KeyBoard{
    @Override
    public void sayHello() {
        System.out.println("联想键盘say hello!");
    }
}