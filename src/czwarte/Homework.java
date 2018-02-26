package czwarte;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

//        1. wypisac znaki zakodowane (np. adam -> bebn) i odkoduje spowrotem (szyfr cezara)

        Scanner scanner = new Scanner(System.in);
        Scanner coder = new Scanner(System.in);
        Scanner decoder = new Scanner(System.in);


        int select = 1;
        int howFar;
        while (select != 0) {
            System.out.println("Select option:");
            System.out.println("1. Coder");
            System.out.println("2. Decoder");
            System.out.println("0. Exit");
            select = scanner.nextInt();

            if (select == 1) { // coder
                System.out.println("Number of move");
                howFar = scanner.nextInt();
                System.out.println("Write text to code: ");
                String code = coder.nextLine();
                char [] cezar = code.toCharArray();

                for (int i = 0; i < cezar.length; i++) {
                        if ((cezar[i] >= 'a' && cezar[i] <= 'z') || (cezar[i] >= 'A' && cezar[i] <= 'Z')) {
                            if ((cezar[i] + howFar) > 'Z' && (cezar[i] + howFar) < 'a') {
                                cezar[i] += 26 + howFar;
                            } else if (cezar[i] + howFar > 'z'){
                                cezar[i] = (char)(cezar[i] - 26 + howFar);
                            } else {
                                cezar[i] += howFar;
                            }

                        }
                }
                System.out.println("Encoded: " + String.valueOf(cezar));

                // *****************************************************
            } else if (select == 2) { // decoder
                System.out.println("Number of move");
                howFar = scanner.nextInt();
                System.out.println("Write text to decode");
                String decode = decoder.nextLine();
                char [] cezar = decode.toCharArray();

                for (int i = 0; i < cezar.length; i++) {
                    if ((cezar[i] >= 'a' && cezar[i] <= 'z') || (cezar[i] >= 'A' && cezar[i] <= 'Z')) {
                        if ((cezar[i] - howFar) > 'Z' && (cezar[i] - howFar) < 'a') {
                            cezar[i] += 26 + howFar;
                        } else if (cezar[i] == 'a' || cezar[i] == 'A'){
                            cezar[i] = (char)(cezar[i] + 26 - howFar);
                        } else {
                            cezar[i] -= howFar;
                        }

                    }
                }
                System.out.println("Text: " + String.valueOf(cezar));
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        System.out.println("End of program.");



        // String message = "cezar szyfr";






    }
}
