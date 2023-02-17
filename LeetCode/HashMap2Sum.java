package LeetCode;

import java.lang.reflect.Array;
import java.util.HashMap;

public class HashMap2Sum {
    public static void main(String[] args) {
        System.out.println("Hi");
        HashMap hashMap = new HashMap();
        hashMap.put(0, 2);
        hashMap.put(1, 7);  
        hashMap.put(2, 11);  
        hashMap.put(3, 15);  
        int answer = twoSumUsingHashMap(hashMap, 9);
            System.out.println(answer);

        

    }

    static int twoSumUsingHashMap(HashMap hashMap, int target)
    {
        int placeHolder = 0;
        int placeHolder2 = 0;
        int answer = 0;
        for(int i = 0; i < hashMap.size(); i++) {
            //if(i == 0)
            //{ placeHolder = (Integer)hashMap.get(i); }
            placeHolder = (Integer)hashMap.get(0);
            placeHolder2 = placeHolder + (Integer)hashMap.get(i);
            if(placeHolder2 == target)
            {
                answer = placeHolder;
                return answer;
            } else {
                placeHolder = i;
            }
        }
        return answer;
    }
    
}
