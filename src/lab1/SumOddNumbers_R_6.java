package lab1;

// R-1.6

public class SumOddNumbers_R_6 {
    public static void main(String[] args) {
        System.out.println(sumOddNumbersUpTo(5));  // Should print 9 (1 + 3 + 5)
        System.out.println(sumOddNumbersUpTo(10)); // Should print 25 (1 + 3 + 5 + 7 + 9)
    }

    public static int sumOddNumbersUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
