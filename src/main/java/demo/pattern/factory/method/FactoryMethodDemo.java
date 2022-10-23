package demo.pattern.factory.method;

import demo.pattern.factory.entity.Mouse;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        MouseFactory mc = new IBMMouseFactory();
        Mouse mouse = mc.createMouse();
        mouse.sayHi();
    }
}
