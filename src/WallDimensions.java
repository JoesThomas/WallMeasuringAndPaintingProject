import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WallDimensions {
    public static int amountOfWalls = 4;
    public static ArrayList<Wall> walls = new ArrayList<>();
    public static float paintNeeded;


    public static void wallSize() throws IOException {
        for (int i = 0; i < amountOfWalls; i++) {
            BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            System.out.println("Please input Height of wall " + (i+1));
            String heightstring = reader.readLine();
            System.out.println("Please input Length of wall " + (i+1));
            String lengthstring = reader.readLine();
            int height = Integer.parseInt(heightstring);
            int length = Integer.parseInt(lengthstring);
            Wall currentWall = new Wall();
            currentWall.setHeight(height);
            currentWall.setLength(length);
            walls.add(currentWall);
        }
    }

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

    public static void calculatePaintNeeded() {
        for (int i = 0; i < walls.size(); i++) {
            float lengthOfWall = walls.get(i).length;
            float heightOfWall = walls.get(i).height;
            paintNeeded = paintNeeded + ((lengthOfWall * heightOfWall)*100);
            System.out.println("Paint needed for wall " + (i+1) + " " +(lengthOfWall * heightOfWall)*100 + "ml");
        }
        System.out.println("Paint needed to paint all walls " + paintNeeded + "ml");
    }

    public static void calculateVolume() {
        System.out.println("Volume of room is " + (calculateArea()) * walls.get(0).height + "m3");
    }


}
