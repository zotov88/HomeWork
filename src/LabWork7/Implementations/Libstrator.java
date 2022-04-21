package LabWork7.Implementations;

import LabWork7.Interfaces.*;

public final class Libstrator extends User implements Librarian, Administrator {

    public Libstrator(String name) {
        super(name);
    }

    @Override
    public void findBook(Reader reader, Printable printable) {
        System.out.println("Администратор " + this.name + " нашла и выдала книгу " + printable + " читателю " + reader);
    }

    @Override
    public void overdueNotification(Reader reader, Printable printable) {
        System.out.println("Администратор " + this.name + " напомнила читателю " + reader + ", что пора вернуть книгу " + printable);
    }

    @Override
    public void orderBook(Supplier supplier, Printable printable) {
        System.out.println("Библиотекарь " + this.name + " заказала у поставщика " + supplier + " книгу " + printable);
    }
}
