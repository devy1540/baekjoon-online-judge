package practice.from8000to8999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;


public class No8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int result = 0;
            int rate = 1;
            boolean b = false;
            String[] s = br.readLine().split("");

            for(String x : s) {
                if(x.equals("O")) {
                    if(b) {
                        rate++;
                    }
                    result += rate;
                    b = true;
                } else {
                    b = false;
                    rate = 1;
                }
            }
            sb.append(result).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
