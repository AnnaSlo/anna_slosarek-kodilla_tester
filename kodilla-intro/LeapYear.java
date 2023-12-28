public class LeapYear {
        public static void main(String[] args) {
            int rokTestowy = 2024;
         if (rokTestowy % 4 == 0 && rokTestowy % 100 != 0 || rokTestowy % 400 ==0) {
            System.out.println("Rok przestepny");
         } else {
            System.out.println("Rok nieprzestepny");
        }
    }
}