package LeetCode;

import javax.sql.rowset.serial.SerialArray;

public class BinarySearch 
{

    //Input: nums = [-1,0,3,5,9,12], target = 9
    //Output: 4
    public static void main(String[] args) 
    {
       int[] testData = {-1,0,3,5,9,12};
       System.out.println(search(testData, 9));
    }

    public static int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return target = i;
            }
        }

        return -1;
    }

}