package FunProjects;
import java.util.Scanner;
//add methods

public class Diamonds 
{
    public static void main(String[] args) {
        //Creating an scanner object
        Scanner userInput = new Scanner(System.in); 
        System.out.println("Pick how tall you want your pyramid to be?");
        int height = userInput.nextInt();
        //Closing the object to prevent memory leak
        userInput.close();
        drawDiamond(height);
    }

    public static void drawDiamond( int height)
    {
        int placeHolder = 0;
        // Looping the rows
        for(int i = 0; i < height; i++)
        {
            //Add an space at the start
            if(i == 0)
            {
                for(int g = height + 1; g >= 0; g--)
                { System.out.print(" ");}
            }
             placeHolder++;
             for(int j = 0; j < placeHolder; j++ )
             {
                if(j == 0)
                {
                    //Adding the star and space
                    System.out.println("*");
                    for(int g = height - i; g > 0; g--)
                    {System.out.print(" ");}
                }
                System.out.print(" ");
                if(placeHolder == height){break;}
                System.out.print("*"); 
             }
             System.out.print(" "); 
        }
    }

}

