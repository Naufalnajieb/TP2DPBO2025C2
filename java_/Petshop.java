/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

public class Petshop {

    //Atribut
    private int ID;
    private String Nama_Produk;
    private int Harga_Produk;
    private int Stok_Produk;

    //Constructor
    public Petshop(){
        this.ID = 0;
        this.Nama_Produk = "-";
        this.Harga_Produk = 0;
        this.Stok_Produk = 0;
    }
    public Petshop(int ID, String Nama_Produk, int Harga_Produk, int Stok_Produk){
        this.ID = ID;
        this.Nama_Produk = Nama_Produk;
        this.Harga_Produk = Harga_Produk;
        this.Stok_Produk = Stok_Produk;
    }

    //Setter
    public void set_ID(int ID){
        this.ID = ID;
    }
    public void set_Nama_Produk(String Nama_Produk){
        this.Nama_Produk = Nama_Produk;
    }
    public void set_Harga_Produk(int Harga_Produk){
        this.Harga_Produk = Harga_Produk;
    }
    public void set_Stok_Produk(int Stok_Produk){
        this.Stok_Produk = Stok_Produk;
    }

    //Getter
    public int get_ID(){
        return this.ID;
    }
    public String get_Nama_Produk(){
        return this.Nama_Produk;
    }
    public int get_Harga_Produk(){
        return this.Harga_Produk;
    }
    public int get_Stok_Produk(){
        return this.Stok_Produk;
    }

    //--------->Method
    //Menu Tampilan
    public void Sambutan(){
        System.out.println("\nSelamat Datang di PetShop Milik Naufal Fakhri Al-Najieb");
        System.out.println("Versi 2.0\n");
        System.out.println("++========================================================++");
        System.out.println("||    <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>   ||");
        System.out.println("||                      Welcome User                      ||");
        System.out.println("||    <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>   ||");
        System.out.println("++========================================================++\n");
    }
    public void Menu_Program(){
        System.out.println("1. Tampilkan Produk");
        System.out.println("2. Tambah Produk");
    }
}