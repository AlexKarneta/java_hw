package org.example;
class dataTypes{

}
public class Lesson_1 {
    dataTypes[] dataType = new dataTypes[8];
    dataTypes dataType1 = new dataTypes();
    byte byteData=127;
    short shortData=32740;
    int intData = 12312311;
    boolean boolData=true;
    long longData=321321321L;
    double doubleData=321321.13;
    float floatData=21323.123F;
    char charData=23122;

    public void displayData(){
        System.out.println( "Type of value:"+((Object) byteData).getClass().getName());
    }
}