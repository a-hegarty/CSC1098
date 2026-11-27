import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class Symbol_Table{
    String scope;
    Symbol_Table parent;
    HashMap<String, symtabEntry> table;
}