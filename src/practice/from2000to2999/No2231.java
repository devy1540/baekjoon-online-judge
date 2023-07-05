package practice.from2000to2999;
import java.util.*;
import java.io.*;
import java.util.stream.*;
import java.math.*;

public class No2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(n));

        bw.flush();
        bw.close();
        br.close();
    }
}
