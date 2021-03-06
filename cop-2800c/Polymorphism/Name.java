import java.util.*;

public class Name {
    private String firstName;
    private String middleName = "";
    private String lastName;

    public Name(String fullName) {
        String[] tempName = fullName.split(" ");

        setFirstName(tempName[0]);
        setLastName(tempName[1]);

        if (tempName.length == 3) {
            this.setFirstName(tempName[0]);
            this.setMiddleName(tempName[1]);
            this.setLastName(tempName[2]);
        }
    }

    public Name(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setMiddleName("");
        this.setLastName(lastName);
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
            return (firstName + " " + middleName.charAt(0) + ". " + lastName);
        return (firstName + " " + lastName);
    }

    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Name) && !(obj instanceof String)) {
            return false;
        }

        Name nObj = (Name) obj;

        return this.getFirstName().equals(nObj.getFirstName()) && this.getMiddleName().equals(nObj.getMiddleName())
                && this.getLastName().equals(nObj.getLastName());

    }
}