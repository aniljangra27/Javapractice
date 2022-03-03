package com.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class GenereicClass {
    public static void main(String[] args) {
        String LANG_LEVEL_SEO_CONFIG = "/jcr:content/languagelevelconfig/seo";
        String str = "/content/iwc/americas/us/en/journal";
        final String val = StringUtils.substringBeforeLast(str, "/");
        System.out.println(val+LANG_LEVEL_SEO_CONFIG);

        int min1 = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .min()
                .orElse(0);

        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(i -> i > 2)
                .map(i -> i * 3)
                .sum();

        System.out.println(min1 + "sum= "+sum);
    }
}
