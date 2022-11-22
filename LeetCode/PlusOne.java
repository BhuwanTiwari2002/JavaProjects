package LeetCode;

import java.util.Arrays;
public class PlusOne 
{

    /*
    Input: digits = [1,2,3]
    Output: [1,2,4]
     */
    public static void main(String[] args) 
    {
        int[] digits = {4,2,1,2,6};
        int[] answer = new int[digits.length];
        answer = PlusOne(digits);
        for(int i = 0; i < answer.length; i++)
        {
            System.out.print(answer[i]);
        }
    }

    public static int[] PlusOne(int[] nums) {
       for(int i = 0; i < nums.length; i++){
            if(nums[nums.length - 1] < 10)
            { 
                nums[nums.length - 1] = nums[nums.length - 1] + 1;
                return nums;
            } else {
                nums[0] = nums[0] + 1;
                return nums;
            }
        }
        return nums;
    }

}