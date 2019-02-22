/*
* File: Player.java
* Name: David Bruno
* Date: 2/21/19
*/

public class Player{
    private Name name;
    private String dateOfBirth;
    private double moneyBalance;

    public Player(Name name, String dateOfBirth, double moneyBalance){
        setName(name);
        setDOB(dateOfBirth);
        setBalance(moneyBalance);
    }

    public Name getName(){
        return name;
    }

    public String getDOB(){
        return dateOfBirth;
    }

    public double getBalance(){
        return moneyBalance;
    }

    public void setName(String name){
        this.name = new Name(name);
    }

    public void setDOB(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setBalance(Double moneyBalance){
        this.moneyBalance = moneyBalance;
    }

}