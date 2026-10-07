package Level1.Problems;


public class ReverseString {
    /*START
    Read a string
    Set left = first character position
    Set right = last character position

    WHILE left < right
        Swap characters at left and right
        Move left forward
        Move right backward
    END WHILE

    Print reversed string
    STOP
*/
    public static void main(String[] args) {
        String s = "hello world";
        char[] cArr = s.toCharArray();
        int left = 0;
        int right = cArr.length-1;
        while (left<right){
            char c = cArr[left];
            cArr[left] = cArr[right];
            cArr[right] = c;
            left++;
            right--;

        }
        System.out.println(String.valueOf(cArr));
    }
}
