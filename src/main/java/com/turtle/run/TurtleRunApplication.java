package com.turtle.run;

/**
 * Turtle run game.
 * resume:
 * have to pay attention about the run direction.
 * 1. not diagonal direction.
 * 2. when there isn't any 'forbidden place'. we can count just the position of turtle.
 * 3. when we count the 'forbidden place'. The direction should be calculated by the position
 * of turtle in two directions.
 * 4. if we add the second turtle :).
 */

public class TurtleRunApplication {
    //for n turtles (n > 1). We have to create object to save the different position of turtle.
    private Integer height;
    private Integer width;
    private Integer x;
    private Integer y;
    private int[][] map;

    public TurtleRunApplication() {
        mapConfiguration(10, 10);
    }

    private void mapConfiguration(int heightInput, int widthInput) {
        height = heightInput;
        width = widthInput;
        map = new int[heightInput][widthInput];
        System.out.println("Welcome to the game! Finish your map configuration!");
        printMap(map);
    }

    public boolean setTurtle(int xTurtle, int yTurtle) {
        if (xTurtle < width - 1 && xTurtle >= 0 && yTurtle < height - 1 && yTurtle >= 0) {
            x = xTurtle;
            y = yTurtle;
            map[xTurtle][yTurtle] = 1;
            System.out.println("Your turtle is ready!");
            printMap(map);
            return true;
        } else {
            //TODO: let the user to set the new position of the turtle.
            return false;
        }
    }

    //Simple case. one turtle and not forbidden place.
    private boolean getDirection() {
        return Math.random() > 0.5;
    }

    //TODO: add the forbidden place condition.
    private boolean getDirection(int x, int y) {
        return Math.random() > 0.5;
    }

    private int getStep(int x, int border) {
        int directionTmp = Math.random() > 0.5 ? 1 : -1;
        if (x + directionTmp < 0 || x + directionTmp > border - 1) {
            return -1 * directionTmp;
        } else {
            return directionTmp;
        }
    }

    private void runTurtle() {
        while (true) {
            //prevent move diago. we have to choose a direction to move.
            int stepX = 0;
            int stepY = 0;

            if (getDirection()) {
                stepX = getStep(x, width);
            } else {
                stepY = getStep(y, height);
            }

            map[x][y] = 0;
            x += stepX;
            y += stepY;
            map[x][y] = 1;
            printMap(map);
            try {
                //make the result esay to read.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0) {
                    System.out.print("__");
                } else if (map[i][j] == 1) {
                    System.out.print("& ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

    public static void run() {
        //TODO:interact with user to get information.
        //charge le Conf.
        TurtleRunApplication ta = new TurtleRunApplication();
        ta.setTurtle(0, 0);
        ta.runTurtle();
    }
}
