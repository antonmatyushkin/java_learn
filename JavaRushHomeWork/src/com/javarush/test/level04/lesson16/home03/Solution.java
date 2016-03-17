package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for ( ; ; )
        {
            String n = reader.readLine();
            int n1 = Integer.parseInt(n);

            if (!(n.equals("-1")))
            {
                sum = sum + n1;
            }
            else
            {
                sum = sum + n1;
                break;
            }
        }
        System.out.println(sum);
    }
}
