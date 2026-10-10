package Level1.Problems;

public class LinearSearch {
    /*
    * START
    Read array and target

    FOR i = 0 TO array length - 1
     IF array[i] == target
     Print index i
     STOP
     END IF
    END FOR

    Print "Element not found"

    STOP*/
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,10};
        int target=11;
        boolean isFound = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                isFound=true;
                System.out.println("Element found at "+i+"th index");
                break;
            }
        }
        if(!isFound){
            System.out.println("Not Found");
        }
    }
}
