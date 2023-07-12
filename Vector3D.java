package Modui11.p6;

public class Vector3D extends  Vector{
    //конструктор, принимающий параметры x1, y1, z1, x2, y2, z2;
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
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
    //метод getScalarProduct(Vector3D vector) (скалярное произведение),
    //возвращающий скалярное произведение векторов (вещественное (double) число).
    double getScalarProduct(Vector3D vector){
        return z1;
    }

}
