package pet;

public enum Element {
    PLUS("+"),
    MINUS("--"),
    PIPE("|"),
    EMPTY1(" "),
    EMPTY2("  "),
    PERSON("{}");

    private String symbol;
    Element(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol(){
        return symbol;
    }
}
