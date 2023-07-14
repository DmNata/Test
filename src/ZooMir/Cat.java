package ZooMir;

public class Cat extends Animal {
    public Cat() {
        //хищник, питается мясом и молоком
        super(false, "milk and meat");
    }
    public void sound() {
        System.out.println("Meow");
    }
    @Override
    public void move() {
        System.out.println("Кошка умеет двигаться очень тихо");
    }
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am a Cat";
    }
}






