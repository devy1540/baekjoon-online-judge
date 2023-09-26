package practice.from1000to1999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            String tmp = br.readLine();
            map.put(i, tmp);
            map2.put(tmp, i);
        }

        for(int i = 0; i < m; i++) {
            String input = br.readLine();
            if(isNumeric(input)) {
                sb.append(map.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(map2.get(input)).append("\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
