package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    private String circle;

    public Circle (int centerX, int centerY, int radius)
    {
        this.circle = Integer.toString(centerX) + Integer.toString(centerY) + Integer.toString(radius);
    }

    public Circle (int centerX, int centerY, int radius, int width)
    {
        this.circle = Integer.toString(centerX) + Integer.toString(centerY) + Integer.toString(radius) + Integer.toString(width);
    }

    public Circle (int centerX, int centerY, int radius, int width, String color)
    {
        this.circle = Integer.toString(centerX) + Integer.toString(centerY) + Integer.toString(radius) + Integer.toString(width) + color;
    }
}
