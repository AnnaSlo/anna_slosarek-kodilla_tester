import java.util.Scanner;

public class Color {

    public static void main(String[] args) {
        char userSelection = getUserSelection();
        String colorName = getColorName(userSelection);
        System.out.println("Pełna nazwa koloru: " + colorName);
    }

    public static char getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first letter of the color: ");
        return scanner.next().charAt(0);
    }
        public static String getColorName(char firstLetter) {
        Scanner scanner = new Scanner(System.in);
        char letter = Character.toUpperCase(firstLetter);
        return switch (letter) {
            case 'R' -> "Red";
            case 'G' -> "Green";
            case 'B' -> "Blue";
            case 'Y' -> "Yellow";
            case 'W' -> "White";
            default -> "Unknown color";
        };
    }
}