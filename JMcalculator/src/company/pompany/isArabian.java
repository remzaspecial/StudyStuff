package company.pompany;

public class isArabian {//check for Arabian numbers is implemented here
    public static boolean isArabianNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
