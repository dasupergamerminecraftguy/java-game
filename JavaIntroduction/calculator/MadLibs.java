
/**
 * MadLib generator!
 */

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Give a random word(for example: poop): ");
        String person = s.nextLine();
        System.out.print("Give a random number: ");
        int number = s.nextInt();
        String place = "the toilet  ";
        String animal = "garbage can ";
        
        System.out.println("Once upon a time, there was a peice of" + person +  " on the street . The peice of" + person +  "had  "+ number + " hunger games wins.");
        System.out.println("One day, the peice of" + person + "was going to " + place + " when the peice of" + person +" accidentally ran over a " + animal + "trying to get to the bathroom");
    }
}
