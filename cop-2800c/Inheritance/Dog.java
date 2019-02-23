public class Dog extends Animal{
    
    private Name name;
    private Breed breed;
    private DOB dateOfBirth;

    public Dog(String name, int weight, int height, String breed, String dateOfBirth){
        super(weight,height);
        setName(name);
        setBreed(breed);
        setDOB(dateOfBirth);
    }

    public Name getName(){
        return name;
    }

    public void setName(String name){
        this.name = new Name(name);
    }
    
    public Breed getBreed(){
        return breed;
    }

    public DOB getDOB(){
        return dateOfBirth;
    }

    public void setBreed(String breed) {
        this.breed = new Breed(breed);
    }

    public void setDOB(String dateOfBirth) {
        this.dateOfBirth = new DOB(dateOfBirth);
    }

    @Overrride
    public String toString(){
        String result;
        result = "Dog: " + name +  " Breed: " + this.getBreed() + " Date of birth: " + this.getDOB() + super.toString() + super.getWeight() + super.getHeight();
        return result;
    }
}