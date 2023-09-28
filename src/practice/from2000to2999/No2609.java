package practice.from2000to2999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No2609 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] i = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //최대공약수
        int g = 1;
        //최소공배수
        int l = 1;

        int div = 2;
        while(true) {
            if(i[0] % div == 0 && i[1] % div == 0) {
                g *= div;
                i[0] /= div;
                i[1] /= div;
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
