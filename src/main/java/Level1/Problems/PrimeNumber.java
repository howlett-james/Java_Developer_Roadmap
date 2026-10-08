package Level1.Problems;

import java.util.Scanner;

public class PrimeNumber {
    /*
    * START
    Read number n
    IF n <= 1
        Not Prime
    ELSE
        Assume n is Prime
        FOR each number from 2 up to n-1
            IF n is divisible by current number
                Not Prime
                Stop checking
            END IF
        END FOR
    END IF
    Print result
    STOP
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        if(n<=2){
            return true;
        }
        for (int i = 3; i < n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
