package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;
import br.edu.ifsp.deck.Deck;

public class Hand {
    private Card vira;
    private Player player1;
    private Player player2;
    private Round[] rounds;
    private int roundsIndex;

    public Hand(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        rounds = new Round[3];
        generateAndShareDeck();
    }

    private void generateAndShareDeck(){
        Deck deck = new Deck();
        deck.shuffle();
        vira = deck.takeOne();
        player1.setCards(deck.take(3));
        player2.setCards(deck.take(3));
    }

    public void playRound(){
        if(roundsIndex > 2) return;
        Round round = new Round(player1.getName(), player1.chooseCard(), player2.getName(), player2.chooseCard(), vira);
        System.out.println("winner: "+round.getWinner());
        rounds[roundsIndex++] = round;
    }

    public boolean isDone(){
        return isHandFinished();
    }

    private boolean isHandFinished(){
        return rounds[0] != null && rounds[1] != null && rounds[2] != null;
    }

    public String getWinner(){
        return getNameWinner();
    }

    private String getNameWinner() {
        if (!isDone()) {
            return null;
        }
        int player1Count = 0;
        int player2Count = 0;
        for (int i = 0; i < 3; i++) {
            if (rounds[i].getWinner() != null) {

                if (rounds[i].getWinner().equals(player1.getName())) {
                    player1Count++;
                } else if (rounds[i].getWinner().equals(player2.getName())) {
                    player2Count++;
                }
            }
        }
        return defineWinner(player1Count, player2Count);
    }

    private String defineWinner(int player1Count, int player2Count){
        if(player1Count ==0 && player2Count == 0){
            return null;
        }
        else if(rounds[2].getWinner() == null && player2Count == player1Count){
            return rounds[0].getWinner();
        }
        else if (rounds[0].getWinner() == null && rounds[1].getWinner() == null) {
            return rounds[2].getWinner();
        }
        else if (rounds[1].getWinner() == null) {
            return rounds[0].getWinner();
        }
        else if(rounds[0].getWinner() == null){
            return rounds[1].getWinner();
        }
        if(player1Count >= 2 ){
            return player1.getName();
        }
        return player2.getName();
    }
}
