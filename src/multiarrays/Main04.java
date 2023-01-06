package multiarrays;

public class Main04 {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4, 5, 6},
            {7, 8, 9, 10}
        };
        System.out.println(oddSum(arr));
    }

    public static int oddSum(int[][] arr) {
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 1){
                    oddSum += arr[i][j];
                }
            }
        }
        return oddSum;
    }
}