package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        sb.append(solve(br, k));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int solve(BufferedReader br, int k) throws Exception {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < k; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x != 0) {
                stack.push(x);
            } else {
                stack.pop();
            }
        }
        int result = 0;
        for(int i : stack) {
            result += i;
        }

        return result;
    }
}
