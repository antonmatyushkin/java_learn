package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        int[] a = new int[7];
        int i = 0;

        Scanner in = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);

        System.out.println("Minimum = " + minimum);
        */

        for (int element : a)
        {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            a[i] = in.nextInt();

            System.out.println(a[i] + " - ");

            i++;
        }

        for (int element : a)

            System.out.print(element + " ");

    }

    /*
    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
    */
}
