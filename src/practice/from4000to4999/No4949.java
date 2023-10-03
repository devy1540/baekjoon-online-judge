package practice.from4000to4999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No4949 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s;
        while(!(s = br.readLine()).equalsIgnoreCase(".")) {
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else if(s.charAt(i) == ')' || s.charAt(i) == ']') {
                    if(stack.isEmpty()) {
                        stack.push(s.charAt(i));
                        break;
                    }
                    if(stack.peek() == '(' && s.charAt(i) == ')') {
                        stack.pop();
                    } else if(stack.peek() == '[' && s.charAt(i) == ']') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                        break;
                    }
                }
            }
            if(stack.isEmpty()) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
