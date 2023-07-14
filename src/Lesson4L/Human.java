package Lesson4L;

public class Human {
    public static void main(String[] args) {
    }
        //поля
        String name, address, work;
        int age;
        double weight;


    Human laddy1 = new Human("Helly", 21); //1
    Human laddy2 = new Human("lily", "Sochi"); //2
    Human laddy3 = new Human("Ketty", 22, 55.3); //3
    Human laddy4 = new Human("Anny", 32, null); //4
    Human laddy5 = new Human(23, 54.5, null, "Colorist"); //5


    //конструктор1
    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //конструктор2
    public Human(String name,String address) {
        this.name = name;
        this.address = address;
    }

    //конструктор3
    public Human(String name,int age,double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //конструктор4
    public Human(String name,int age,String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    // конструктор5
    public Human(int age,double weight,String address, String work){
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
}


}
//public class Human {
//    String name, address, work;
//    int age, weight;
//
//    public Human(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.weight = 60;
//    }
//
//    public Human(String name, String address) {
//        this.name = name;
//        this.address = address;
//        this.weight = 60;
//        this.age = 25;
//    }
//
//    public Human(String name, int age, int weight) {
//        this(name, age);
//        this.weight = weight;
//    }
//
//    public Human(String name, int age, String work) {
//        this(name, age);
//        this.weight = 60;
//        this.work = work;
//    }
//
//    public Human(int age, int weight, String address, String work) {
//        this.name = "Jhon";
//        this.age = age;
//        this.weight = weight;
//        this.address = address;
//        this.work = work;
//    }
//}
//Задача 5
//        Создайте класс Human со следующими полями:
//
//        name (имя, строка);
//        age (возраст, число);
//        weight (вес, число);
//        address (адрес, строка);
//        work (работа, строка).
//        Создайте 5 инициализаторов (конструкторов), принимающих:
//
//        name, age;
//        name, address;
//        name, age, weight;
//        name, age, work;
//        age, weight, address, work.
//        Задача конструктора — создать полноценный объект (сделать его валидным).
//        То есть, если вес неизвестен, то нужно указать хоть какой-нибудь средний вес,
//        то же касается возраста и имени, а вот адреса и работы может и не быть (равны null).