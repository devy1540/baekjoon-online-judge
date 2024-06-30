package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        //듣도 못한 사람
        int n = Integer.parseInt(s[0]);
        //보도 못한 사람
        int m = Integer.parseInt(s[1]);

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) set.add(br.readLine());
        for(int i = 0; i < m; i++) {
            String x = br.readLine();
            if(set.contains(x)) list.add(x);
        }
        sb.append(list.size()).append("\n");
        Collections.sort(list);

        for(String x : list) sb.append(x).append("\n");

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
