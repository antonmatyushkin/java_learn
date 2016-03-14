package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import org.omg.PortableInterceptor.INACTIVE;

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

        if (a1 != b1 && a1 != c1 && b1 == c1)
        {
            System.out.println("1");
        }
        else if (a1 == b1 && a1 != c1 && b1 != c1)
        {
            System.out.println("3");
        }
        else if (a1 != b1 && b1 != c1 && a1 == c1)
        {
            System.out.println("2");
        }
    }
}
