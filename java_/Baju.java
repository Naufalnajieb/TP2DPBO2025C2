import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

public class Baju extends Aksesoris{

    //Atribut
    private String Merk;
    private char Size;

    //Constructor
    public Baju(){
        this.Merk = "-";
        this.Size = '-';
    }
    public Baju(String Merk, char Size){
        this.Merk = Merk;
        this.Size = Size;
    }

    //Setter
    public void set_Merk(String Merk){
        this.Merk = Merk;
    }
    public void set_Size(char Size){
        this.Size = Size;
    }

    //Getter
    public String get_Merk(){
        return this.Merk;
    }
    public char get_Size(){
        return this.Size;
    }

    public void Pilihan_Menu(int pilihan, ArrayList<Baju> list_produk, Scanner sc){
        if (pilihan == 1) {
            Show_Data(list_produk);
        } 
        else if (pilihan == 2){
            Add_Data(list_produk, sc);
        }
        else{
            System.out.println("Pilihan Opsi Tidak Tersedia!");
        }
    }

    //Create Data
    public void Add_Data(ArrayList<Baju> list_produk, Scanner sc){

        int ID, Harga_Produk, Stok_Produk;
        String Nama_Produk, jenis, bahan, warna, Merk;
        char size;

        System.out.print("> 1. Masukan ID : ");
        ID = sc.nextInt();

        System.out.print("> 2. Masukan Nama Produk : ");
        Nama_Produk = sc.next();

        System.out.print("> 3. Masukan Harga Produk : ");
        Harga_Produk = sc.nextInt();

        System.out.print( "> 4. Masukan Stok Produk : ");
        Stok_Produk = sc.nextInt();;

        System.out.print( "> 5. masukan jenis Aksesoris Produk : ");
        jenis = sc.next();

        System.out.print( "> 6. masukan bahan Aksesoris Produk : ");
        bahan = sc.next();

        System.out.print( "> 7. masukan warna Aksesoris Produk : ");
        warna = sc.next();

        System.out.print( "> 8. masukan Merk Aksesoris : ");
        Merk = sc.next();

        System.out.print( "> 9. masukan Size Aksesoris : ");
        size = sc.next().charAt(0);

        if (!list_produk.isEmpty()){
            int mark = 0;
            int iterasi = 0;
            while ((iterasi < list_produk.size()) && ((mark != 1) || (mark != 2))){
                if (list_produk.get(iterasi).get_ID() == ID){
                    mark = 1;
                }
                else if(list_produk.get(iterasi).get_ID() < 0){
                    mark = 2;
                }
                iterasi++;
            }

            if (mark == 1){
                System.out.println("Produk ID tidak boleh sama !");
            }
            else if (mark == 2){
                System.out.println("Produk ID tidak boleh kurang dari 0 !");
            }
            else{
                Baju save = new Baju(); // pembuatan objek pada setiap proses loop
                save.set_ID(ID);
                save.set_Nama_Produk(Nama_Produk);
                save.set_Harga_Produk(Harga_Produk);
                save.set_Stok_Produk(Stok_Produk);
                save.set_jenis(jenis);
                save.set_bahan(bahan);
                save.set_warna(warna);
                save.set_Merk(Merk);
                save.set_Size(size);
                (list_produk).add(save); // masukin ke dalam list
            }
        }
        else{
            Baju save = new Baju(); // pembuatan objek pada setiap proses loop
            save.set_ID(ID);
            save.set_Nama_Produk(Nama_Produk);
            save.set_Harga_Produk(Harga_Produk);
            save.set_Stok_Produk(Stok_Produk);
            save.set_jenis(jenis);
            save.set_bahan(bahan);
            save.set_warna(warna);
            save.set_Merk(Merk);
            save.set_Size(size);
            (list_produk).add(save); // masukin ke dalam list
        }
    }
    
    public int hitung_angka(int current){ //hitung panjang digit tahun
        int angka = current; //angkan adalah tahun node sekarang
        int hitung = 0; //deklarasi hitung
        if (angka == 0){ //jika angkanya 0
            hitung = 1; //hitungnya 1
        }
        else{
            while (angka > 0){ //selama angka lebih besar dari 0
                angka = angka / 10; //angka dibagi 10
                hitung = hitung + 1; //hitung bertambah
            }
        }
        
        return hitung; //kembalikan nilai hitung sekarang
    }
    

