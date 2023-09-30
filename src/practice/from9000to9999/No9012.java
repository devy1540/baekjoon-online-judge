package practice.from9000to9999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No9012 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.startsWith(")")) {
                sb.append("no");
            } else {
                long x = Arrays.stream(s.split("")).filter(a -> a.equals("(")).count();
                long y = Arrays.stream(s.split("")).filter(a -> a.equals(")")).count();

                if(x == y) {
                    sb.append("yes");
                } else {
                    sb.append("no");
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
