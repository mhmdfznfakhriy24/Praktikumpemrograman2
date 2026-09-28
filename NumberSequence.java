package module01.problem02;

public class NumberSequence {
    public static void printSequence(int startingNum) {
        int count = 0;
        int currentNum = startingNum;

        while (count < 10) {
            int printedNum;

            // Cek apakah angka kelipatan 5
            if (currentNum % 5 == 0) {
                printedNum = (currentNum / 5) - 1;
            } else {
                printedNum = currentNum;
            }

            // Cetak angka
            System.out.print(printedNum);

            // Cetak koma jika belum di angka terakhir (10 baris/deret)
            if (count < 9) {
                System.out.print(",");
            }

            // Lanjut ke angka berikutnya
            currentNum++;
            count++;
        }
        System.out.println(); // Pindah baris di akhir
    }
}