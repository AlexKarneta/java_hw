package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Car volvo= new Car();
        volvo.brand="Volvo";
        volvo.releaseDate.set(2023,11,8);
        volvo.type="SUV";

        System.out.println(volvo.brand);
        System.out.println(volvo.releaseDate.getTime());

        Car bmw= new Car("bmw", "suv", "yellow", "gas", 4, new GregorianCalendar(2020, Calendar.JUNE, 15));
        System.out.println(bmw.type);
        bmw.print();
    }
}