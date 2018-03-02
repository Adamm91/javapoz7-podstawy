package szoste;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // zad. 1 zliczyc elemenety
        // zad. 2 posortowac

        // zad. 1
        // przejsc po elementach
        //      for
        // zapisac wystapienia elementow
        //      utworzyc tablice w ktorej bede zliczac


        /*
        silnia (factorial) -> long
        zliczanie liczb podzielnych przez 2, ale nie podzielnych przez 3
        sprawdzenie czy string jest liczba
        zmiana jednego znaku na drugi w danym stringu (np spacje na myslniki "ala ma kota" -> "ala-ma-kota")
        czy test jest palindromem np kajak > true, anna > true, abc > false
        split -> 123;abc;dd -> ["123", "abc", "dd"]
        split -> dd.aa.cc -> ["dd", "aa", "cc"]
        fibonacci -
        sprawdzanie nawiasow w stringu
        porownanie 2 stringow ktore sa liczbami
        suma liczb pierwszych w danej liczbie (1,2,3,5,7,11)
                            np. 11 = 7 + 3 + 1
         */

        int[] array = {2, 6, 12, 15, 18, 20};
        String ala = "ala ma kota";


//        System.out.println(factorial(5));
//        System.out.println(byTwoNotThree(array));
//        System.out.println(changeSymbol(ala, ' ', '-'));
//        System.out.println("The text is a number: " + isNumber("22"));
//        System.out.println("\"kajak\" is palindrome = " + isPalindrome("kajak"));
//        System.out.println("\"Anna\" is palindrome = " + isPalindrome("Anna"));
//        System.out.println("\"abcd\" is palindrome = " + isPalindrome("abcd"));
//        System.out.println("a;b;c 0(-1) = " + getNthIndexOf(';', "a;b;c", 0));
//        System.out.println("a;b;c 0(1) = " + getNthIndexOf(';', "a;b;c", 1));
//        System.out.println("a;b;c 0(3) = " + getNthIndexOf(';', "a;b;c", 2));
//        System.out.println("a;b;c 0(5) = " + getNthIndexOf(';', "a;b;c", 3));
//        System.out.println("\"Ala ma kota\" split = " + Arrays.toString(split("Ala ma kota", ' ')));
//        System.out.println("\"Ala ma kota\" split2 = " + Arrays.toString(split2("Ala ma kota", ' ')));
//        System.out.println("\"Ala ma kota\" split2 = " + Arrays.toString(split2("ab;cd;ef", ';')));
//        System.out.println("\"Ala ma kota\" split2 = " + Arrays.toString(split2("ab;;cd;ef", ';')));
//        System.out.println("fibonacci for 7 is: " + fibonacciNumber(7));
//        System.out.println("fibonacci tab for 5 is: " + Arrays.toString(fibonacciArray(5)));
//        System.out.println(turn("adam"));
//        System.out.println(reverse("ADAM"));
//        System.out.println(braces("(a+b)"));
//        System.out.println(braces(")(a+b)("));
//        System.out.println(braces("(a+b))"));
//        System.out.println(braces("(a+b)("));
//        System.out.println(Arrays.toString(reverseArray(new int[] {1, 2, 3, 4, 5, 6})));
//        System.out.println("tree of height 5: \n" + tree(5));
//        System.out.println(isNumber("25" , "72"));
        System.out.println(primaryNumbersOf(37));



