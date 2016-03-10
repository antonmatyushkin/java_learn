package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg0 = new Zerg();
        zerg0.name = "a";
        Zerg zerg1 = new Zerg();
        zerg1.name = "b";
        Zerg zerg2 = new Zerg();
        zerg2.name = "c";
        Zerg zerg3 = new Zerg();
        zerg3.name = "d";
        Zerg zerg4 = new Zerg();
        zerg4.name = "e";
        Zerg zerg5 = new Zerg();
        zerg5.name = "f";
        Zerg zerg6 = new Zerg();
        zerg6.name = "g";
        Zerg zerg7 = new Zerg();
        zerg7.name = "h";
        Zerg zerg8 = new Zerg();
        zerg8.name = "i";
        Zerg zerg9 = new Zerg();
        zerg9.name = "j";

        Protos protos0 = new Protos();
        protos0.name = "a";
        Protos protos1 = new Protos();
        protos1.name = "b";
        Protos protos2 = new Protos();
        protos2.name = "c";
        Protos protos3 = new Protos();
        protos3.name = "d";
        Protos protos4 = new Protos();
        protos4.name = "e";

        Terran terran0 = new Terran();
        terran0.name = "a";
        Terran terran1 = new Terran();
        terran1.name = "b";
        Terran terran2 = new Terran();
        terran2.name = "c";
        Terran terran3 = new Terran();
        terran3.name = "d";
        Terran terran4 = new Terran();
        terran4.name = "e";
        Terran terran5 = new Terran();
        terran5.name = "f";
        Terran terran6 = new Terran();
        terran6.name = "g";
        Terran terran7 = new Terran();
        terran7.name = "h";
        Terran terran8 = new Terran();
        terran8.name = "i";
        Terran terran9 = new Terran();
        terran9.name = "j";
        Terran terran10 = new Terran();
        terran10.name = "k";
        Terran terran11 = new Terran();
        terran11.name = "l";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}