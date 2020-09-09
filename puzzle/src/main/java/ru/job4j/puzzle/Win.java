package ru.job4j.puzzle;

public class Win {

    public static boolean checkVertical(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][2] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[2][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkNotWinHorAndVert(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[2][i] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

//    public static boolean checkNotWinL(int[][] board) {
//        boolean rsl = true;
//        for (int i = 0; i < board.length; i++) {
//            if (board[4][i] != 1) {
//                rsl = false;
//                break;
//            }
//        }
//        return rsl;
//    }

//    public static void main(String[] args) {
//        int mass1 = new int
//    }
}
