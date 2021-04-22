/*
LetterGrade.java: This lesson demonstrates how to use Javax Library, its swing class, 
which contains a JOptionPane object that contains methods we can use to display 
output on the screen,and collect input from the user, by using a graphical user
interface dialog window, rather than the command console keyboard input from scanner 
class. It further demonastrates how to work with Java Arrays, which are special 
variable with multiple storage bins, to conatain several data points that share a 
common data type and a common name. We are going to continue to explore
selection(Decision) Statements from chapter 3 to branch away from natural sequence
into multiple choice paths, which tend to be 3 or more path, specifically focusing
on the negative path nesting scenarios. This time, rather than using a switch 
element, which is limited to integer-based data for the condition test, we will use
the Nested Else-If element, which allows us to work with floating-point condition
tests. We are also going to demonastrate how to work with each of the three(3)
Repetition Structures in Java to loop through a set of statements that get repeated.
Those include the Post-Test Loop Structure called Do/While, the Pre-Test Loop
Structure called While, which uses an indefinite condition test, and the Pre-Test
Loop structure called for, which uses a finite condition test based on a counter
Variable. We will also focus on using compound condition tests that are analyzed 
with logical or operators. This lesson will allow us to create a final course letter
Grade calculator that, for now, only accepts input of quiz values, calculates the running
sum of those quiz values, then calculates the cousrse average based on a count of quizzes.
This will produce a floating-point average of quizzes, which then needs to be converted to 
to be a Letter Grade.
Authored by: Michael Tirrito
CMP128-83149: Computer Science I
Fall 2020
Aniel Alvarado
County College of Morris
Date Last Modified: 12/09/2020
*/


import javax.swing.JOptionPane; // Allows usagge of the methods that belong to JOptionPane 
//object, so that we can display output and collect input using GUI interface.

