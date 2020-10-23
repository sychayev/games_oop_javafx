package ru.job4j.puzzle;

public class Win {

    public static boolean checkWinVertical(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 1) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; i++) {
                if (board[i][j] != 1) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkNotWinOrAndVert(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; i++) {
                if (board[i][j] == 1) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkNotWinL(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

}
