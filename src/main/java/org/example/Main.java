package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import org.example.Controller.BookDaoImpl;
import org.example.Daointerface.BookDao;
import org.example.model.Books;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // creating object
        BookDao bookDao = new BookDaoImpl();
        System.out.println("--------- inserting book records ----------");

        ArrayList<Books> BookList = new ArrayList<Books>();

        Books b1 = new Books();
        b1.setIsbn(120);
        b1.setBookName("Java Book");
        BookList.add(b1);

        Books b2 = new Books();
        b2.setIsbn(300);
        b2.setBookName("Python Book");
        BookList.add(b2);

        Books b3 = new Books();
        b3.setIsbn(365);
        b3.setBookName("JavaScript Book");
        BookList.add(b3);

        Books b4 = new Books();
        b4.setIsbn(256);
        b4.setBookName("SQL Book");
        BookList.add(b4);

        bookDao.saveBook(BookList);
    }
}
