public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck deck1=new Deck(4,13,true);
        Deck deck2=new Deck(4,13,true);
        System.out.println(deck1);
        System.out.println("------------------");
        System.out.println(deck2);
        deck1.shuffleCards();
        deck2.shuffleCards();
        System.out.println("------------------");
        System.out.println(deck1);
        System.out.println("------------------");
        System.out.println(deck2);
        System.out.println("------------------");
        int deck1Length=deck1.getCardAmount();
        int deck2Length=deck2.getCardAmount();
        int matches=0;
        for(int i=0;i<deck1Length && i<deck2Length;i++){
            Card card1=deck1.getCardAt(i);
            Card card2=deck2.getCardAt(i);
            if(card1.equals(card1, card2)){
                matches++;
                System.out.println("match"+matches+":");
                System.out.println(card1+" "+card2);
            }
        }
        System.out.println("Number of matches: " +matches);
    }
}
