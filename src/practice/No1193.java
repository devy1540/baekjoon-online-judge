package practice;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class No1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // true는 위에서 아래로
        // false는 아래에서 위로
        boolean direction = false;
        boolean flag = true;

        //분자
        int numerator = 2;
        //분모
        int denominator = 0;

        int x = Integer.parseInt(br.readLine());

        for(int i = 0; i < x; i++) {
            if(numerator == 1 || denominator == 1) {
                if(numerator == 1 && flag) {
                    denominator++;
                    direction = true;
                    flag = false;
                } else if(denominator == 1 && !flag) {
                    numerator++;
                    direction = false;
                    flag = true;
                } else {
                    if(direction) {
                        numerator++;
                        denominator--;
                    } else {
                        numerator--;
                        denominator++;
                    }
                }
            } else {
                if(direction) {
                    numerator++;
                    denominator--;
                } else {
                    numerator--;
                    denominator++;
                }
            }
        }

        bw.write(String.format("%s/%s", numerator, denominator));

        bw.flush();
        bw.close();
        br.close();
    }
}
