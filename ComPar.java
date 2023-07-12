package RazNoe;

import java.util.Arrays;
import java.util.Comparator;

public class ComPar implements Comparator <String> {
    public static void main(String[] args) {
//        нужно просто передать его объект в качестве параметра в метод sort():
//        ComPar name = new ComPar();
//        Arrays.sort(array, name);
//        Или даже в одну строку, создав и передав в метод sort() безымянный объект:
//        Arrays.sort(array, new ComparatorByLength());

        String[] array = {"Apple", "Pineapple", "DragonFruit", "Orange", "Lime", "Cherry"};
        Arrays.sort(array, new ComPar());
        System.out.println(Arrays.toString(array));
    }


    @Override
    public int compare(String arg0, String arg1) { // arg0 первая строка
        // считаем, что null-ссылки "больше всех"
        // при сортировке они должны уйти в конец

        if (arg0 == null)//если длина первой строки больше, возвратится положительное число
            return 1;
        if (arg1 == null)//если длина второй строки больше, возвратится отрицательное число,
            return -1;
        // точно две не-null строки -- сравниваем по длине
        return arg0.length() - arg1.length();
        //более короткие строки «переедут» ближе к началу, а длинные отправятся в конец.
    }
}





