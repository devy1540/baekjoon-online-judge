package practice.from2000to2999;
import java.io.*;
public class No2754 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        
        switch(s) {
            case "A+": sb.append(4.3); break;
            case "A0": sb.append(4.0); break;
            case "A-": sb.append(3.7); break;
            case "B+": sb.append(3.3); break;
            case "B0": sb.append(3.0); break;
            case "B-": sb.append(2.7); break;
            case "C+": sb.append(2.3); break;
            case "C0": sb.append(2.0); break;
            case "C-": sb.append(1.7); break;
            case "D+": sb.append(1.3); break;
            case "D0": sb.append(1.0); break;
            case "D-": sb.append(0.7); break;
            default: sb.append(0.0); break;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}
