package org.example.solid;

import org.example.solid.singleResponsability.Book;
import org.example.solid.singleResponsability.BookPrinter;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("name", "author", "text");
        BookPrinter printer = new BookPrinter();
        printer.printTextToConsole(book.getText());
    }
}
