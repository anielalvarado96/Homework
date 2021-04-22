import java.util.Scanner;
//my name is anielalvarado
public class IngredientAdjuster {

    //divided cups by 48 to get per cookie measurement. Will do this for each double.
    public static double cupsOfSugarPerCookie = (1.5/48);
    public static double cupsOfButterPerCookie = (1.0/48);
    public static double cupsOfFlourPerCookie = (2.75/48);


     //This is my main
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("How many cookies do you want to make?");
        int amountOfCookies = myObj.nextInt();

        System.out.println("This is the recipe to make " + amountOfCookies + " cookies!");
        System.out.println("Amount of Sugar: " + cupsOfSugarPerCookie*amountOfCookies);
        System.out.println("Amount of Butter: " + cupsOfButterPerCookie*amountOfCookies);
        System.out.println("Amount of Flour: " + cupsOfFlourPerCookie*amountOfCookies);

    }
    
}
