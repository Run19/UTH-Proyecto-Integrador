package Util;

public class Util {
    public static String twoDigits(int num) {
        String number = "" + num;
        if (num < 10) {
            number = "0" + num;
        } else if (num > 99) {
            number = number.substring(number.length() - 2);
        }
        return number;
    }
}
