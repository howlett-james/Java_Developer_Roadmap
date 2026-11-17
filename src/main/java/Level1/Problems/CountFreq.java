package Level1.Problems;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40};
        int target = 10;
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(target == arr[i]){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
