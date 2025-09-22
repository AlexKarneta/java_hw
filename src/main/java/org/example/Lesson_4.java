package org.example;

import java.util.Random;

public class Lesson_4 {
    public static void main(String[] args) {
        //1
        Random random = new Random();
        int randomNumber = random.nextInt(8);
        String result = null;
        switch (randomNumber) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "tusday";
                break;
            case 3:
                result = "wednesday";
                break;
            case 4:
                result = "thuesday";
                break;
            case 5:
                result = "friday";
                break;
            case 6:
                result = "saturday";
                break;
            case 7:
                result = "sunday";
                break;
            default:
                result = "Friday 13";
                break;
        }
        System.out.println(result);
        //2
        enum Month {
            January,
            February,
            March,
            April,
            May,
            June,
            July,
            August,
            September,
            October,
            November,
            December
        }
        Month month = Month.January;
        System.out.println(month);
        enum Seasons {
            Spring,
            Summer,
            Autumn,
            Winter
        }
        Seasons season = Seasons.Spring;

        switch (month) {
            case December:
            case January:
            case February:
                season = Seasons.Winter;
                break;
            case August:
            case July:
            case June:
                season = Seasons.Summer;
                break;
            case September:
            case October:
            case November:
                season = Seasons.Autumn;
                break;
            case March:
            case April:
            case May:
                season = Seasons.Spring;
                break;
        }
        System.out.println(season);
        //3
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
        }
        //4
        String star = "*";
        for (int i = 0; i < 5; i++) {
            String starResult = "";
            for (int j = 0; j <= i; j++)
                starResult += star;
            System.out.println(starResult);
        }
    }
}
