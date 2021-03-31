## Laporan Praktikum Searching

### Jawaban Soal

#### 6.2.3	Jawaban 

1.	Method TampilData untuk menampilkan data setelah data yang diinputkan, sedangkan TampilPossisi untuk menampilkan posisi index yang dicari, misal data yang diinputkan tidak ada di data maka output akan menghasilkan “tidak ditemukan”.
2.	Pencarian data yang menggunakan sequential searching akan berhenti bila kondisi sudah terpenuhi atau sudah ditemukan. Pada saat data array listMhs.dengan indeks[j] dengan atribut nim sama dengan data yg di cari dari parameter cari (input nim) maka variable posisi berisi j kemudian pencarian berhenti.
3.	Jika data NIM yang dimasukkan tidak terurut dari kecil ke besar, program masih dapat berjalan  dan hasil yang dikeluarkan benar. Karena di dalam pemanggilan FindBinarySearch terdapat pemilihan yang menentukan apabila suatu kondisi sudah memenuhi atau tidak.


6.2.3	Jawaban 

1. Kode program
    
    <img src = "./SS/11.jpg">

2. Kode Program

    <img src = "./SS/1.jpg">

3.	Jika data NIM yang dimasukkan tidak urut, program masih dapat berjalan tetapi output yang menggunakan binary search tidak ditemukan, dan output yang menggunakan sequential search hasilnya sesuai.
4.	Hasil dari binary search sebelum program di modifikasi input yang dicari hasilnya tidak ditemukan. Jadi, mengubah kode program binary search agar hasilnya sesuai
    
    <img src = "./SS/12.jpg">    

    output
    
    <img src = "./SS/3.jpg"> 

    <img src = "./SS/4.jpg">

    <img src = "./SS/5.jpg"> 

5. Class
    
    <img src = "./SS/6.jpg"> 

    <img src = "./SS/7.jpg"> 

    <img src = "./SS/8.jpg"> 

    <img src = "./SS/10.jpg">

    <img src = "./SS/9.jpg"> 

 

    