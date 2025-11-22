package task_02;

public class StringToInt {
    protected String str;

    public StringToInt(String str) {
        this.str = str;
    }

    public void getNum1() {
        try {
            int number = Integer.parseInt(this.str);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid number!");
        }
    }
}
