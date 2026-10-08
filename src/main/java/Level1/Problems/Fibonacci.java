package Level1.Problems;

import java.util.Scanner;

public class Fibonacci {
    /*
    Output:
    0 1 1 2 3 5 8

    * START
    Read N

    Set first = 0
    Set second = 1

    REPEAT N times
        Print first
        next = first + second
        first = second
        second = next
    END REPEAT

    STOP*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first =0;
        int second =1;
        for(int i =0;i<n;i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
