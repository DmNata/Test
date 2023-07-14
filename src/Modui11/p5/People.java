package Modui11.p5;

public abstract class People {
    //строковое поле name;
    //целочисленное поле age;
    //строковое поле profession;
    String name;
    int age;
    String profession;

    //конструктор, принимающий переменную String name, int age, String profession;

    public People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    //абстрактный метод getProfession(), возвращающий строку — профессию человека;
    abstract String getProfession();

    //абстрактный метод getAge(), возвращающий целое число — возраст человека;

    abstract int getAge();

    //абстрактный метод getName(), возвращающий строку — имя человека.

    abstract  String getName();
    }

