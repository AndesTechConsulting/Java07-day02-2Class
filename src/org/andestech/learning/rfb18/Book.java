package org.andestech.learning.rfb18;

import java.util.Random;

class Shelf
{
    int roomId, shelfId;

 //   public Shelf(){}
 // container class for book
    
}


public class Book {

    static final String libName = "OMSK State Libray";

    static private int count = 0;

   // String title, author, ISBN;
    private Shelf shelf;

    private String title;
    private String author;
    private String ISBN;

    private void chooseShelf(){
        //.....
        shelf = new Shelf();
        shelf.roomId = 123;
        shelf.shelfId = new Random().nextInt(10000);
    }

    public Book(){

        System.out.println("+++ ctor: " + this);
        chooseShelf();
        count++;

    }

    public Book(String author, String title, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        chooseShelf();
        System.out.println("+++ ctor2: " + this);
        count++;
    }

    public static int getCount(){return count;}

    public String getBook(){

     return "Book: " + title + ", " +
             author + ", " + ISBN +
             ", room|shelf: " + shelf.roomId + "|" + shelf.shelfId;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public String getISBN() {
//        return ISBN;
//    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
