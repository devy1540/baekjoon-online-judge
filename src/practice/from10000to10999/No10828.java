package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;


public class No10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if(s[0].equalsIgnoreCase("push")) {
                stack.push(Integer.parseInt(s[1]));
            } else if(s[0].equalsIgnoreCase("pop")) {
                if(stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.pop());
                }
                sb.append("\n");
            } else if(s[0].equalsIgnoreCase("size")) {
                sb.append(stack.size()).append("\n");
            } else if(s[0].equalsIgnoreCase("empty")) {
                if(stack.isEmpty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            } else {
                if(stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.peek());
                }
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
