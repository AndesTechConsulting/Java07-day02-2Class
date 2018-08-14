package org.andestech.learning.rfb18;

public class Main {
    static Book book;


    public static void main(String[] args) {


    book = new Book();
//    book.author = "Жюль Верн";
//    book.title = "20 тысяч лье под водой";
//    book.ISBN = "ISS-16213123-21323";

        book.setAuthor("Жюль Верн");
        book.setTitle("20 тысяч лье под водой");
        book.setISBN("ISS-16213123-21323");

    Book book2 = new Book();

    Book book4 = new Book("Лев Толстой","Война и Мир","ISS-87623876-234-323AAA");

    Book book3 = book;

    System.out.println(book);
    System.out.println(book2);
    System.out.println(book3);

    //book3.title = "Капитан Немо";
        // book3.setTitle("Капитан Немо");
    System.out.println(book.getBook());
    System.out.println(book3.getBook());
    System.out.println(book4.getBook());
        System.out.println(Book.libName);
      //  System.out.println(book.);
        new Book(); new Book();
        System.out.println("Books added: " + Book.getCount());
    }



}
