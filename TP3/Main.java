
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args )
    {
        try {
            exercicio2Lexer lexer = new exercicio2Lexer(CharStreams.fromFileName("PathInputFile.txt"));
            CommonTokenStream stream = new CommonTokenStream(lexer);
            exercicio2Parser parser = new exercicio2Parser(stream);
            parser.s();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
