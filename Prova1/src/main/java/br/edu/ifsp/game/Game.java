package br.edu.ifsp.game;

public class Game {
    private Player player1;
    private Player player2;
    private Hand[] hands;
    private int handsCounter;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;

        Hand firstHand = new Hand(player1, player2);
        hands = new Hand[30];
        hands[handsCounter++] = firstHand;
    }

    public void play(){
        if(isDone()){
            return;
        }
        Hand handInGame = hands[handsCounter-1];
        while (!handInGame.isDone()){
            handInGame.playRound(); // TODO aqui tá diferente do pedido na prova. Leia novamente a spec. Ele só deve jogar um round por vez.
        }
        Player winnerHand = getWinnerHand(handInGame);
        winnerHand.incrementScore();
        System.out.println("vencedor da mão: "+winnerHand.getName());
        Hand newHand = new Hand(player1, player2);
        hands[handsCounter++] = newHand;
        play();
    }

    private Player getWinnerHand(Hand hand){
        if(hand.getWinner().equals(player1.getName())){
            return player1;
        }
        return player2;
    }

    public boolean isDone(){
        return player1.getScore() == 12 || player2.getScore() == 12;
    }

    public Player getWinner(){
        if(!isDone()) {
            return null;
        }
        if(player1.getScore() ==12){ // TODO dá para usar if ternário.
            return player1;
        }
        return player2;
    }
}
