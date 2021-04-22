import java.util.Scanner;  // Import the Scanner class
public class StringManipulator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("What is your favorite city?");

        String favoriteCity = myObj.nextLine();
//bringing out variables in statements
        System.out.println("Number of characters in the city name is " + favoriteCity.length());
        System.out.println("The name of the city in uppercase is " +favoriteCity.toUpperCase());
        System.out.println("The name of the city in lowercase is " +favoriteCity.toLowerCase());
        System.out.println("The fist character of the city is " +favoriteCity.charAt(0));


        

    }
    
}
