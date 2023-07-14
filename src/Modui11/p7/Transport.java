package Modui11.p7;

public abstract class Transport {
    //целочисленное поле fuel;
    //целочисленное поле speed;
    int fuel, speed;

    //конструктор, принимающий fuel и speed;
    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }
    //абстрактный метод canMove(int n),
    // возвращающий логическое (boolean) значение — сможет ли транспорт поехать n километров;
    public abstract boolean canMove(int n);

    //абстрактный метод getFuelLevel(),
    // возвращающий целое число — уровень топлива.
    public abstract boolean getFuelLevel();


    }

