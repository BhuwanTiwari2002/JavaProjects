package LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) 
    {
        String strs[] = {"Hell","Hello","Hen"};
        System.out.println(LongestCommonPrefix(strs)); 
    }

    static String LongestCommonPrefix(String strs[]) {
        char[] placeHolder1 = strs[0].toCharArray();
        char[] placeHolder2 = strs[1].toCharArray();
        char[] placeHolder3 = strs[2].toCharArray();
        String answer = "";
        int minLength = placeHolder1.length;
        if(placeHolder2.length < minLength)
        {
            minLength = placeHolder2.length;
            if(placeHolder3.length < minLength){
                minLength = placeHolder3.length;
            }
        }
        for(int i = 0; i < minLength; i++) 
        {
            if(placeHolder1[i] == placeHolder2[i] && placeHolder2[i] == placeHolder3[i]) 
            { 
                answer += placeHolder1[i];
            }
        }
        if(answer != "")
        {
            return String.valueOf(answer);
        }
        return "There is no common prefix among the input strings.";
    }
    
}
