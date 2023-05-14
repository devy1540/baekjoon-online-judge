package practice;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class No2903 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int x = 2 + (int) Math.pow(2, n) - 1;

        bw.write(String.valueOf(x * x));

        bw.flush();
        bw.close();
        br.close();
    }
}
