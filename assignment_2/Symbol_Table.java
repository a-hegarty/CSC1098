import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

public class Symbol_Table{
    String scope;
    // scope name lets us encode whether or not the table is for a class/method/global/ etc
    Symbol_Table parent;
    // ref to parent table help when performing symbol lookup
    HashMap<String, SymTabEntry> table;

    Symbol_Table(String sc){
        this.scope = sc;
        this.table = new HashMap<String, SymTabEntry>();
    }

    public Symbol_Table(String scope, Symbol_Table parent){
        this.scope = scope;
        this.parent = parent;
        this.table = new HashMap<String, SymTabEntry>();
    }

    public SymTabEntry lookup(String symbol){
        SymTabEntry result;
        result = table.get(symbol);
        if(result != null){
            return result;
        }
        else if(parent != null){
            return parent.lookup(symbol);
        }
        else{
            return null;
        }
    }

}