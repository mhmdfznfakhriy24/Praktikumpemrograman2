package module03.problem01;

import java.util.Random;

public class Dice {
    private int value;
    private Random random = new Random();

    public Dice() {
        randomizeValue();   // nilai langsung diacak saat objek dibuat
    }

    public void randomizeValue() {
        value = random.nextInt(6) + 1;   // hasil 1 sampai 6
    }

    public int getValue() {
        return value;
    }
}