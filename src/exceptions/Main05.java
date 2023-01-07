package exceptions;

public class Main05 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("xyz");
            int num2 = Integer.parseInt("5");
        } catch (NumberFormatException e) {
            System.out.println("This isn't number");
        } finally {
            System.out.println(1);
        }
    }
}
