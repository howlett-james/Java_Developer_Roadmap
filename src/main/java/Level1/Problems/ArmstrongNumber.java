package Level1.Problems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int originalNum = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        int temp = n;
        while (temp > 0){
            int digit = temp%10;
            sum +=(int) Math.pow(digit,digits);
            temp /= 10;
        }
        System.out.println((originalNum==sum) ?"Armstrong Number" : "Not an Armstrong Number");
    }
}
