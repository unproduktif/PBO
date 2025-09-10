package week3.percabangan;
import java.util.Scanner;
public class MasterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HitungGrade gr = new HitungGrade();

        System.out.print("Masukkan Nilai Anda : ");
        int nilai = scanner.nextInt();
        if(nilai < 0 || nilai > 100){scanner.close();return;}
        System.out.println("Kategori nilai anda : "+ gr.kategoriNilai(nilai)+ " dan Anda dinyatakan : "+gr.keterangan(nilai));

        scanner.close();
    }
}
