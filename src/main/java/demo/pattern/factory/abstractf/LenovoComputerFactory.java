package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.KeyBoard;
import demo.pattern.factory.entity.LenovoKeyBoard;
import demo.pattern.factory.entity.LenovoMouse;
import demo.pattern.factory.entity.Mouse;

public class LenovoComputerFactory implements ComputerFactory{
    @Override
    public KeyBoard createKeyBoard() {
        return new LenovoKeyBoard();
    }

    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }
}
