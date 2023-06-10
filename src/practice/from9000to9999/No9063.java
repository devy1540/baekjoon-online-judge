package practice.from9000to9999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No9063 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] xlist = new int[n];
        int[] ylist = new int[n];

        if(n == 1) {
            bw.write(String.valueOf(0));
        } else {
            for(int i = 0; i < n; i++) {
                int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                xlist[i] = input[0];
                ylist[i] = input[1];
            }

            int w = Arrays.stream(xlist).max().orElseThrow() - Arrays.stream(xlist).min().orElseThrow();
            int h = Arrays.stream(ylist).max().orElseThrow() - Arrays.stream(ylist).min().orElseThrow();

            bw.write(String.valueOf(w * h));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
