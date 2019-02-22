import java.text.DecimalFormat;

/*
* File: Player.java
* Name: David Bruno
* Date: 2/21/19
*/

public class Player{
    private Name name;
    private Date dateOfBirth;
    private int moneyBalance;

    public Player(String name, String dateOfBirth, int moneyBalance){
        setName(name);
        setDOB(dateOfBirth);
        setBalance(moneyBalance);
    }

    public Name getName(){
        return name;
    }

    public Date getDOB(){
        return dateOfBirth;
    }

    public int getBalance(){
        return moneyBalance;
    }

    public void setName(String name){
        this.name = new Name(name);
    }

    public void setDOB(String dateOfBirth){
        this.dateOfBirth = new Date(dateOfBirth);
    }

    public void setBalance(int moneyBalance){
        this.moneyBalance = moneyBalance;
    }
    
    public void play(SlotMachine machine){
        this.moneyBalance--;
        machine.setBalance(machine.getBalance() + 1);
        machine.setPlays(machine.getPlays() + 1);
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("$###,###,###,##0.00");
        return name + ", " + dateOfBirth + ", " + df.format(moneyBalance);
    }

}