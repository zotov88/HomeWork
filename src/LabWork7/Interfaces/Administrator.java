package LabWork7.Interfaces;

public interface Administrator {

    void findBook(Reader reader, Printable printable);

    void overdueNotification(Reader reader, Printable printable);
}
