package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        if (a1 >= b1 && a1 >= c1 && b1 >= c1)
        {
            System.out.println(a1 + " " + b1 + " " + c1);
        }
        else if (a1 >= b1 && a1 >= c1 && b1 <= c1)
        {
            System.out.println(a1 + " " + c1 + " " + b1);
        }
        else if (a1 <= b1 && a1 <= c1 && b1 <= c1)
        {
            System.out.println(c1 + " " + b1 + " " + a1);
        }
        else if (a1 <= b1 && a1 <= c1 && b1 >= c1)
        {
            System.out.println(b1 + " " + c1 + " " + a1);
        }
        else if (a1 <= b1 && a1 >= c1 && b1 >= c1)
        {
            System.out.println(b1 + " " + a1 + " " + c1);
        }
        else if (a1 >= b1 && a1 <= c1 && b1 <= c1)
        {
            System.out.println(c1 + " " + a1 + " " + b1);
        }
    }
}
