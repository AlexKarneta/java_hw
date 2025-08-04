package org.example;

public class Lesson_1 {
    byte byteData=127;
    short shortData=32740;
    int intData = 12312311;
    boolean boolData=true;
    long longData=321321321L;
    double doubleData=321321.13;
    float floatData=21323.123F;
    char charData=23122;

    byte b = 10;
    int i=b;
    double d=i;

    double doubleValue = 9.78;
    int intValue = (int) doubleValue;

    public void displayData(){
        System.out.println( "Type of value:"+((Object) byteData).getClass().getName());
        System.out.println( "Type of value:"+((Object) shortData).getClass().getName());
        System.out.println( "Type of value:"+((Object) intData).getClass().getName());
        System.out.println( "Type of value:"+((Object) boolData).getClass().getName());
        System.out.println( "Type of value:"+((Object) longData).getClass().getName());
        System.out.println( "Type of value:"+((Object) doubleData).getClass().getName());
        System.out.println( "Type of value:"+((Object) floatData).getClass().getName());
        System.out.println( "Type of value:"+((Object) charData).getClass().getName());

        System.out.println( "b:"+b);
        System.out.println( "i:"+i);
        System.out.println( "d:"+d);

        System.out.println( "doubleValue:"+doubleValue);
        System.out.println( "intValue:"+intValue);
    }
}
