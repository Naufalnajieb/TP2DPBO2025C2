#include "Petshop.cpp"

/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

class Aksesoris: public Petshop{
    private:
        string jenis;
        string bahan;
        string warna;

    public:
        Aksesoris(){
            this->jenis = "-";
            this->bahan = "-";
            this->warna = "-";
        }
        Aksesoris(string jenis, string bahan, string warna){
            this->jenis = jenis;
            this->bahan = bahan;
            this->warna = warna;
        }

        void set_jenis(string jenis){
            this->jenis = jenis;
        }
        void set_bahan(string bahan){
            this->bahan = bahan;
        }
        void set_warna(string warna){
            this->warna = warna;
        }

        string get_jenis(){
            return this->jenis;
        }
        string get_bahan(){
            return this->bahan;
        }
        string get_warna(){
            return this->warna;
        }

        ~Aksesoris(){
        }
};
