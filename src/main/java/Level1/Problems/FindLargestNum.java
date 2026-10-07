package Level1.Problems;

public class FindLargestNum {
    /*START
    Create/read an array
    Assume the first element is the largest

    FOR each remaining element
        IF current element > largest
            Update largest
        END IF
    END FOR

    Print largest
    STOP
    */
    public static void main(String[] args) {
        int[] arr = {10, 85, 7, 40, 65};
        int a = arr[0];
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            if(current>a){
                a=current;
            }
        }
        System.out.println(a);
    }
}
