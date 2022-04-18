package com.movsisyan.module;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    String name;
    String address;
    List<BookShelf> bookShelves = new ArrayList<>();

    public Library() {
    }

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addBookShelf(BookShelf b) {
        bookShelves.add(b);
    }

    public BookShelf findBookShelf(BookShelf shelf, int number) {
        for (BookShelf bookShelf : bookShelves) {
            if (bookShelf.getNumber() == number ||
                    Objects.equals(bookShelf, shelf)) {
                return bookShelf;
            }
        }
        return null;
    }

    public Book findBookInL(String name) {
        for (int i = 0; i < bookShelves.size(); i++) {
            if (bookShelves.get(i).getBooks().get(i).getName().equalsIgnoreCase(name)) {
                return bookShelves.get(i).getBooks().get(i);
            }
        }
        return null;
    }

    public int[] findBookInL(Book book) {
        int f = -1;
        for (int i = 0; i < bookShelves.size(); i++) {
            if (bookShelves.get(i).findBookInShelf(book) != null) {
                f = bookShelves.get(i).getBooks().indexOf(book);
                return new int[]{i, f};
            }
        }
        return null;
    }

    public void removeBookShelf(BookShelf shelf) {
        bookShelves.remove(shelf);
    }
}
