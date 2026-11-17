package Level1.Problems;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello world";
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length-1;
        while (left<right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.valueOf(c));
    }
}
