package practice.from9000to9999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No9012 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");

            Stack<String> stack = new Stack<>();
            for(String x : s) {
                if(x.equals("(")) {
                    stack.push(x);
                } else if(stack.isEmpty()) {
                    stack.push(x);
                    break;
                } else {
                    stack.pop();
                }
            }
            if(!stack.isEmpty()) {
                sb.append("NO");
            } else {
                sb.append("YES");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
