package Level1.Problems;

public class FindSmallestNum {
    /*START
    Create/read an array
    Assume the first element is the smallest

    FOR each remaining element
        IF current element < smallest
            Update smallest
        END IF
    END FOR

    Print smallest
    STOP
*/
    public static void main(String[] args) {
        int[] arr = {10, 85, 7, 40, 65};
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            if(current < smallest){
                smallest = current;
            }
        }
        System.out.println(smallest);
    }
}
