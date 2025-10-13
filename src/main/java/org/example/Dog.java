package org.example;

public class Dog  extends Animal{
    String type;
    Dog(){}
    Dog(String type){
        this.type=type;
    }
    @Override
    public void makeSound(){
        String soundmaker=(type==null)?"Animal make sound":type+" make sound";
        System.out.println(soundmaker);
    }
}
