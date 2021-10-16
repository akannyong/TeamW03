package nyong;
import com.google.gson.Gson;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Player player = new Player("Akan", 50, 70, 100);
        player.addEquipment("Car", 2000);
        Game game = new Game(player);
        game.saveGame();
        Game newGame = Game.loadGame("filename.txt");
        newGame.player.display();

    }
}
