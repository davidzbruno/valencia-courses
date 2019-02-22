import java.util.*;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        middleName = "";
    }

    public Name(String firstName, String middleName, String lastName) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        if (middleName.length() > 0)
            return (firstName + middleName.charAt(0) + ". " + lastName);
        return (firstName + " " + lastName);
    }
}