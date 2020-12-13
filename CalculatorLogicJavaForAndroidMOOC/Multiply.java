package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    private int One = 0;
    private int Two = 0;

    public Multiply(int argumentOne, int argumentTwo) {
        One = argumentOne;
        Two = argumentTwo;
    }

    public String toString() {
        return String.valueOf(One * Two);
    }
}