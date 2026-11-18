package Level1.Problems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;
        System.out.println(isFound(arr, target));
        
    }
    public static int isFound(int[] arr, int target){
        for (int i =0;i<arr.length;i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
