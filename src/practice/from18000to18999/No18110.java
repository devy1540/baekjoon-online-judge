package practice.from18000to18999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No18110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(solve(br)));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int solve(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int without = (int) Math.round(n * 0.15);
        int[] ilist = new int[n];

        for(int i = 0; i < n; i++) {
            ilist[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ilist);

        int[] copy = Arrays.copyOfRange(ilist, without, n - without);

        return (int) Math.round(Arrays.stream(copy).average().orElse(0));
    }
}
