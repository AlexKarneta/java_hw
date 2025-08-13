package org.example;

public class Main {
    Integer a = 127;
    Integer b = 127;
    Integer c = 128;
    Integer d = 128;
    System.out.println("a == b: " + (a == b));
    System.out.println("c == d: " + (c == d)); // -128 127 кеш значения, все что выше создаются новые объекты, а их ссылки явно не равны.в целом == сравнивает по ссылке

    System.out.println("a.equals(b): " + a.equals(b));
    System.out.println("c.equals(d): " + c.equals(d)); // сравнивает значения в объектах

    int age = 25;
    boolean hasTicket = true; // не зайдет т.к не выполнится условие
    boolean canEnter = age >= 18 && hasTicket;   // зайдет т.к. по возрасту выполняется условие
    System.out.println("Can enter: " + canEnter);

}
