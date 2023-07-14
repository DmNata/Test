package Modui11.p6;

public class Vector2D extends Vector {
    //конструктор, принимающий параметры x1, y1, x2, y2 (z1 и z2 равны 0);
    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0 ,x2, y2,0);
//        z1 = 0;
//        z2 = 0;

    }



    //метод getLength(), возвращающий длину вектора (double);
    @Override
    public double getLength() {

        return Math.sqrt(Math.pow(x1 - x2, 2)+ Math.pow(y1 - y2,2));
    }

    //метод getVectorCords(), возвращающий строку (координаты вектора через пробел);
    @Override
    public String getVectorCords() {

        return (x1 - x2) + " " + (y1 - y1);
    }

    //метод getScalarProduct(Vector2D vector) (скалярное произведение),
    //возвращающий скалярное произведение векторов (вещественное (double) число);
    double getScalarProduct(Vector2D vector2d) {
        String cords = getVectorCords();
        String cords2 = vector2d.getVectorCords();

        return Integer.parseInt(cords.split(" ")[0]) *  Integer.parseInt(cords2.split(" ")[0]) +
                Integer.parseInt(cords2.split(" ")[1]) +Integer.parseInt(cords.split(" ")[1]);
    }

    //метод getAngle(Vector 2D vector), возвращающий
    //вещественное значение — косинус угла (в радианах) между векторами,
    //если они не нулевые, иначе метод должен вернуть -2.0.
   public  double getAngle(Vector2D vector2d) {

        if(getLength() != 0 && vector2d.getLength() != 0) {
            return getScalarProduct(vector2d) / (this.getLength() * vector2d.getLength());
        } else return -2.0;
    }
}
