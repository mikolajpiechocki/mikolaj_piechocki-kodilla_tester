public class Notebook {

    String weight;
    int price;
    int weight1;
    int year;


    public Notebook(String weight, int price, int weight1, int year) {

        this.weight = weight;
        this.price = price;
        this.weight1 = weight1;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public String getWeight() {
        return this.weight;
    }

    public void checkWeight1() {
        if (this.weight1 < 800) {
            System.out.println("This device is light.");
        } else if (this.weight1 > 800 && this.weight1 < 1500) {
            System.out.println("This device is not very heavy.");
        } else {
            System.out.println("This device is very heavy.");
        }
    }

    public void checkYear() {
        if (this.year < 2012) {
            System.out.println("This device is very old.");
        } else if (this.year > 2012 && this.year < 2016) {
            System.out.println("This device is not very young.");
        } else {
            System.out.println("This device is very young.");
        }
    }

    public void checkYearPrice() {
        if (this.year < 2012) {
            if (this.price < 600) {
                System.out.println("This notebook is old but very cheap.");
            } else if (this.price > 600 && this.price < 1000) {
                System.out.println("This notebook is old and price is not expensive.");
            } else {
                System.out.println("This notebook is old and very expensive.");
            }
        } else if (this.year > 2012 && this.year < 2016) {
            if (this.price < 600) {
                System.out.println("This notebook isn`t old but very cheap.");
            } else if (this.price > 600 && this.price < 1000) {
                System.out.println("This notebook isn`t old and price isn`t expensive.");
            } else {
                System.out.println("This notebook isn`t young but very expensive.");
            }
        }
        else {
                if (this.price < 600) {
                    System.out.println("This notebook is very very cheap and very young.");
                } else if (this.price > 600 && this.price < 1000) {
                    System.out.println("This notebook is cheap and very young.");
                } else {
                    System.out.println("This notebook is expensive but very young.");
                }
            }
        }
    }






