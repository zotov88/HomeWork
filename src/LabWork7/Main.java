package LabWork7;

import LabWork7.Implementations.Book;
import LabWork7.Implementations.ReadLier;
import LabWork7.Implementations.Libstrator;
import LabWork7.Interfaces.Printable;

public class Main {

    public static void main(String[] args) {
        ReadLier readLier = new ReadLier("Иван");
        Libstrator libstrator = new Libstrator("Мария");

        Printable book1 = new Book("Мастер и Маргарита");
        Printable book2 = new Book("1984");

        readLier.takeBook(libstrator, book1);
        libstrator.overdueNotification(readLier, book1);
        libstrator.orderBook(readLier, book2);
        readLier.bringBook(libstrator, book2);
        readLier.returnBook(libstrator, book1);
    }
}
