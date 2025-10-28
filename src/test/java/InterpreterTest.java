import msa.lang.draw.DrawInterpreter;
import msa.lang.draw.utils.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.*;

public class InterpreterTest {

    private void runSample(String name) throws IOException {
        String source = FileUtils.readString(String.format("sample/%s.draw", name));
        DrawInterpreter.executeAll(source, new FileOutputStream(new File(String.format("sample/%s.png", name))));
    }

    @Test
    public void mandelbrot() throws IOException {
        runSample("mandelbrot");
    }

    @Test
    public void rainbowSquares() throws IOException {
        runSample("rainbow_squares");
    }

    @Test
    public void spiralFlower() throws IOException {
        runSample("spiral_flower");
    }

    @Test
    public void kochSnowflake() throws IOException {
        runSample("koch_snowflake");
    }

    @Test
    public void sierpinski() throws IOException {
        runSample("sierpinski");
    }

    @Test
    public void juliaSet() throws IOException {
        runSample("julia_set");
    }
}
