import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WallDimensions.wallSize();
        System.out.println("Area of room is " + WallDimensions.calculateArea() + "m2");
        WallDimensions.calculateArea();
        WallDimensions.calculatePaintNeeded();
        WallDimensions.calculateVolume();
    }
}
