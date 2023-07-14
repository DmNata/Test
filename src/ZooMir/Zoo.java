package ZooMir;
public class Zoo  extends Animal {
    // теперь в массиве будут самые разные объекты
    Object[] objects;

    public Zoo() {
        // в этой строке мы еще не создаем объекты,
        // а только “места” для них
        objects = new Object[4];
        // наполняем массив животными
        // И ЛАРЬКОМ с ПОПКОРНОМ!
        objects[0] = new Dog();
        objects[1] = new PopcornStall();
        objects[2] = new Reptile();
        objects[3] = new Cat();
    }

    public void print() {
        // Каждое животное и ЛАРЕК выводится по-своему!
        for (Object a : objects) {
            // благодаря toString() просто выводим переменную а
            System.out.println(a);
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }
    public void sound(){
        // Используем цикл!
        for(Object a: objects){
            // если объект издает звук, послушаем!
            if (a instanceof Soundable)
                ((Soundable)a).sound();
        }
    }
}