    // Fungsi untuk mencari panjang string terpanjang
    public int long_string(ArrayList<Baju> list_produk, Function<Baju, String> getter) {
        int long_size = 0;
        int iterasi = 0;
        while (iterasi < list_produk.size()) {
            int size = getter.apply(list_produk.get(iterasi)).length();
            if (size > long_size) {
                long_size = size;
            }
            iterasi++;
        }
        return long_size;
    }

    // Fungsi untuk mencari panjang angka terpanjang
    public int long_number(ArrayList<Baju> list_produk, Function<Baju, Integer> getter) {
        int long_size = 0;
        int iterasi = 0;
        while (iterasi < list_produk.size()) {
            int size = hitung_angka(getter.apply(list_produk.get(iterasi)));
            if (size > long_size) {
                long_size = size;
            }
            iterasi++;
        }
        return long_size;
    }

    //Show data
    public void Show_Data(ArrayList<Baju> list_produk){
        if (list_produk.isEmpty()){
            System.out.println("Produk Masih kosong !");
        }
        else{
            int long_size[] = new int[8];
            long_size[0] = long_number(list_produk, Baju::get_ID);
            long_size[1] = long_string(list_produk, Baju::get_Nama_Produk);
            long_size[2] = long_number(list_produk, Baju::get_Harga_Produk);
            long_size[3] = long_number(list_produk, Baju::get_Stok_Produk);
            long_size[4] = long_string(list_produk, Baju::get_jenis);
            long_size[5] = long_string(list_produk, Baju::get_bahan);
            long_size[6] = long_string(list_produk, Baju::get_warna);
            long_size[7] = long_string(list_produk, Baju::get_Merk);

            for (int next = 1; next <= 5; next++){
                if (next == 1 || next == 3 || next == 5){
                    
                    System.out.print("+");
                    if ((long_size[0] + 2 < 4)){
                        for (int inc = 0; inc < 4; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        for (int inc = 0; inc < long_size[0] + 2; inc ++){
                            System.out.print('-');
                        }
                    }
                    System.out.print("+");
                    if ((long_size[1] + 2 < 6)){
                        for (int inc = 0; inc < 6; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        for (int inc = 0; inc < long_size[1] + 2; inc ++){
                            System.out.print('-');
                        }
                    }
                    System.out.print("+");
                    if ((long_size[2] + 2 < 7)){
                        for (int inc = 0; inc < 7; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        for (int inc = 0; inc < long_size[2] + 2; inc ++){
                            System.out.print('-');
                        }
                    }
                    System.out.print("+");
                    if ((long_size[3] + 2 < 6)){
                        for (int inc = 0; inc < 6; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        for (int inc = 0; inc < long_size[3] + 2; inc ++){
                            System.out.print('-');
                        }
                    }
                    System.out.print("+");
                    if ((long_size[4] + 2 < 7)){
                        for (int inc = 0; inc < 7; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        for (int inc = 0; inc < long_size[4] + 2; inc ++){
                            System.out.print('-');
                        }
                    }
                    System.out.print("+");
                    if ((long_size[5] + 2 < 7)){
                        for (int inc = 0; inc < 7; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        for (int inc = 0; inc < long_size[5] + 2; inc ++){
                            System.out.print('-');
                        }
                    }
                    System.out.print("+");
                    if ((long_size[6] + 2 < 7)){
                        for (int inc = 0; inc < 7; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        
                        for (int inc = 0; inc < long_size[6] + 2; inc ++){
                            System.out.print('-');
                        }
                    }
                    System.out.print("+");
                    if ((long_size[7] + 2 < 6)){
                        for (int inc = 0; inc < 6; inc++){
                            System.out.print('-');
                        }
                    }
                    else{
                        for (int inc = 0; inc < long_size[7] + 2; inc ++){
                            System.out.print('-');
                        }
                    }

                    System.out.print("+");
                    for (int inc = 0; inc < 6; inc ++){
                        System.out.print('-');
                    }
                    System.out.println('+');

                }
                else if (next == 2){
                    System.out.print("| ID ");
                    if (long_size[0] - 2 > 0){
                        for (int inc = 0; inc < (long_size[0] - 2); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("| Nama ");
                    if (long_size[1] - 4 > 0){
                        for (int inc = 0; inc < (long_size[1] - 4); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("| Harga ");
                    if (long_size[2] - 5 > 0){
                        for (int inc = 0; inc < (long_size[2] - 5); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("| Stok ");
                    if (long_size[3] - 4 > 0){
                        for (int inc = 0; inc < (long_size[3] - 4); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("| Jenis ");
                    if (long_size[4] - 5 > 0){
                        for (int inc = 0; inc < (long_size[4] - 5); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("| Bahan ");
                    if (long_size[5] - 5 > 0){
                        for (int inc = 0; inc < (long_size[5] - 5); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("| Warna ");
                    if (long_size[6] - 5 > 0){
                        for (int inc = 0; inc < (long_size[6] - 5); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.print("| Merk ");
                    if (long_size[7] - 4 > 0){
                        for (int inc = 0; inc < (long_size[7] - 4); inc ++){
                            System.out.print(' ');
                        }
                    }
                    System.out.println("| Size |");
                }
                else{
                    
                    int iterasi = 0;
                    while (iterasi < list_produk.size()){
                        System.out.print("| " + list_produk.get(iterasi).get_ID());
                        if (hitung_angka(list_produk.get(iterasi).get_ID()) <= long_size[0]){
                            if ((long_size[0] < 2)){
                                int count = 2 - hitung_angka(list_produk.get(iterasi).get_ID());
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[0] - hitung_angka(list_produk.get(iterasi).get_ID());
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }
                        System.out.print(" | " + list_produk.get(iterasi).get_Nama_Produk());
                        if (list_produk.get(iterasi).get_Nama_Produk().length() <= long_size[1]){
                            if ((long_size[1] < 4)){
                                int count = 4 - list_produk.get(iterasi).get_Nama_Produk().length();
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[1] - list_produk.get(iterasi).get_Nama_Produk().length();
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }
                        System.out.print(" | " +  list_produk.get(iterasi).get_Harga_Produk());
                        if (hitung_angka(list_produk.get(iterasi).get_Harga_Produk()) <= long_size[2]){
                            if ((long_size[2] < 5)){
                                int count = 5 - hitung_angka(list_produk.get(iterasi).get_Harga_Produk());
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[2] - hitung_angka(list_produk.get(iterasi).get_Harga_Produk());
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }
                        System.out.print(" | " + list_produk.get(iterasi).get_Stok_Produk());
                        if (hitung_angka(list_produk.get(iterasi).get_Stok_Produk()) <= long_size[3]){
                            if ((long_size[3] < 4)){
                                int count = 4 - hitung_angka(list_produk.get(iterasi).get_Stok_Produk());
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[3] - hitung_angka(list_produk.get(iterasi).get_Stok_Produk());
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }
                        System.out.print(" | " + list_produk.get(iterasi).get_jenis());
                        if (list_produk.get(iterasi).get_jenis().length() <= long_size[4]){
                            if ((long_size[4] < 5)){
                                int count = 5 - list_produk.get(iterasi).get_jenis().length();
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[4] - list_produk.get(iterasi).get_jenis().length();
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }
                        System.out.print(" | " + list_produk.get(iterasi).get_bahan());
                        if (list_produk.get(iterasi).get_bahan().length() <= long_size[5]){
                            if ((long_size[5] < 5)){
                                int count = 5 - list_produk.get(iterasi).get_bahan().length();
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[5] - list_produk.get(iterasi).get_bahan().length();
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }
                        System.out.print(" | " + list_produk.get(iterasi).get_warna());
                        if (list_produk.get(iterasi).get_warna().length() <= long_size[6]){
                            if ((long_size[6] < 5)){
                                int count = 5 - list_produk.get(iterasi).get_warna().length();
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[6] - list_produk.get(iterasi).get_warna().length();
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }

                        System.out.print(" | " + list_produk.get(iterasi).get_Merk());
                        if (list_produk.get(iterasi).get_Merk().length() <= long_size[7]){
                            if ((long_size[7] < 4)){
                                int count = 4 - list_produk.get(iterasi).get_Merk().length();
                                for (int inc = 0; inc < count; inc++){
                                    System.out.print(' ');
                                }
                            }
                            else{
                                int show = long_size[7] - list_produk.get(iterasi).get_Merk().length();
                                for (int inc = 0; inc < show; inc ++){
                                    System.out.print(' ');
                                }
                            }
                        }

                        System.out.print(" | " + list_produk.get(iterasi).get_Size());
                        System.out.println("    |");

                        iterasi++;
                    }
                }
            }                
        }
    }
}