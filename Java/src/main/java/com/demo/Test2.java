package com.demo;

public class Test2 {
    public static void main(String[] args) {
        String str = "/content/iwc/glbe/global/en/watch-collections0";
        String searcgStr = "/content/iwc/glbe";
        if (str.startsWith(searcgStr)) {

            String temp = str.substring(str.indexOf("global")+6);
//            System.out.println("/content/iwc/int/global"+temp);
//            System.out.println(str.indexOf("global"));

            System.out.println(str.replaceFirst("glbe","int"));

            String [] arr = {"/content/iwc/glbe/global/en/watch-collections0","/content/iwc/glbe/global/en/watch-collections1","/content/iwc/glbe/global/en/watch-collections2"};

        }
        
    }
}
