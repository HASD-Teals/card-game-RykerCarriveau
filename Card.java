public class Card {
    // PROPERTIES
    private String color;
    private char rank;
    private String symbol;
    private int value;
    private boolean playable;
    // CONSTRUCTORS
    public Card() {
        this.color="";
        this.rank=0;
        this.symbol="";
        this.value=0;
        this.playable=false;
    }
    public Card(String color, char rank, String symbol, int value, boolean playable){
        this.color=color;
        this.rank=rank;
        this.symbol=symbol;
        this.value=value;
        this.playable=playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public char getRank() {
        return this.rank;
    }
    public String getSymbol() {
        return this.symbol;
    }
    public int getValue() {
        return this.value;
    }
    public boolean getPlayable() {
        return this.playable;
    }    
    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setPlayable(boolean playable) {
        this.playable = playable;
    }
    // METHODS
    public static void toString(){
        System.out.println("Card Color: "+this.color);
    }
}
