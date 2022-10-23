package demo.pattern.factory.simple;

import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.HpMouse;
import demo.pattern.factory.entity.Mouse;

public class MouseFactory {

    public static Mouse creatMouse(int type){
        switch (type){
            case 1:return new DellMouse();
            case 2:return new HpMouse();
            default:return null;
        }
    }
}
