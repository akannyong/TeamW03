package nyong;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Game {
    Player player;

    public Game (Player player) {
        this.player = player;
    }

    public void saveGame() {
        Gson gson = new Gson();
        String save = gson.toJson(player);

        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(save);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Game loadGame(String filer) throws IOException {
        String save = Files.readString(Path.of(filer));
        Gson gson = new Gson();
        Player player = gson.fromJson(save, Player.class);
        return new Game(player);
    }
}
