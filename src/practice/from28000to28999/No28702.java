package practice.from28000to28999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No28702 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sArr = new String[3];

        for(int i = 0; i < sArr.length; i++) {
            sArr[i] = br.readLine();
        }

        int index = 0;

        for(int i = 0; i < sArr.length; i++) {
            if(isNumber(sArr[i])) {
                index = i;
                break;
            }
        }

        int result = Integer.parseInt(sArr[index]) + (3 - index);

        if(result % 3 == 0 && result % 5 == 0) bw.write("FizzBuzz");
        else if(result % 3 == 0) bw.write("Fizz");
        else if(result % 5 == 0) bw.write("Buzz");
        else bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
