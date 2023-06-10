package practice.from27000to27999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No27323 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(a * b));

        bw.flush();
        bw.close();
        br.close();
    }
}
