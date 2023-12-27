// app/src/main/java/com/example/movies/View/RecommendationsActivity.java
package com.example.movies.View;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.Controller.MovieController;
import com.example.movies.R;

import java.util.List;

public class RecommendationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);

        // Retrieve selected genres from intent
        List<String> selectedGenres = getIntent().getStringArrayListExtra("selectedGenres");

        // Get movie recommendations from the controller
        List<String> recommendations = MovieController.getInstance().getRecommendations(selectedGenres);

        // Display recommendations in a ListView
        ListView listView = findViewById(R.id.listViewRecommendations);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recommendations);
        listView.setAdapter(adapter);
    }
}
