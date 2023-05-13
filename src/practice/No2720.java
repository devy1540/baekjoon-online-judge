package practice;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class No2720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int cent = Integer.parseInt(br.readLine());
            int quarter = 0, dime = 0, nickel = 0, penny = 0;

            quarter += cent / 25;
            cent %= 25;

            dime += cent / 10;
            cent %= 10;

            nickel += cent / 5;
            cent %= 5;

            penny += cent;

            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
