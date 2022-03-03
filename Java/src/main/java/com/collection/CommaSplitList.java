package com.collection;

import java.util.Arrays;
import java.util.List;

public class CommaSplitList {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        final List<String> listString = Arrays.asList(str.split(","));
        System.out.println(listString);
    }
}
