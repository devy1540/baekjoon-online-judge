package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class No10699 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        LocalDate now = LocalDate.now();

        sb.append(now);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
