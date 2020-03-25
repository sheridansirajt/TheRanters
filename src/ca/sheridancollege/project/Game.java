
package ca.sheridancollege.project;

import java.util.ArrayList;

public class Game implements DiscardPile, Turn {
	private final String gameName;
	ArrayList<Player> players = new ArrayList<Player>();
	ArrayList<Card> discard = new ArrayList<Card>();
	ArrayList<Card> cards = new ArrayList<Card>();

	public Game(String givenName, ArrayList<Card> cards) {
		this.cards = cards;
		gameName = givenName;
		players.add(new Player(1, "Player1", cards));
		players.add(new Player(2, "Player2", cards));
		players.add(new Player(3, "Player3", cards));
		players.add(new Player(4, "Player4", cards));
	}

	public String getGameName() {
		return gameName;
	}

	public void gameEnd(Player player) {
		if (player.hand == null) {
			System.out.println(player.getPlayerName() + " Wins");
		}
	}

	public void start(Player player) {
		System.out.println(player.getPlayerName() + " Turn");
		playerTurn(player, discard, cards, players);
	}
}
