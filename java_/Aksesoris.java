/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

public class Aksesoris extends Petshop {
    //Atribut
    private String jenis;
    private String bahan;
    private String warna;

    //Constructor
    public Aksesoris(){
        this.jenis = "-";
        this.bahan = "-";
        this.warna = "-";
    }
    public Aksesoris(String jenis, String bahan, String warna){
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    //Setter
    public void set_jenis(String jenis){
        this.jenis = jenis;
    }
    public void set_bahan(String bahan){
        this.bahan = bahan;
    }
    public void set_warna(String warna){
        this.warna = warna;
    }

    //Getter
    public String get_jenis(){
        return this.jenis;
    }
    public String get_bahan(){
        return this.bahan;
    }
    public String get_warna(){
        return this.warna;
    }
}
