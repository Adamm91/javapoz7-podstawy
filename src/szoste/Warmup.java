package szoste;

import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {

        // metoda przyjmujaca tablice stringow z imionami, zliczamy w petli ile jest zenskich imion endsWith () - a
        // zliczenia wystapienia znaku (niezaleznie od wielkosci)  w stringu "ala ma kota"
        // zliczenia wystapienia znaku (niezaleznie od wielkosci)  w tablicy stringow.

        String [] names = {"anna", "dominika", "gosia", "adam", "bartek"};
        System.out.println("Women's names = " + womenNameCounter(names));

        String ala = "Ala ma kota";
        System.out.println(endsWith("ala ma kota" , "ota"));
        System.out.println(letterCounter("Anna",'a'));
        System.out.println("Number of a in " + Arrays.toString(names) + " = " + lettersCounter(names, 'a'));



    }

    public static int lettersCounter(String[] messages, char c) {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            counter += letterCounter(messages[i], c);

        }
        return counter;
    }

    public static int letterCounter (String text, char c) {
        char [] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);
        for (int i = chars.length - 1; i >= 0; i--) {
            if ( capitalize(chars[i]) == capitalizedChar) {
                counter++;
            }
        }
        return counter;
    }

    public static char capitalize(char c) {
      return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
    }

    public static int womenNameCounter (String [] names) {
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
//            if (names[i].endsWith("a")) {
//                counter++;
//            }
            if (endsWith(names[i], "a")) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean endsWith(String text, String searchingValue) {
        boolean result = false;
        if (searchingValue.length() <= text.length()) {
            int i = searchingValue.length() - 1;
            char[] textAsCharArray = text.toCharArray();
            char[] searchingValueAsCharArray = searchingValue.toCharArray();

            int aLength = textAsCharArray.length;
            int bLength = searchingValueAsCharArray.length;
            while (i >= 0 && searchingValueAsCharArray[i] == textAsCharArray[aLength + i - bLength]) {
                i--;
            }
            result= i == -1;
        }
        return result;
    }



}
