package com.demo;

import org.apache.commons.lang3.StringUtils;

public class SubStingTest {
    public static void main(String[] args) {
        String path = "/content/iwc/americas/us/en/seofilter/blue-dial-watch";
        String euPath ="/content/iwc/europe/de/de/seofinder/gray-dial-watch";
        subString(path);
        subString(euPath);
        String given = "/content/iwc/americas/us/en/blue-dial-watch/jcr:content";
        String searh = "blue-dial-watch";
        if (given.contains(searh)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
    private static void subString(final String path) {
        System.out.println("Filter: " + StringUtils.substringBeforeLast(path, "/seofilter"));
        System.out.println("Finder: " + StringUtils.substringBeforeLast(path, "/seofinder"));
    }
}
