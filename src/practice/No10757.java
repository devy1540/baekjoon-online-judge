package practice;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No10757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        long[] list = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        String[] s = br.readLine().split(" ");
//        long a = Long.parseLong(s[0]);
//        long b = Long.parseLong(s[1]);

        BigDecimal a = new BigDecimal(s[0]);
        BigDecimal b = new BigDecimal(s[1]);

        System.out.println(a);
        System.out.println(b);
//        System.out.println(Arrays.toString(list));

        bw.write(String.valueOf(a.add(b)));

        bw.flush();
        bw.close();
        br.close();
    }
}
