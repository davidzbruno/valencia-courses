import java.util.*;

/*
* File: Name.java -- for Inheritance project
* Name: David Bruno
* Date: 2/22/19
*/

public class Name{
    private String firstName;
    private String lastName;

    public Name(String fullName) {
        String temp[] = fullName.split(" ");
        if (temp.length == 2){
            setFirstName(temp[0]);
            setLastName(temp[1]);
        }else if(temp.length == 1){
            setFirstName(temp[0]);
            setLastName("");
        }else{
            setFirstName("Ruff");
            setLastName("Ruffington");
        }
    }

    public Name(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return getLastName().equals("") ? getFirstName() : getFirstName() + " " + getLastName();
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
        return this.getFirstName().equals(nObj.getFirstName()) && this.getLastName().equals(nObj.getLastName());
        
    }
}