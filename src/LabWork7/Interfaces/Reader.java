package LabWork7.Interfaces;

public interface Reader {

    void takeBook(Administrator administrator, Printable printable);

    void returnBook(Administrator administrator, Printable printable);
}
