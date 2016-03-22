package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.InputStreamReader;
=======
import java.io.*;
>>>>>>> c5444b687879e55175e5b6d8fcceac1f51a7c57d

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD
        int sum = 0;

        while (true)
        {
            String s = reader.readLine();
            if (s.equals("сумма")) break;
            int s1 = Integer.parseInt(s);
            sum += s1;
        }

=======

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
>>>>>>> c5444b687879e55175e5b6d8fcceac1f51a7c57d
        System.out.println(sum);
    }
}
