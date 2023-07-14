package Lesson4L;

public class Balance {
    public static void main(String[] args) {

    }
    //это поля
    int chashaP = 9;

    int chashaL = 1;

    // это метод
    public void addRight(int P) {
        chashaP += P;
    }
    //это метод
    public void addLeft(int L) {
        chashaL += L;

    }

    //это метод с условиями
    public String getSituation() {
        //условие
     if (chashaP == chashaL) {

         //System.out.println("Они равны");
         return "=";

     }else if (chashaP > chashaL) {
         //System.out.println("вес на правой больше");
         return "P";

     } else if
        (chashaP < chashaL) {
         return "L";
         //System.out.println("вес на левой больше");
     }else {
         return "N";
         //System.out.println("exception");
     }

    }
}


//Задача 1
//        Напишите класс Balance для описания весов с двумя чашами, которые будут балансировать.
//
//        В этом классе должны быть следующие методы:
//
//        addRight(int n) — добавить на правую чашу (метод ничего не возвращает);
//        addLeft(int n) — добавить на левую чашу (метод также ничего не возвращает);
//        getSituation() — метод вернет =, если вес на обеих чашах равен, R — если вес на правой больше, L — на левой больше.
