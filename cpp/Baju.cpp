#include "Aksesoris.cpp"

/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

class Baju : public Aksesoris{
    private:
        string Merk;
        char Size;

    public:
        Baju(){
            this->Merk = "-";
            this->Size = '-';
        }

        Baju(string Merk, char Size){
            this->Merk = Merk;
            this->Size = Size;
        }

        void set_Merk(string Merk){
            this->Merk = Merk;
        }
        void set_Size(char Size){
            this->Size = Size;
        }

        string get_merk(){
            return this->Merk;
        }
        char get_size(){
            return this->Size;
        }

        void Pilihan_Menu(int pilihan, list<Baju> *list_produk){
            if (pilihan == 1) {
                Show_Data(list_produk);
            } 
            else if (pilihan == 2){
                Add_Data(list_produk);
            }
            else{
                cout << "Pilihan Opsi Tidak Tersedia!" << endl;
            }
        }
        void Add_Data(list<Baju> *list_produk){
            
            int ID, Harga_Produk, Stok_Produk;
            string Nama_Produk, jenis, bahan, warna, Merk;
            char size;

            cout << "> 1. Masukan ID : ";
            cin >> ID ;

            cout << "> 2. Masukan Nama Produk : ";
            cin >> Nama_Produk;

            cout << "> 3. Masukan Harga Produk : ";
            cin >> Harga_Produk;

            cout << "> 4. Masukan Stok Produk : ";
            cin >> Stok_Produk;

            cout << "> 5. masukan jenis Aksesoris Produk : ";
            cin >> jenis;

            cout << "> 6. masukan bahan Aksesoris Produk : ";
            cin >> bahan;

            cout << "> 7. masukan warna Aksesoris Produk : ";
            cin >> warna;

            cout << "> 8. masukan Merk Aksesoris : ";
            cin >> Merk;

            cout << "> 9. masukan Size Aksesoris : ";
            cin >> size;

            if (!(*list_produk).empty()){
                int mark = 0;
                list<Baju>::iterator iterasi = (*list_produk).begin();
                while ((iterasi != (*list_produk).end()) && ((mark != 1) || (mark != 2))){
                    if (iterasi->get_ID() == ID){
                        mark = 1;
                    }
                    else if (iterasi->get_ID() < 0){
                        mark = 2;
                    }
                    iterasi++;
                }

                if (mark == 1){
                    cout << "Produk ID tidak boleh sama !" << endl;
                }
                else if (mark == 2){
                    cout << "Produk ID tidak boleh kurang dari 0 !" << endl;
                }
                else{
                    Baju save; // pembuatan objek pada setiap proses loop
                    save.set_ID(ID);
                    save.set_Nama_Produk(Nama_Produk);
                    save.set_Harga_Produk(Harga_Produk);
                    save.set_Stok_Produk(Stok_Produk);
                    save.set_jenis(jenis);
                    save.set_bahan(bahan);
                    save.set_warna(warna);
                    save.set_Merk(Merk);
                    save.set_Size(size);
                    (*list_produk).push_back(save); // masukin ke dalam list
                }
            }
            else{
                Baju save; // pembuatan objek pada setiap proses loop
                save.set_ID(ID);
                save.set_Nama_Produk(Nama_Produk);
                save.set_Harga_Produk(Harga_Produk);
                save.set_Stok_Produk(Stok_Produk);
                save.set_jenis(jenis);
                save.set_bahan(bahan);
                save.set_warna(warna);
                save.set_Merk(Merk);
                save.set_Size(size);
                (*list_produk).push_back(save); // masukin ke dalam list
            }
        }

