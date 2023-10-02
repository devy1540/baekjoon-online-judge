package practice.from2000to2999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No2775 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int[][] arr = new int[15][15];

        for(int i = 0; i < arr.length; i++) {
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for(int i = 0; i < t; i++) {
            //층 수
            int k = Integer.parseInt(br.readLine());
            //호 수
            int n = Integer.parseInt(br.readLine());

            for(int j = 1; j <= k; j++) {
                for(int x = 2; x <= n; x++) {
                    arr[j][x] = arr[j][x - 1] + arr[j - 1][x];
                }
            }
            sb.append(arr[k][n]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        bw.close();
    }
}
