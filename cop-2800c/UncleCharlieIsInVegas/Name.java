import java.util.*;

/*
* File: Name.java
* Name: David Bruno
* Date: 2/21/19
*/

public class Name{
    private String firstName;
    private char middleInitial;
    private String lastName;

    public Name(String fullName) {
        String temp[] = fullName.trim().split(" ");
        if (temp.length < 3)
            Name(temp[0],temp[1]);
        else
            Name(temp[0],temp[1],temp[2]);
    }

    public Name(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        middleInitial = 365;
    }

    public Name(String firstName, char middleInitial, String lastName) {
        this.setFirstName(firstName);
        this.setMiddleInitial(middleInitial);
        this.setLastName(lastName);
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        if (middleInitial != 365)
            return (firstName + " " + middleInitial + ". " + lastName);
        return (firstName + " " + lastName);
    }

    @Override
    public boolean equals(Object obj){
        // If the object is compared with itself then return true   
        if (obj == this) { 
            return true; 
        } 

        if (!(obj instanceof Name)  && !(obj instanceof String)) {
            return false; 
        }

        Name nObj = (Name) obj;

        return this.getFirstName().equals(nObj.getFirstName()) && this.getMiddleInitial == obj.getMiddleInitial() && this.getLastName().equals(nObj.getLastName());
        
    }
}