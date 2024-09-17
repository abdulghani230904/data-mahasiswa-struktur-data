// Class KonversiSuhu2 yang menginherit dari KonversiSuhu
class KonversiSuhu2 extends KonversiSuhu {
    // Method untuk mengubah Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius * 4/5;
    }
}
