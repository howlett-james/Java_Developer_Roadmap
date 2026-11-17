package Level1.Problems;

public class FindSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 85, 7, 40, 65};
        int smallest = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
