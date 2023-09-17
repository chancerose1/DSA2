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
 *********************************
 * Your Computing ID: 
 * Collaborators: 
 * Sources: Introduction to Algorithms, Cormen
 **************************************/
import java.util.List;
import java.util.ArrayList;

public class Marriage {

    private List<Integer> lukePath = new ArrayList<>();
    private List<Integer> lorelaiPath = new ArrayList<>();

    public List<Integer> getLukePath() {
        return lukePath;
    }

    public List<Integer> getLorelaiPath() {
        return lorelaiPath;
    }

    /**
     * This is the method that should set off the computation
     * of marriage.  It takes as input a list lines of input
     * as strings.  You should parse that input and then compute 
     * the shortest paths that both Luke and Lorelai should take.
     * The class fields of lukePath and lorelaiPath should be filled
     * with their respective paths.  The getters above will be called
     * by the grader script.
     *
     * @return the length of the shortest paths (in rooms)
     */
    public int compute(List<String> fileData) {
        return 0;
    }
}
