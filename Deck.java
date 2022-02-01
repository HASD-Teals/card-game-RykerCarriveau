import javax.smartcardio.Card;

public class Deck {
    // PROPERTIES
    private Card[] cards={};
    private int suitNumber=0;
    private int cardsPerSuit=0;
    private boolean aceHigh=false;
    private int aceValue=0;
    // CONSTRUCTORS
    public Deck() {
        for(int i=0;i<52;i++){
            cards[i]=new Card();
        }
    }
    public Deck(int suitNumber, int cardsPerSuit,boolean aceHigh){
        this.suitNumber=suitNumber;
        this.cardsPerSuit=cardsPerSuit;
        this.aceHigh=aceHigh;
        if(aceHigh==false){
            this.aceValue=1;
        }
        else{
            this.aceValue=14;
        }
    }
    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }
    public Card getCardAt(int x){
        return this.cards[x];
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        Card save=cards[0];
        for(int k=0;k<cards.length;k++){
            int random=(0,cards.length-1);
            cards[k]
        }
        // Shuffle this.cards in a random order
    }
    private void makeDeck(){
    }
    public String toString(){
        for(int j=0;j<cards.length;j++){
            System.out.print(cards[j]+" ,");
        }
        return "";
    }
}
