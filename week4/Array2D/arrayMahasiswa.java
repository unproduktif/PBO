package Array2D;
public class arrayMahasiswa {
    public static void main(String[] args) {
        int jml=0;
        double rerata=0;
        String[][] dataMahasiswa = {
            {"A001", "Budi", "Pemrograman", "85"},
            {"A002", "Budi", "Pemrograman", "78"},
            {"A001", "Budi", "Basis Data", "90"},
            {"A003", "Budi", "Pemrograman", "88"},
            {"A002", "Budi", "Basis Data", "82"},
            {"A003", "Budi", "Basis Data", "75"}
        };
        for (int i = 0; i< dataMahasiswa.length; i++){
            for(int j = 0; j<dataMahasiswa.length; j++){
                if(dataMahasiswa[j][0]==dataMahasiswa[i][0]){
                    jml++;
                    rerata = Double.parseDouble(dataMahasiswa[i][3])/jml;
                }
            }
            System.out.println("NIM: "+ dataMahasiswa[i][0]+" Nama: "+dataMahasiswa[i][1]+" Mata Kuliah: "+dataMahasiswa[i][2]+" Nilai: "+ dataMahasiswa[i][3]);
            if(dataMahasiswa[i][1]!=dataMahasiswa[i+1][1]){
                System.out.println("Rerata nilai "+ dataMahasiswa[i][1]+" : "+rerata);
            }
        }
    }
}
