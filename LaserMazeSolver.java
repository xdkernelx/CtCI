import java.util.*;

public class LaserMazeSolver {
    public static final int MAX_ROW = 50;
    public static final int NEST_COL = 1;
    public static final String BEAM_SIGNAL = "@";

    // public static void findStartPosition(int[] position, String[][] maze) {

    //     int row_size = maze[0].length - 1;

    //     for (int i = 0; i < MAX_ROW; i++) {
    //         System.out.println(i);  
    //         for (int j = 0; j < row_size; j++) {
    //             if (maze[i][j] == BEAM_SIGNAL) {
    //                 position[0] = i;
    //                 position[1] = j;    
    //             }
    //         }
    //     }


    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] maze = new String[MAX_ROW][NEST_COL];
        boolean first_line = true;
        int[] position = new int[2];
        int index = 0;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] inputs = input.split("");
            maze[index] = inputs;
            index++;
        }

        // findStartPosition(position, maze);


    }
}
 
