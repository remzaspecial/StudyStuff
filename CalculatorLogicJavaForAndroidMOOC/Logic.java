package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;

    }
    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
            if(operation == ADDITION) {
                Add add = new Add(argumentOne, argumentTwo);
                mOut.print(add.toString());//we use toString method because mOut use String value
            }
            else if(operation == SUBTRACTION) {
                Subtract sub = new Subtract(argumentOne, argumentTwo);
                mOut.print(sub.toString());
            }
            else if (operation == MULTIPLICATION) {
                Multiply mul = new Multiply(argumentOne, argumentTwo);
                mOut.print(mul.toString());
            }
            else if(operation == DIVISION) {
                Divide div = new Divide(argumentOne, argumentTwo);
                mOut.print(div.toString());
            }

        }
    }
