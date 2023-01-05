package methods;

public class Main06 {
    public static void main(String[] args) {
        System.out.println(checkMaturity(16));
        System.out.println(checkMaturity(20));
    }

    public static boolean checkMaturity(int age){
        if (age >= 18){
            return true;
        } else
        return false;
    }
}
