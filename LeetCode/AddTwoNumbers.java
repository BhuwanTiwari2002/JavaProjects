package LeetCode;
import java.util.Arrays;
import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) 
    {
        int arr[] = {2,4,3};
        int arrTwo[] = {5,6,4};
        System.out.println(AddTwoNumbers(arr, arrTwo));

    }

    public static String AddTwoNumbers(int[] arr1, int[] arr2) {
        
        
        int placeholder2 = 0;
        String answer = "";
        for(int i = 0; i < arr1.length; i++)
        {
            
            placeholder2 = arr1[i] + arr2[i]; 
            if(placeholder2 >= 10) {
                arr1[i + 1] += placeholder2/placeholder2;
                placeholder2 = placeholder2 % placeholder2;
            }

            answer += Integer.toString(placeholder2);
        }
        return answer;
    }

}
