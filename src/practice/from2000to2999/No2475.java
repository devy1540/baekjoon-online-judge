package practice.from2000to2999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;


public class No2475 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .map(x -> x * x)
                .toArray();

        int result = Arrays.stream(list).sum() % 10;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
