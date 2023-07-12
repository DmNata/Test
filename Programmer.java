package Lesson4L;

public class Programmer {
    public static void main(String[] args) {
    }
    String name, company, position;

    //конструктор, принимающий name и company;
    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position ="intern"; //(с самого начала (при инициализации)
    }

    // метод getPosition(), возвращающий строку — позицию программиста.
     String getPosition(String position){
        return position;
     }
     //метод work(), поднимающий позицию программиста на уровень вверх
    ////        (с самого начала (при инициализации) программист — intern (стажер),
    ////        потом junior (джуниор), далее middle, senior, lead).
    void work(){
        switch (position){ //проверяем позицию
            case "intern": // если сейчас интерн то потом джун
                position = "junior"; // если джун и так далее
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
            default:
                System.out.println("exception");
            }
        }

    }





//Задача 6
//        Напишите класс Programmer.
//        Переменные:
//        name (имя, строка);
//        company (имя компании, строка);
//        position (позиция, строка);
//        конструктор, принимающий name и company;
//        метод getPosition(), возвращающий строку — позицию программиста.
//        метод work(), поднимающий позицию программиста на уровень вверх
//        (с самого начала (при инициализации) программист — intern (стажер),
//        потом junior (джуниор), далее middle, senior, lead).