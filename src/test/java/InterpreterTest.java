import msa.lang.draw.DrawInterpreter;
import msa.lang.draw.utils.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

public class InterpreterTest {
    @Test
    public void testParseTree() throws UnsupportedEncodingException {


        String source = FileUtils.readString("grammar/sample.draw");

        DrawInterpreter.executeAll(source);


    }

}
