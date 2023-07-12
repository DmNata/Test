package Modui11.p6;

public class Vector2D extends Vector {
    //конструктор, принимающий параметры x1, y1, x2, y2 (z1 и z2 равны 0);
    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1,x2, y2);
        z1 = 0;
        z2 = 0;

    }



    //метод getLength(), возвращающий длину вектора (double);
    @Override
    double getLength() {
        return x1;
    }

    //метод getVectorCords(), возвращающий строку (координаты вектора через пробел);
    @Override
    int getVectorCords() {
        return y1;
    }

    //метод getScalarProduct(Vector2D vector) (скалярное произведение),
    //возвращающий скалярное произведение векторов (вещественное (double) число);
    double getScalarProduct(int vector) {
        return z1;
    }

    //метод getAngle(Vector 2D vector), возвращающий
    //вещественное значение — косинус угла (в радианах) между векторами,
    //если они не нулевые, иначе метод должен вернуть -2.0.
    double getAngle() {
        return z2 ;
    }
}
