package com.company;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HaHaHa");
        for (String str: list) {
            System.out.println(str);
        }

        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        for (String key: map.keySet()) {
            System.out.println("key=" + key + " and value=" + map.get(key));
        }

        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }

        for (String v: map.values()) {
            System.out.println("value=" + v);
        }
    }
}
