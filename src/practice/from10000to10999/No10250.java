package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No10250 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            //층수
            int h = Integer.parseInt(s[0]);
            //방수
            int w = Integer.parseInt(s[1]);
            //몇번쨰 손님
            int n = Integer.parseInt(s[2]);
            int cnt = 1;
            all:
            for(int x = 1; x <= w; x++) {
                for(int y = 1; y <= h; y++) {
                    if(cnt == n) {
                        String floor = String.valueOf(y);
                        String number = (x < 10) ? (String.format("0%d", x)) : (String.valueOf(x));

                        bw.write(String.format("%s%s\n", floor, number));
                        break all;
                    } else {
                        cnt++;
                    }
                }
            }

        }



        bw.flush();
        bw.close();
        br.close();
    }
}
