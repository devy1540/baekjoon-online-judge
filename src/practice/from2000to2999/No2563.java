package practice.from2000to2999;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class No2563 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] result = new int[100][100];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = input[0];
            int b = input[1];
            for (int x = a; x < a + 10; x++) {
                for (int y = b; y < b + 10; y++) {
                    result[x][y] = 1;
                }
            }
        }

        long count = Arrays.stream(result).flatMapToInt(Arrays::stream).filter(v -> v == 1).count();

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }
}
