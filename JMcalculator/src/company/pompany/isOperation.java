package company.pompany;

public class isOperation {//check for operation symbol is implemented here
    public static boolean isOperation(String string) {
        String[] operations = {"+", "-", "*", "/"};
        int counter = 0;
        for (int i = 0; i < operations.length; i++) {
            if (string.equals(operations[i])) {
                counter++;
            }
        }
        if (counter > 0) return true;
        else return false;
    }
}
