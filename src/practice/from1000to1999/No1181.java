package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        list = list.stream().sorted((o1, o2) -> {
            if(o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        }).distinct().collect(Collectors.toList());

        for(String s : list) {
            bw.write(s + "\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
