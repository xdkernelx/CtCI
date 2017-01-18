import java.util.*;

public class LaserMazeSolver {
    public static final int MAX_ROW = 50;
    public static final int NEST_COL = 1;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] maze = new String[MAX_ROW][NEST_COL];
        boolean first_line = true;
        int index = 0;

        while (scanner.hasNext()) {
            String input = scanner.next();
            String[] inputs = input.split("");
            maze[index] = inputs;
            index++;
        }


    }
}
 
