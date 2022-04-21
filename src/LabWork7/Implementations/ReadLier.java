package LabWork7.Implementations;

import LabWork7.Interfaces.*;

public class ReadLier extends User implements Reader, Supplier {

    public ReadLier(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator, Printable printable) {
        System.out.println("Читатель " + this.name + " попросил у администратора " + administrator + " книгу " + printable);
        administrator.findBook(this, printable);
    }

    @Override
    public void returnBook(Administrator administrator, Printable printable) {
        System.out.println("Читатель " + name + " вернул книгу " + printable + " администратору " + administrator);
    }

    @Override
    public void bringBook(Librarian librarian, Printable printable) {
        System.out.println("Поставщик " + this.name + " принес заказанную библиотекарем " + librarian + " книгу " + printable);
    }
}
