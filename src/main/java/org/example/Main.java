package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//1. Объяви List и заполни его числами от 1 до 10.
//        2. Выведи на экран числа от 1 до 10 с помощью while.
//        3. Выведи числа от 10 до 1 с помощью while.
//        4. С помощью while найди сумму чисел всех значений твоего листа.
public class Main {
    public static void main(String[] args) {
        Book book1 =new Book();
        book1.author="King";
        book1.title="It";
        Book book2 =new Book("Sapkovsky","Witcher");
        Book book3 =new Book("Herbert","Dune",1965);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Dog chih= new Dog("chih");
        Dog chepard= new Dog();
        Cat sphynx=new Cat();
        chih.makeSound();
        chepard.makeSound();
        sphynx.makeSound();
    }
}