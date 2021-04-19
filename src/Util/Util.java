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


    public static StringBuilder drawTitle(char character, String title) {
        StringBuilder titleDecorated = new StringBuilder();

        String charactersLine = String.valueOf(character).repeat(title.length());

        titleDecorated.append(charactersLine).append("\n");
        titleDecorated.append(title).append("\n");
        titleDecorated.append(charactersLine);

        return titleDecorated;
    }
}
