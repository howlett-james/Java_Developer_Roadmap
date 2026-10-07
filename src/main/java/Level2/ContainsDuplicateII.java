package Level2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1};
        int k =3;
        System.out.println(new ContainsDuplicateII().containsDuplicate(arr,k));
    }
    public boolean containsDuplicate(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int previousIndex=0;
            if(map.containsKey(arr[i])){
                previousIndex = map.get(arr[i]);
                if(i-previousIndex <=k){
                    return true;
                }else {
                    map.put(arr[i],i);
                }
            }else {
                map.put(arr[i],i);
            }
        }
        return false;
    }
}
