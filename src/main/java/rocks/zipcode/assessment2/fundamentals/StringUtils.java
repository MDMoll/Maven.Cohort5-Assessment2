package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return leftPadder(stringToBePadded, amountOfPadding);
    }

    public static String rightPadder(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static String leftPadder(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return rightPadder(stringToBePadded, amountOfPadding);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String output = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            output += stringToBeRepeated;
        }
        return output;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        boolean isAlpha = true;
        for (char ch : string.toCharArray()) {
            if (!Character.isLetter(ch) || ch != ' ') {
                isAlpha = false;
                break;
            }
        }
        return isAlpha;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean isNum = true;
        for (char ch : string.toCharArray()) {
            if (!Character.isDigit(ch)) {
                isNum = false;
                break;
            }
        }
        return isNum;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        boolean isSpecial = true;
        for (char ch : string.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) || ch != ' ') {
                isSpecial = false;
                break;
            }
        }
        return isSpecial;
    }
}
