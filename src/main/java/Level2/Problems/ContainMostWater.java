package Level2.Problems;

public class ContainMostWater {
    /* START

    left = 0
    right = length of array - 1
    maxArea = 0

    WHILE left < right

        width = right - left

        height = minimum of height[left] and height[right]

        area = width * height

        maxArea = maximum of maxArea and area

        IF height[left] < height[right]
            left = left + 1
        ELSE
            right = right - 1

    RETURN maxArea

END */
    public static void main(String[] args) {
        int[] arr ={1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = arr.length-1;
        int maxArea = 0;
        while(left<right){
            int width = right - left;
            int height = Math.min(arr[left],arr[right]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxArea);
    }    
}
