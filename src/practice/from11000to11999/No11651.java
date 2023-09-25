package practice.from11000to11999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No11651 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Map<String, Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            Map<String, Integer> map = new HashMap<>();
            map.put("x", x);
            map.put("y", y);

            list.add(map);
        }

        list = list.stream().sorted((o1, o2) -> {
            if(o1.get("y").intValue() == o2.get("y").intValue()) {
                return o1.get("x") - o2.get("x");
            } else {
                return o1.get("y") - o2.get("y");
            }
        }).collect(Collectors.toList());

        for(Map<String, Integer> m : list) {
            bw.write(String.format("%d %d\n", m.get("x"), m.get("y")));
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
