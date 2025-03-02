# Saya Naufal Fakhri Al-Najieb dengan NIM 2309648 mengerjakan Tugas Praktikum 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
# maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from Baju import Baju

produk = Baju()  # Membuat objek Baju
produk.Sambutan()  # Memanggil method Sambutan

confirmation = ""
mark = 0
value = 0

list_produk = []  # List untuk menyimpan objek Baju

# Menambahkan data ke dalam list_produk
for index in range(1, 6):
    produk = Baju()  # Membuat objek baru di setiap iterasi
    if index == 1:
        produk.set_ID(1)
        produk.set_Nama_Produk("Sweater_Anjing")
        produk.set_Harga_Produk(75000)
        produk.set_Stok_Produk(20)
        produk.set_jenis("Baju")
        produk.set_bahan("Wol")
        produk.set_warna("Merah")
        produk.set_Merk("PawComfort")
        produk.set_Size('M')
        list_produk.append(produk)  # Menambahkan objek ke dalam list
    elif index == 2:
        produk.set_ID(2)
        produk.set_Nama_Produk("Kaos_Kucing")
        produk.set_Harga_Produk(50000)
        produk.set_Stok_Produk(15)
        produk.set_jenis("Kaos")
        produk.set_bahan("Katun")
        produk.set_warna("Biru")
        produk.set_Merk("MeowWear")
        produk.set_Size('S')
        list_produk.append(produk)
    elif index == 3:
        produk.set_ID(3)
        produk.set_Nama_Produk("Kostum_Anjing")
        produk.set_Harga_Produk(120000)
        produk.set_Stok_Produk(10)
        produk.set_jenis("Kostum")
        produk.set_bahan("Polyester")
        produk.set_warna("Merah")
        produk.set_Merk("DogPower")
        produk.set_Size('L')
        list_produk.append(produk)
    elif index == 4:
        produk.set_ID(4)
        produk.set_Nama_Produk("Jas_Kucing")
        produk.set_Harga_Produk(150000)
        produk.set_Stok_Produk(8)
        produk.set_jenis("Jas")
        produk.set_bahan("Sutra")
        produk.set_warna("Hitam")
        produk.set_Merk("RoyalPets")
        produk.set_Size('M')
        list_produk.append(produk)
    else:
        produk.set_ID(5)
        produk.set_Nama_Produk("Hoodie_Anjing")
        produk.set_Harga_Produk(85000)
        produk.set_Stok_Produk(12)
        produk.set_jenis("Hoodie")
        produk.set_bahan("Fleece")
        produk.set_warna("Abu-abu")
        produk.set_Merk("ActivePaws")
        produk.set_Size('L')
        list_produk.append(produk)

# Loop untuk memilih menu
while mark != 1:
    produk.Menu_Program()
    print()
    value = int(input("Pilih opsi menu > "))

    produk.Pilihan_Menu(value, list_produk)
    print()
    confirmation = input("Apakah Anda ingin memilih opsi lainnya lagi? (ya/tidak)\n> ")
    if confirmation == "tidak":
        mark = 1
    else:
        print()