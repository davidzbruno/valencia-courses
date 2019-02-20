import java.util.*;

public class Array{
    public static void main(String[] args){

    //You generate and store 10 numbers randomly generated all between 1 and 100.
    int[] randomArray = random(10);
    
    //Declare an array that stores the random numbers.
    int[] arr = randomArray;
    
    //Print out the array
    print(arr);
    
    //Sort the array
    sort(arr);
    
    //Print out the array
    print(arr);
    
    //Search the array for a number user ask for between 1 and 100...display found or not found
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a nunber between 1 and 100: ");
    int userTarget = sc.nextInt();
    System.out.println(search(arr, userTarget)? "Your number was found!" : "Your number was NOT found.");
    sc.close();

    //Display each number from 1 to 100 and the number of times found in the array
    histogram(arr);
    
    //Display the average of the numbers in the array
    System.out.println("Average: " + average(arr));
    
    //Display the highest number in the array
    System.out.println("Maximum: " + max(arr));

    //Display the lowest number in the array
    System.out.println("Minimum: " + min(arr));

    }

    private static int[] random(int num){
        Random r = new Random();
        int[] result = new int[num];

        for(int i = 0; i < num; ++i){
            result[i] = r.nextInt(100) + 1;
        }
        return result;
    }

    private static void print(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    private static void sort(int[] arr){
        int i = 0, temp = 0, bottom = arr.length - 1;
        boolean switchMade;

        do{
            switchMade = false;
            for(i = 0; i < bottom; ++i){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]= temp;
                    switchMade = true;
                }
            }
            bottom--;
        }while(switchMade);
    }

    private static boolean search(int[] arr, int target){
        int start = 0, end = arr.length - 1, middle = 0;

        while(start <= end){
            middle = (start+end)/2;
            if(arr[middle] < target){
                start = middle + 1;
            }
            else if(arr[middle] > target){
                end = middle - 1;
            }
            else{
                return true;
            }
        }

        return false;
    }

    private static void histogram(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + ": X ");
            while(i != arr.length-1 && arr[i] == arr[i+1]){
                System.out.print("X ");
                i++;
            }
            System.out.println();
        }

    }

    private static double average(int[] arr){
        double result = 0.0;
        for(int i : arr)
            result += i;
        return result / arr.length;
    }

    private static int max(int[] arr){
        //Since the array is already sorted the maximum value is at the last index
        return arr[arr.length - 1];
        
        /*
        int result = arr[0];
        for(int i : arr)
            result = (result > i) ? result : i;
        return result;
        */
    }

    private static int min(int[] arr){
        //Since the array is already sorted the maximum value is at the first index
        return arr[0];
        /*
        int result = arr[0];
        for(int i : arr)
            result = (result < i) ? result : i;
        return result;
        */
    }
}