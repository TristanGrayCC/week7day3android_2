package example.codeclan.com.topgames;

import java.util.ArrayList;

public class TopGames {

    private ArrayList<Game> list;

    public TopGames() {
        list = new ArrayList<Game>();
        list.add(new Game(1, "Uncharted 4: A Thief's End", 2016, 93, "Action-Adv.", "PS4", "Sony"));
        list.add(new Game(2, "INSIDE", 2016, 92, "Puzzle/Adv.", "XB1", "PLAYDEAD"));
        list.add(new Game(3, "Out of the Park Baseball 17", 2016, 92, "Sports/Sim", "PC", "Out Of The Park Dev."));
        list.add(new Game(4, "The Witcher 3: Wild Hunt - Blood and Wine", 2016, 92, "Action/RPG", "PC", "Warner Bros. Interactive"));
        list.add(new Game(5, "Overwatch", 2016, 91, "FPS", "PC", "Blizzard Entertainment"));
        list.add(new Game(6, "Overwatch", 2016, 91, "FPS", "XB1", "Blizzard Entertainment"));
        list.add(new Game(7, "Forza Horizon 3", 2016, 91, "Racing", "XB1", "Microsoft"));
        list.add(new Game(8, "The Witcher 3: Wild Hunt - Blood and Wine", 2016, 91, "Action/RPG", "PS4", "Warner Bros. Interactive"));
        list.add(new Game(9, "INSIDE", 2016, 91, "Puzzle/Adv.", "PS4", "PLAYDEAD"));
        list.add(new Game(10, "Overwatch", 2016, 90, "FPS", "PS4", "Blizzard Entertainment"));
        list.add(new Game(11, "Stephen's Sausage Roll", 2016, 90, "Puzzle", "PC", "increpare"));
        list.add(new Game(12, "NBA 2K17", 2016, 90, "Sports", "XB1", "2K Games"));
        list.add(new Game(13, "Kentucky Route Zero - Act IV", 2016, 90, "Adventure", "PC", "Cardboard Computer"));
    }

    public ArrayList<Game> getList() {
        return new ArrayList<Game>(list);
    }

}
