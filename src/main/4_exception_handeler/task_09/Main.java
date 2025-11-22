package task_09;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Inside main");
            methodB();
        } catch (Exception e) {
            System.out.println("Exception caught in main:");
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues normally...");
    }

    static void methodA() throws Exception {
        System.out.println("Inside methodA");
        throw new Exception("Exception from methodA");
    }

    // Method B: calls methodA but does not catch the exception
    static void methodB() throws Exception {
        System.out.println("Inside methodB");
        methodA();  // exception will propagate to methodB, then to main
    }
}
