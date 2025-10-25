public class Duck extends Animal implements Flyable, Swimmable{

    public Duck(String nama){
        super(nama);
    }

    @Override
    public void makeSound(){
        System.out.println("WEk WEK WEK");
    }
    
    @Override
    public void swim(){
        System.out.println("Yes, i`m Swimming");
    }
    @Override
    public void fly(){
        System.out.println("Yess, i`m Flying");
    }
}