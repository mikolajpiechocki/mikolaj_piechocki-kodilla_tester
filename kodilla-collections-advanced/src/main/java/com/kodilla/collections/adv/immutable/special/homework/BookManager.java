package com.kodilla.collections.adv.immutable.special.homework;

public class BookManager extends Book{
        private String title;
        private String author;

    public BookManager(String author, String title) {
        super(author, title);
            }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
