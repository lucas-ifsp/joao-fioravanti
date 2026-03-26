package br.edu.ifsp.game;
import br.edu.ifsp.deck.Card;


public class Round {
    private final String winner;

    public Round(String player1, Card cardPlayer1, String player2, Card cardPlayer2, Card vira){
        final int result = cardPlayer1.compareValueTo(cardPlayer2, vira);
        if(result == 0){ // TODO não precisa comparar sempre, dá para simplificar extraindo a variável, como acima.
            winner = null;
        }
        else if(result > 0){
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
