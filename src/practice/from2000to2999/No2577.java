package practice.from2000to2999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] s = String.valueOf((long) a * b * c).split("");

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < 10; i++) {
            map.put(i, 0);
        }

        for(String s1 : s) {
            int tmp = Integer.parseInt(s1);
            map.computeIfPresent(tmp, (k, v) -> v + 1);
        }

        for(int i = 0; i < 10; i++) {
            sb.append(map.get(i)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
