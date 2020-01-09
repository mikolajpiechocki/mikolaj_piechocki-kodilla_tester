public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000, 600, 2019);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight1();
        notebook.checkYear();
        /*notebook.checkYearPrice();*/

        Notebook heavyNotebook = new Notebook("2000g", 1500, 2000, 2010);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight1();
        heavyNotebook.checkYear();
        /*heavyNotebook.checkYearPrice();*/

        Notebook oldNotebook = new Notebook("1600g", 500, 1600, 2015);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight1();
        oldNotebook.checkYear();
        /*oldNotebook.checkYearPrice();*/

        if (1 > 2) {
            System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa.");
        }
    }
}
