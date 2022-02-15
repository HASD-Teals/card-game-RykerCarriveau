public class Card {
    // PROPERTIES
    private String color;
    private String rank;
    private String symbol;
    private int value;
    private boolean playable;
    // CONSTRUCTORS
    public Card() {
        this.color="";
        this.rank="";
        this.symbol="";
        this.value=0;
        this.playable=false;
    }
    public Card(String color, String rank, String symbol, int value, boolean playable){
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

    public String getRank() {
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

    public void setRank(String rank) {
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
    public String toString(){
        System.out.println("Card Color: "+this.color);
        System.out.println("Card Rank: "+this.rank);
        System.out.println("Card Symbol: "+this.symbol);
        System.out.println("Card Value: "+this.value);
        System.out.println("Is Card Playable?: "+this.playable);
        return "";
    }
    public boolean equals(Card card1, Card card2){
        if(card1.getValue()==card2.getValue()&&card1.getRank()==card2.getRank()&&card1.getColor()==card2.getColor()&&card1.getPlayable()==card2.getPlayable()&&card1.getSymbol()==card2.getSymbol()){
            return true;
        }
        else{
            return false;
                }
    }
}
