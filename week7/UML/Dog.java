public class Dog extends Animal{
    private String breed;

    public Dog(){
    }

    public Dog(String nama, int age, String breed){
        super(nama, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    } 

    public void setBreed(String breed){
        this.breed = breed;
    }
    @Override
    public void makeSound(){
        System.out.println("go gog gog");
    }
    @Override
    public String toString(){
        return "Dog { " + super.toString() + " Breed = " + breed +" }";
    }
}
