package gdstruct.midterms;

import java.util.Objects;

public class Card
{
    private int cardNo; //1-10
    private String suit; //Spade, Heart, Diamond

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardNo == card.cardNo && suit.equals(card.suit);
    }

    @Override
    public int hashCode() {return Objects.hash(cardNo, suit);}

    @Override
    public String toString() {
        return "Card{" +
                "cardNo=" + cardNo +
                ", suit='" + suit + '\'' +
                '}';
    }

    public Card(int cardNo, String suit)
    {
        this.cardNo = cardNo;
        this.suit = suit;
    }

    public int getCardNo() {return cardNo;}

    public void setCardNo(int cardNo) {this.cardNo = cardNo;}

    public String getSuit() {return suit;}

    public void setSuit(String suit) {this.suit = suit;}
}
