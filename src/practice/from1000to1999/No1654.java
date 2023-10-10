package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");

        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        int[] arr = new int[k];

        for(int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(Arrays.stream(arr).average().orElseThrow());

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
