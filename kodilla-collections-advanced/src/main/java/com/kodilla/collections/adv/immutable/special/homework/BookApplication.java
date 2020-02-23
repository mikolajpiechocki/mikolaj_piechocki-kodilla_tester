package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book1 = new BookManager ("Henryk Sienkiewicz", "W pustyni i puszczy.");
        BookManager book2 = new BookManager ("Wojciech Sumliński", "Niebezpieczne związki Bronisława Komorowskiego.");
        BookManager book3 = new BookManager ("Wojciech Sumliński", "Niebezpieczne związki Donalda Tuska.");
        BookManager book4 = new BookManager ("Henryk Sienkiewicz", "W pustyni i puszczy.");
        BookManager x = book1;
        BookManager y = book2;
        BookManager z = book3;
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(x==y);
        System.out.println("---------");
        System.out.println(x.hashCode());
        System.out.println(z.hashCode());
        System.out.println(x==z);
        System.out.println("---------");
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
        System.out.println(y==z);
        System.out.println("---------");
        System.out.println(book1==book4);
        System.out.println(book1.hashCode());
        System.out.println(book4.hashCode());
        System.out.println("---------");
        System.out.println(book1.equals(book4));
        System.out.println(book4.equals(book1));
    }
}
