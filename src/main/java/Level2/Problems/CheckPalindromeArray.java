package Level2.Problems;

public class CheckPalindromeArray {
    /* left = 0
right = array.length - 1

while left < right:
 if arr[left] != arr[right]:
 return false

 left++
 right--

return true */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(checkPalindrome(arr)?"Palindrome" : "Not Palindrome");
    }
    public static boolean checkPalindrome(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] !=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
