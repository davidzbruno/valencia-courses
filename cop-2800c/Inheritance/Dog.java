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

    @Override
    public String toString(){
        String result;
        result = "(DOG) " + this.getName() +  ", " + this.getBreed() + ", " + this.getDOB() + ", " + super.toString();
        return result;
    }
}