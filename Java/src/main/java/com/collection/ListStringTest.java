package com.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListStringTest {
    public static void main(String[] args) {
        List<String> fieldList = Arrays.asList("lug","ref","color");
        List<String> fieldList1 = Arrays.asList("lug11","ref11","color11");
        Map<String, String> map = new HashMap<>();
//        fieldList.forEach(field ->
//                map.put(field, "1")
//                );

        for (int i=0;i<fieldList.size();i++) {
            map.put(fieldList.get(i),fieldList1.get(i));
        }
        System.out.println(map);
    }


}
