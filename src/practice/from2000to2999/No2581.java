package practice.from2000to2999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No2581 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i = m; i <= n; i++) {
            if(i == 1) continue;
            boolean flag = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                list.add(i);
            }
        }

        if(list.size() == 0) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(String.format("%s\n", list.stream().mapToInt(v -> v).sum()));
            bw.write(String.format("%s", list.stream().mapToInt(v -> v).min().orElseThrow()));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
