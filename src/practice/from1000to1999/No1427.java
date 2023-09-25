package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] n = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(n, Collections.reverseOrder());

        for(int x : n) {
            bw.write(String.valueOf(x));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
