package com.demo;

import java.util.OptionalInt;
import java.util.Random;

public class Random4Digit {
    public static void main(String[] args) {
        for (int i=0; i<50;i++ ) {
            System.out.println(randomPortNumber());
        }
    }

    private static int randomPortNumber() {
        final Random random = new Random();
        final OptionalInt randomNum = random.ints(1, 1111, 9999).findAny();
        if (randomNum.isPresent()) {
            return randomNum.getAsInt();
        } else {
            return 1982;
        }
    }

}
