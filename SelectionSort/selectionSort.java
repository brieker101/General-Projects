
public class selectionSort
{
    public static int[] selectionSort(int[] nums){
        for(int i = 0; i<nums.length;i++){

            for(int j = i; j < nums.length; j++){
                int lowestSoNumber = nums[i];
                int lowestIndex = i;

                if(nums[j] < lowestSoNumber){
                    lowestSoNumber = nums[j];
                    lowestIndex = j;
                }

                int temp = nums[i];
                nums[i] = nums[lowestIndex];
                nums[lowestIndex] = temp;
            }
        } 
        return nums;
     }
}
