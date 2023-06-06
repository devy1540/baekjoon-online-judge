package practice.from25000to25999;

import java.util.*;
import java.io.*;
public class No25206 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        int calculateSubject = 0;
        double sum = 0;

        for(int i = 0; i < 20; i++) {
            String s = br.readLine();
            double course = Double.parseDouble(s.split(" ")[1]);
            String grade = s.split(" ")[2];

            if(!grade.equalsIgnoreCase("p")) {
                sum += course * gradeMap.get(grade);
                calculateSubject += course;
            }
//            bw.write(subject + " " + course + " " + grade + "\n");
        }

        bw.write(String.format("%.6f", sum / calculateSubject));

        bw.flush();
        bw.close();
        br.close();
    }
}
