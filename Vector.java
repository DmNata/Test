package Modui11.p6;

public abstract class Vector {



    //целочисленные переменные x1, y1, z1, x2, y2, z2 — координаты начала и конца вектора;
    int x1, y1, z1, x2, y2, z2;

    //конструктор, который принимает эти параметры (x1, y1, z1, x2, y2, z2);
    public Vector(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    public Vector(int x1, int y1, int x2, int y2) {
    }



    //абстрактный метод getLength(), возвращающий вещественное (double) число — длину вектора;
    // x1
    abstract double getLength();

    //абстрактный метод getVectorCords(), возвращающий строку (координаты через пробел, например: 2, 0, -1).
    // y1
    abstract int getVectorCords();


    @Override
    public String toString() {
        return "Vector{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", z1=" + z1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", z2=" + z2 +
                '}';
    }
}

