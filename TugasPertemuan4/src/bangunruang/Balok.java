package bangunruang;

public class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    // Konstruktor untuk menginisialisasi atribut panjang, lebar, dan tinggi balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Implementasi metode untuk menghitung volume balok
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    // Implementasi metode untuk menghitung luas permukaan balok
    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}