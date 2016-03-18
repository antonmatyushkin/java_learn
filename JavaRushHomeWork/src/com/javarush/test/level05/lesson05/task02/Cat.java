package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {

    }

    public boolean fight(Cat anotherCat)
    {
        //Задаем количество жизней котов по 100 единиц.
        int health = 100;
        int anotherHealth = 100;


        //Расчитываем опыт и силу котов.
        int skill = (this.age * this.strength) / this.weight;
        int force = (this.weight * this.strength) / (this.age + 1);
        int anotherSkill = (anotherCat.age * anotherCat.strength) / anotherCat.weight;
        int anotherForce = (anotherCat.weight * anotherCat.strength) / (anotherCat.age + 1);

        //Рассчитываем повреждения котов за счет их силы.
        if (force > anotherForce)
        {
            anotherHealth = anotherHealth / 2;
        }
        else if (force < anotherForce)
        {
            health = health / 2;
        }
        else if (force == anotherForce)
        {
            health = health - 25;
            anotherHealth = anotherHealth - 25;
        }

        //Рассчитываем повреждения котов за счет опыта (результаты жизней сохраняются от предыдущих повреждений).
        if (skill > anotherSkill)
        {
            anotherHealth = anotherHealth / 2;
        }
        else if (skill < anotherSkill)
        {
            health = health / 2;
        }
        else if (skill == anotherSkill)
        {
            health = health - 25;
            anotherHealth = anotherHealth - 25;
        }

        //Определяем победителя
        if (health >= anotherHealth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
