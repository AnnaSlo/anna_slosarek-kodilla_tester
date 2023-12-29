public class Loops {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfElements = names.length;
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i2 = names.length - 1; i2 >= 0; i2--) {
            System.out.println(names[i2]);
        }

        String[] names2 = new String[] {"Agata", "Gabi", "Magda", "Kasper", "Artur"};
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
        sumNumbers();

            int i = 0;
            while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

           public static int sumNumbers() {
            int[] numbers = new int[] {1,0,1};
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];

            }
            System.out.println(result);
            return result;
        }
    }