package practice.from7000to7999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No7785 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> member = new LinkedHashSet<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if(s[1].equals("enter")) {
                member.add(s[0]);
            } else {
                member.remove(s[0]);
            }
        }

        member.stream().sorted(Collections.reverseOrder()).forEach(s -> sb.append(s).append("\n"));

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
