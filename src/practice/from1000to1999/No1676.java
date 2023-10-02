package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No1676 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        BigInteger x = BigInteger.valueOf(1);
        for(int i = 1; i <= n; i++) {
            x = x.multiply(BigInteger.valueOf(i));
        }

        int count = 0;

        while(x.remainder(BigInteger.valueOf(10)).intValue() == 0) {
            x = x.divide(BigInteger.valueOf(10));
            count++;
        }

        sb.append(count);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        bw.close();
    }
}
