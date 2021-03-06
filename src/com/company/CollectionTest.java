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

        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3);
        System.out.println(sites);
        System.out.println(sites.size());
        sites.set(1, "Wiki");
        System.out.println(sites.get(1));
        for (String site: sites) {
            System.out.println(site);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(30);
        numbers.add(25);
        numbers.add(10);
        numbers.add(45);
        Collections.sort(numbers);
        for (Integer number: numbers) {
            System.out.println(number);
        }

        LinkedList<String> lSites = new LinkedList<String>();
        lSites.add("Google");
        lSites.add("Runoob");
        lSites.add("Taobao");
        lSites.add("Weibo");
        lSites.addFirst("Wiki");
        lSites.addLast("Baidu");
        System.out.println(lSites);
        lSites.removeFirst();
        lSites.removeLast();
        System.out.println(lSites);
        System.out.println(lSites.getFirst());
        for (String site: lSites) {
            System.out.println(site);
        }

        HashSet<String> hSites = new HashSet<String>();
        hSites.add("Google");
        hSites.add("Runoob");
        hSites.add("Taobao");
        hSites.add("Weibo");
        hSites.add("Runoob");
        System.out.println(hSites);
        System.out.println(hSites.contains("Taobao"));
        hSites.clear();
        System.out.println(hSites);

        HashMap<Integer, String> mSites = new HashMap<Integer, String>();
        mSites.put(1, "Google");
        mSites.put(2, "Runoob");
        mSites.put(3, "Taobao");
        mSites.put(4, "Zhihu");
        System.out.println(mSites);
        System.out.println(mSites.get(3));
        mSites.remove(3);
        System.out.println(mSites);

        Iterator<Integer> it = mSites.keySet().iterator();
        while (it.hasNext()) {
            Integer in = it.next();
            System.out.println();
            if (in < 3) {
                it.remove();
            }
        }
        System.out.println(mSites);
    }
}
