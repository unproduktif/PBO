public class Main {
    public static void main(String[] args) {
        KendaraanListrik[] kendaraan = {
            new MobilListrik("Mobil Listrik", 80, 20,10),
            new MotorListrik("Motor Listrik",30,10,5),
            new MobilListrik("Mobil Listrik", 60, 45,12),
            new MotorListrik("Mobil Listrik", 25, 20,4)
        };

        double totalWaktu = 0;
        double totalEnergi = 0;

        for(KendaraanListrik k : kendaraan){
            double waktu = k.hitungWaktuPengisian();
            double energi = k.hitungEnergiDibutuhkan();
            
            System.out.printf("%s -> waktu: %.4f jam, enegri: %.1f kWh%n", k.getNama(), waktu, energi);

            totalWaktu += waktu;
            totalEnergi += energi;
        }
        System.out.println();
        System.out.println("Total waktu pengisian keseluruhan kendaraan: "+ totalWaktu+" jam");
        System.out.println("Total energi dibutuhkan: "+ totalEnergi+" kWh");
    }
}
