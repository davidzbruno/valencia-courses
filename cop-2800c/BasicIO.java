import java.util.*;

public class BasicIO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Please enter three numbers: ");
        
        int temp[] = new int[3], sum = 0;
        for(int i = 0; i < 3; ++i){
            temp[i] = sc.nextInt();
            sum += temp[i];
        }
        sc.close();
        double average = sum / 3.0;

        //Output
        System.out.printf("The three numbers are: %d, %d, and %d.\n",temp[0],temp[1],temp[2]);
        System.out.printf("The sum of the numbers is: %d.\n",sum);
        System.out.printf("The average of the numbers is %.2f\n",average);
    }
}