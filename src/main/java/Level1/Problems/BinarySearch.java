package Level1.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    /*START
    Read sorted array and target

    left = 0
    right = array length - 1

    WHILE left <= right
     mid = left + (right - left) / 2

     IF array[mid] == target
     Print mid
     STOP
     ELSE IF array[mid] < target
     left = mid + 1
     ELSE
     right = mid - 1
     END IF
    END WHILE

    Print "Element not found"

    STOP
*/
    public static void main(String[] args) {
        int[] arr = {23, 32, 50, 87, 25, 77, 17};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int left =0;
        int right = arr.length-1;
        boolean isFound = false;
        while(left<=right){
            int middle = (left+right)/2;
            if(arr[middle]==target){
                isFound=true;
                System.out.println("Found at "+middle);
                break;
            }else if (arr[middle]<target){
                left =middle+1;
            }else {
                right=middle-1;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }
    }
}