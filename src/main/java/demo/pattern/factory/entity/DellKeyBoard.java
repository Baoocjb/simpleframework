package demo.pattern.factory.entity;

public class DellKeyBoard implements KeyBoard{
    @Override
    public void sayHello() {
        System.out.println("戴尔键盘say hello!");
    }
}
