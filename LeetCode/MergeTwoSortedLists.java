package LeetCode;

import javax.sql.rowset.serial.SerialArray;
import java.util.Arrays;
public class MergeTwoSortedLists 
{

    /*
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
     */
    public static void main(String[] args) 
    {
       int[] testData = {1,2,4};
       int[] testDataTwo = {1,3,4};

       int [] answer = search(testData, testDataTwo);
       for(int i = 0; i < answer.length; i++)
       {
            System.out.println(answer[i]);
       }
    }

    public static int[] search(int[] nums, int[] numsTwo) {
        int index = nums.length + numsTwo.length;
        int answer[] = new int[index];
        int j = 0;
        for(int i = 0; i < index; i++)
        {
            if(i < nums.length)
            {
                answer[i] = nums[i];
            } else {
               answer[i] = numsTwo[j];
               j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }

}