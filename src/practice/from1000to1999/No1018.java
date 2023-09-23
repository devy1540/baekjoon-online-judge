package practice.from1000to1999;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class No1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int min = Integer.MAX_VALUE;

//        boolean[][] sWhite = makeInitBoard(true);
//        boolean[][] sBlack = makeInitBoard(false);

        String[][] arr = new String[n][m];

        for(int i = 0; i < n; i++) {
            s = br.readLine().split("");
            System.arraycopy(s, 0, arr[i], 0, m);
        }

        System.out.println(Arrays.deepToString(makeInitBoard(true)));

//        for(int i = 0; i <= n - 8; i++) {
//            for(int j = 0; j <= m - 8; j++) {
//                min = Math.min(min, cal(i, j, arr));
//            }
//        }

        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
        br.close();
    }

    //true는 white로 시작, false는 black으로 시작
    public static String[][] makeInitBoard(boolean color) {
        String[][] board = new String[8][8];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(color) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
                color = !color;
            }
            color = !color;
        }
        return board;
    }

//    public static int cal(int x, int y, String[][] board) {
//        int n = 0;
////        boolean init = board[x][y];
//        boolean[][] init = makeInitBoard(board[x][y]);
//
//        for(int i = 0; i < 8; i++) {
//            for(int j = y; j < 8; j++) {
//                if(board[x + i][y + j] != init[i][j]) {
//                    n++;
//                }
//            }
//        }
//
//        return n;
//    }
}
