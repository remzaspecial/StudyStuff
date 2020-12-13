package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    private int One = 0;
    private int Two = 0;

    public Subtract(int argumentOne, int argumentTwo) {
        One = argumentOne;
        Two = argumentTwo;
    }

    public String toString() {
        return String.valueOf(One - Two);
    }
}