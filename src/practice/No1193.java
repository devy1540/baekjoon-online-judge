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
                    System.out.println("분자가 1이여서 분모를 증가한다.");
                    denominator++;
                    direction = true;
                    flag = false;
                } else if(denominator == 1 && !flag) {
                    System.out.println("분모가 1이여서 분자를 증가한다.");
                    numerator++;
                    direction = false;
                    flag = true;
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

            System.out.println("중간집계 >> 분자: " + numerator + ", 분모: " + denominator);

        }

        System.out.println("분자: " + numerator + ", 분모: " + denominator);



//        for(int i = 1; i <= x; i++) {
//            if(numerator == 1 || denominator == 1) {
//                if(s % 2 != 0) {
//                    System.out.println("홀수다");
//                    denominator++;
//                    direction = false;
//                } else {
//                    System.out.println("짝수다");
//                    numerator++;
//                    direction = true;
//                }
//                s = 1;
//            }
//
//            System.out.println("i: " + i + ", " + "s: " + s);
//            System.out.println("현재 값: " + numerator + "/" + denominator);
//            while(i > s) {
//                System.out.println("while문 접근");
//                if(direction) {
//                    numerator++;
//                    denominator--;
//                } else {
//                    numerator--;
//                    denominator++;
//                }
//                System.out.println("증분된 값: " + numerator + "/" + denominator);
//                s++;
//            }
//
//
//        }

        System.out.println("분자: " + numerator);
        System.out.println("분모: " + denominator);


        bw.flush();
        bw.close();
        br.close();
    }
}
