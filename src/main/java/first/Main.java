package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String binaryNumber = scanner.next();
            if(!isValidBinaryNumber(binaryNumber)) {
                System.out.println("Error, not valid binary number");
            }
            else {
                System.out.println(convertBinaryToDecimal(binaryNumber));
            }
        } catch (Exception e) {
            System.out.println("Error during reading input" + e.getMessage());
        }
    }

    public static boolean isValidBinaryNumber(String binaryNumber) {
        if (binaryNumber.length() > Integer.SIZE ||
                binaryNumber.length() == 0) return false;
        for (int i = 0; i < binaryNumber.length(); ++i) {
            if (binaryNumber.charAt(i) != '0' &&
                    binaryNumber.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static int convertBinaryToDecimal(String binaryNumber){
        int res = 0, n = binaryNumber.length();
        for (int i = 0; i < n; ++i) {
            if (binaryNumber.charAt(i) == '1') {
                res += 1 << (n - i - 1);
            }
        }
        return res;
    }
}