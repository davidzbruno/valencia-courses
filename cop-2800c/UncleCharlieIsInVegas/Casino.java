import java.util.*;

/*
* File: Casino.java
* Name: David Bruno
* Date: 2/22/19
*/

public class Casino{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player players[] = new Player[50];
        SlotMachine machines[] = new SlotMachine[50];

        //Create Uncle Charlie and basic machines
        players[0] = new Player("Uncle D Charlie", "2/21/2019", 100);
        machines[0] = new SlotMachine("Lucky 7", 5000, 10000, 5000, 10, 5);
        machines[1] = new SlotMachine("Lucky Lotto", 55000, 100000, 75000, 50, 25);
        machines[2] = new SlotMachine("Purple People Eater", 1000, 50, 40, 5, 2);

        Player curPlayer = players[0];
        SlotMachine curMachine = machines[0];

        String option = "exit";
        do{
            display(curPlayer,curMachine);
            option = sc.next();
            int index = 0;
            switch(option){
                case "1":
                    print(players);
                    System.out.println("Which player do you choose? ");
                    index = sc.nextInt() - 1;
                    if(players[index].getBalance() < 1){
                        System.out.println("This player has insufficient funds. Pick a different player.");
                        break;
                    }
                    curPlayer = players[index];
                    break;
                case "2":
                    print(machines);
                    System.out.println("Which machine do you choose? ");
                    index = sc.nextInt() - 1;
                    if(machines[index].getBalance() < machines[index].getPayout()){
                        System.out.println("This machine has insufficient funds. Pick a different machine.");
                        break;
                    }
                    curMachine = machines[index];
                    break;
                case "3":
                    newPlayer(players);
                    break;
                case "4":
                    newMachine(machines);
                    break;
                case "5":
                    play(curPlayer,curMachine);
                    break;
                case "exit":
                    System.out.println("Thank you for coming to the Casino!");
                    break;
                default:
                    System.out.println("Invalid entry. Please try again.");
                    break;
             }
        }while(!option.equals("exit"));
    }
    public static void display(Player curPlayer, SlotMachine curMachine){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Current Player: " + curPlayer.getName() + " $" + curPlayer.getBalance() + " ---- Current Machine: " + curMachine.getName());
        System.out.println("[1] Select a player [2] Select a machine [3] Add Player [4] Add Machine [5] Play [exit] Exit ");
        System.out.println("--------------------------------------------------------------------------------");

    }
    public static int indexLast(Object[] arr){
        for(int i = 0; i < arr.length; ++i){
            if( arr[i] == null ) return i;
        }
        return -1;
    }
    public static void newPlayer(Player[] players){
        if(indexLast(players) == -1){
            System.out.println("The Casino is full. No more players can enter the casino.");
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first name of this new player?");
        String firstName = sc.next();
        System.out.println("What is the last name of this new player?");
        String lastName = sc.next();
        System.out.println("What is the DOB of this new player?");
        String dateOfBirth = sc.next();
        System.out.println("What is the money balance of this new player?");
        int balance = sc.nextInt();

        players[indexLast(players)] = new Player((firstName+" "+lastName), dateOfBirth, balance);
    }
    public static void newMachine(SlotMachine[] machines){
        if(indexLast(machines) == -1){
            System.out.println("The Casino is full. No more machines can be brought into the casino.");
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of this slot?");
        String name = sc.next();
        System.out.println("What is the balance of this slot?");
        int balance = sc.nextInt();
        System.out.println("How many plays does it take for someone to win the jackpot?");
        int numJackpots = sc.nextInt();
        System.out.println("How many plays does it take for someone to win normally?");
        int numWins = sc.nextInt();
        System.out.println("What is the jackpot payout of this slot?");
        int jackpotPayout = sc.nextInt();
        System.out.println("What is the normal payout of this slot?");
        int payout = sc.nextInt();

        machines[indexLast(machines)] = new SlotMachine(name, balance, numJackpots,jackpotPayout, numWins, payout);
    }
    public static void print(Object[] arr){
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == null)
                continue;
            System.out.println("[" + (i+1) + "] " + arr[i]);
        }
    }
    public static void play(Player player, SlotMachine machine){
        Scanner sc = new Scanner(System.in);
        String input = "0";
        if(player.getBalance() < 1){
            System.out.println("This player has insufficient funds. Pick a different player.");
            return;
        }
        if(machine.getBalance() < machine.getPayout()){
            System.out.println("This machine has insufficient funds. Pick a different machine.");
            return;
        }

        player.play(machine);
        
        if(machine.isJackpot()){
            System.out.println("YOU JUST HIT THE " + machine.getName().toUpperCase() + " JACKPOT!");
            player.setBalance( player.getBalance() + machine.getJackpotPayout() );
            machine.setBalance( machine.getBalance() - machine.getJackpotPayout() );
        }
        else if(machine.isWin()){
            System.out.println("You won $" + machine.getPayout()+ " on the " + machine.getName() + " machine.");
            player.setBalance( player.getBalance() + machine.getPayout() );
            machine.setBalance( machine.getBalance() - machine.getPayout() );
        }else{
            System.out.println("Sorry. Better luck next time " + player.getName()+ ".");
        }
    }
}