package Level1.Problems;

public class SecondLargest{
    /* 
    Read array

    IF array length < 2
    Print "Not enough elements"
    STOP
    END IF

    largest = first element
    secondLargest = not initialized
    foundSecond = false

    FOR each element in array, starting from index 1

    IF element > largest
    secondLargest = largest
    largest = element
    foundSecond = true

    ELSE IF element < largest
    IF foundSecond == false OR element > secondLargest
    secondLargest = element
    foundSecond = true
    END IF
    END IF

    END FOR

    IF foundSecond == true
    Print secondLargest
    ELSE
    Print "No second-largest distinct value"
    END IF
    */
   public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 9};

        if(arr.length <2){
            System.out.println("Not enough elements");
        }
        int largest = arr[0];

        int secondLargest =0;

        boolean foundSecond = false;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
                foundSecond = true;
            }else if(arr[i] < largest){
                if(foundSecond==false || arr[i]>secondLargest){
                    secondLargest = arr[i];
                    foundSecond = true;
                }
            }
        }
        if(foundSecond == true){
            System.out.println(secondLargest);
        }else{
            System.out.println("No Second-largest distinct");
        }
        
   }
}