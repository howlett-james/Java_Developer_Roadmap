package Level1.Problems;

import java.util.Scanner;

public class ArmstrongNumber {
    /*
    * START
    Read n
    Store original number
    Set sum = 0

    WHILE n > 0
        Extract last digit
        Cube the digit
        Add cube to sum
        Remove last digit from n
    END WHILE

    IF sum == original number
        Armstrong
    ELSE
        Not Armstrong
    END IF

    Print result
    STOP
    * */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n, count =0;
        while (temp>0){
            temp /= 10;
            count++;
        }
        temp = n;
        int sum =0;
        while (temp>0){
            int lastDigit = temp%10;
            sum = (int) (sum + Math.pow(lastDigit, count));
            temp /= 10;
        }
        System.out.println((sum==n) ? "Armstrong" : "Not Armstrong");
    }
}
