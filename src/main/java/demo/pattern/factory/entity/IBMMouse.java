package demo.pattern.factory.entity;

public class IBMMouse implements Mouse{
    @Override
    public void sayHi() {
        System.out.println("联想旗下的IBM鼠标say Hi!");
    }
}
