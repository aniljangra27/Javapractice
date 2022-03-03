package com.demo;

public class ReplaceTest {
    public static void main(String[] args) {
        String str = "/content/cq:tags/iwc:collections:title/test:one/iwc:test2";
        System.out.println(str.replaceAll(":","/"));
        System.out.println("===============");
        System.out.println(str.replace(":","/"));
    }
}
