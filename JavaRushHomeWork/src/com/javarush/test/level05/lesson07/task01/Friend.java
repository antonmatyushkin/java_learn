package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String fullname = null;

    public void initialize(String name)
    {
        this.fullname = name;
    }

    public void initialize(String name, int age)
    {
        this.fullname = name + Integer.toString(age);
    }

    public void initialize(String name, int age, int sex)
    {
        this.fullname = name + Integer.toString(age) + Integer.toString(sex);
    }
}
