package week3.percabangan;
public class HitungGrade {
    int nilai;
    String ket, grade;

    public String kategoriNilai(int nilai){
        if(nilai >= 85 && nilai<=100){
            grade = "A";
        }else if(nilai >= 70 && nilai <= 84){
            grade = "B";
        }else if(nilai >= 60 && nilai<=69){
            grade = "C";
        }else if(nilai >= 50 && nilai <= 59){
            grade = "D";
        }else{
            grade = "E";
        }

        return grade;
    }

    public String keterangan(int nilai){
        if(nilai < 60){
            ket = "TIDAK LULUS";
        }else{
            ket = "LULUS";
        }
        return ket;
    }
}
