public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[7];
        books [0] = "Niebezpieczne związki Bronisława Komorowskiego";
        books [1] = "Niebezpieczne związki Donalda Tuska";
        books [2] = "Niebezpieczne związki Andrzeja Leppera";
        books [3] = "Komisarz";
        books [4] = "Powrót do Jedwabnego";
        books [5] = "Niebezpieczne związki Generała Petelickiego";
        books [6] = "Rozprawa";

        String book = books [2];
        System.out.println(book);
        int numberOfElements = books.length;
        System.out.println(numberOfElements);
        System.out.println("Moja Tablica zawiera ");System.out.println(numberOfElements);System.out.println(" elementów");
        }

}

