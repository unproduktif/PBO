package week3.input;
import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Lengkap : ");
        String nama = scanner.nextLine();
        System.out.print("Alamat       : ");
        String alamat = scanner.nextLine();
        System.out.print("Umur (ex. 19): ");
        int umur = scanner.nextInt();
        System.out.println();
        System.out.println("Biodata Anda");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur);
        scanner.close();
    }
}
