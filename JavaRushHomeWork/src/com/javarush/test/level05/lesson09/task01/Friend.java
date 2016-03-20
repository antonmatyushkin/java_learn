package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    private String fullname = null;

    public Friend (String name)
    {
        this.fullname = name;
    }

    public Friend (String name, int age)
    {
        this.fullname = name + Integer.toString(age);
    }

    public Friend (String name, int age, int sex)
    {
        this.fullname = name + Integer.toString(age) + Integer.toString(sex);
    }
}