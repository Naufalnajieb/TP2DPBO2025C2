import java.util.ArrayList;
import java.util.Scanner;

/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

public class Main {

    public static void main(String[] args) {
        Baju Produk = new Baju();
        Produk.Sambutan();

        String confirmation;
        int Mark = 0;
        int value = 0;

        ArrayList<Baju> list_Produk = new ArrayList<>();

        for(int index = 1; index <= 5; index++){
            Produk = new Baju();
            if (index == 1){
                Produk.set_ID(1);
                Produk.set_Nama_Produk("Sweater_Anjing");
                Produk.set_Harga_Produk(75000);
                Produk.set_Stok_Produk(20);
                Produk.set_jenis("Baju");
                Produk.set_bahan("Wol");
                Produk.set_warna("Merah");
                Produk.set_Merk("PawComfort");
                Produk.set_Size('M');
                list_Produk.add(Produk); // masukin ke dalam list
            }
            else if (index == 2){
                Produk.set_ID(2);
                Produk.set_Nama_Produk("Kaos_Kucing");
                Produk.set_Harga_Produk(50000);
                Produk.set_Stok_Produk(15);
                Produk.set_jenis("Kaos");
                Produk.set_bahan("Katun");
                Produk.set_warna("Biru");
                Produk.set_Merk("MeowWear");
                Produk.set_Size('S');
                list_Produk.add(Produk); // masukin ke dalam list
            }
            else if (index == 3){
                Produk.set_ID(3);
                Produk.set_Nama_Produk("Kostum_Anjing");
                Produk.set_Harga_Produk(120000);
                Produk.set_Stok_Produk(10);
                Produk.set_jenis("Kostum");
                Produk.set_bahan("Polyester");
                Produk.set_warna("Merah");
                Produk.set_Merk("DogPower");
                Produk.set_Size('L');
                list_Produk.add(Produk); // masukin ke dalam list
            }
            else if (index == 4){
                Produk.set_ID(4);
                Produk.set_Nama_Produk("Jas_Kucing");
                Produk.set_Harga_Produk(150000);
                Produk.set_Stok_Produk(8);
                Produk.set_jenis("Jas");
                Produk.set_bahan("Sutra");
                Produk.set_warna("Hitam");
                Produk.set_Merk("RoyalPets");
                Produk.set_Size('M');
                list_Produk.add(Produk); // masukin ke dalam list
            }
            else{
                Produk.set_ID(5);
                Produk.set_Nama_Produk("Hoodie_Anjing");
                Produk.set_Harga_Produk(85000);
                Produk.set_Stok_Produk(12);
                Produk.set_jenis("Hoodie");
                Produk.set_bahan("Fleece");
                Produk.set_warna("Abu-abu");
                Produk.set_Merk("ActivePaws");
                Produk.set_Size('L');
                list_Produk.add(Produk); // masukin ke dalam list
            }
        }

        Scanner sc = new Scanner(System.in);
        try{
            do{
                Produk.Menu_Program();
                System.out.println();
                System.out.print("Pilih opsi menu > ");
                value = sc.nextInt();

                Produk.Pilihan_Menu(value, list_Produk, sc);
                System.out.println();
                System.out.println("Apakah Anda ingin memilih opsi lainnya lagi? (ya/tidak)");
                System.out.print("> ");
                confirmation = sc.next();
                if (confirmation.equalsIgnoreCase("tidak")){
                    Mark = 1;
                }
                else{
                    System.out.println();
                }
            }while(Mark != 1);
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            sc.close();
        }
    }
}
