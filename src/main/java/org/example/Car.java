package org.example;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car {
    String brand;
    Calendar releaseDate= new GregorianCalendar();
    String type;
    String color;
    String fuelType;
    int doors;

    Car(String brand,String type,String color,String fuelType,int doors,Calendar releaseDate ){
        this.brand=brand;
        this.type=type;
        this.color=color;
        this.fuelType=fuelType;
        this.doors=doors;
        this.releaseDate=releaseDate;
    }
    Car() {}
    Car(String brand,String type,String color) {
        this.brand=brand;
        this.type=type;
        this.color=color;
    }
    void print(){
        System.out.println("brand: "+brand+"\ntype: "+type);
    }
}
