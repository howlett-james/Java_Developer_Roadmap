package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(twoSum.getArray(),twoSum.getTarget())));
    }
    public int[] twoSum(int [] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int x = target-arr[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }else {
                map.put(arr[i],i);
            }
        }
        return null;
    }

    public int[] getArray(){

        System.out.println("Enter the total Number of elements:");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the each elements:");
        for(int i =0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    public int getTarget(){
        System.out.println("Enter Target Value:");
        return scanner.nextInt();
    }
}
