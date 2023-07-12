package Modui11;

public class Mouse3 implements Movable3, Edible3 {
    @Override
    public void beEaten() {
        System.out.println("мышь съели");
    }

    @Override
    public void move() {
        System.out.println("мышь пошла");
    }
}
//        Мышь (Mouse) может передвигаться, и её могут съесть.