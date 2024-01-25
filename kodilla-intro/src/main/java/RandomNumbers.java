import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int min = 0;
        int max = 0;

        Random random = new Random();
        int maxSum = 5000;
        while (sum <= maxSum) {
            int nextRandom = random.nextInt(31);
            if (min > nextRandom){
                min = nextRandom;
            }
            if (max < nextRandom){
                max = nextRandom;
            }
            if (sum + nextRandom >= maxSum){
                break;
            }

            sum = sum + nextRandom;
            System.out.println(nextRandom);
        }

    System.out.println("Minimalna liczba: " + min);
    System.out.println("Maksymalna liczba: " + max);
    System.out.println(sum);

    }
}
