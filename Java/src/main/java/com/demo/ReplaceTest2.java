package com.demo;

import java.util.Arrays;
import java.util.List;

public class ReplaceTest2 {
    public static void main(String[] args) {
        final List<String> countryList = Arrays.asList("zh-cn", "tw", "en", "zh-tw", "ar", "zh_cn","ZH_TW");
        for (String str : countryList) {
            System.out.println(str.replace("-", "_"));
        }
    }
}
