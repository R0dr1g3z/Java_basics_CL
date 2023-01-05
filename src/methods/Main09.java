package methods;

public class Main09 {
    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        int number = 1;
        for (int i = 0; i < n; i++) {
            number *= i + 1;
        }
        return number;
    }
}
