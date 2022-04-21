package LabWork7.Implementations;

import LabWork7.Interfaces.Printable;

public final class Book implements Printable {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
