import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;

public class cal
{
    public static void main(String[] args) throws Exception
    {
        String inputFile = null;
        if (args.length > 0)
        {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null)
        {
            is = new FileInputStream(inputFile);
        }

        calLexer lexer = new calLexer(CharStreams.fromStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        calParser parser = new calParser(tokens);
        ParseTree tree = parser.prog();

        //error handling
        // via https://www.antlr.org/api/Java/org/antlr/v4/runtime/Parser.html#getNumberOfSyntaxErrors()
        int err_count = parser.getNumberOfSyntaxErrors();

        if (err_count == 0)
        // no syntax errors
        {
            System.out.println(inputFile + " parsed correctly");
        }
        else
        // 1 or more syntax errors
        {
            System.out.println(inputFile + " has not parsed");
        }
    }
}