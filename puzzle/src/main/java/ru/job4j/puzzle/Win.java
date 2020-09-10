package ru.job4j.puzzle;

public class Win {

    public static boolean checkWinVertical(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[2][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
    public static boolean checkHorizontal(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][2] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
}

    public static boolean checkNotWinOrAndVert(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[2][2] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

//    public static boolean checkNotWinL(int[][] board) {
//        boolean rsl = true;
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][4] ==0) {
//                rsl = false;
//                break;
//            }
//        }
//        return rsl;
//    }

}
