package module01.problem03;

public class OddSequence {
    public static void printSequence(int n, int startingNum) {
        int count = 0;
        int currentNum = startingNum;

        do {
            // Cek apakah angka ganjil (bukan genap)
            if (currentNum % 2 != 0) {
                System.out.print(currentNum);
                count++;

                // Cetak koma dan spasi jika belum mencetak sebanyak N angka
                if (count < n) {
                    System.out.print(", ");
                }
            }
            currentNum++;
        } while (count < n);

        System.out.println(); // Pindah baris
    }
}