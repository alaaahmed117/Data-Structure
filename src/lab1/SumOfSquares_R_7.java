package lab1;

// R-1.7

public class SumOfSquares_R_7 {
    public static void main(String[] args) {
        System.out.println(sumOfSquaresUpTo(3));  // Should print 14 (1^2 + 2^2 + 3^2)
        System.out.println(sumOfSquaresUpTo(5));  // Should print 55 (1^2 + 2^2 + 3^2 + 4^2 + 5^2)
    }

    public static int sumOfSquaresUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
