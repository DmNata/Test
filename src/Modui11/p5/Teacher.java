package Modui11.p5;

public class Teacher extends People {
    //строковое поле subject (преподаваемый предмет);
    String subject;

    //конструктор принимающий имя, возраст, профессию и преподаваемый предмет;
    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
//        this.name = name;
//        this.age = age;
//        this.profession = profession;
//        this.subject = subject;
    }

    //метод getProfession должен возвращать  строку — профессию;
    @Override
    String getProfession() {
        return profession;
    }

    //етод getAge() должен возвращать целое число — возраст;
    @Override
    int getAge() {
        return age;
    }


    //метод getName() должен возвращать строку — имя;
    @Override
    String getName() {
        return name;
    }

    String getSubject() {
        return subject;
    }

    String giveALesson() {
        return "The lesson was ended";
    }

    @Override
    public String toString() {
        return name + age + profession + subject;
    }

}
