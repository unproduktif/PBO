public abstract class Hewan{
    private String nama;
    private int jumKaki;
    private boolean bisaTerbang;

    public Hewan(String nama, int jumKaki, boolean bisaTerbang){
        this.nama = nama;
        this.jumKaki = jumKaki;
        this.bisaTerbang = bisaTerbang;
    }

    public void isHewan(){

    }

    public abstract void bersuara();
}