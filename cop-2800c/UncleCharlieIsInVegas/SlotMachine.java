/*
* File: SlotMachine.java
* Name: David Bruno
* Date: 2/21/19
*/

public class SlotMachine {
    private String nameOfSlot;
    private double balance;
    private int numJackpots;
    private int numWins;
    private double payOut;

    public SlotMachine(String nameOfSlot, double balance, int numJackpots, int numWins, double payOut){
        setName(nameOfSlot);
        setBalance(balance);
        setJackpots(numJackpots);
        setWins(numWins);
        setPayOut(payOut);
    }
    
    public String getName(){
        return nameOfSlot;
    }

    public double getBalance(){
        return currBalance;
    }

    public int getNumJackpots(){
        return numJackpots;
    }

    public int getNumWins(){
        return numWins;
    }

    public double getPayOut(){
        return payOut;
    }

    public void setName(String nameOfSlot){
        this.nameOfSlot = nameOfSlot;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setJackpots(int numJackpots){
        this.numJackpots = numJackpots;
    }

    public void setWins(int numWins){
        this.numWins = numWins;
    }
    
    public void setPayOut(double payOut){
        this.payOut = payOut;
    }
}