package module01.problem05;

public class Cylinder {
    // Deklarasi PHI sebagai konstanta sesuai standar penulisan Java
    public static final double PHI = 3.141592653589793;

    public static void calculateVolume(double r, double t) {
        double volume = PHI * r * r * t;

        // Mencetak hasil format output
        System.out.printf("Volume tabung dengan jari-jari %s cm dan tinggi %s cm adalah %.3f m3\n",
                formatNumber(r), formatNumber(t), volume);
    }

    // Helper method agar angka bulat tercetak tanpa desimal tambahan jika diinput angka bulat
    private static String formatNumber(double number) {
        if (number == (long) number) {
            return String.format("%d", (long) number);
        } else {
            return String.format("%s", number);
        }
    }
}
