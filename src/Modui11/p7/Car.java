package Modui11.p7;

public class Car extends Transport {
    //целочисленное поле maxPassengers — максимальное количество пассажиров;
    int maxPassengers = 10;

    //конструктор, принимающий в себя fuel, speed, maxPassengers;
    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    //метод canMove(int n), должен вернуть true,
    // если fuel >= n и уменьшать уровень fuel на n, иначе возвращать false;
    @Override
    public boolean canMove(int n) {

        if (fuel >= n) {
            fuel--;
            return true;

        } else
            return false;
    }


    //метод getFuelLevel(), возвращающий целое число — fuel;
    @Override
    public boolean getFuelLevel() {
        if (fuel != -0)
            return true;
        else
        return false;

    }

    //метод getMaxPassenger(), возвращающий целое число — максимальное число пассажиров.
    public int getMaxPassenger() {
        return  maxPassengers;

    }
}
