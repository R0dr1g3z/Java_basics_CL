package methods;

public class Main03 {
    public static void main(String[] args) {
        System.out.println(String.format("%.2f", convertToUsd(56)));
    }

    public static double convertToUsd(int pln){
        return pln * 4.43;
    }
}
