import java.util.*;

public class LaserMazeSolver {
    public static final int MAX_ROW = 50;
    public static final int NEST_COL = 1;
    public static final String BEAM_SIGNAL = "@";

    public static int[] findStartPosition(String[][] maze) {

        int row_size = maze[0].length - 1;
        int[] position = new int[2];

        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < row_size; j++) {
                if (maze[i][j].equals(BEAM_SIGNAL)) {
                    position[0] = i;
                    position[1] = j;
                    return position;    
                }
            }
        }

        return position;
    }

    public static int adventureTime(int[] start, int[] position, String[][] maze) {


        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] maze = new String[MAX_ROW][NEST_COL];
        boolean first_line = true;
        int[] position = null;
        int[] start = null;
        int[] velocity = {1,0};
        int index = 0;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] inputs = input.split("");
            maze[index] = inputs;
            index++;
        }

        start = findStartPosition(maze);
        position = findStartPosition(maze);

        distance_traveled = adventureTime(start, position, maze);

        System.out.println(distance_traveled);
    }
}
 
