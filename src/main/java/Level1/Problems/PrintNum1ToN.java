package Level1.Problems;

import java.util.Scanner;

public class PrintNum1ToN {
    /*START
    Read N
    Set number = 1

    WHILE number <= N
        Print number
        Increase number by 1
    END WHILE
    STOP
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }
    }
}
