import java.util.Random;

public class Loops {

/*    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }*/
    public static void main(String[] args) {
    String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
    for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
    }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        public int getCountOfRandomNumber(int max) {
            Random random = new Random();
            int result = 0;
            int sum = 0;
            while (sum < max) {
                int temp = random.nextInt(10);
                sum = sum + temp;
                result++;
            }
            return result;
        }

}
}
