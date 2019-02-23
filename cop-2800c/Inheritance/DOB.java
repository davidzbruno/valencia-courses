/*
* File: DOB.java //Date of Birth
* Name: David Bruno
* Date: 2/22/19
*/

public class DOB extends Date{

    public DOB(int month, int day, int year) {
        super(month, day, year);
    }

    public DOB(String date){
        super(date);
    }

    public boolean isBirthday(DOB date){
        return this.equals(date);
    }
}