package bangunruang;

public class Main {

    // Metode untuk menghitung dan menampilkan volume dan luas permukaan
    public static void hitungBangunRuang(BangunRuang bangunRuang) {
        System.out.println("Volume: " + bangunRuang.volume());
        System.out.println("Luas Permukaan: " + bangunRuang.luasPermukaan());
    }

    public static void main(String[] args) {
        // Contoh penggunaan untuk Balok
        System.out.println("Balok:");
        Balok balok = new Balok(3, 4, 5);
        hitungBangunRuang(balok);

        // Contoh penggunaan untuk Kubus
        System.out.println("\nKubus:");
        Kubus kubus = new Kubus(4);
        hitungBangunRuang(kubus);
    }
}
