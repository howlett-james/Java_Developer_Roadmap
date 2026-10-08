package Level1.Problems;

import java.util.Scanner;

public class Factorial {
    /*
    * START
    Read n
    Set factorial = 1

    FOR i from 1 to n
        factorial = factorial × i
    END FOR

    Print factorial
    STOP
    * */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
