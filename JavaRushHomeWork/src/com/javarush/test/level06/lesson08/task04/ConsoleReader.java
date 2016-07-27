package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //напишите тут ваш код
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String s1 = s.readLine();

        return s1;
    }

    public static int readInt() throws Exception
    {
        //напишите тут ваш код
        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(i.readLine());

        return i1;
    }

    public static double readDouble() throws Exception
    {
        //напишите тут ваш код
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        double d1 = Double.parseDouble(d.readLine());

        return d1;
    }

    public static boolean readBoolean() throws Exception
    {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        boolean b1 = Boolean.parseBoolean(b.readLine());

        return b1;
    }
}
