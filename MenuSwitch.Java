/* 
MenuSwitch.java: This lesson teaches us how to use java Selection(Decision) 
Statements from chapter 3 to branch away from natural sequence into multiple choice 
paths, which tend to be 3 or more paths. Each path have its own independent set 
of statements or no statements at all. All paths will eventually join back to 
natural sequence. In this lesson, we learn how to do that with switches and learn 
about the importance of the break statement. The program will use a switch to 
control output on a screen, based on which option the user selects at run-time from 
an on-screen menu of choices.
Authored by: Michael Sidaras-Tirrito
CMP128-83149: Computer Science I
Fall 2020
Professor Tirrito
County College of Morris
Date Last Modified: 10/28/2020
*/

import java.util.Scanner;
 public class MenuSwitch
 {
     public static void main(String [] args)
     {
         //Initialization variables and constants 
         int input = 0; //This variable collect the choice of menu options
         Scanner Keyboard = new Scanner(System.in);

         //OUTPUTTING THE WELCOME BANNER
        System.out.println("************************************************************");
		System.out.println("*            Welcome to the Menu Switch Aplication         *");
		System.out.println("*                Written by: Aniel Alvarado                *");
		System.out.println("*                 Date Written: 10/28/2020                 *");
		System.out.println("************************************************************");

        //Menu output to user
        System.out.println("This is a sample program to demonstrate using a string to the process menu selection \n\n ");

        for (int i = 0; i<60; i++)
        {
        System.out.print('_');
        }
        System.out.println("");//Output a top border of underscores and terminates the l
    
        System.out.println("| Main Menu                                                |");
        System.out.println("| ---------------------------------------------------------|");
        System.out.println("|1. Print Professor's Name                                 |");
        System.out.println("|2. Print Student #1's Name                                |");
        System.out.println("|3. Print Student #2's Name                                |");
        System.out.println("|4. Print Student #3's Name                                |");
        System.out.println("|5. Print Student #4's Name                                |");
        System.out.println("|6. Print Student #5's Name                                |");
        System.out.println("|7. Print Student #6's Name                                |");
        System.out.println("|8. Print Student #7's Name                                |");
        System.out.println("|9. Print Student #8's Name                                |");
        System.out.println("|10.Print Student #9's Name                                |");
        System.out.println("|11.Print Student #10's Name                               |");
        System.out.println("|12.Print Student #11's Name                               |");
        System.out.println("|----------------------------------------------------------|");
        System.out.print("|MAKE SELECTION NOW -->                                     |");

        for (int i = 0; i<60; i++)
        {
        System.out.print('_');
        }
        System.out.println("\n");//Outputs a bottom border of underscores and terminates the line
        
        input = Keyboard.nextInt();
        Keyboard.nextLine();

        switch (input)
            {
                case 1: 
                    System.out.println("Professor Tirrito");
                    break;
                case 2: 
                    System.out.println("Alex Santos");
                    break;
                case 3: 
                    System.out.println("Aniel Alvarado");
                    break; 
                case 4: 
                    System.out.println("Daniel Glueck");
                    break;   
                case 5: 
                    System.out.println("Frank Gencarelli");
                    break;
                case 6: 
                    System.out.println("Gavyn Crellin");
                    break;
                case 7: 
                    System.out.println("George Gallini");
                    break;
                case 8: 
                    System.out.println("Jason Caicedo");
                    break;
                case 9: 
                    System.out.println("Jenna Jones");
                    break;
                case 10: 
                    System.out.println("Maggie Warner");
                    break;
                case 11: 
                    System.out.println("Ronak Patel");
                    break;
                case 12: 
                    System.out.println("Tyler Torner");
                    break;
                default:
                    System.out.println("You have enter invalid input. No students exists at that number.");
            }//end switch input
            System.out.println("\nThis concludes the Menu Switch Aplication. Have a nice day.\n");
     }//end main method 
 }//end class 