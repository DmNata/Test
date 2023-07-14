package Modui11.p6;

public class Vector3D extends  Vector{
    //конструктор, принимающий параметры x1, y1, z1, x2, y2, z2;
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }
    //метод getLength(), возвращающий длину вектора (double);
    @Override
    public double getLength() {
        return x1;
    }
    //метод getVectorCords(), возвращающий строку (координаты вектора через пробел);
    @Override
    public String getVectorCords() {
        return (x1 -x2) + " " + (y1 - y2) + " " + (z1 - z2);
    }
    //метод getScalarProduct(Vector3D vector) (скалярное произведение),
    //возвращающий скалярное произведение векторов (вещественное (double) число).
    double getScalarProduct(Vector3D vector3d){
        String cords = getVectorCords();
        String cords2 = vector3d.getVectorCords();

        int a = Integer.parseInt(cords.split(" ")[0]) *  Integer.parseInt(cords2.split(" ")[0]);
        int b = Integer.parseInt(cords2.split(" ")[1]) +Integer.parseInt(cords.split(" ")[1]);
        int c = Integer.parseInt(cords2.split(" ")[2]) +Integer.parseInt(cords.split(" ")[2]);
        return  a + b + c;
    }

}
