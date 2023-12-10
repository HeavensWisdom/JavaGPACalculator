// ValidationUtils.java
package validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtils {
    public static String validateInput(Scanner scanner, String regex, String errorMessage) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        String input;

        do {
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("done")) {
                return null;
            }

            matcher = pattern.matcher(input);

            if (!matcher.matches()) {
                System.out.println(errorMessage);
            }
        } while (!matcher.matches());

        return input;
    }
}