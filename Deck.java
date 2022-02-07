
public class Deck {
    // PROPERTIES
    private Card[] cards={};
    private int suitNumber=0;
    private int cardsPerSuit=0;
    private boolean aceHigh=false;
    private int aceValue=0;
    private String color="";
    private String symbol="";
    private String rank="";
    // CONSTRUCTORS
    public Deck() {
        this.cards=new Card[52];
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
        makeDeck(this.suitNumber, this.cardsPerSuit, this.aceHigh);
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
        cards=new Card[suitNumber*cardsPerSuit];
        for(int l=1;l<=suitNumber;l++){
            if(l==1 || l==2){
                this.color="black";
                if(l==1){
                    this.symbol="club";
                }
                else if(l==2){
                    this.symbol="spade";
                }
            }
            else if(l==3 || l==4){
                this.color="red";
                if(l==3){
                    this.symbol="diamond";
                }
                else if(l==4){
                    this.symbol="heart";
                }
            }
            for(int a=0;a<this.cards.length;a++){
                if(aceHigh==true){
                    int value=1;
                    for(int n=0;n<cardsPerSuit;n++){
                        if(n<cardsPerSuit-4){
                            value++;
                            this.rank=value+"";
                            this.cards[a*l]=new Card(this.color, this.rank, this.symbol, n+1, true);                            
                        }
                        else if(n==cardsPerSuit-4){
                            this.rank="jack";
                            this.cards[a*l]=new Card(this.color, this.rank, this.symbol, n+1, true);
                        }
                        else if(n==cardsPerSuit-3){
                            this.rank="queen";
                            this.cards[a*l]=new Card(this.color, this.rank, this.symbol, n+1, true);
                        }
                        else if(n==cardsPerSuit-2){
                            this.rank="king";
                            this.cards[a*l]=new Card(this.color, this.rank, this.symbol, n+1, true);
                        }
                        else if(n==cardsPerSuit-1){
                            this.rank="ace";
                            this.cards[a*l]=new Card(this.color, this.rank, this.symbol, n+1, true);
                        }
                    }
                }
            else if(aceHigh==false){
                int value2=1;
                for(int p=0;p<cardsPerSuit;p++){
                    if(p==0){
                        this.rank="ace";
                        this.cards[a*l]=new Card(this.color, this.rank, this.symbol, p+1, true);
                    }
                    else if(p<cardsPerSuit-3){
                        value2++;
                        this.rank=value2+"";
                        this.cards[a*l]=new Card(this.color, this.rank, this.symbol, p+1, true);
                    }
                    else if(p==cardsPerSuit-3){
                        this.rank="jack";
                        this.cards[a*l]=new Card(this.color, this.rank, this.symbol, p+1, true);
                    }
                    else if(p==cardsPerSuit-2){
                        this.rank="queen";
                        this.cards[a*l]=new Card(this.color, this.rank, this.symbol, p+1, true);
                    }
                    else if(p==cardsPerSuit-1){
                        this.rank="king";
                        this.cards[a*l]=new Card(this.color, this.rank, this.symbol, p+1, true);
                    }
                }
            }                
            }
    }
    System.out.println(this.cards);
    return this.cards;
}
    public String toString(){
        for(int o=0;o<this.cards.length;o++){
            System.out.print(this.cards[o]);
        }
        return "";
    }
}
