#include "Baju.cpp"

/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

int main(){
    
    Baju Produk;
    Produk.Sambutan();
    
    string Confirmation;
    int Mark = 0;
    int value = 0;

    list<Baju> list_Produk;

    for(int index = 1; index <= 5; index++){
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
            list_Produk.push_back(Produk); // masukin ke dalam list
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
            list_Produk.push_back(Produk); // masukin ke dalam list
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
            list_Produk.push_back(Produk); // masukin ke dalam list
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
            list_Produk.push_back(Produk); // masukin ke dalam list
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
            list_Produk.push_back(Produk); // masukin ke dalam list
        }
    }

    do{
        Produk.Menu_Program();
        cout << endl;
        cout << "Pilih opsi menu > ";
        cin >> value;
        
        Produk.Pilihan_Menu(value, &list_Produk);
        cout << endl;
        cout << "Apakah Anda ingin memilih opsi lainnya lagi? (ya/tidak)" << endl;
        cout << "> ";
        cin >> Confirmation;
        if (Confirmation == "tidak"){
            Mark = 1;
        }
        else{
            cout << endl;
        }
    }while(Mark != 1);

    return 0;
}