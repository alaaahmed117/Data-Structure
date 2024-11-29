
package lab1;

import java.util.Scanner;

/**
 *
 * @author a30zx
 */
public class InputAllBaseTypes_R_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                inputAllBaseTypes();

    }
    
    // R-1.1
     public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);

        // Input and print a boolean
        System.out.print("Enter a boolean: ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("Boolean value: " + boolValue);

        // Input and print a byte
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("Byte value: " + byteValue);

        // Input and print a char
        System.out.print("Enter a char: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("Char value: " + charValue);

        // Input and print a short
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();
        System.out.println("Short value: " + shortValue);

        // Input and print an int
        System.out.print("Enter an int: ");
        int intValue = scanner.nextInt();
        System.out.println("Int value: " + intValue);

        // Input and print a long
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();
        System.out.println("Long value: " + longValue);

        // Input and print a float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Float value: " + floatValue);

        // Input and print a double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Double value: " + doubleValue);

        scanner.close();
    }
     
     
}
