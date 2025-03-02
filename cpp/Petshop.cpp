#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std;

/* Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

class Petshop{
    private:
        int ID;
        string Nama_Produk;
        int Harga_Produk;
        int Stok_Produk;

    public:
        Petshop(){
            this->ID = 0;
            this->Nama_Produk = "-";
            this->Harga_Produk = 0;
            this->Stok_Produk = 0;
        }

        Petshop(int ID, string Nama_Produk, int Harga_Produk, int Stok_Produk){
            this->ID = ID;
            this->Nama_Produk = Nama_Produk;
            this->Harga_Produk = Harga_Produk;
            this->Stok_Produk = Stok_Produk;
        }

        void set_ID(int ID){
            this->ID = ID;
        }
        void set_Nama_Produk(string Nama_Produk){
            this->Nama_Produk = Nama_Produk;
        }
        void set_Harga_Produk(int Harga_Produk){
            this->Harga_Produk = Harga_Produk;
        }
        void set_Stok_Produk(int Stok_Produk){
            this->Stok_Produk = Stok_Produk;
        }
        
        int get_ID(){
            return this->ID;
        }
        string get_Nama_Produk(){
            return this->Nama_Produk;
        }
        int get_Harga_Produk(){
            return this->Harga_Produk;
        }
        int get_Stok_Produk(){
            return this->Stok_Produk;
        }

        void Sambutan(){
            cout << "\nSelamat Datang di Petshop Milik Naufal Fakhri Al-Najieb\n";
            cout << "Versi 2.0\n\n";
            cout << "++========================================================++\n";
            cout << "||    <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>   ||\n";
            cout << "||                      Welcome User                      ||\n";
            cout << "||    <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>   ||\n";
            cout << "++========================================================++\n\n";
        }
        void Menu_Program(){
            cout << "1. Tampilkan Produk" << endl;
            cout << "2. Tambah Produk" << endl;
        }

        ~Petshop(){
            
        }
};
