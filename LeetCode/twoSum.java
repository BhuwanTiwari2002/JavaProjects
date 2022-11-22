package LeetCode;

public  class twoSum {
    public static void main(String[] args) 
    {
        System.out.println("Leetcode Problem: TwoSum");
        int numbers[] = {2,7,11,15};
        int answer[] = {0,0};
        answer = twoSums(numbers, 18);
        for(int i = 0; i < answer.length; i++ ) 
        {
            System.out.println(answer[i]);
        }
    }

    public static int[] twoSums(int[] nums, int target) 
    {
        int placeHolder = 0;
        int[] answer = {0,0};
        for(int i = 0; i < nums.length; i++ ) {
            if(i == 0) { } //if the i is 0 then don't do anything 
            else 
            { 
                placeHolder = nums[i-1] + nums[i]; //Take the previous index number and add it to the current index and save it to placeholder
            }
            if (placeHolder == target) //If placeholder = answers then just store the index into answer
            {
                answer[0] = i - 1;
                answer[1] = i;

            }
        }
        return answer;
    }
}