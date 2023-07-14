package Modui11.p4;

public class Car {
    //В классе Car должна быть:
    //строковая переменная carModel;
    // конструктор, принимающий carModel.
    String carModel;

    public Car() {
        this.carModel = carModel;
    }

    //В классе Engine должны быть:
    //логические (boolean) поле isWorking (по умолчанию false);
    //целочисленное поле horsepower;
    //конструктор, принимающий horsepower;

    static class Engine {
        boolean isWorking = false;
        int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }


        //метод String startStopEngine(), если isWorking равен true,
        //то метод должен вернуть "engine was stopped" и поменять значение
        //isWorking на false, иначе — "engine was started" и isWorking = true.

        public String startStopEngine() {

            if (this.isWorking){
                isWorking = false;
                return "engine was stopped";
            }
            // if (isWorking == true)
            //return "engine was stopped " + false ;

            else {
                isWorking = true;
                return "engine was started";
                //return "engine was started " + true ;
            }



        }
    }
}




