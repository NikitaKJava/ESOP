package at.aau.ESOP.AB6.Exercise8;

import java.util.Arrays;

/**
 * Created by Nikita on 04.05.2021 at 23:53
 */
public class RobotOverlord {
    public static void main(String[] args) {
        char[][] field = new char[][]
                                        {{'_', '_', '_', '_'},
                                         {'_', '_', 'R', '_'},
                                         {'_', '_', 'x', 'x'},
                                         {'_', '_', '_', '_'}};

        int[] position = getRobotPosition(field);
        int obstacles = countObstacles(field, position, false);
        int obstaclesDiagonal = countObstacles(field, position, true);

        System.out.println("Position: "+ Arrays.toString(position));
        System.out.println("Obstacles (diagonal)= "+obstaclesDiagonal);
        System.out.println("Obstacles (non-diagonal)= "+obstacles);
    }

    // TODO put your method definitions here
    static int[] getRobotPosition(char[][] field) {

        if (field == null || field.length == 0) {
            return new int[0];
        }

        int[] position = new int[2];

        boolean found = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 'R') {
                    position[0] = i;
                    position[1] = j;
                    found = true;
                }
            }
        }

        if (found) {
            return position;
        }
        return new int[0];
    }

    static int countObstacles(char[][] field, int[] robotPosition, boolean diagonal) {

        if (field == null || robotPosition == null) {
            return -1;
        }
        if (field.length == 0 || robotPosition.length == 0) {
            return -1;
        }

        int pX = robotPosition[0];
        int pY = robotPosition[1];
        int obstacles = 0;
        int[][] obstaclePosition;

        if (!diagonal) {
            obstaclePosition = new int[][]{
                    {-1, 0},
                    {0, -1},
                    {0, 1},
                    {1, 0}}; // 4 positions
        } else {
            obstaclePosition = new int[][]{
                    {-1, 0},
                    {0, -1},
                    {1, 0},
                    {0, 1},
                    {-1, -1},
                    {-1, 1},
                    {1, -1},
                    {1, 1}}; // 8 positions
        }

        int obstaclePositionX;
        int obstaclePositionY;

        for ( int i = 0; i < obstaclePosition.length; i++) {
            obstaclePositionX = pX + obstaclePosition[i][0];
            obstaclePositionY = pY + obstaclePosition[i][1];
            if (obstaclePositionX >= 0 && obstaclePositionY >= 0 && obstaclePositionX < field.length && obstaclePositionY < field[0].length) { // check bounds
                if ( field[obstaclePositionX][obstaclePositionY] == 'x') {
                    obstacles++;
                }
            }
        }
        return obstacles;
    }
}
