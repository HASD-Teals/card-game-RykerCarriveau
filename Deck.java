
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
            this.cards[i]=new Card();
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
            this.aceValue=this.cardsPerSuit;
        }
    }
    // ACCESSORS
    public int getCardAmount() {
        return this.cards.length;
    }
    public Card getCardAt(int x){
        return this.cards[x];
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards(Deck changing) {
        Card save;
        for(int k=0;k<this.cards.length;k++){
            int random=(int)Math.floor(Math.random()*(this.cards.length));
            save=this.cards[k];
            this.cards[k]=cards[random];
            this.cards[random]=save;
        }
        // Shuffle this.cards in a random order
    }
    private Card[] makeDeck(int suitNumber, int cardsPerSuit,boolean aceHigh){
        Deck newDeck= new Deck(suitNumber, cardsPerSuit, aceHigh);
        Card[] deck={};
        for(int l=0;l<suitNumber;l++){
            String color="";
            String symbol="";
            String rank="";
            if(suitNumber%2==0){
                color="black";
                if(suitNumber%4==0){
                    symbol="club";
                }
                else{
                    symbol="spade";
                }
            }
            else{
                color="red";
                if(suitNumber%3==0){
                    symbol="diamond";
                }
                else{
                    symbol="heart";
                }
            }
            for(int a=0;a<=cardsPerSuit;a++){
                if(aceHigh==true){
                    int value=1;
                    for(int n=0;n<cardsPerSuit;n++){
                        if(n<cardsPerSuit-4){
                            value++;
                            rank="value";
                            this.cards[n]=new Card(color, rank, symbol, a, true);                            
                        }
                        else if(n==cardsPerSuit-4){
                            rank="jack";
                            this.cards[n]=new Card(color, rank, symbol, a, true);
                        }
                        else if(n==cardsPerSuit-3){
                            rank="queen";
                            this.cards[n]=new Card(color, rank, symbol, a, true);
                        }
                        else if(n==cardsPerSuit-2){
                            rank="king";
                            this.cards[n]=new Card(color, rank, symbol, a, true);
                        }
                        else if(n==cardsPerSuit-1){
                            rank="ace";
                            this.cards[n]=new Card(color, rank, symbol, a, true);
                        }
                    }
                }
            else if(aceHigh==false){
                int value2=1;
                for(int p=0;p<cardsPerSuit;p++){
                    if(p==0){
                        rank="ace";
                        this.cards[p]=new Card(color, rank, symbol, a, true);
                    }
                    else if(p<cardsPerSuit-3){
                        value2++;
                        this.cards[p]=new Card(color, rank, symbol, a, true);
                    }
                    else if(p==cardsPerSuit-3){
                        rank="jack";
                        this.cards[p]=new Card(color, rank, symbol, a, true);
                    }
                    else if(p==cardsPerSuit-2){
                        rank="queen";
                        this.cards[p]=new Card(color, rank, symbol, a, true);
                    }
                    else if(p==cardsPerSuit-1){
                        rank="king";
                        this.cards[p]=new Card(color, rank, symbol, a, true);
                    }

                }
            }                
            }

            deck=cards;
    }
    return deck;
}
    public String toString(){
        System.out.print(makeDeck(suitNumber, cardsPerSuit, aceHigh));
        return "";
    }
}
