package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        for (int i = 0; i < 9; i++) {
            Date d = new Date(80 + i, 1 + i, 7 + i);
            map.put("Фамилия" + i, d);
        }

        return (HashMap<String, Date>) map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();

        for (Map.Entry<String, Date> pair : map.entrySet()){
            int time = pair.getValue().getMonth() ;

            if (time > 4 && time < 8 ){
                set.add(pair.getKey());
            }
        }

        for (String s : set){
            map.remove(s);
        }
    }
}
