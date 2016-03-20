package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String cat;

    public void initialize(String name)
    {
        this.cat = name;
    }

    public void initialize(String name, int weight, int age)
    {
        this.cat = name + Integer.toString(weight) + Integer.toString(age);
    }

    public void initialize(String name, int age)
    {
        this.cat = name + Integer.toString(age);
    }

    public void initialize(String name, String color)
    {
        this.cat = name + color;
    }

    public void initialize(String name, String color, String address)
    {
        this.cat = name + color + address;
    }
}
