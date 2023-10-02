package practice.from15000to15999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No15289 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();

        final BigInteger r = BigInteger.valueOf(31);
        final BigInteger m = BigInteger.valueOf(1234567891);
        BigInteger result = BigInteger.valueOf(0);

        for(int i = 0; i < l; i++) {
            int a = s.charAt(i) - 96;
            BigInteger ri = r.pow(i);
            result = result.add(ri.multiply(BigInteger.valueOf(a)));
        }

        sb.append(result.remainder(m));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        bw.close();
    }
}
