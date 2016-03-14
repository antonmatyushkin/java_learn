package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String d = reader.readLine();
        int d1 = Integer.parseInt(d);

        if (a1 > b1 && a1 > c1 && a1 > d1)
        {
            System.out.println(a1);
        }
        else if (b1 > a1 && b1 > c1 && b1 > d1)
        {
            System.out.println(b1);
        }
        else if (c1 > a1 && c1 > b1 && c1 > d1)
        {
            System.out.println(c1);
        }
        else if (d1 > a1 && d1 > b1 && d1 > c1)
        {
            System.out.println(d1);
        }
    }
}
