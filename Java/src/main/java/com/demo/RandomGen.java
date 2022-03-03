package com.demo;

import java.util.Random;
public class RandomGen{
    public static void main(String[] args) {
        Random objGenerator = new Random();
        for (int iCount = 10; iCount< 50; iCount++){
            int randomNumber = objGenerator.nextInt(100);
            System.out.println("Random No : " + randomNumber);
        }
    }
}