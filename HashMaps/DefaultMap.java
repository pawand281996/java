package com.codingblocks.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class DefaultMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("apple" , "a sweet red fruits");
        map.put("mango" , "king of fruits");
        map.put("grapes", "anguur kathe hai");

        System.out.println(map.get("apple"));
        System.out.println(map.get("grapes"));

        map.put("grapes", "anguur methe hai");

        System.out.println(map.get("grapes"));

        map.remove("apple");
        //removing apple from maps

        System.out.println(map.get("apple"));
        //now getting apples will not throw exception but prints null or returns null


        System.out.println("apple".hashCode());

    }
}
