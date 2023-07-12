package Lesson4L;

import java.util.zip.ZipFile;

public class Bell {
    public static void main(String[] args) {
    }
      //переменная для условия
    Boolean ding = true;
   //метод с условием
    void sound() {
        //если тру(динг)  то это сообщение
        if (ding) {
            System.out.println("ding");
            //если фолс(не динг) то это сообщение
        } else {
            System.out.println("dong");
        }
        //если снова динг то не динг
        // тру не равняется тру
        // за тру всегда следом фолс
        ding = !ding;
    }
}








//Задача
// 2
//        Напишите класс Bell, имеющий всего один метод sound, если он был вызван,
//        то метод должен напечатать в консоль ding или dong. Первый звук всегда ding,
//        второй — dong, третий — снова ding и так далее.