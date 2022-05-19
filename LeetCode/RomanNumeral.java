package LeetCode;

public class RomanNumeral
{
    //Still needs more work, some constraints aren't added yet
    public static void main(String[] args) {
        System.out.println("Hello World");
        int answer = romanToInt("LVIII");
        System.out.println( "The Roman Numeral Conversion is "+ answer);
    }
    
     public static int romanToInt(String s) {
        char[] romanLetters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] romanToValue = {1, 5, 10, 50, 100, 500, 1000};
        int currentCount = 0;
        int test = 0;
        for(int i = 0; i < s.length(); i++) {
                //Second Loop
                for(int j = 0; j < 7; j++) {
                    if(s.charAt(i) == romanLetters[j]) {
                       currentCount = romanToValue[j] + currentCount;
                    }    
                }
            }
        return currentCount;
     }

}