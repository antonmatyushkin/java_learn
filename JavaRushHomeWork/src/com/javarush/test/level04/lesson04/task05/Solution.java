package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        int m = Integer.parseInt(n);

        if (m > 0)
        {
            int k = m * 2;
            System.out.println(k);
        }
        else if (m < 0)
        {
            int l = m + 1;
            System.out.println(l);
        }
    }

}