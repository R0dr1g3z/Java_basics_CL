package exceptions;

public class Main06 {
    public static void main(String[] args) {
       
        try {
            divide(10, 0);
            divide(10, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Don't divide by 0");
        }
 
     }
 
     static int divide(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Don;t divide by 0");
        }
        return a / b;
     }
}
