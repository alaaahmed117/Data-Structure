package lab1;


// R-1.5

public class SumCalculator_R_5 {
    public static void main(String[] args) {
        System.out.println(sumUpTo(5));  // Should print 15
        System.out.println(sumUpTo(10)); // Should print 55
    }

    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
