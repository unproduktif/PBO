package Array2D;
public class Array2D{
    public static void main(String[] args) {
        String[][] negaraIbuKota = {
        {"Indonesia", "Jakarta"},
        {"Jepang", "Tokyo"},
        {"Amerika", "Washington DC"}
    };
        for(int i = 0; i < negaraIbuKota.length; i++){
            System.out.println("Ibukota "+ negaraIbuKota[i][0]+" adalah "+ negaraIbuKota[i][1]);
        }
    }
}