package practice.from15000to15999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No15894 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        //1 -> 4
        //2 -> 8
        //3 -> 12
        bw.write(String.valueOf(n * 4));

        bw.flush();
        bw.close();
        br.close();

    }
}
