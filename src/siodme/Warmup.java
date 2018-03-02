package siodme;

public class Warmup {
    public static void main(String[] args) {

    // napisz metode ktora zmienia wielkosc liter w Stringu.

     String message = "AaBbCc";
        System.out.println(switchCase(message));
        System.out.println("switched AbCd = " + switchCase("AbCd" ) );

    }

    public static String switchCase (String text) {

        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            chars [i] = switchCase(chars[i]);
        }
        return String.valueOf(chars);
    }

    public static char switchCase (char c) {
        char switchedChar = c;
        if (c >= 'a' && c <= 'z') {
            switchedChar -= 32;
        } else if (c >= 'A' && c <= 'Z') {
            switchedChar += 32;
        }
        return switchedChar;
    }


}
