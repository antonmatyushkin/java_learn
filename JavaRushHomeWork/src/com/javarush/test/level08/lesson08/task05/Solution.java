package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {
        HashMap<String, String> list = createMap();

        Iterator<Map.Entry<String, String>> iterator = list.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            map.put("фамилия" + i, "имя" + i);
        }

        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        for (Map.Entry<String, String> pair1 : map.entrySet())
        {
            String value1 = pair1.getValue();
            list.add(value1);

        }
        int count = 0;
        for (int i = 0; i<list.size();i++){
            String value1 = list.get(i);
            for(int j = 0; j< list.size(); j++){
                String value2 = list.get(j);
                if(value1==value2){
                    count++;
                    if(count>=2){
                        removeItemFromMapByValue(map, value1);}
                }
            }
            count=0;
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
