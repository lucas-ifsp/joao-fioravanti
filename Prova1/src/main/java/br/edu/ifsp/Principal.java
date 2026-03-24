package br.edu.ifsp;
import br.edu.ifsp.game.Game;
import br.edu.ifsp.game.Player;

public class Principal {
    public static void main() {
        Player player1 = new Player("joao");
        Player player2 = new Player("lucas");
        Game game = new Game(player1, player2);
        game.play();
        System.out.println(game.getWinner().getName());
    }
}
