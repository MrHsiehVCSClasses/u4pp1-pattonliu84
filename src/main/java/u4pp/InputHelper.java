package u4pp;
import java.util.Scanner;

public class InputHelper {
    Scanner scanner;

    public void InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean getYesNoInput(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.next();
        char firstChar = userInput.charAt(0);
        String String = "" + firstChar;
        Boolean valid = char.equals("Y") || char.equals("y") || char.equals("n") ||
                 char.equals("N");
        return valid;
    }

    public int getIntegerInput(String prompt, int min, int max) {
        int i = min - 1;
        while (i < min || i > max) {
            System.out.println(prompt);
            String userInput = this.scanner.next();
            i = Integer.parseInt(userInput);
        }
        return i;
    }
}
