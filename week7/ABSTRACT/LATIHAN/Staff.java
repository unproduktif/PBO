public class Staff extends Employe{
    public Staff(String nama, int salary){
        super(nama,salary);
    }
    @Override
    public int calculateBonus(){
        return (int) (getSalary() * 5);
    }

    @Override
    public void tampilData(){
        System.out.println("=== Data Staff ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Gaji: " + getSalary());
        System.out.println("Bonus: " + calculateBonus());
    }
}
