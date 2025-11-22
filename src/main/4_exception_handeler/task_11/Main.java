package task_11;


public class Main {

    public static void main(String[] args) {
        System.out.println("Program started.");

        try {
            System.out.println("Inside try block.");

            int result = 10 / 0;
            System.out.println("This line will not execute.");

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program ended.");

    }


}
