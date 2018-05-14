package games.winchester.unodeluxe.models;

import java.io.Serializable;
import java.util.List;

public abstract class CardCollection implements Serializable {

    protected List<Card> cards;

    public int getSize() {
        return this.cards.size();
    }

}
