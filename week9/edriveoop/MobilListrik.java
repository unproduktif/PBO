public class MobilListrik extends KendaraanListrik{
    public MobilListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    
    public double hitungWaktuPengisian(){
        double waktu = hitungEnergiDibutuhkan()/kecepatanPengisian;
        return waktu * 1.1;
    }

    
}
