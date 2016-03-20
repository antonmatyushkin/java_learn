package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String circle;

    public void initialize(int centerX, int centerY, int radius)
    {
        this.circle = Integer.toString(centerX) + Integer.toString(centerY) + Integer.toString(radius);
    }

    public void initialize(int centerX, int centerY, int radius, int width)
    {
        this.circle = Integer.toString(centerX) + Integer.toString(centerY) + Integer.toString(radius) + Integer.toString(width);
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color)
    {
        this.circle = Integer.toString(centerX) + Integer.toString(centerY) + Integer.toString(radius) + Integer.toString(width) + color;
    }
}
