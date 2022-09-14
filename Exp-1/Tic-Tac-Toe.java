import java.util.*;
import java.lang.*;
import java.io.*;

class TicTacToe {
    public static void main(String args[]) {
        char[][] board = { { '_', '|', '_', '|', '_' }, { '_', '|', '_', '|', '_' }, { ' ', '|', ' ', '|', ' ' } };
        printBoard(board);
        boolean win = false;
        while (!win) {
            System.out.println("Player's turn");
            playerMove(board);
            win = winningMoves(board);
            if (win) {
                System.out.println("Player has won!");
                break;
            }
            System.out.println("Computer's move");
            computerMove(board);
            if (win) {
                System.out.println("Computer has won!");
                break;
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println(Arrays.deepToString(board).replace("],", "\n").replace(",", "").replaceAll("[\\[\\]]", " "));
    }

    public static void updateBoard(int player, int position, char[][] board) {
        char c;

        if (player == 1) {
            c = 'X';
        } else {
            c = 'O';
        }

        switch (position) {
            case 1:
                board[0][0] = c;
                printBoard(board);
                break;

            case 2:
                board[0][2] = c;
                printBoard(board);
                break;

            case 3:
                board[0][4] = c;
                printBoard(board);
                break;

            case 4:
                board[1][0] = c;
                printBoard(board);
                break;

            case 5:
                board[1][2] = c;
                printBoard(board);
                break;

            case 6:
                board[1][4] = c;
                printBoard(board);
                break;

            case 7:
                board[2][0] = c;
                printBoard(board);
                break;

            case 8:
                board[2][2] = c;
                printBoard(board);
                break;

            case 9:
                board[2][4] = c;
                printBoard(board);
                break;
        }
    }

    public static void playerMove(char[][] board) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input move:");
        int position = sc.nextInt();
        updateBoard(1, position, board);
    }

    public static void computerMove(char[][] board) {
        Random r = new Random();
        int move = r.nextInt(9) + 1;

        System.out.println("Computer's move:" + " " + move);
        updateBoard(0, move, board);
    }

    public static boolean winningMoves(char[][] board) {
        if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][4] == 'X') {
            return true;
        } else if (board[1][0] == 'X' && board[1][2] == 'X' && board[1][4] == 'X') {
            return true;
        } else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            return true;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][4] == 'X' && board[1][4] == 'X' && board[2][4] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][2] == 'X' && board[2][4] == 'X') {
            return true;
        } else if (board[0][4] == 'X' && board[1][2] == 'X' && board[2][0] == 'X') {
            return true;
        } else if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][4] == 'O') {
            return true;
        } else if (board[1][0] == 'X' && board[1][2] == 'X' && board[1][4] == 'X') {
            return true;
        } else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            return true;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][4] == 'X' && board[1][4] == 'X' && board[2][4] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][2] == 'X' && board[2][4] == 'X') {
            return true;
        } else if (board[0][4] == 'X' && board[1][2] == 'X' && board[2][0] == 'X') {
            return true;
        } else {
            return false;
        }
    }
}
