package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for ( ; ; )
        {
            String s = reader.readLine();

            if (!(s.equals("сумма")))
            {
                int s1 = Integer.parseInt(s);
                sum = sum + s1;
            }
        }
        System.out.println(sum);
    }
}
