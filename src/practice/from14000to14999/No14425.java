package practice.from14000to14999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No14425 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int result = 0;

        List<String> s = new ArrayList<>();
        List<String> checkedList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            s.add(br.readLine());
        }

        for(int i = 0; i < m; i++) {
            checkedList.add(br.readLine());
        }

        for(String e : checkedList) {
            if(s.contains(e)) {
                result++;
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();

    }
}
