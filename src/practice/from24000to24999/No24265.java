package practice.from24000to24999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No24265 {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        bw.write(String.format("%s\n", n * (n / 2)));
        bw.write(String.valueOf(2));

        bw.flush();
        bw.close();
        br.close();
    }


}
