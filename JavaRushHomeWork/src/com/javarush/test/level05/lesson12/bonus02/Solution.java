package com.javarush.test.level05.lesson12.bonus02;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
=======
import java.util.Scanner;
>>>>>>> 37aef08bd98f1396e4b9aeef16679b0c2327babb

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
<<<<<<< HEAD
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        for(int i = 0; i < 5; i++){
            System.out.println(list.get(a));
        }

        //System.out.println("Minimum = " + minimum);
    }

=======
        int[] a = new int[5];
        int i = 0;

        Scanner in = new Scanner(System.in);

        //Создаем массив из 5 элементов.
        for (int element : a)
        {
            a[i] = in.nextInt();
            i++;
        }

        int min = a[0];
        //Определяем минимальный элемент в массиве.
        for (i = 0; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }

        System.out.println("Minimum = " + min);
    }
>>>>>>> 37aef08bd98f1396e4b9aeef16679b0c2327babb
}
