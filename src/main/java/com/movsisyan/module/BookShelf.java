package com.movsisyan.module;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    int number;
    List<Book> books = new ArrayList<>();

    public BookShelf() {
    }

    public BookShelf(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBookOnBookshelf(Book book) {
        books.add(book);
    }

    public Book findBookInShelf(Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBook(String author) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                bookList.add(book);
            }
            return bookList;
        }
        return null;
    }

    public void removeBook(Book book) {
        if (findBookInShelf(book) != null) {
            books.remove(book);
        }
    }
 }
