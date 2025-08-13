package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Lesson_1 sampleData=new Lesson_1();
        sampleData.displayData();

        String firstValue = "abc";
        String secondValue = firstValue;
        firstValue = "hello world!";
Integer a=1;
        int firstPrimitive = 1;
        int secondPrimitive =firstPrimitive;
        firstPrimitive=3;
        BigDecimal first =new BigDecimal("3.15");
        BigDecimal second = new BigDecimal("3.15");

        Object test= null;
//        System.out.println(secondValue);
        System.out.println(first.add(second));
        System.out.println( "Type of value:"+((Object) test).getClass().getName());
    }
}