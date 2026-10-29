package Level2.Problems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        char[] arr = str.toLowerCase().toCharArray();
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            char c = arr[right];
            arr[right] = arr[left];
            arr[left] = c;
            left++;
            right--;
        }
        System.out.println((str.toLowerCase().equals(String.valueOf(arr))) ?"Palindrome" :"Not a Palindrome");
    }
}
