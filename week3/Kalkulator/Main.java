package week3.Kalkulator;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        kalkulator kal = new kalkulator();  
        System.out.print("Angka pertama : ");
        int a = scanner.nextInt();
        System.out.print("Angka kedua : ");
        int b = scanner.nextInt();
        System.out.println("Pilih operasi:\n1. Tambah   3. Kali\n2. Kurang  4. bagi ");
        System.out.print("Pilih : ");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println(a+" + "+ b+ " = "+kal.tambah(a, b));
                break;
            case 2:
                System.out.println(a+" - "+ b+ " = "+kal.kurang(a, b));
                break;
            case 3:
                System.out.println(a+" x "+ b+ " = "+kal.kali(a, b));
                break;
            case 4:
                System.out.println(a+" : "+ b+ " = "+kal.bagi(a, b));
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        scanner.close();

    }
}
