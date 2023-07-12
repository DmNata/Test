package ZooMir;

public class Animal {
    // переопределяем toString()
    @Override
    public String toString() {
        return "";
    }
    public Animal() {

    }

    public static void main(String[] args) {
    }
    private boolean vegetarian;
    private String eats;


    public Animal(boolean veg, String food){
        this.vegetarian = veg;
        this.eats = food;
    }

    public void sound(){
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
    public void move() {
        System.out.println("Животные могут двигаться");
    }

    protected void print() {
    }
}

