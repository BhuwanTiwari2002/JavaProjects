package FunProjects;
import java.util.Random;
import java.util.Scanner;


public class RandomPassword
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in); 
        System.out.println("How long do you want your password to be?");
        int passwordLength = userInput.nextInt();
        System.out.print(passwordGenerator(passwordLength));
    }

    static String passwordGenerator(int userLength)
    {
        char[] specialCharacters = {'$','!','&','*'};
        char[] uppercaseLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lowercaseLetter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] randomLocations = {"specialCharacters", "uppercaseLetter", "lowercaseLetter"};
        String password = "";
        Random random = new Random();
        String randomLocationValue = "";
        for(int i = 0; i < userLength; i++)
        {
            int randomNumber = random.nextInt(0,26);
            int randomNumber2 = random.nextInt(0,3);
            int randomNumber3 = random.nextInt(0,4);

            randomLocationValue = randomLocations[randomNumber2];

            if(randomLocationValue == "specialCharacters")
            { password = password + specialCharacters[randomNumber3]; }
            if(randomLocationValue == "uppercaseLetter")
            { password = password + uppercaseLetter[randomNumber];}
            if(randomLocationValue == "lowercaseLetter")
            { password = password + lowercaseLetter[randomNumber];}   
        }
        return password;
    }



}