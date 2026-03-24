package br.edu.ifsp.game;
import br.edu.ifsp.deck.Card;


public class Round {
    private final String winner;

    public Round(String player1, Card cardPlayer1, String player2, Card cardPlayer2, Card vira){
        if(cardPlayer1.compareValueTo(cardPlayer2, vira) == 0){
            winner = null;
        }
        else if(cardPlayer1.compareValueTo(cardPlayer2, vira) > 0){
            winner = player1;
        }
        else {
            winner = player2;
        }
    }

    public String getWinner(){
        return winner;
    }

}
