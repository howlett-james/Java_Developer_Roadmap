package Level1.Problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int factorial = 1;
        for(int i = 1;i<=n;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
