public class SymTabEntry{
        String symbol; // symbol
        Symbol_Table parentSymTab; // reference to the table the symbol is in
        Symbol_Table subscopeSymTab; // reference to subscope symbol table
        boolean isConst; // if the symbol is readonly

        public SymTabEntry(String symbol, Symbol_Table parentSymTab, Symbol_Table subscopeSymTab, boolean isConst){
            this.symbol = symbol; //symbol
            this.parentSymTab = parentSymTab;
            this.subscopeSymTab = subscopeSymTab;
            this.isConst = isConst;
        }

        // second declaration in case the sumbol does not reference any sub-scope symbol tables
        public SymTabEntry(String symbol, Symbol_Table parentSymTab, boolean isConst){
            this.symbol = symbol; //symbol
            this.parentSymTab = parentSymTab;
            this.isConst = isConst;
        }
    }