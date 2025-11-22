package task_03;

public class StringUtils {
    protected String str;

    public StringUtils(String str) {
        this.str = str;
    }

    public static String safeToUpper(String input) {
        try {
            return input.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("\n\nError: You passed null!");
            return null;
        }
    }
}
