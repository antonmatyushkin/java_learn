package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String fullname = null;

    public Cat (String name)
    {
        this.fullname = name;
    }

    public Cat (String name, int weight, int age)
    {
        this.fullname = name + Integer.toString(weight) + Integer.toString(age);
    }

    public Cat (String name, int age)
    {
        this.fullname = name + Integer.toString(age);
    }

    public Cat (int weight, String color)
    {
        this.fullname = Integer.toString(weight) + color;
    }

    public Cat (int weight, String color, String address)
    {
        this.fullname = Integer.toString(weight) + color + address;
    }
}
