package module01.problem04;

import java.util.Scanner;

// Kelas pendamping (tanpa kata kunci public)
class RockPaperScissors {
    public static void determineWinner(String inputAbu, String inputBagas) {
        String[] abuMoves = inputAbu.replace("Tangan Abu: ", "").split(" ");
        String[] bagasMoves = inputBagas.replace("Tangan Bagas: ", "").split(" ");

        int abuScore = 0;
        int bagasScore = 0;

        for (int i = 0; i < 3; i++) {
            String abu = abuMoves[i];
            String bagas = bagasMoves[i];

            if (abu.equals(bagas)) {
                // Seri
            } else if ((abu.equals("B") && bagas.equals("G")) ||
                    (abu.equals("G") && bagas.equals("K")) ||
                    (abu.equals("K") && bagas.equals("B"))) {
                abuScore++;
            } else {
                bagasScore++;
            }
        }

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}

// Kelas utama (public)
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputAbu = input.nextLine();
        String inputBagas = input.nextLine();
        input.close();

        RockPaperScissors.determineWinner(inputAbu, inputBagas);
    }
}