package LeetCode;

public class RotatedSortedArray {
    /*
      Input: nums = [4,5,6,7,0,1,2], target = 0
      Output: 4
     */
    public static void main(String[] args) 
    {
        int [] digits = {1};
        System.out.println(RotatedSortedArray(digits,  0));
    }
    public static int RotatedSortedArray(int[] nums, int target) {
        int answer = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                answer = i;
            }
        }
         return answer;
     }
}
