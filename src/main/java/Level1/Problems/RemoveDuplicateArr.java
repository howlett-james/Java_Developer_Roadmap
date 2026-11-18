package Level1.Problems;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};
        Set<Integer> unique = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            unique.add(arr[i]);
        }
        System.out.println(unique);
    }
}
