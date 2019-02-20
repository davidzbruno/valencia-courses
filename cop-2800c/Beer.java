import java.util.*;

public class Beer{
    public static void main(String[] args){        
        final int DAYS_PER_YEAR = 365;
        final int CALORIES_PER_BEER = 150;
        final int POUNDS_PER_YEAR = 15;
       
        //Input
        Scanner sc = new Scanner(System.in);

        System.out.println("On average, how many beers will you consume each day?");
        double beersPerDay = sc.nextDouble();

        System.out.println("On average, how much will you pay for each can of beer?");
        double moneyPerBeer = sc.nextDouble();
        
        sc.close();

        //Output
        System.out.printf("That is approximately %.2f beers in one year.\n", beersPerDay * DAYS_PER_YEAR);
        System.out.printf("In one year, you will consume approximately %.2f calories from beer alone.\n", beersPerDay * CALORIES_PER_BEER * DAYS_PER_YEAR);
        System.out.printf("Without diet or exercise to counter these calories, you can expect to gain %.2f pounds from drinking that much beer this year.\n", beersPerDay * POUNDS_PER_YEAR);
        System.out.printf("You will spend %.2f per year.\n", beersPerDay * moneyPerBeer * DAYS_PER_YEAR);
        
    }
}