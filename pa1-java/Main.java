/**
 * CS3100 - Fall 2023 - Programming Assignment 1
 *********************************
 * Collaboration Policy: You may discuss the problem and the overall
 * strategy with up to 4 other students, but you MUST list those people
 * in your submission under collaborators.  You may NOT share code,
 * look at others' code, or help others debug their code.  Please read
 * the syllabus carefully around coding.  Do not seek published or online
 * solutions for any assignments. If you use any published or online resources
 * (which may not include solutions) when completing this assignment, be sure to
 * cite them. Do not submit a solution that you are unable to explain orally to a
 * member of the course staff.
 **************************************/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> lines = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("chapel.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        lines.add(line);
      }        

      // Call method and print the result

      Long start = System.currentTimeMillis();
      Marriage m = new Marriage();
      System.out.println(m.compute(lines));
      System.out.println(m.getLukePath().toString());
      System.out.println(m.getLorelaiPath().toString());
      Long end = System.currentTimeMillis();
      System.out.println("time: " + ((end - start) / 1000.0));
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println("Error occurred when reading file");
    }
  }
}
