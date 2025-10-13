package org.example;

public class Book {
    String author;
    String title;
    Integer year;
    Book(){}
    Book(String author,String title,Integer year){
        this.author=author;
        this.title=title;
        this.year=year;
    }
    Book(String author,String title){
        this.author=author;
        this.title=title;
    }
    @Override
    public String toString(){
        StringBuilder bookInfo=new StringBuilder();
        bookInfo.append("Author: "+author+'\n'+"Title: "+title+'\n');
        if(year!=null){
            bookInfo.append("Year: "+year);
        }
        return bookInfo.toString();
    }
}
