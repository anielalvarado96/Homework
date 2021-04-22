import java.util.Scanner;  // Import the Scanner class
public class MilesPerGallon {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        //prompts user for miles driven
        System.out.println("Input number of miles driven");
    
        //reads users last line and sets it to the object
        double milesDriven = myObj.nextDouble(); 

        //prompts user for gallons used
        System.out.println("Input number of gallons used");

        //reads users last line and sets it to the object
        double gallonsUsed = myObj.nextDouble(); 

        System.out.println("Here is your current miles per gallon: " + (milesDriven/gallonsUsed));
    }
    
}
