package lab1;


// R-1.3

public class Multiples_R_3 {
    public static void main(String[] args) {
        System.out.println(isMultiple(10L, 5L)); // Should print true
        System.out.println(isMultiple(10L, 3L)); // Should print false
    }

    public static boolean isMultiple(long n, long m) {
        if (m == 0) {
            return false; // Avoid division by zero
        }
        return n % m == 0;
    }
}
