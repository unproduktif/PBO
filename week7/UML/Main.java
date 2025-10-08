public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dooogyy", 3);
        Dog dog = new Dog("blooory", 1, "Buldok");
        System.out.println(animal.toString());
        dog.makeSound();
        animal.makeSound();

    }
}
