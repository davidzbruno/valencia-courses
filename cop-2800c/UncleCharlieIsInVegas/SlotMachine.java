import java.text.DecimalFormat;

/*
* File: SlotMachine.java
* Name: David Bruno
* Date: 2/21/19
*/

public class SlotMachine {
    private String nameOfSlot;
    private int balance;
    private int numJackpots;
    private int jackpotPayout;
    private int numWins;
    private int payout;
    private int plays;

    public SlotMachine(String nameOfSlot, int balance, int numJackpots, int jackpotPayout, int numWins, int payout) {
        setName(nameOfSlot);
        setBalance(balance);
        setJackpots(numJackpots);
        setJackpotPayout(jackpotPayout);
        setWins(numWins);
        setPayout(payout);
    }

    public boolean isEnough(double testAmount){
        return getBalance() > testAmount;
    }

    public boolean isJackpot(){
        return (plays % numJackpots == 0);
    }

    public boolean isWin(){
        return (plays % numWins == 0);
    }

    public String getName() {
        return nameOfSlot;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumJackpots() {
        return numJackpots;
    }

    public int getJackpotPayout() {
        return jackpotPayout;
    }

    public int getNumWins() {
        return numWins;
    }

    public int getPayout() {
        return payout;
    }

    public int getPlays() {
        return plays;
    }

    public void setName(String nameOfSlot) {
        this.nameOfSlot = nameOfSlot;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setJackpots(int numJackpots) {
        this.numJackpots = numJackpots;
    }

    public void setJackpotPayout(int jackpotPayout) {
        this.jackpotPayout = jackpotPayout;
    }

    public void setWins(int numWins) {
        this.numWins = numWins;
    }

    public void setPayout(int payout) {
        this.payout = payout;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("$###,###,###,##0.00");
        return nameOfSlot + ", " + df.format(balance) + ", Plays: " + plays;
    }
}