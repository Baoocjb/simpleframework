package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.IBMKeyBoard;
import demo.pattern.factory.entity.IBMMouse;
import demo.pattern.factory.entity.KeyBoard;
import demo.pattern.factory.entity.Mouse;

public class IBMComputerFactory extends LenovoComputerFactory{
    @Override
    public Mouse createMouse() {
        return new IBMMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new IBMKeyBoard();
    }
}
