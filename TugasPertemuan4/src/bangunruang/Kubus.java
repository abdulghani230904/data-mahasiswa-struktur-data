package bangunruang;

public class Kubus extends BangunRuang {
    private double sisi;

    // Konstruktor untuk menginisialisasi atribut sisi kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode untuk menghitung volume kubus
    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }

    // Implementasi metode untuk menghitung luas permukaan kubus
    @Override
    public double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}
