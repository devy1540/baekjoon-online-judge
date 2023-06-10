package practice.from1000to1999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No1085 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int w = Integer.parseInt(s[2]);
        int h = Integer.parseInt(s[3]);

        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(w-x);
        list.add(h-y);

        bw.write(String.valueOf(list.stream().mapToInt(v -> v).min().getAsInt()));

        bw.flush();
        bw.close();
        br.close();
    }
}
