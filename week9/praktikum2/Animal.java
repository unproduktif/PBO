public abstract class Animal {
    private String nama;

    public Animal(String nama){
        this.nama = nama;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println(nama + " Makan apa");
    }

}
