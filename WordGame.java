import java.util.Scanner;
public class WordGame {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);


        System.out.println("Please input your name");
        String myName = myObj.next();

        System.out.println("Please input your age");
        int myAge = myObj.nextInt();

        System.out.println("Please input the name of a city");
        String myCity = myObj.next();

        System.out.println("Please input the name of a college");
        String myCollege = myObj.next();

        System.out.println("Please input a profession");
        String myProfession = myObj.next();

        System.out.println("Please input a type of animal");
        String myAnimal = myObj.next();

        System.out.println("Please input pet's name");
        String myPetName = myObj.next();

        System.out.println("There once was a person named " + 
        myName + " who lived in " + myCity + ". At the age of " + 
        myAge + ", " + myName + " went to college at " + myCollege + 
        ". "+ myName + " graduated and went to work as a " + myProfession + ". Then, " + myName
        + " adpoted a(n) " + myAnimal + " named " + myPetName + ". They both lived happliy ever after!");





        
    }
    
}
