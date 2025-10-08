public class Manager extends Employe{
    public Manager(String nama, int salary){
        super(nama, salary);
    }
    @Override
    public int calculateBonus(){
        return (int) (getSalary() * 10);
    }

    @Override
    public void tampilData(){
        System.out.println("=== Data Manager ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Gaji: " + getSalary());
        System.out.println("Bonus: " + calculateBonus());
    }
}