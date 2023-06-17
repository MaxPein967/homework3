package org.example;
import java.util.*;
/*
Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
 */
public class workArrayList {
    public static void main(String[] args) {
        System.out.print("Введите длину списка n: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        ArrayList<Integer> arList = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < n; i++) {
            int x = ran.nextInt(n);
            arList.add(x);
        }
        System.out.println("Произвольный список целых чисел: " + arList);

        int min = arList.get(0);
        int max = arList.get(0);
        float sum = 0;
        for (int i = 0; i < arList.size(); i++) {
            int num = arList.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float arithmeticMean = sum / arList.size();

        for (int i = arList.size() - 1; i >= 0; i--) {
            int even = arList.get(i) % 2;
            if (even == 0) {
                arList.remove(i);
            }
        }
        Collections.sort(arList);
        System.out.println("Список с удаленными четными числами: " + arList);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + arithmeticMean);
    }
}
