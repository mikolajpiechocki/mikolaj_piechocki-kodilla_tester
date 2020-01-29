// nie wiem czemu nie działa
/*
public class User {

    public static void main(String[] arge) {
        User [] users = new User[7];
        users[0] = new User("Monika", 44);
        users[1] = new User("Sonia", 12);
        users[2] = new User("Wojciech", 15);
        users[3] = new User("Mikołaj", 44);
        users[4] = new User("Stefania", 77);
        users[5] = new User("Anna", 65);
        users[6] = new User("Zbyszek", 65);

        int sum = 0;

        for (int i = 0; i < users.length; i++) {
            sum += users[i].age;
        }

        double avg = sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < avg) {
                System.out.println(users[i].firstName + " " + users[i].age);
            } else {
                System.out.println("wiek uzytkownika większy od sredniej");
            }
        }
    }
}

/*public class RunUsers {
    public static void main(String[] args) {

        User[] users = new User[3];
        users[0] = new User("Jan", 20);
        users[1] = new User("Piotr", 15);
        users[2] = new User("Tomek", 34);

        int sum = 0;

        for (int i = 0; i < users.length; i++) {
            sum += users[i].age;
// sum = 0 + 20; //1krok
//sum = 20 + 15; //2 krok pętli
// sum = 35 + 34; // 3 krok
// sum = 69;
        }

        double avg = sum / users.length; //69/3

        for (int i = 0; i < users.length; i++) {
            if (users[i].age > avg) {
                System.out.println(users[i].firstName + " " + users[i].age);
            } else {
                System.out.println("wiek uzytkownika mniejszy od sredniej");
            }
        }
    }
}*/
