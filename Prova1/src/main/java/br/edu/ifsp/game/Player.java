package br.edu.ifsp.game;
import br.edu.ifsp.deck.Card;

public class Player {
    private final String name;
    private int score;
    private final Card[] cards;
    private int indexChose;

    public Player(String name){
        this.name = name;
        cards = new Card[3];
    }

    public void setCards(Card[] cards){
        indexChose = 2;
        for(int i = 0; i<3; i++){
            this.cards[i] = cards[i];
        }
    }

    public Card chooseCard(){
        return cards[indexChose--];
    }

    public void incrementScore(){
        score++;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

}
