import java.text.DecimalFormat;

public class Person{
    private Name name;
    private char gender;
    private int age;
    private double salary;

    public Person(String fullName, char gender, int age, double salary){
        setName(fullName);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public Person(String fullName, char gender, int age){
        setName(fullName);
        setGender(gender);
        setAge(age);
        setSalary(0.00);
    }

    public Name getName(){
        return name;
    }
    public void setName(String fullName){
        String temp[] = fullName.split(" ");
        name = (temp.length > 2) ? new Name(temp[0],temp[1]) : new Name(temp[0],temp[1],temp[2]);
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        gender = Character.toUpper(gender);
        if( gender == 'M' || gender == 'F' )
            this.gender = gender;
        else
            System.out.println("Gender must equal M or F only.");
    }
    public char getAge(){
        return age;
    }
    public void setAge(int age){
        if( age > 1 && age < 120 )
            this.age = age;
        else
            System.out.println("Age must be between 1 and 120.");
    }
    public char getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if( salary > 0)
            this.salary = salary;
        else
            System.out.println("Salary must be a positive number.");
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###,###,###,##0.000");
        return name + ", " + gender + ", " + age + ", $" + df.format(salary);
    }
    
}