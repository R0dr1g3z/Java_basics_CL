package exceptions;

public class Main04 {
    public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Don;t divide by 0");
        }
    }
}
