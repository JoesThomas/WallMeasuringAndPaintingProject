
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
    WallDimensions wallDimensions;
    @Test
    void testWallAmountIsSet() throws IOException {
        assertTrue(wallDimensions.amountOfWalls == 4);
    }

    @Test
    void testWallArrayListIsEmptyToStart() throws IOException {
        assertTrue(wallDimensions.walls.size() == 0);
    }
}
