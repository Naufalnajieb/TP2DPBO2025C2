# Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
# maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from Aksesoris import Aksesoris

class Baju (Aksesoris):
   
    #Konstruktor
    def __init__(self, Merk="-", Size='-'):
        self.__Size = Size
        self.__Merk = Merk

     # Setter methods
    def set_Merk(self, Merk):
        self.__Merk = Merk

    def set_Size(self, Size):
        self.__Size = Size


    # Getter methods
    def get_Merk(self):
        return self.__Merk

    def get_Size(self):
        return self.__Size
    
    def Pilihan_Menu(self, pilihan, list_produk):
        if pilihan == 1:
            self.Show_Data(list_produk)

        elif pilihan == 2:
            self.Add_Data(list_produk)

        else:
            print("Pilihan Opsi Tidak Tersedia!")

    def Add_Data(self, list_produk):
        ID = int(input("> 1. Masukan ID : "))
        Nama_Produk = input("> 2. Masukan Nama Produk : ")
        Harga_Produk = int(input("> 3. Masukan Harga Produk : "))
        Stok_Produk = int(input("> 4. Masukan Stok Produk : "))
        jenis = input("> 5. Masukan jenis Aksesoris Produk : ")
        bahan = input("> 6. Masukan bahan Aksesoris Produk : ")
        warna = input("> 7. Masukan warna Aksesoris Produk : ")
        Merk = input("> 8. Masukan Merk Aksesoris : ")
        Size = input("> 9. Masukan Size Aksesoris : ")

        if list_produk:  # Jika list_produk tidak kosong
            mark = 0
            index = 0  # Indeks untuk mengiterasi list_produk

            while index < len(list_produk) and (mark != 1 or mark != 2):
                produk = list_produk[index]  # Ambil produk saat ini
                if produk.get_ID() == ID:
                    mark = 1
                elif produk.get_ID() < 0:
                    mark = 2
                index += 1  # Pindah ke produk berikutnya

            if mark == 1:
                print("Produk ID tidak boleh sama!")
            elif mark == 2:
                print("Produk ID tidak boleh kurang dari 0!")
            else:
                save = Baju()  # Membuat objek baru
                save.set_ID(ID)
                save.set_Nama_Produk(Nama_Produk)
                save.set_Harga_Produk(Harga_Produk)
                save.set_Stok_Produk(Stok_Produk)
                save.set_jenis(jenis)
                save.set_bahan(bahan)
                save.set_warna(warna)
                save.set_Merk(Merk)
                save.set_Size(Size)
                list_produk.append(save)  # Menambahkan objek ke dalam list
        else:  # Jika list_produk kosong
            save = Baju()  # Membuat objek baru
            save.set_ID(ID)
            save.set_Nama_Produk(Nama_Produk)
            save.set_Harga_Produk(Harga_Produk)
            save.set_Stok_Produk(Stok_Produk)
            save.set_jenis(jenis)
            save.set_bahan(bahan)
            save.set_warna(warna)
            save.set_Merk(Merk)
            save.set_Size(Size)
            list_produk.append(save)  # Menambahkan objek ke dalam list

    def hitung_angka(self, current):
        angka = current  # Angka yang akan dihitung jumlah digitnya
        hitung = 0  # Variabel untuk menyimpan jumlah digit

        if angka == 0:  # Jika angka adalah 0
            hitung = 1  # Jumlah digit adalah 1
        else:
            while angka > 0:  # Selama angka lebih besar dari 0
                angka = angka // 10  # Bagi angka dengan 10 (hilangkan digit terakhir)
                hitung += 1  # Tambahkan 1 ke hitung

        return hitung  # Kembalikan jumlah digit
    
    def long_string(self, list_produk, getter):
        long_size = 0 

        for produk in list_produk:  
            size = len(getter(produk)) 
            if size > long_size:  
                long_size = size

        return long_size

    def long_number(self, list_produk, getter):
        long_size = 0

        for produk in list_produk:
            size = self.hitung_angka(getter(produk))
            if size > long_size:
                long_size = size

        return long_size
    
    def Show_Data(self, list_produk):
        if not list_produk:  # Jika list_produk kosong
            print("Produk Masih kosong!")
        else:
            
            long_size = [
                self.long_number(list_produk, Baju.get_ID),  
                self.long_string(list_produk, Baju.get_Nama_Produk),
                self.long_number(list_produk, Baju.get_Harga_Produk),
                self.long_number(list_produk, Baju.get_Stok_Produk),
                self.long_string(list_produk, Baju.get_jenis),  
                self.long_string(list_produk, Baju.get_bahan),  
                self.long_string(list_produk, Baju.get_warna),  
                self.long_string(list_produk, Baju.get_Merk)
            ]

            for next in range(1, 6):  # Loop dari 1 hingga 5
                if next == 1 or next == 3 or next == 5:  # Hanya cetak pada iterasi 1, 3, dan 5
                    print("+", end="")
                    
                    # Kolom 1: ID
                    width = max(long_size[0] + 2, 4)  # Lebar minimum 4
                    print("-" * width, end="+")
                    
                    # Kolom 2: Nama Produk
                    width = max(long_size[1] + 2, 6)  # Lebar minimum 6
                    print("-" * width, end="+")
                    
                    # Kolom 3: Harga Produk
                    width = max(long_size[2] + 2, 7)  # Lebar minimum 7
                    print("-" * width, end="+")
                    
                    # Kolom 4: Stok Produk
                    width = max(long_size[3] + 2, 6)  # Lebar minimum 6
                    print("-" * width, end="+")
                    
                    # Kolom 5: Jenis
                    width = max(long_size[4] + 2, 7)  # Lebar minimum 7
                    print("-" * width, end="+")
                    
                    # Kolom 6: Bahan
                    width = max(long_size[5] + 2, 7)  # Lebar minimum 7
                    print("-" * width, end="+")
                    
                    # Kolom 7: Warna
                    width = max(long_size[6] + 2, 7)  # Lebar minimum 7
                    print("-" * width, end="+")
                    
                    # Kolom 8: Merk
                    width = max(long_size[7] + 2, 6)  # Lebar minimum 6
                    print("-" * width, end="+")
                    
                    # Kolom tambahan (opsional)
                    print("-" * 6, end="+")
                    
                    print()  # Pindah ke baris baru
                
                elif next == 2:
                    print("| ID ", end="")
                    if long_size[0] - 2 > 0:
                        print(" " * (long_size[0] - 2), end="")
                    
                    print("| Nama ", end="")
                    if long_size[1] - 4 > 0:
                        print(" " * (long_size[1] - 4), end="")
                    
                    print("| Harga ", end="")
                    if long_size[2] - 5 > 0:
                        print(" " * (long_size[2] - 5), end="")
                    
                    print("| Stok ", end="")
                    if long_size[3] - 4 > 0:
                        print(" " * (long_size[3] - 4), end="")
                    print("| Jenis ", end="")
                    if long_size[4] - 5 > 0:
                        print(" " * (long_size[4] - 5), end="")
                    
                    print("| Bahan ", end="")
                    if long_size[5] - 5 > 0:
                        print(" " * (long_size[5] - 5), end="")
                    
                    print("| Warna ", end="")
                    if long_size[6] - 5 > 0:
                        print(" " * (long_size[6] - 5), end="")
                    
                    print("| Merk ", end="")
                    if long_size[7] - 4 > 0:
                        print(" " * (long_size[7] - 4), end="")
                    
                    print("| Size |")
                else:
                    for produk in list_produk:  # Iterasi melalui setiap produk dalam list_produk
                        # Kolom ID
                        print(f"| {produk.get_ID()}", end="")
                        if self.hitung_angka(produk.get_ID()) <= long_size[0]:
                            if long_size[0] < 2:
                                print(" " * (2 - self.hitung_angka(produk.get_ID())), end="")
                            else:
                                print(" " * (long_size[0] - self.hitung_angka(produk.get_ID())), end="")
                        print(" | ", end="")

                        # Kolom Nama Produk
                        print(produk.get_Nama_Produk(), end="")
                        if len(produk.get_Nama_Produk()) <= long_size[1]:
                            if long_size[1] < 4:
                                print(" " * (4 - len(produk.get_Nama_Produk())), end="")
                            else:
                                print(" " * (long_size[1] - len(produk.get_Nama_Produk())), end="")
                        print(" | ", end="")

                        # Kolom Harga Produk
                        print(produk.get_Harga_Produk(), end="")
                        if self.hitung_angka(produk.get_Harga_Produk()) <= long_size[2]:
                            if long_size[2] < 5:
                                print(" " * (5 - self.hitung_angka(produk.get_Harga_Produk())), end="")
                            else:
                                print(" " * (long_size[2] - self.hitung_angka(produk.get_Harga_Produk())), end="")
                        print(" | ", end="")

                        # Kolom Stok Produk
                        print(produk.get_Stok_Produk(), end="")
                        if self.hitung_angka(produk.get_Stok_Produk()) <= long_size[3]:
                            if long_size[3] < 4:
                                print(" " * (4 - self.hitung_angka(produk.get_Stok_Produk())), end="")
                            else:
                                print(" " * (long_size[3] - self.hitung_angka(produk.get_Stok_Produk())), end="")
                        print(" | ", end="")

                        # Kolom Jenis
                        print(produk.get_jenis(), end="")
                        if len(produk.get_jenis()) <= long_size[4]:
                            if long_size[4] < 5:
                                print(" " * (5 - len(produk.get_jenis())), end="")
                            else:
                                print(" " * (long_size[4] - len(produk.get_jenis())), end="")
                        print(" | ", end="")

                        # Kolom Bahan
                        print(produk.get_bahan(), end="")
                        if len(produk.get_bahan()) <= long_size[5]:
                            if long_size[5] < 5:
                                print(" " * (5 - len(produk.get_bahan())), end="")
                            else:
                                print(" " * (long_size[5] - len(produk.get_bahan())), end="")
                        print(" | ", end="")

                        # Kolom Warna
                        print(produk.get_warna(), end="")
                        if len(produk.get_warna()) <= long_size[6]:
                            if long_size[6] < 5:
                                print(" " * (5 - len(produk.get_warna())), end="")
                            else:
                                print(" " * (long_size[6] - len(produk.get_warna())), end="")
                        print(" | ", end="")

                        # Kolom Merk
                        print(produk.get_Merk(), end="")
                        if len(produk.get_Merk()) <= long_size[7]:
                            if long_size[7] < 4:
                                print(" " * (4 - len(produk.get_Merk())), end="")
                            else:
                                print(" " * (long_size[7] - len(produk.get_Merk())), end="")
                        print(" | ", end="")

                        # Kolom Size
                        print(produk.get_Size(), end="")
                        print("    |")