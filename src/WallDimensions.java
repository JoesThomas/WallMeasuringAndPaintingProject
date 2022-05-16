import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class WallDimensions {
    public static int amountOfWalls;
    public static ArrayList<Wall> walls = new ArrayList<>();

    public static void setAmountOfWalls() throws IOException {
        System.out.println("Please input Amount of walls:");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String amountofWallsString = reader.readLine();

        amountOfWalls = Integer.parseInt(amountofWallsString);
    }

    public static void wallSize() throws IOException {

        for (int i = 0; i < amountOfWalls; i++) {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            System.out.println("Please input Height of wall " + (i+1));
            String heightstring = reader.readLine();
            System.out.println("Please input width of wall " + (i+1));
            String widthstring = reader.readLine();
            System.out.println("Please input length of wall " + (i+1));
            String lengthstring = reader.readLine();

            int height = Integer.parseInt(heightstring);
            int width = Integer.parseInt(widthstring);
            int length = Integer.parseInt(lengthstring);
            Wall currentWall = new Wall();
            currentWall.setHeight(height);
            currentWall.setLength(length);
            currentWall.setWidth(width);
            walls.add(currentWall);
        }
    }

    public static void calculate(){
        if (walls.size() < 3){
            System.out.println("Sorry, not enough walls to discover the area of the walls");
        }
        System.out.println(walls);
        if (walls.size() < 3){
            System.out.println("Sorry, not enough walls to discover the volume of the room");
        }
    }


}
