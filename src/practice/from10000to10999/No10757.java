package practice.from10000to10999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No10757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigDecimal[] list = Stream.of(br.readLine().split(" ")).map(BigDecimal::new).toArray(BigDecimal[]::new);

        bw.write(String.valueOf(list[0].add(list[1])));

        bw.flush();
        bw.close();
        br.close();
    }
}
