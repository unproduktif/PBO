public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Sapi("Alaska", 4, false);
        Hewan hewan2 = new Burung("Merpati",2,true);
        hewan1.bersuara();
        hewan2.bersuara();
    }
}
