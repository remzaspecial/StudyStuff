package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    private int One = 0;
    private int Two = 0;

    public Add(int argumentOne, int argumentTwo) {
        One = argumentOne;
        Two = argumentTwo;
    }

    public String toString() {
        return String.valueOf(One + Two);
    }
}
