package module01.problem05;

import java.util.Scanner;

// Kelas pendamping (tanpa kata kunci public)
class Cylinder {
    public static final double PHI = 3.141592653589793;

    public static void calculateVolume(double r, double t) {
        double volume = PHI * r * r * t;

        System.out.printf("Volume tabung dengan jari-jari %s cm dan tinggi %s cm adalah %.3f m3\n",
                formatNumber(r), formatNumber(t), volume);
    }

    private static String formatNumber(double number) {
        if (number == (long) number) {
            return String.format("%d", (long) number);
        } else {
            return String.format("%s", number);
        }
    }
}

// Kelas utama (public)
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        input.close();

        Cylinder.calculateVolume(r, t);
    }
}