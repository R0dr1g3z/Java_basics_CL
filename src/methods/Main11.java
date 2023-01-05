package methods;

public class Main11 {
    public static void main(String[] args) {
        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
    }

    public static double dogAge(double dogAge){
        if (dogAge > 2){
            return 2 * 10.5 + (dogAge - 2) * 4;
        } else
        return dogAge * 10.5;
    }
}
