package practice.from2000to2999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No2798 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        //카드 갯수
        int n = Integer.parseInt(s[0]);
        //합계
        int m = Integer.parseInt(s[1]);

        int[] ilist = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        System.out.println(Arrays.toString(ilist));
        int result = 0;

        end:
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    int tmp = ilist[i] + ilist[j] + ilist[k];
                    if(tmp == m) {
                        result = tmp;
                        break end;
                    }
                    if(tmp >= result && tmp < m) {
                        result = tmp;
                    } else {
                        break;
                    }
                }
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
