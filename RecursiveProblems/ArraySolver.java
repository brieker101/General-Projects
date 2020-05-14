
public class ArraySolver
{
    //I WILL TAKE THIS L BECAUSE MY PRIDE IS TOO GREAT
    //On my honor, I did not look up the solutions online.
    //I DID NOT EVEN TRY TO LOOK THIS UP ONLINE.
    public ArraySolver(){}

    //I know this has to do with reaching the end then coming all the way back up 
    //with the largest number.
    public int findLargest(int[] nums){
        int largestNum = 0;
        //Trying to find the largest number
        for(int i = 0; i<nums.length;i++){
            //This is an infinite loop
            largestNum = Math.max(nums[i], findLargest(nums));
        }
        return largestNum;
    }

    //This does the same thing as the previous one but adds them instead.
    public int findSum(int[] nums){
        
        return nums[0] + findSum(nums);
        //I am completely lost right now
    }

}
