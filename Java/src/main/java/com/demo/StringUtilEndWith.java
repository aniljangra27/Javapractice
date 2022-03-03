package com.demo;

import org.apache.commons.lang3.StringUtils;

public class StringUtilEndWith {
    public static void main(String[] args) {
        String str = "IWIWMX04";
        boolean b = StringUtils.endsWithAny(str, "BB", "BC");
        System.out.println(b);

        System.out.println("Boolean: "+Boolean.parseBoolean(null));
    }
}
