package games.winchester.unodeluxe.messages;

import java.util.List;

import at.laubi.network.messages.Message;
import games.winchester.unodeluxe.enums.CardColor;
import games.winchester.unodeluxe.models.Deck;
import games.winchester.unodeluxe.models.Game;
import games.winchester.unodeluxe.models.Player;
import games.winchester.unodeluxe.models.Stack;

/**
 * Setup object which is sent from master to all connected players when game starts
 */
public class Setup implements Message {
    private Deck deck;
    private Stack stack;
    private CardColor activeColor;
    private List<Player> players;
    private int activePlayer;

    public Setup(Game game) {
        deck = game.getDeck();
        stack = game.getStack();
        activeColor = game.getActiveColor();
        players = game.getPlayers();
        activePlayer = game.getActivePlayer();
    }

    public Deck getDeck() {
        return deck;
    }

    public Stack getStack() {
        return stack;
    }

    public CardColor getActiveColor() {
        return activeColor;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getActivePlayer() {
        return activePlayer;
    }
}
