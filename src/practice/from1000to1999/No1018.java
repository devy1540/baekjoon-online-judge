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

        boolean[][] arr = new boolean[n][m];


        bw.flush();
        bw.close();
        br.close();
    }
}
