package week3.perulangan;
public class hitungParkir {
    int hari, total=0;
    int kendaraan;

    public int ket(int kendaraan){
        if(kendaraan==1){
            total+=2000;
        }else if(kendaraan==2){
            total+=5000;
        }
        return total;
    }
}
