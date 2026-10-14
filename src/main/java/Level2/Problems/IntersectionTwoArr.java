package Level2.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionTwoArr {
    /*Create a HashSet from the first array
Create an empty HashSet for the result

FOR each number in the second array
    IF the first set contains the number
        Add it to the result set
    END IF
END FOR

Return the result*/
    public static void main(String[] args) {
        System.out.println(findIntersection(new int[]{1, 2, 2, 3},new int[]{2, 2, 4}));
    }
    public static Set<Integer> findIntersection(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            if(set1.contains(arr2[i])){
                set2.add(arr2[i]);
            }
        }
        return set2;
    }
}
