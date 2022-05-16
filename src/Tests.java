import org.junit.jupiter.api.Test;

import java.io.Console;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
    WallDimensions wallDimensions;
    @Test
    void testWallAmountNotNull() throws IOException {
        assertTrue(wallDimensions.amountOfWalls == 0);
    }

    @Test
    void testWallArrayListNotNull() throws IOException {
        assertTrue(wallDimensions.walls.size() == 0);
    }


    @Test
    void testWallNotNull() throws IOException {
        wallDimensions.setAmountOfWalls(amountofWallsString = "2");
        Console.print
        assertTrue(wallDimensions.walls.size() == 0);
    }
}
