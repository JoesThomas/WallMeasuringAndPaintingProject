import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WallDimensions {
    //Global variables to ensure that the main variables are accessible for all classes
    public static int amountOfWalls = 4;
    public static ArrayList<Wall> walls = new ArrayList<>();
    public static float paintNeeded;

    //Function to allow the user to input the measurements of the room, in the current version the maximum amount of rooms is 4
    //I would also add a standardised height of walls as this currently allows errors to arise from lack of validation
    public static void wallSize() throws IOException {
        for (int i = 0; i < amountOfWalls; i++) {
            BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            System.out.println("Please input Height of wall " + (i+1));
            String heightstring = reader.readLine();
            System.out.println("Please input Length of wall " + (i+1));
            String lengthstring = reader.readLine();
            float height = Float.parseFloat(heightstring);
            float length = Float.parseFloat(lengthstring);
            Wall currentWall = new Wall();
            currentWall.setHeight(height);
            currentWall.setLength(length);
            walls.add(currentWall);
        }
    }

    //This calculates the area of the rectangular shaped room
    public static float calculateArea() {
        float length = walls.get(0).length;
        float width = walls.get(0).length;
        for (int i = 0; i < amountOfWalls; i++) {
            if (walls.get(i).length != (length)) {
                width = walls.get(i).length;
                break;
            }
        }
        return length*width;
    }

    //This calculates the amount of paint needed to paint the walls based upon the idea that each square metre of wall requires 100ml of paint
    public static void calculatePaintNeeded() {
        for (int i = 0; i < walls.size(); i++) {
            float lengthOfWall = walls.get(i).length;
            float heightOfWall = walls.get(i).height;
            paintNeeded = paintNeeded + ((lengthOfWall * heightOfWall)*100);
            System.out.println("Paint needed for wall " + (i+1) + " " +(lengthOfWall * heightOfWall)*100 + "ml");
        }
        System.out.println("Paint needed to paint all walls " + paintNeeded + "ml");
    }

    //This calculates the volume of the room based upon the return value of the calculateArea function
    public static void calculateVolume() {
        System.out.println("Volume of room is " + (calculateArea()) * walls.get(0).height + "m3");
    }

}
