// app/src/main/java/com/example/movies/View/GenreSelectionActivity.java
package com.example.movies.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.Controller.MovieController;
import com.example.movies.R;

import java.util.ArrayList;
import java.util.List;

public class GenreSelectionActivity extends AppCompatActivity {

    private List<String> selectedGenres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_selection);

        selectedGenres = new ArrayList<>();

        CheckBox actionCheckBox = findViewById(R.id.checkboxAction);
        CheckBox dramaCheckBox = findViewById(R.id.checkboxDrama);
        CheckBox comedyCheckBox = findViewById(R.id.checkboxComedy);
        CheckBox SciFiCheckBox = findViewById(R.id.checkboxSciFi);
        CheckBox HorrorCheckBox = findViewById(R.id.checkboxHorror);
        CheckBox RomanceCheckBox = findViewById(R.id.checkboxRomance);
        CheckBox DocumentaryCheckBox = findViewById(R.id.checkboxDocumentary);

        Button nextButton = findViewById(R.id.btnNext);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check which genres are selected
                if (actionCheckBox.isChecked()) {
                    selectedGenres.add("Action");
                }
                if (dramaCheckBox.isChecked()) {
                    selectedGenres.add("Drama");
                }
                if (comedyCheckBox.isChecked()) {
                    selectedGenres.add("Comedy");
                }
                if (SciFiCheckBox.isChecked()) {
                    selectedGenres.add("Sci-Fi");
                }
                if (HorrorCheckBox.isChecked()) {
                    selectedGenres.add("Horror");
                }
                if (RomanceCheckBox.isChecked()) {
                    selectedGenres.add("Romance");
                }
                if (DocumentaryCheckBox.isChecked()) {
                    selectedGenres.add("Documentary");
                }
                // Pass control to the controller
                MovieController.getInstance().handleGenreSelection(GenreSelectionActivity.this, selectedGenres);
            }
        });
    }
}
