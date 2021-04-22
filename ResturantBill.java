import java.util.Scanner;  // Import the Scanner class

public class ResturantBill {

    //these are my variables 
    public static double tax = 0.0675;
    public static double tip = 0.20;

    public static double mealPriceAfterTax;

    public static double totalMealPrice;

    public static void main(String[] args) {
        //importing a scanner to read the user input
        Scanner myObj = new Scanner(System.in);

        System.out.println("What was the cost of the meal?");
        double mealPrice = myObj.nextDouble();

        mealPriceAfterTax = ((mealPrice*tax) + mealPrice);

        totalMealPrice = ((mealPriceAfterTax*tip)+ mealPriceAfterTax);

        System.out.println("This is the meal price $" + mealPrice + ", this is the meal price after tax $" + mealPriceAfterTax + ", this is the meal price after tax and tip $" + totalMealPrice );



    }



    
}