// metoda ktora zwraca nowa tablice ktora jest odwrocona
// drzewko
// metoda do porownania 2 stringow czy sa liczbami
// metoda wyswietlajaca sume liczb pierwszyc w danej liczbie (1,2,3,5,7,11)
    }

    public static String primaryNumbersOf(int number) {
        int [] primaryNumbers = {1,2,3,5,7,11};
        StringBuilder result = new StringBuilder();
        int i = primaryNumbers.length - 1;
        while (number > 0) {
            if (number >= primaryNumbers[i]) {
                    number -= primaryNumbers[i];
                    result.append(primaryNumbers[i] + " + ");
            } else {
                i--;
            }
        }
        return result.substring(0, result.length() - 3);
    }

    public static int isNumber(String number1, String number2) {
        int result = 0;
        if (number1.length() > number2.length()) {
            result++;
        } else if (number1.length() < number2.length() ) {
            result--;
        } else {
            int i = 0;
           while (i < number1.length() && result == 0) {
               if (number1.charAt(i) > number2.charAt(i) ) {
                   result++;
               } else if (number1.charAt(i) < number2.charAt(i)) {
                   result--;
               }
               i++;
           }
        }

        return result;
    }

    public static String tree (int height) {
        StringBuilder treeBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                treeBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                treeBuilder.append("*");
            }
            treeBuilder.append("\n");
        }
        return treeBuilder.toString();
    }

    public static int [] reverseArray (int [] array) {
        int [] reverse = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[reverse.length - 1 - i] = array[i];
        }
        return reverse;
    }

    public static boolean braces (String text) {
        char[] array = text.toCharArray();
        int counterOfOpen = 0;
        int counterOfClose = 0;
        boolean result = true;
        int counter = 0;
        int i = 0;
        while (i < array.length && counter >= 0) {
            if (array[i] == '(') {
                counter++;
            } else if (array[i] == ')') {
                counter--;
            }
            i++;
        }

         return counter == 0;
    }

    public static void swap () {
        int a = 2;
        int b = 5;
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static String reverse (String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return String.valueOf(array);
    }

    public static String turn (String text) {
        char[] chars = text.toCharArray();
        char[] turned = new char [chars.length];
        for (int i = 0; i < chars.length; i++) {
            turned [turned.length - (1 + i)] = chars[i];
        }
        return String.valueOf(turned);
    }

    public static int [] fibonacciArray (int n) {
        int [] fibonacciArray = new int[n+1];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray;
    }

    public static int fibonacciNumber (int n) {
        int first = 0;
        int second = 1;
        int next = 0;
        if (n <= 1) return n;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                next = first + second;

                first = second;
                second = next;
            }
        }
        return next;
    }

    public static String [] split2(String message, char c) {
        int size = Warmup.letterCounter(message, c) + 1;
        String [] resultArray = new String [size] ;
        int start = 0;
        int end;
        for (int i = 0; i < resultArray.length; i++) {
            String textToPut = "";
            end = getNthIndexOf(c, message, (i + 1));
            for (int j = start; j < end; j++) {
                textToPut += message.charAt(j);
            }

            resultArray[i] = textToPut;
            start = end + 1;

        }
        return resultArray;
    }

    public static String [] split (String message, char c) {
        int size = Warmup.letterCounter(message, c) + 1;
        String [] resultArray = new String [size] ;
        String textToPut = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != c) {
                textToPut += message.charAt(i);
                if (i == message.length() - 1) {
                    resultArray[j] = textToPut;
                }
            } else {
                resultArray[j] = textToPut;
                j++;
                textToPut= "";
            }
        }
        return resultArray;
    }

    public static boolean isPalindrome (String text) {
        char[] chars = text.toCharArray();
        boolean result = true;
        int i = 0;
        while (i < chars.length / 2 && (Warmup.capitalize(chars[i]) == Warmup.capitalize(chars[chars.length - i - 1])) ) {
            i++;
        }
        return i == chars.length / 2;
    }

    public static int getNthIndexOf (char c, String text, int index) {
        char[] chars = text.toCharArray();
        int i = -1;
        while (i < chars.length && index > 0) {
            i++;
            if (i < chars.length && c == chars[i]) {
                index--;
            }
        }
        return i;
    }




    public static String changeSymbol(String text, char c, char d) {
        char [] toChange = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (toChange[i] == c) {
                toChange[i] = d;
            }
        }
        return String.valueOf(toChange);
    }

    public static boolean isNumber (String text) {
        char [] toCharArray = text.toCharArray();
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (toCharArray[i] >= (char) 48 && toCharArray[i] <= (char) 57) {
                result++;
            }
        }
       return result == toCharArray.length;
    }


    public static int byTwoNotThree (long [] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 != 0 && array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static long factorial (long a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
