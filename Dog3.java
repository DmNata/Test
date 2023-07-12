package Modui11;

public class Dog3 implements Movable3,Eat3{
    @Override
    public void eat() {
        System.out.println("собака поела");
    }

    @Override
    public void move() {
        System.out.println("собака пошла");
    }
}

//        Собака (Dog) может передвигаться и съесть кого-то.