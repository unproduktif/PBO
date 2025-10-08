public class Main {
    public static void main(String[] args) {
        Employe manager = new Manager("Rizal",100000);
        Employe staff = new Staff("Dodi",1500000);

        manager.tampilData();
        System.out.println();
        staff.tampilData();
        
    }
}
