package Level1.Problems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int first = 0, second = 1;
        for(int i =0;i<n;i++){
            System.out.print(first +" ");
            int next = first+second;
            first = second;
            second = next;
        }
    }
}
