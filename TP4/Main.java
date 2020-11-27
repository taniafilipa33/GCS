import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args )
    {
        try {
            stockLexer lexer = new stockLexer(CharStreams.fromFileName("exemplo2.txt"));
            CommonTokenStream stream = new CommonTokenStream(lexer);
            stockParser parser = new stockParser(stream);
            parser.s();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
