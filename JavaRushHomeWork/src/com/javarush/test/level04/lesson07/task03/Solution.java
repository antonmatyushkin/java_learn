package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        if (a1 >= 0 && b1 >= 0 && c1 >= 0)
        {
            System.out.println("3");
        }
        else if ((a1 >= 0 && b1 >= 0) || (a1 >= 0 && c1 >= 0) || (b1 >= 0 && c1 >= 0))
        {
            System.out.println("2");
        }
        else if (a1 >= 0 || b1 >= 0 || c1 >= 0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }

    }
}
