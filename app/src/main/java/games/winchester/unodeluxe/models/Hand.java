package games.winchester.unodeluxe.models;

import java.util.ArrayList;

public class Hand extends CardCollection {

    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void addCards(ArrayList<Card> cards){
        this.cards.addAll(cards);
    }

    public void removeCard(Card card){
        this.cards.remove(card);
    }
}