        int hitung_angka(int current){ //hitung panjang digit tahun
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

        int long_string(list<Baju> *list_produk, string (Baju::*getter)()) {
            int long_size = 0;
            list<Baju>::iterator iterasi = (*list_produk).begin();
            while (iterasi != (*list_produk).end()) {
                
                int size = ((*iterasi).*getter)().length();
                if (size > long_size) {
                    long_size = size;
                }
                iterasi++;
            }
            return long_size;
        }
        
        int long_number(list<Baju> *list_produk, int (Baju::*getter)()) {
            int long_size = 0;
            list<Baju>::iterator iterasi = (*list_produk).begin();
            while (iterasi != (*list_produk).end()) {
                
                int size = hitung_angka(((*iterasi).*getter)());
                if (size > long_size) {
                    long_size = size;
                }
                iterasi++;
            }
            return long_size;
        }

        void Show_Data(list<Baju> *list_produk){
            if ((*list_produk).empty()){
                cout << "Produk Masih kosong !" << endl;
            }
            else{
                
                int long_size[8];                
                long_size[0] = long_number(list_produk, &Baju::get_ID);
                long_size[1] = long_string(list_produk, &Baju::get_Nama_Produk);
                long_size[2] = long_number(list_produk, &Baju::get_Harga_Produk);
                long_size[3] = long_number(list_produk, &Baju::get_Stok_Produk);
                long_size[4] = long_string(list_produk, &Baju::get_jenis);
                long_size[5] = long_string(list_produk, &Baju::get_bahan);
                long_size[6] = long_string(list_produk, &Baju::get_warna);
                long_size[7] = long_string(list_produk, &Baju::get_merk);

                
                for (int next = 1; next <= 5; next++){
                    if (next == 1 || next == 3 || next == 5){
                        
                        cout << "+";
                        if ((long_size[0] + 2 < 4)){
                            for (int inc = 0; inc < 4; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            for (int inc = 0; inc < long_size[0] + 2; inc ++){
                                cout << '-';
                            }
                        }
                        cout << "+";
                        if ((long_size[1] + 2 < 6)){
                            for (int inc = 0; inc < 6; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            for (int inc = 0; inc < long_size[1] + 2; inc ++){
                                cout << '-';
                            }
                        }
                        cout << "+";
                        if ((long_size[2] + 2 < 7)){
                            for (int inc = 0; inc < 7; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            for (int inc = 0; inc < long_size[2] + 2; inc ++){
                                cout << '-';
                            }
                        }
                        cout << "+";
                        if ((long_size[3] + 2 < 6)){
                            for (int inc = 0; inc < 6; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            for (int inc = 0; inc < long_size[3] + 2; inc ++){
                                cout << '-';
                            }
                        }
                        cout << "+";
                        if ((long_size[4] + 2 < 7)){
                            for (int inc = 0; inc < 7; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            for (int inc = 0; inc < long_size[4] + 2; inc ++){
                                cout << '-';
                            }
                        }
                        cout << "+";
                        if ((long_size[5] + 2 < 7)){
                            for (int inc = 0; inc < 7; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            for (int inc = 0; inc < long_size[5] + 2; inc ++){
                                cout << '-';
                            }
                        }
                        cout << "+";
                        if ((long_size[6] + 2 < 7)){
                            for (int inc = 0; inc < 7; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            
                            for (int inc = 0; inc < long_size[6] + 2; inc ++){
                                cout << '-';
                            }
                        }
                        cout << "+";
                        if ((long_size[7] + 2 < 6)){
                            for (int inc = 0; inc < 6; inc++){
                                cout << '-';
                            }
                        }
                        else{
                            for (int inc = 0; inc < long_size[7] + 2; inc ++){
                                cout << '-';
                            }
                        }

                        cout << "+";
                        for (int inc = 0; inc < 6; inc ++){
                            cout << '-';
                        }
                        cout << '+' << endl;

                    }
                    else if (next == 2){
                        cout << "| ID ";
                        if (long_size[0] - 2 > 0){
                            for (int inc = 0; inc < (long_size[0] - 2); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Nama ";
                        if (long_size[1] - 4 > 0){
                            for (int inc = 0; inc < (long_size[1] - 4); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Harga ";
                        if (long_size[2] - 5 > 0){
                            for (int inc = 0; inc < (long_size[2] - 5); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Stok ";
                        if (long_size[3] - 4 > 0){
                            for (int inc = 0; inc < (long_size[3] - 4); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Jenis ";
                        if (long_size[4] - 5 > 0){
                            for (int inc = 0; inc < (long_size[4] - 5); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Bahan ";
                        if (long_size[5] - 5 > 0){
                            for (int inc = 0; inc < (long_size[5] - 5); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Warna ";
                        if (long_size[6] - 5 > 0){
                            for (int inc = 0; inc < (long_size[6] - 5); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Merk ";
                        if (long_size[7] - 4 > 0){
                            for (int inc = 0; inc < (long_size[7] - 4); inc ++){
                                cout << ' ';
                            }
                        }
                        cout << "| Size |" << endl;
                    }
                    else{
                        
                        list<Baju>::iterator iterasi = (*list_produk).begin();
                        while (iterasi != (*list_produk).end()){
                            cout << "| " << iterasi->get_ID();
                            if (hitung_angka(iterasi->get_ID()) <= long_size[0]){
                                if ((long_size[0] < 2)){
                                    int count = 2 - hitung_angka(iterasi->get_ID());
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[0] - hitung_angka(iterasi->get_ID());
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }
                            cout << " | " << iterasi->get_Nama_Produk();
                            if (iterasi->get_Nama_Produk().length() <= long_size[1]){
                                if ((long_size[1] < 4)){
                                    int count = 4 - iterasi->get_Nama_Produk().length();
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[1] - iterasi->get_Nama_Produk().length();
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }
                            cout << " | " << iterasi->get_Harga_Produk();
                            if (hitung_angka(iterasi->get_Harga_Produk()) <= long_size[2]){
                                if ((long_size[2] < 5)){
                                    int count = 5 - hitung_angka(iterasi->get_Harga_Produk());
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[2] - hitung_angka(iterasi->get_Harga_Produk());
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }
                            cout << " | " << iterasi->get_Stok_Produk();
                            if (hitung_angka(iterasi->get_Stok_Produk()) <= long_size[3]){
                                if ((long_size[3] < 4)){
                                    int count = 4 - hitung_angka(iterasi->get_Stok_Produk());
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[3] - hitung_angka(iterasi->get_Stok_Produk());
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }
                            cout << " | " << iterasi->get_jenis();
                            if (iterasi->get_jenis().length() <= long_size[4]){
                                if ((long_size[4] < 5)){
                                    int count = 5 - iterasi->get_jenis().length();
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[4] - iterasi->get_jenis().length();
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }
                            cout << " | " << iterasi->get_bahan();
                            if (iterasi->get_bahan().length() <= long_size[5]){
                                if ((long_size[5] < 5)){
                                    int count = 5 - iterasi->get_bahan().length();
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[5] - iterasi->get_bahan().length();
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }
                            cout << " | " << iterasi->get_warna();
                            if (iterasi->get_warna().length() <= long_size[6]){
                                if ((long_size[6] < 5)){
                                    int count = 5 - iterasi->get_warna().length();
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[6] - iterasi->get_warna().length();
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }

                            cout << " | " << iterasi->get_merk();
                            if (iterasi->get_merk().length() <= long_size[7]){
                                if ((long_size[7] < 4)){
                                    int count = 4 - iterasi->get_merk().length();
                                    for (int inc = 0; inc < count; inc++){
                                        cout << ' ';
                                    }
                                }
                                else{
                                    int show = long_size[7] - iterasi->get_merk().length();
                                    for (int inc = 0; inc < show; inc ++){
                                        cout << ' ';
                                    }
                                }
                            }

                            cout << " | " << iterasi->get_size();
                            cout << "    |" << endl;

                            iterasi++;
                        }
                    }
                }                
            }
        }

        ~Baju(){

        }
};
