package practice.from11000to11999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No11866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder("<");

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        List<Integer> list = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        int cnt = 0;
        List<Integer> result = new ArrayList<>();

        while(result.size() < n) {
            cnt += (k - 1);
            if(cnt >= list.size()) {
                cnt = cnt % list.size();
            }
            result.add(list.get(cnt));
            sb.append(list.get(cnt));
            list.remove(list.get(cnt));
            if(!list.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
