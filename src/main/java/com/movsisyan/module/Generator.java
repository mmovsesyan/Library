package com.movsisyan.module;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static int randomNumber(int a, int b) {
        return (int) (a + (Math.random() * (b - a) + 1));
    }

    public static Book randomBook(int a, int b) {
        return new Book("B" + " " + randomNumber(a, b), "A" + randomNumber(a, b),
                randomNumber(a, b));
    }

    public static BookShelf randomBookshelf(int a, int b) {
        BookShelf bookShelf = new BookShelf(randomNumber(a, b));
        for (int i = 0; i < (int) (Math.random() * 10); i++) {
            bookShelf.addBookOnBookshelf(randomBook((int) (Math.random() * i), (int) (Math.random() * (i + 1))));
        }
        return bookShelf;
    }

    public static List<BookShelf> randomLibrary(int n) {
        List<BookShelf> bookShelves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bookShelves.add(randomBookshelf((int) (Math.random() * i), (int) (Math.random() * (i + 1))));
        }
        return bookShelves;
    }
}
