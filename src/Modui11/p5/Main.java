package Modui11.p5;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alon ", 22," Teacher ","English");
        System.out.println(teacher);

    }
    }

//        Задача 5
//        Создайте абстрактный класс People. В нём должны быть:
//
//        строковое поле name;
//        целочисленное поле age;
//        строковое поле profession;

//        конструктор, принимающий переменную String name, int age, String profession;

//        абстрактный метод getProfession(), возвращающий строку — профессию человека;
//        абстрактный метод getAge(), возвращающий целое число — возраст человека;
//        абстрактный метод getName(), возвращающий строку — имя человека.

//        Создайте класс Teacher, который является наследником класса People. В нём должны быть:
//
//        строковое поле subject (преподаваемый предмет);
//        конструктор принимающий имя, возраст, профессию и преподаваемый предмет;
//        метод getProfession должен возвращать  строку — профессию;
//        метод getAge() должен возвращать целое число — возраст;
//        метод getName() должен возвращать строку — имя;
//        метод getSubject() должен возвращать строку — преподаваемый предмет;
//        метод giveALesson() должен вернуть строку "The lesson was ended".