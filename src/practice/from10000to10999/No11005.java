package practice.from10000to10999;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class No11005 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        long n  = Long.parseLong(input[0]);
        int b = Integer.parseInt(input[1]);

        bw.write(Long.toString(n, b).toUpperCase());
        change(n, b);


        bw.flush();
        bw.close();
        br.close();
    }

    public static void change(long n, int b) {
        StringBuffer s = new StringBuffer();
        long tmp = n;
        while(tmp > 0) {
            if(tmp % b < 10) {
                s.append((char) ((tmp & b) + 48));
            } else {
                s.append((char) ((tmp % b) + 55));
            }

            tmp /= b;
        }

        System.out.println("change: " + s);
    }
}
