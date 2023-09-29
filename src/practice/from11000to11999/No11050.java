package practice.from11000to11999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;


public class No11050 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int nf = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        int kf = IntStream.rangeClosed(1, k).reduce(1, (a, b) -> a * b);
        int nkf = IntStream.rangeClosed(1, n - k).reduce(1, (a, b) -> a * b);

        int result = nf / (kf * nkf);

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}

/**
 * 이항계수 공식
 * n! / k!(n-k)!
 * */