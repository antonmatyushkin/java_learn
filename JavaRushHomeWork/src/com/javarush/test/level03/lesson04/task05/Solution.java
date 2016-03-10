package com.javarush.test.level03.lesson04.task05;

/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i0 = 1;
        int i1 = i0 + 2;
        int i2 = i1 + 3;
        int i3 = i2 + 4;
        int i4 = i3 + 5;
        int i5 = i4 + 6;
        int i6 = i5 + 7;
        int i7 = i6 + 8;
        int i8 = i7 + 9;
        int i9 = i8 + 10;
        System.out.println(i0);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
        System.out.println(i8);
        System.out.println(i9);
    }
}