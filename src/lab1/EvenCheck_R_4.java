package lab1;

// R-1.4
public class EvenCheck_R_4 {
    public static void main(String[] args) {
        System.out.println(isEven(4));  // Should print true
        System.out.println(isEven(7));  // Should print false
    }

    public static boolean isEven(int i) {
        // Check if the least significant bit is 0 (which indicates an even number)
        return (i & 1) == 0;
    }
}
