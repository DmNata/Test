package ZooMir;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.move();  // Запускает метод в классе Animal
        cat.move();  // Запускает метод в классе Cat

        Zoo zoo = new Zoo();
        zoo.change(new Dog(), 2);
        System.out.println(zoo);


    }
}
