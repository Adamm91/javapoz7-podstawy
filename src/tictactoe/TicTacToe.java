package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            TicTacToeViews.menuView();
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
            }
        } while (answer != 0);
    }

    public static void startGame(Scanner scanner) {
        boolean result = true;
        char cross = 'X';
        char circle = 'O';
        char currentSign = cross;
        char[] board = "123456789".toCharArray();
        int i = 0;
        do {
            TicTacToeViews.boardView(board);
            int position = askForPosition(scanner, board);
            mark(currentSign, board, position);
            currentSign = currentSign == 'X' ? circle : cross;
        } while (i < 9 && !gameFinished(board));
        TicTacToeViews.boardView(board);
        System.out.println();
        System.out.println("End of game");

        if (!gameFinished(board)) {
            TicTacToeViews.drawEndGame();
        } else {
            TicTacToeViews.loserEndGame(currentSign);

        }
        System.out.println();
    }

    private static boolean gameFinished(char[] board) {
        return  isFirstDiagonalEqual(board) ||
                isSecondDiagonalEqual(board) ||
                isAnyVerticalEqual(board) ||
                isAnyHorizontalEqual(board);
    }

    private static boolean isSecondDiagonalEqual(char[] board) {
        return (board[2] == board[4] && board[4] == board[6]);
    }

    private static boolean isFirstDiagonalEqual(char[] board) {
        return (board[0] == board[4] && board[4] == board[8]);
    }

    private static boolean isAnyHorizontalEqual(char[] board) {
        boolean theTrue = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i] % 3 == 1 && board[i] == board[i+1] && board[i] == board[i+2]) {
                theTrue = true;
            }
        }
        return theTrue;
    }

    private static boolean isAnyVerticalEqual(char[] board) {
        return (board[0] == board[3] && board[3] == board[6] ||
                board[1] == board[4] && board[4] == board[7] ||
                board[6] == board[7] && board[7] == board[8]);
    }

    public static void mark(char currentSign, char[] board, int position) {
        board[position] = currentSign;
    }


    public static int askForPosition(Scanner scanner, char[] board) {
        int position;
        do {
            position = scanner.nextInt();
            if (!isValidPosition(position, board)) {
                System.out.println("Invalid value. Try again");
            }
        } while (!isValidPosition(position, board));
        return position - 1;
    }

    private static boolean isValidPosition(int position, char[] board) {
        return (position >= 1 && position <= 9) && board[position - 1] != 'X' && board[position - 1] != 'O';
    }

}
