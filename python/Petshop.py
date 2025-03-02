# Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
# maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

class Petshop:
    
    #Konstruktor
    def __init__(self, ID=0, Nama_Produk="-", Harga_Produk=0, Stok_Produk=0):
        self.__ID = ID
        self.__Nama_Produk = Nama_Produk
        self.__Harga_Produk = Harga_Produk
        self.__Stok_Produk = Stok_Produk

    # Setter methods
    def set_ID(self, ID):
        self.__ID = ID

    def set_Nama_Produk(self, Nama_Produk):
        self.__Nama_Produk = Nama_Produk

    def set_Harga_Produk(self, Harga_Produk):
        self.__Harga_Produk = Harga_Produk

    def set_Stok_Produk(self, Stok_Produk):
        self.__Stok_Produk = Stok_Produk

    # Getter methods
    def get_ID(self):
        return self.__ID

    def get_Nama_Produk(self):
        return self.__Nama_Produk

    def get_Harga_Produk(self):
        return self.__Harga_Produk

    def get_Stok_Produk(self):
        return self.__Stok_Produk

    # Method untuk menampilkan sambutan
    def Sambutan(self):
        print("\nSelamat Datang di Petshop Milik Naufal Fakhri Al-Najieb")
        print("Versi 2.0\n")
        print("++========================================================++")
        print("||    <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>   ||")
        print("||                      Welcome User                      ||")
        print("||    <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>   ||")
        print("++========================================================++\n")

    # Method untuk menampilkan menu program
    def Menu_Program(self):
        print("1. Tampilkan Produk")
        print("2. Tambah Produk")