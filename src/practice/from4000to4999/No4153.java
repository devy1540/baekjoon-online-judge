package practice.from4000to4999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;


public class No4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String[] s = br.readLine().split(" ");
            if(Arrays.stream(s).allMatch(s1 -> s1.equals("0"))) {
                break;
            }

            //빗변
            int heru = Arrays.stream(s).mapToInt(Integer::parseInt).max().orElseThrow();
            int x = Arrays.stream(s).mapToInt(Integer::parseInt).filter(i -> i != heru).map(i -> i * i).sum();

            if(x == heru * heru) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();

    }
}
