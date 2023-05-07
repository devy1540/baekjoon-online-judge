package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class No1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(checker(s)) {
                result++;
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean checker(String s) {
        List<Character> list = new ArrayList<>();
        char prev = 0;

        //구현
        for(int x = 0; x < s.length(); x++) {
            char now = s.charAt(x);

            //앞에 나온 문자와 현재 문자가 같지 않은 경우
            if(now != prev) {
                if(!list.contains(now)) {
                    list.add(now);
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
