package practice.from2000to2999;

import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class No2738 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String in = br.readLine();
        int n = Integer.parseInt(in.split(" ")[0]);
        int m = Integer.parseInt(in.split(" ")[1]);

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        int[][] result = new int[n][m];

        //a
        for (int x = 0; x < n; x++) {
            int[] e = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            System.arraycopy(e, 0, a[x], 0, e.length);
            a[x] = Arrays.copyOf(e, e.length);
        }

        //b
        for(int x = 0; x < n; x++) {
            int[] e = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            b[x] = Arrays.copyOf(e, e.length);
        }

        for(int x = 0; x < n; x++) {
            for(int y = 0; y < m; y++) {
                result[x][y] = a[x][y] + b[x][y];
                bw.write(result[x][y] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
