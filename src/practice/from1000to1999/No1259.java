package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No1259 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] s = br.readLine().split("");
            boolean b = true;

            if(Arrays.stream(s).allMatch(s1 -> s1.equals("0"))) {
                break;
            }

            for (int i = 0; i < s.length / 2; i++) {
                if (!s[i].equals(s[s.length - 1 - i])) {
                    b = false;
                    break;
                }
            }
            if(b) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
