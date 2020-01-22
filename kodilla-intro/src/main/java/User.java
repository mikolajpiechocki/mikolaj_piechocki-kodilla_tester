// w trakcie pracy ale aby skończyć muszę zapoznać się z następnym działem
public class User {
String name;
    int age;


    public User(String name, int age) {
        User monika = new User("Monika", 44);
        User sonia = new User("Sonia", 12);
        User wojciech = new User("Wojciech", 15);
        User mikolaj = new User("Mikołaj", 44);
        User stefania = new User("Stefania", 77);
        User anna = new User("Anna", 65);
        User zbyszek = new User("Zbyszek", 65);
        String[] users = new String[] {"Monika", "Sonia", "Wojciech", "Mikołaj", "Stefania", "Anna", "Zbyszek"};
                this.age = age;
        this.name = name;
                   }
    public static int getAge(int[] age) {
        return this.age;
    }
    public String getName(int[] name) {
        return this.name;
    }
    public static void main(String[] args) {
        String[] users = new String[] {"Monika", "Sonia", "Wojciech", "Mikołaj", "Stefania", "Anna", "Zbyszek"};
               int[] ages = {44, 12, 15, 44, 77, 65, 65};
        sumAges(ages);

    }
     public int sumAges(int[] ages) {
            int result = 0;
        for (int i = 0; i < ages.length; i++) {
           result = result + ages[i];
        }
        System.out.println(result);
        return result;
                     }
    public averageAge(int[] ages) {
        int result1 = 0;
        for (int i = 0; i < ages.length; i++) {
            if ages[i] <(sumAges()/ages.length) {
                System.out.println(getName(name[i]) + "jest poniżej średniego wieku");
                return getAge(age(i));
            }
        else {
                System.out.println(getName() + "jest powyżej średniego wieku");
                return false;
            }
            return;
        }

    }

            /*int result = 0;
            for (int i = 0; i < numberOfElements; i++) {
                result = result + numberOfElements[i];
            }*/
        }

        /*int sumOfAgesUser = getAge();
         for (int i = 0; i < users.length; i++) {
            int result = 0;
            for (int i = 0; i < sumOfAgesUser; i++) {
                result = result + age();
            }
            System.out.println();
            System.out.println(i);
        }*/

    /*public User(String [], int []) {
        String[] users = new String[];
        int numberOfElements = users.length;
        System.out.println(numberOfElements);

    }
        */
