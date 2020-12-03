package company.pompany;

public class isRoman {
    public static boolean isRomanNumber(String string) {//check for Roman numbers is implemented here
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",};
        int counter = 0;
        for (int i = 0; i < roman.length; i++) {
            if (string.equals(roman[i])) {
                counter++;
            }
        }
        if (counter > 0) return true;
        else return false;
    }
}
