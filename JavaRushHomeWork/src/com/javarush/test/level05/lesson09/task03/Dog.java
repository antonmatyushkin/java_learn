package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

import java.security.PublicKey;

public class Dog
{
    //напишите тут ваш код
    private String fullname = null;

    public Dog (String name)
    {
        this.fullname = name;
    }

    public Dog (String name, int growth)
    {
        this.fullname = name + Integer.toString(growth);
    }

    public Dog (String name, int growth, String color)
    {
        this.fullname = name + Integer.toString(growth) + color;
    }
}
