package Level1.Problems;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;
        System.out.println(isFound(arr, target));
    }
    public static int isFound(int[] arr, int target){
        int left =0, right = arr.length-1;
        while (left<=right) {
            int middle = left + (right-left)/2;
            if(target==arr[middle]){
                return middle;
            }else if(arr[middle]>target){
                right = middle -1;
            }else{
                left = middle+1;
            }
        }
        return -1;
    }
}
