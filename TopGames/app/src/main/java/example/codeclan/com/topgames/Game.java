package example.codeclan.com.topgames;

public class Game {

    private int ranking;
    private String title;
    private int year;
    private int metacriticScore;
    private String genre;
    private String console;

    public Game(Integer ranking, String title, Integer year, Integer metacriticScore, String genre, String console) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
        this.metacriticScore = metacriticScore;
        this.genre = genre;
        this.console = console;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getScore() {
        return metacriticScore;
    }

    public String getGenre() {
        return genre;
    }

    public String getConsole() {
        return console;
    }

}
