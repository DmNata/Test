package Lesson4L;

public class Squirrel {
    public static void main(String[] args) {
    }
    int[] nuts; // поле nuts

    public Squirrel(int[] nuts) {
        this.nuts = nuts; // инициализируем nuts
    }

    int getNuts(int n) {return nuts[n];} // возвращаем значение элемента n

    int maxNuts() {
        if (nuts.length > 1) {
            int arr[] = nuts.clone(); // создаем дублирующий массив
            // куда лучше прыгать на первый, а потом на второй или сразу
            //на второй пенек
            arr[1] = max(arr[1], arr[0] + arr[1]);
            if (arr[1] < 0) arr[1] = 0;
            // мы поняли как лучше прыгнуть на первые 2 пенька, теперь
            //разбираемся с остальными
            for (int i = 2; i < arr.length; i++) {
                // как лучше прыгнуть перепрыгнуть предыдущий пенек или
                //нет
                arr[i] = max(arr[i] + arr[i - 1], arr[i] + arr[i - 2]);
                if (arr[i] < 0) arr[i] = 0;
            }

            // таким образом мы проходим все элементы массив, кроме
            // последних двух
            // ведь последний элемент может быть отрицательным и возможно
            // туда
            // прыгать было не нужно (наш for просто проверяет все
            // элементы, в том числе
            // и последний), поэтому осталось сравнить 2 последних
            // элемента, как мы сравнивали
            // два первых и возвратить данное значение и проверить, что
            // оно больше 0
            int a = max(arr[arr.length - 2], arr[arr.length - 1]);
            return max(0, a);
        } else return max(0, nuts[0]); // если массив длинной 1, то мы
        // проверяем, надо ли вообще
        //прыгать на пенек, если он кривой, то вернем 0 орехов, а если
        // там есть орехи, то вернем их.
    }

    private int max(int a, int b) { // метод нахождения максимума
        if (a >= b) return a;
        return b;
    }
}
//        ИЛИ:
//public class Squirrel {
//    private int[] nuts;
//
//    public Squirrel(int[] nuts) {
//        this.nuts = nuts;
//    }
//
//    public int getNuts(int index) {
//        return nuts[index];
//    }
//
//    ///*
//    public int maxNuts() {
//        int maxOfNuts = 0, len = nuts.length;
//        if (len > 1) {
//            int i = 0;
//            //Проверяем, можно ли подобрать орешки с первого
//            if (nuts[i] > 0)
//                maxOfNuts += nuts[i];
//            //Проверяем, можно ли подобрать орешки со второго до последнего-предпоследнего
//            for (; i < len - 2; i++) {
//                if (nuts[i + 1] < 0 && nuts[i + 1] <= nuts[i + 2])
//                    i++;//перепрыгиваем через пень
//                maxOfNuts += nuts[i + 1];
//                if (maxOfNuts < 0)
//                    maxOfNuts = 0;
//            }
//            // Смотрим, стоит ли прыгать на последний пень
//            if (i == len - 2 && nuts[i + 1] > 0) {
//                maxOfNuts += nuts[i + 1];
//            }
//            return maxOfNuts;
//        } else if (nuts[0] >= 0)
//            return nuts[0];
//        else
//            return 0;
//    }
//



//    Задача 13
//        Все мы знаем, что белочки любят собирать орешки и нести их себе домой
//        (ведь знаем?). Так вот, одной белочке сначала очень не везло,
//        и она не нашла ни одного орешка, как вдруг, по дороге домой,
//        она увидела много пеньков, на некоторых лежали орешки.
//        Но некоторые пеньки были кривыми, если белочка прыгнет на такой пенек,
//        то точно потеряет несколько орешков.
//        Ваша задача — написать программу, которая будет считать,
//        какое максимальное количество орешков белочка сможет донести до домика,
//        если пропрыгает по всем этим пенькам.
//        Белочка — не супермен, поэтому прыгать она может либо на каждый пенек,
//        либо через один. Также не обязательно начинать с первого пенька,
//        можно сразу прыгнуть на второй, то же самое касается и последних двух.
//        Белочка может остановиться и на предпоследнем пеньке.
//        Напишите класс Squirrel, в нем должно быть следующее:
//        поле nuts (массив целых чисел);
//        конструктор, в который подают массив nuts
//        ( в каждой ячейке которого хранится значение n,
//        если n — положительное, то на пеньке с таким индексом
//        белочка найдет n орешков, если отрицательное,
//        то на этом пеньке белочка потеряет n орешков);
//        метод getNuts(int index), возвращает число — сколько найдет
//        или потеряет белочка на пеньке с индексом n;
//        метод maxNuts(), также возвращает число — какое максимальное
//        число орешков белочка донесет до дома.
//        Пример:
//        Ввод
//        Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
//        System.out.println(s.maxNuts());
//        Squirrel s2 = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, 2, 3});
//        System.out.println(s2.maxNuts());
//        Вывод
//        6
//        9
//        Примечание:
//        Помните, что количество орехов не может быть меньше нуля,
//        если белочка будет только терять орехи, то принесет она, например, не -5 орехов, а 0.
//        В первом случае лучше всего прыгнуть сразу на первый пенек,
//        с него на второй, перепрыгнуть третий и попасть на последний .
//        Во втором же — прыгнуть на первый, перепрыгнуть второй,
//        забрать орешки с третьего и прыгнуть на 4-ый,
//        потому что на 5-ом мы потеряем аж 4 штуки, после чего собрать 2 последних пенька .