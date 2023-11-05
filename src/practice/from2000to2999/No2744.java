package practice.from2000to2999;
import java.io.*;
import java.util.*;

public class No2744 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 97 && c <= 122) {
                c = (char) (c - 32);
            } else {
                c = (char) (c + 32);
            }
            sb.append(c);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
