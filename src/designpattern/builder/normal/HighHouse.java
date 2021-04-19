package designpattern.builder.normal;

public class HighHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("高楼造梯子");
    }
}
