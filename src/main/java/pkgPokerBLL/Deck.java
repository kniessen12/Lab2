package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	public Deck()
	{
		for(eRank Rank: eRank.values()){
			for(eSuit Suit: eSuit.values()){
				DeckCards.add(new Card(Rank,Suit));
				Collections.shuffle(DeckCards);
			}
		}
		//	This method will do a for/each, returning each rank in the enum.
		for (eRank Rank : eRank.values()) {
			System.out.println(Rank.getiRankNbr());
		}
	}
	
	public Card DrawCard()
	{	
		return DeckCards.remove(0);
	}
}
