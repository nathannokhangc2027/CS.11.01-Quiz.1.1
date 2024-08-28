import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Nathan
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println ("What is your age?");
        age = scanner.nextInt();
        System.out.println ("What is your first name?");
        scanner.nextLine();
        firstName = scanner.nextLine();
        System.out.println ("What is your favourite food?");
        favouriteFood = scanner.nextLine();
        System.out.println ("Name: " + firstName + "\n\nAge: " + age + "\n\nFavourite food: " + favouriteFood);







    }

}
