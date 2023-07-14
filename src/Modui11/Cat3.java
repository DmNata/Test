package Modui11;

public class Cat3 implements Movable3, Edible3, Eat3 {

    @Override
    public void eat() {
        System.out.println("кот поел");
    }

    @Override
    public void beEaten() {
        System.out.println("кота съели");
    }

    @Override
    public void move() {
        System.out.println("кот пошел");
    }
}
    //Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
