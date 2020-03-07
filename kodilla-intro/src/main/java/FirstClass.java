public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 600, 2019);
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkYearPrice();
        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

        Notebook heavyNotebook = new Notebook(2000, 1500, 2000, 2010);
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1600, 500, 1600, 2015);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkYearPrice();

        if (1 > 2) {
            System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa.");
        }
    }
}