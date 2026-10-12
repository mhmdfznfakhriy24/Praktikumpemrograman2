package module01.problem02;

import java.util.Scanner;

class NumberSequence {
    public static void generateSequence(int start, int end) {
        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = start; i >= end; i--) {
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

        NumberSequence.generateSequence(start, end);
    }
}