public class LetterGradeV2_0
{
    public static void main (String[] args)
    {
        //VARIABLE INITIALIZATION AREA
        float [][] quizzes = new float [20][6]; //This is a 20-element array of type float.
        FileWriter outputFile = new FilerWriter("letterGrades.txt");
        PrintWriter writeOut = new PrinterWriter(outputFile);

        /* VISUALIZATION OF THE ARRAY IN RAM

              ---------------------------------------------------------------------------------
        VALUE |0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|0.0|
              ---------------------------------------------------------------------------------
        Index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10| 11| 12| 13| 14| 15| 16| 17| 18| 19|
              ---------------------------------------------------------------------------------
             Lower              quizzes[20] in RAM                                        Upper 
             Bound                     size                                               Bound
        */
    
             
             String [] names = new String[20];
             String [] letterZZZGrades = new String[20];      
             byte studentCount = 0;//changed counter from studentCount to studentCount because we now are keeping track of how many student records have been created, not how many quizzes have been created . There will always be 5 quizzes.
             String letterGrade = "";
             byte sentinel = 0; //This sentinel is used to control the loop that allows more quizzes to be entered for an induvidual student.
             char sentinel2 = 'y'; //This sentinel is used to control the loop that allows more quizzes to be entered for a new student, not the former one.
             String answer = "y";
             float average = 0.0f;

             JOptionPane.showMessageDialog(null, "Welcome to the Letter Grade calculator App v. 2.0\nWritten by: Michael S. Sidaras-Tirrito\nDate Created: 12/09/2020");

             do//This do/while loop controls executing the program multiple times for new students, until the user says they are done working with the app.
             {
                 sentinel2 = 'y'; // Resetting to default prior to procesesing a new student
                 //This is the post-test  loop body. It occurs first, before any condition test. The loop body is guaranteed to execute (iterate) at least one time before the condition is tested, and the loop could potencially end.
             while (sentinel !=-1 && quizcount <20)
             {
              quizzes[quizCount] = Float.parseFloat(JOptionPane.showInputDialog("Enter quiz" + (quizCount + 1) + " Grade: "));
              quizCount++;//Updating array boundary counter variable. 
              sentinel = Byte.parseByte(JOptionPane.showInputDialog("If you are done entering quizzes, type -1 and hit enter. Otherwise, enter 0 to continue: "));//updating indefinite loop structure main control variable.  
            
             }//End of while loop structure (post-test indefinite loop)
             JOptionPane.showMessageDialog(null, "Thank you for entering all the quiz grades for this student! we will now calculate the course average and course letter grade for this student...");
             
             for (int i = 0; i<5; i++)
             {
                average += quizzes[studentCount][i];//Incrementing the sum of quizzes into average as a running sum.
             }//end of for loop
             
             average /= quizCount; // Decrementing the sum of quizzes by total quizzes to get average and store it back into itself. We used averaged to store the sum before.
            quizzes[studentCount][5] = average;
             //USES A NEGATIVE PATH NESTED SELECTION STRUCTURE (ELSE IF) TO DETERMINE LETTER GRADE, RATHER THAN A SWITCH. The reason why is because java switches cannot work with floating-point numbers. Coincidentally, this is how you handle a range of floating-point values.

             if (average >= 93.0f)
            {
            letterGrade = "A";
            }//End letter grade A path
            else if (average >= 90.0f)
            {
             letterGrade = "A-";
            }//end letter grade A-
            else if (average >= 87.0f)
            {
             letterGrade = "B+";
            }//end letter grade B+

            else if (average >= 83.0f)
            {
             letterGrade = "B";
            }//end letter grade B

            else if (average >= 80.0f)
            {
             letterGrade = "B-";
            }//end letter grade B-

            else if (average >= 77.0f)
            {
             letterGrade = "C+";
            }//end letter grade C+

            else if (average >= 70.0f)
            {
             letterGrade = "C";
            }//end letter grade C
            
            else if (average >= 60.0f)
            {
             letterGrade = "D";
            }//end letter grade D
            else
            {
             letterGrade = "F";
            }//end letter grade F


             JOptionPane.showMessageDialog(null, "The average of all quizzes is: " + average + "\nYour student's Letter Grade is : " + LetterGrade);
             //ONE STUDENT'S GRADES HAVE BEEN AVERAGED AND LETTER CSLCULATED. WE NOW NEED 
             //TO LET THE USER DECIDE IF THEY WANT TO CONTINUE USING THIS CALCULATOR FOR 
             //OTHER STUDENTS' GRADES, OR IF THEY WANT TO EXIT THE PROGRAM.

             answer = JOptionPane.showInputDialog("Thank you for using the letter grade calculator app to calculate one student's quizzes average and letter grade!\nWould you like to calculate a letter grade for another student? (Y or N): ");
             sentinel2 = answer.chartAt(0);//collecting first character in answer string to analyze the yes or no character entered by the user.
             if (sentinel2 != 'Y' && sentinel2 != 'y' && sentinel2 != 'N' && sentinel2 != 'n' )
             {
              //TRUE PATH OCCURS WHEN THE USER ENTERED BAD DATA, SOMETHING OTHER THAN A Y OR AN N.
              JOptionPane.showMessagedDialog(null, "Invalid Input: " + sentinel2 + "!\nYou Must Enter only Y or N.\nPlease try again!");
              sentinel2 = 'y';
             } //end of true path
             else if (sentinel2 == 'N' || sentinel2 == 'n')
             {
                 answer = JOptionPane.showInputDialog("we would hate to close the app too soon if you made a typingf mistake!\nAre you absolutely sure you are done with all students, and are ready to exit the program? (Y or N)");

             }//end of nested false path
             else
             {
                 JOptionPane.showMessageDialog(null, "Thank you! we understand that you want to process more stuents.\nWe will now bring you back to the beginning of the program. ");
                 //resetting the array values
                 for (int i = 0; i< quizCount; i++)
                 {
                     quizzes[i] = 0.0f; 
                 } //end of for loop
              //Resetting quizCount, LetterGrade, average and input variables, except sentinel2
              sentinel = 0;
              answer = "";
              average = 0.0f;
              quizCount = 0;
              letterGrade = "";

             }//end nested else if false path selection structure for good or bad data entry on whether or not to exit the program.
            }while (sentinel2 != 'N' && sentinel2 != 'n' && studentCount < 20);//End of Do/While loop structure, which now contains the AND operator instead of the OR operator. This fixes the logical error bug in our code that was causing and infinite loop of our program. 

            JOptionPane.showMessageDialog(null, "Thank you for using the letter grade calculator App v. 1.0!\nThis is the end of the program. ");
    
    }//End of main method 
    
}//End of class LetterGrade