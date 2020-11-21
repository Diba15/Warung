# Warung
#### Author : Dimas Bagas Saputro

#### NIM : 6706192089

Sebuah Warung ingin sebuah aplikasi sederhana dimana ia ingin menyimpan data tentang Barang-barang dagangannya, dia juga bisa menghapus dan melihat data yang sudah disimpannya itu. Dia juga bisa mengurutkan bahan dagangannya berdasarkan nama dan jenis barangnya.

Penjelasan :

-	Terdapat Class Abstract yang bernama Barang dimana class tersebut akan digunakan untuk melakukan inheritance kepada class anak, dan mewariskan beberapa method dan variablenya. Class Barang juga melakukan agregasi untuk menjadikan class Barang tersebut menjadi lebih besar menggunakan ArrayList.

-	Terdapat Class Makanan, Sabun dan Minuman yang merupakan class anak dari class Barang yang mewariskan beberapa method dan variable, pada class ini juga terjadi polymorphism dimana perubahan method constructor yang menggunakan method Overloading dan class display yang menggunakan method Override.

-	Terdapat class Warung dimana class ini menampung data yang ada pada Class Barang, pada class Warung juga terdapat ArrayList untuk menampung data Barang yang ditambahkan. Pada class Warung juga terdapat method yang bernama addBarang untuk menambahkan data pada ArrayList Barang, Ada juga method deleteBarang untuk menghapus data yang ada pada ArrayList Barang secara spesifik dengan menuliskan nama barang yang ingin dihapus, terdapat juga method yang bernama displayBarang yang berfungsi untuk menampilkan info tentang barang yang ada pada ArrayList Barang dan terdapat method sortirBarang untuk mengurutkan data yang ingin ditampilkan, Sortir bisa dipilih berdasarkan nama atau jenis.

-	Terdapat Class SortNama dan SortJenis untuk mengurutkan data Barang, Class ini terasosiasi pada Class Warung yang nantinya digunakan pada method yang ada pada class Warung yang bernama sortirBarang.