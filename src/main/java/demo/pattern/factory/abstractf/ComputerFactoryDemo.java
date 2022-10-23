package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.KeyBoard;
import demo.pattern.factory.entity.Mouse;

public class ComputerFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory icf = new IBMComputerFactory();
        KeyBoard keyBoard = icf.createKeyBoard();
        Mouse mouse = icf.createMouse();
        mouse.sayHi();
        keyBoard.sayHello();
    }
}
