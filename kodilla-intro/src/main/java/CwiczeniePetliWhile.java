import java.util.Random;
public class CwiczeniePetliWhile {

    /*    public static void main(String[] args) {
            getCountOfRandomNumber(100);
            System.out.println(getCountOfRandomNumber(15));
        }
            public static int getCountOfRandomNumber (int max ){
                Random random = new Random();
                int result = 0;
                int sum = 5;
                while (sum < max) {
                    int temp = random.nextInt(10);
                    sum = sum + temp;
                    result++;
                }
                return result;
            }
        }

        public int getCountOfRandomNumber(int max) { Random random = new Random(); int result = 0; int sum = 0; while (sum < max) { int temp = random.nextInt(10); sum = sum + temp; result++; } return result; }
    public class CwiczeniePetliWhile {

        public static void main(String[] args) {
            getCountOfRandomNumber(100);


            public static int getCountOfRandomNumber ( int max){
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
    }*/
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        sumNumbers(numbers);
    }

    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println(result);
        return result;
    }
}

