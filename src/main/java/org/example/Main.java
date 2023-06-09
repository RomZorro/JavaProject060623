package org.example;

//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//   int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int i = new Random().nextInt(2001);
        System.out.println("Случайное число i : " + i);

        int n = Integer.toBinaryString(i).length() - 1;
        System.out.println("Номер старшего значения бита n :  " + n);
        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                count++;
            }
        }
        // Создаем массив m1
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i - 1; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                list.add(j);
            }
        }

        short count2 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                count2++;
            }
            System.out.println("Массив м1: " + list);
            // Создаем массив m2
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (int k = Short.MIN_VALUE; k < i; k++) {
                if (k % n != 0) {
                    list2.add(k);
                }
                System.out.println("Массив м2: " + list2);
            }
        }
    }
}





