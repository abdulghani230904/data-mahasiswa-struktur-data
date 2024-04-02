#include <iostream>
using namespace std;

// Struct untuk menyimpan data mahasiswa
struct Mahasiswa {
    string nama;
    string npm;
    int nilaiUTS;
    int nilaiUAS;
    Mahasiswa* next; // Pointer untuk linked list
};

// Fungsi untuk menampilkan data mahasiswa dari linked list
void tampilkanMahasiswa(Mahasiswa* head) {
    Mahasiswa* current = head;
    while (current != nullptr) {
        cout << "Nama: " << current->nama << endl;
        cout << "NPM: " << current->npm << endl;
        cout << "Nilai UTS: " << current->nilaiUTS << endl;
        cout << "Nilai UAS: " << current->nilaiUAS << endl;
        cout << endl;
        current = current->next;
    }
}

int main() {
    // Inisialisasi data mahasiswa
    Mahasiswa mhs;
    mhs.nama = "Nama Mahasiswa";
    mhs.npm = "2310631170002";
    mhs.nilaiUTS = 90;
    mhs.nilaiUAS = 85;

    // Menggunakan array untuk menyimpan data mahasiswa
    Mahasiswa arrMhs[1];
    arrMhs[0] = mhs;

    // Menggunakan linked list untuk menyimpan data mahasiswa
    Mahasiswa* head = new Mahasiswa();
    head->nama = mhs.nama;
    head->npm = mhs.npm;
    head->nilaiUTS = mhs.nilaiUTS;
    head->nilaiUAS = mhs.nilaiUAS;
    head->next = nullptr;

    // Menampilkan data mahasiswa dari array
    cout << "Data Mahasiswa dari Array:" << endl;
    cout << "Nama: " << arrMhs[0].nama << endl;
    cout << "NPM: " << arrMhs[0].npm << endl;
    cout << "Nilai UTS: " << arrMhs[0].nilaiUTS << endl;
    cout << "Nilai UAS: " << arrMhs[0].nilaiUAS << endl;
    cout << endl;

    // Menampilkan data mahasiswa dari linked list
    cout << "Data Mahasiswa dari Linked List:" << endl;
    tampilkanMahasiswa(head);

    // Dealokasi memory linked list
    delete head;

    return 0;
}
