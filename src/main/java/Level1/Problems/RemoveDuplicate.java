package Level1.Problems;

public class RemoveDuplicate {
    /* 
    Initialize the array
    FOR i = 0 TO array length - 1

    Set duplicate = false

    FOR j = 0 TO i - 1

    IF array[i] == array[j]
    Set duplicate = true
    BREAK
    END IF

    END FOR

    IF duplicate == false
    Print array[i]
    END IF

    END FOR */
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 8, 1, 5, 9};
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}