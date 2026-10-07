package Level1.Problems;

public class SumOfArray {
    /*START
    Create/read an array
    Set sum = 0

    FOR each element in the array
        Add element to sum
    END FOR

    Print sum
    STOP
*/
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
