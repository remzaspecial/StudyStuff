package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    private int One = 0;
    private int Two = 0;

    public Divide(int argumentOne, int argumentTwo) {
        One = argumentOne;
        Two = argumentTwo;
    }

    public String toString() {
        return String.valueOf(One / Two) + " R:" + String.valueOf(One % Two);
    }
}