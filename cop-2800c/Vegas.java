import java.util.*;

public class Vegas{
    public static void main (String[] args){

        //Input
        Scanner sc = new Scanner(System.in);
        System.out.println("How many quarters to you have in your jar? ");
        int quarters = sc.nextInt();
        sc.close();

    //Vegas Game
        int playCounter = 0;
        int[] machinePlays = {0,0,0};

        //Random number to decide the first machine played
        Random ran = new Random();
        int currentMachine = ran.nextInt(3) + 1;

        while(quarters-->0){
            playCounter++;
            machinePlays[currentMachine-1]++;
            //Standard Output
            System.out.printf("Play: %d\nMachine: %d\nQuarter(s) left: %d\n",playCounter,currentMachine,quarters);
            //Additional Winning Output
            int winningMachine = win(machinePlays,currentMachine);
            if(winningMachine != -1){
                quarters += payOut(winningMachine);
                winOutput(winningMachine);
            }

            currentMachine++;
            if(currentMachine > 3) currentMachine = 1;
        }

        //End of Game -- Vicki is out of quarters
        System.out.printf("GAME OVER. You played %d games before running out of quarters.\n",playCounter);
    }

    private static int win(int[] machinePlays, int currentMachine){
        //Machine 1 Probability
        if(currentMachine == 1 && machinePlays[0]%35==0){
            return 1;
        }
        //Machine 2 Probability
        else if(currentMachine == 2 && machinePlays[1]%100==0){
            return 2;
        }
        //Machine 3 Probability
        else if(currentMachine == 3 && machinePlays[2]%8==0){
            return 3;
        }
        return -1;
    }

    private static int payOut(int winningMachine){
        //Machine 1 Payout
        if(winningMachine == 1){
            return 25;
        }
        //Machine 2 Payout
        else if(winningMachine == 2){
            return 75;
        }
        //Machine 3 Payout
        else if(winningMachine == 3){
            return 5;
        }
        return 0;
    }

    private static void winOutput(int winningMachine){
        System.out.printf("CONGRATS! YOU JUST WON $%.2f ON MACHINE %d!\n",change(payOut(winningMachine)),winningMachine);
    }

    private static double change (int quarters){
        return (quarters/4) + (quarters%4)*0.25;
    }
}