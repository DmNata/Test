package Lesson4L;

public class Payer {

    public static void main(String[] args) {

    }
        //поля
        String surname;
        String name;
        String address;
        String cardNumber;

            //конструктор принимающий параметры
         public Payer(String surname,String name,String address,String cardNumber) {
             this.surname = surname;
             this.name = name;
             this.address = address;
             this.cardNumber = cardNumber;

        }
    //метод public toString(),
    //возвращающий строку вида Payer: surname name, address: address, card: cardNumber.
    @Override
    public String toString() {
        return "Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber;
    }
    }





//Задача 3
//        Опишите класс Payer. В классе должны быть следующие поля:
//
//        surname (фамилия, строка);
//        name (имя, строка);
//        address (адрес, строка);
//        cardNumber (номер карты, строка).
//        Реализуйте конструктор, принимающий эти параметры
//        (surname, name, address, cardNumber) и метод public toString(),
//        возвращающий строку вида Payer: surname name, address: address, card: cardNumber.