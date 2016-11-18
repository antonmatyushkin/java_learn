package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }

<<<<<<< HEAD
        for(int i = 0; i < numbers.length; i++){
=======
        for(int i = 0; i < numbers.length - 1; i++){
>>>>>>> 398762eaebea79dae0cad6b4c3ce838e4bd37eea
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
