import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double gasPrice = 0;


        System.out.println("how many gallons are in your tank? ");
        if (in.hasNextDouble())
        {
            gallonsInTank = in.nextDouble();
            in.nextLine(); // must lear buffer after reading a number
        }
        else
        {
            System.out.println("you entered an invalid number. ");
            System.exit(0);
        }

        System.out.println("What is the fuel efficiency in miles per gallon? ");
        if (in.hasNextDouble())
        {
            milesPerGallon = in.nextDouble();
            in.nextLine(); // must lear buffer after reading a number
        }
        else
        {
            System.out.println("you entered an invalid number. ");
            System.exit(0);
        }
        System.out.println("what is the price per gallon");
        if (in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
            in.nextLine(); // must lear buffer after reading a number
        }
        else
        {
            System.out.println("you entered an invalid number. ");
            System.exit(0);
        }
        System.out.println("With the amount of gas you have in your car, you cacn go " + gallonsInTank * milesPerGallon );
        System.out.println("The price of gas for 100 miles is " + (100 - gallonsInTank * milesPerGallon)/milesPerGallon*gasPrice);

    }
}