package Level1.Problems;

public class CountFrequency {
    /*
    * START
    Create/read an array
    Read target
    Set count = 0

    FOR each element in the array
        IF element == target
            Increase count by 1
        END IF
    END FOR

    Print count
    STOP
    * */
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40};
        int target = 10,count =0;
        for(int i =0;i<arr.length;i++){
            if(target == arr[i]){
                count +=1;
            }
        }
        System.out.println(count);
    }
}
