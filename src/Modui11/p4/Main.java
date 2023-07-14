package Modui11.p4;

public class Main {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(12);
        //engine.isWorking = true;
        engine.isWorking = false;
        System.out.println(engine.horsepower);
        System.out.println(engine.startStopEngine().toString());
        

    }
}


//        Задача 4
//        Создайте класс Car с вложенным в него классом Engine.
//
//        В классе Car должна быть:
//        строковая переменная carModel;
//        конструктор, принимающий carModel.

//        В классе Engine должны быть:
//        логические (boolean) поле isWorking (по умолчанию false);
//        целочисленное поле horsepower;
//        конструктор, принимающий horsepower;
//        метод String startStopEngine(), если isWorking равен true,
//        то метод должен вернуть "engine was stopped" и поменять значение
//        isWorking на false, иначе — "engine was started" и isWorking = true.