# Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
# maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from Petshop import Petshop

class Aksesoris (Petshop):  # Inheritance dari kelas Petshop

    #Konstruktor
    def __init__(self, jenis="-", bahan="-", warna="-"):
        self.__jenis = jenis
        self.__bahan = bahan
        self.__warna = warna

    # Setter methods
    def set_jenis(self, jenis):
        self.__jenis = jenis

    def set_bahan(self, bahan):
        self.__bahan = bahan

    def set_warna(self, warna):
        self.__warna = warna

    # Getter methods
    def get_jenis(self):
        return self.__jenis

    def get_bahan(self):
        return self.__bahan

    def get_warna(self):
        return self.__warna