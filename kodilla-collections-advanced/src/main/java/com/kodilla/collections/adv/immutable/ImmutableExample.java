package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new Book("Jan Brzechwa", "Kaczka Dziwaczka");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("Nowa Era");
        System.out.println(book.getTitle());
    }
}
