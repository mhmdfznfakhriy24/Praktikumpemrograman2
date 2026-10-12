package module01.problem03;

import java.util.Scanner;

class OddSequence {
    public static void printOdds(int start, int end) {
        int lower = Math.min(start, end);
        int upper = Math.max(start, end);

        for (int i = lower; i <= upper; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();
        input.close();

        OddSequence.printOdds(start, end);
    }
}