// Class DemoKonversiSuhu untuk mendemokan penggunaan kedua class
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        // Buat objek dari KonversiSuhu dan KonversiSuhu2
        KonversiSuhu konversi1 = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        // Berikan nilai suhu untuk konversi
        double suhuCelcius = 25.0;
        double suhuFahrenheit = 77.0;

        // Panggil semua method
        System.out.println("Konversi dari Celcius ke Fahrenheit: " + konversi1.celciusToFahrenheit(suhuCelcius));
        System.out.println("Konversi dari Celcius ke Reamur: " + konversi1.celciusToReamur(suhuCelcius));
        System.out.println("Konversi dari Fahrenheit ke Reamur: " + konversi2.fahrenheitToReamur(suhuFahrenheit));
    }
}
