public class Animal{
    private String nama;
    private int age ;

    public Animal(){

    };

    public Animal(String nama, int umur){
        this.nama = nama;
        this.age = umur;
    }
    public String getName(){
        return nama;
    }

    public void setNama(String nama){
        this.nama =nama;
    }
    
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Mau miowwww");
    }
    @Override
    public String toString(){
        return "Animal { "+ " nama = "+ this.nama+" umur = "+  this.age +"}";
    }
}