package practice.from2000to2999;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class No2420 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        long n = Integer.parseInt(s[0]);
        long m = Integer.parseInt(s[1]);

        sb.append(Math.abs(n - m));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
