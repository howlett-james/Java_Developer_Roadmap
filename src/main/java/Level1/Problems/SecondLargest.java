package Level1.Problems;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {-10, -20, -5, -30};
        if(arr.length==0){
            return;
        }
        int largest = arr[0];
        int secondLargest = largest;
        boolean foundSecondLargest = false;
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            if(current>largest){
                secondLargest = largest;
                largest = current;
                foundSecondLargest = true;
            }else if(current < largest && (!foundSecondLargest || current>secondLargest)){
                secondLargest = current;
                foundSecondLargest = true;
            }
        }
        if(foundSecondLargest){
            System.out.println(secondLargest);
        }else {
            System.out.println("No second largest element");
        }
    }
}
