import msa.lang.draw.DrawInterpreter;
import msa.lang.draw.utils.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

public class InterpreterTest {
    @Test
    public void test() throws UnsupportedEncodingException, FileNotFoundException {
        String source = FileUtils.readString("sample/mandelbrot.draw");
        DrawInterpreter.executeAll(source, new FileOutputStream(new File("sample/output.png")));
    }

}
