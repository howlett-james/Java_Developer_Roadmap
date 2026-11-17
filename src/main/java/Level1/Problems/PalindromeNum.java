package Level1.Problems;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isPalindrome(n)?"Palindrome" : "Not a palindrome");
    }
    public static boolean isPalindrome(int n){
        if(n<0){
            return false;
        }
        char[] arr = String.valueOf(n).toCharArray();
        int left =0,right=arr.length-1;
        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return (n==Integer.parseInt(String.valueOf(arr)));
    }
}
