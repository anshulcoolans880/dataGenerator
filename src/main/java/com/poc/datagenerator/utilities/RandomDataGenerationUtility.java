package com.poc.datagenerator.utilities;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomDataGenerationUtility {

   // Random r = new Random();

    public static Long generateLong(long leftLimit, long rightLimit){

        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        return generatedLong;
    }

    public static double generateDouble(long leftLimit, long rightLimit){


        double randomValue = leftLimit + (rightLimit - leftLimit) * Math.random();
        return randomValue;
    }

    public static String generateString(int length, boolean useLetters, boolean useNumbers){

    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    return generatedString;

    }

}
