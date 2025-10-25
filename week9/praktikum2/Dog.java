public class Dog extends Animal implements Swimmable{
    public Dog(String nama){
        super(nama);
    }
    public void makeSound(){
        System.out.println("GOK GOK GOK");
    }
    public void swim(){
        System.out.println("Yes, i`m Swimming a litle bit");
    }
}