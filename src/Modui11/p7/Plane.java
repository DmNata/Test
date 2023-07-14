package Modui11.p7;

public class Plane extends Transport {
    //конструктор, принимающий в себя fuel, speed;
    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }
    //метод canMove(int n) должен вернуть true,
    // если fuel >= n, и уменьшать уровень fuel на n, иначе возвращать false;
    @Override
    public boolean canMove(int n) {
        return false;
    }
    //метод getFuelLevel(), возвращающий fuel;
    @Override
    public boolean getFuelLevel() {
        return true;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "speed=" + speed + fuel;

    }

    //метод fillFuel(int n), ничего не возвращающий, но повышающий уровень fuel на n.
    public void fillFuel(int n){
        fuel++;


    }
}
