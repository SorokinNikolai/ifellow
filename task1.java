//Сформировать и заполнить массив случайным числами и вывести максимальное,
// минимальное и среднее значение. Для генерации случайного числа использовать
// метод Math.random(), который возвращает значение в промежутке [0, 1].

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        double[] myArrayOfRandom = new double[10]; // объявление и создание массива длинной в 10 элементов;
        for (int i = 0; i < myArrayOfRandom.length; i++) {
            myArrayOfRandom[i] = Math.random(); // запись рандомных чисел в массив при помощи цикла
        }
        Arrays.sort(myArrayOfRandom); // сортировка элементов в массиве по возрастанию
        double sum = 0.0;
        for (int i = 0; i < myArrayOfRandom.length; i++) {
            sum += myArrayOfRandom[i]; // вычисление суммы элементов массива при помощи цикла
        }
        System.out.println("Минимальное значение = " + myArrayOfRandom[0]);
        System.out.println("Максимальное значение = " + myArrayOfRandom[myArrayOfRandom.length - 1]);
        System.out.println("Среднее значение = " + (sum / myArrayOfRandom.length));
    }
}
