
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class GroupOfCards {
	private ArrayList<Card> deck = new ArrayList<Card>();
	private String color;

	public GroupOfCards() {
		for (int i = 1; i <= 9; i++) {
			String number = Integer.toString(i);
			deck.add(new Card("Yellow", number));
			deck.add(new Card("Red", number));
			deck.add(new Card("Blue", number));
			deck.add(new Card("Green", number));

			if (i <= 4)
				deck.add(new Card("Wild", "Wild"));
			else if (i > 4)
				deck.add(new Card("Wild", "+4"));
		}

		for (int i = 0; i < 4; i++) {
			if (i == 0)
				color = "Yellow";
			if (i == 1)
				color = "Red";
			if (i == 2)
				color = "Blue";
			if (i == 3)
				color = "Green";

			deck.add(new Card(color, "Skip"));
			deck.add(new Card(color, "Reverse"));
			deck.add(new Card(color, "+2"));
		}
	}

	public ArrayList<Card> showCards() {
		return deck;
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}
