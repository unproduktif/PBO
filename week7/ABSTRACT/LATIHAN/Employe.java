abstract class Employe {
    private String nama;
    private int salary;

    public Employe(String nama, int salary){
        this.nama = nama;
        this.salary = salary;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    abstract int calculateBonus();

    public void tampilData(){
        System.out.println("Nama : "+ nama);
        System.out.println("Gaji : "+ salary);
    }
}