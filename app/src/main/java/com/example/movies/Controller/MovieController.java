// app/src/main/java/com/example/movies/Controller/MovieController.java
package com.example.movies.Controller;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import com.example.movies.Model.MovieModel;
import com.example.movies.View.GenreSelectionActivity;
import com.example.movies.View.RecommendationsActivity;

import java.util.List;

public class MovieController {

    private static MovieController instance;
    private MovieModel movieModel;

    private MovieController() {
        movieModel = MovieModel.getInstance();
    }

    public static MovieController getInstance() {
        if (instance == null) {
            instance = new MovieController();
        }
        return instance;
    }
    public void handleLogin(Context context, String username, String password) {
        Intent intent = new Intent(context, GenreSelectionActivity.class);
        context.startActivity(intent);
    }

    public void handleGenreSelection(Context context, List<String> selectedGenres) {
        // Handle selected genres
        Intent intent = new Intent(context, RecommendationsActivity.class);
        intent.putStringArrayListExtra("selectedGenres", (ArrayList<String>) selectedGenres);
        context.startActivity(intent);
    }

    // Method to get movie recommendations
    public List<String> getRecommendations(List<String> selectedGenres) {
        return movieModel.getRecommendations(selectedGenres);
    }
}
