package Level1.Problems;

import java.util.Scanner;

public class Palindrome {
    /*START
    Read n
    Store original number
    Set reversed = 0

    WHILE n > 0
     Extract last digit
     Add digit to reversed after shifting reversed left by one decimal place
     Remove last digit from n
    END WHILE

    IF reversed == original
     Print Palindrome
    ELSE
     Print Not Palindrome
    STOP
*/
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int reverse = 0;
            int temp = n;
            while (temp > 0) {
                int lastDigit = temp % 10;
                reverse = reverse * 10 + lastDigit;
                temp /= 10;
            }
            System.out.println((reverse == n) ? "Palindrome" : "Not Palindrome");
        }
    }
}
