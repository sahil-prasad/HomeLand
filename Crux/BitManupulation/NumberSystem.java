package BitManupulation;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalToBinary(n);
    }

    public static void decimalToBinary(int n) {
        if (n == 0) {
            System.out.print("0"); // Handle special case when n is 0
            return;
        }

        StringBuilder binary = new StringBuilder(); // Use StringBuilder to build the binary representation

        while (n >0) {
            int bit = n % 2; // Calculate the binary digit (0 or 1) at the current position
            binary.append( bit); // Insert the binary digit at the end of the StringBuilder
            n /= 2; // Move to the next bit position by dividing by 2
        }
        binary.reverse();

        System.out.println("Binary Equivalent: " + binary.toString());
    }
}

