package week3.perulangan;
import java.util.Scanner;
public class MainParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hitungParkir HP = new hitungParkir();

        System.out.print("Berapa Hari masuk kampus : ");
        int hari = scanner.nextInt();
        int kendaraan=0;
        for(int i = 1; i <= hari; i++){
            System.out.print("Hari ke-"+i+" (1. Motor   2. Mobil) : ");
            kendaraan = scanner.nextInt();
            int total = HP.ket(kendaraan);
            System.out.println("Total biaya parkir Anda : Rp. "+ total);
        }
        scanner.close();
    }
}
