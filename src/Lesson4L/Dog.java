package Lesson4L;

public class Dog {
    public static void main(String[] args) {
    }

    // Оба поля должны быть приватными и иметь геттеры и сеттеры.
    private String name;
    private int age;

    //конструктор, принимающий данные поля (name, age).
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Создайте метод bark() (лаять), метод должен возвращать строку woof.
    public String bark() {
        return "woof";
    }

    // геттеры и сеттеры.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    }



//Задача 4
//        Создать класс Dog. У собаки должны быть следующие поля:
//
//        name (кличка, строка);
//        age (возраст, число).
//        Оба поля должны быть приватными и иметь геттеры и сеттеры.
//
//        Реализуйте в классе конструктор, принимающий данные поля (name, age).
//
//        Создайте метод bark() (лаять), метод должен возвращать строку woof.