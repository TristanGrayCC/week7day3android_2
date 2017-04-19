package example.codeclan.com.topgames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopGamesAdapter extends ArrayAdapter<Game> {

    public TopGamesAdapter(Context context, ArrayList<Game> games){
        super(context, 0, games);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView ==  null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.games_item, parent, false);
        }

        Game currentGame = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentGame.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentGame.getTitle().toString());

        TextView score = (TextView) listItemView.findViewById(R.id.score);
        String textScore = "metacritic score: "+ currentGame.getScore().toString();
        score.setText(textScore);

        TextView genre = (TextView) listItemView.findViewById(R.id.genre);
        String textGenre = "Genre: "+currentGame.getGenre().toString();
        genre.setText(textGenre);

        TextView publisher = (TextView) listItemView.findViewById(R.id.publisher);
        String textPublisher = "Publisher: "+currentGame.getPublisher().toString();
        publisher.setText(textPublisher);

        listItemView.setTag(currentGame);

        return listItemView;
    }

}