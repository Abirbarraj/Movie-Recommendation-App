// app/src/main/java/com/example/movies/MovieModel.java
package com.example.movies.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieModel {

    private static MovieModel instance;
    private Map<String, List<String>> genreRecommendations;

    private MovieModel() {
        genreRecommendations = new HashMap<>();
        genreRecommendations.put("Action", getActionMovies());
        genreRecommendations.put("Drama", getDramaMovies());
        genreRecommendations.put("Comedy", getComedyMovies());
        genreRecommendations.put("Sci-Fi", getSciFiMovies());
        genreRecommendations.put("Horror", getHorrorMovies());
        genreRecommendations.put("Romance", getRomanceMovies());
        genreRecommendations.put("Documentary", getDocumentaryMovies());

    }

    public static MovieModel getInstance() {
        if (instance == null) {
            instance = new MovieModel();
        }
        return instance;
    }

    public List<String> getRecommendations(List<String> selectedGenres) {
        List<String> recommendations = new ArrayList<>();
        for (String genre : selectedGenres) {
            recommendations.addAll(genreRecommendations.get(genre));
        }
        return recommendations;
    }

    private List<String> getActionMovies() {
        List<String> actionMovies = new ArrayList<>();
        actionMovies.add("Die Hard");
        actionMovies.add("Mad Max: Fury Road");
        actionMovies.add("The Dark Knight");
        actionMovies.add("Terminator 2: Judgment Day");
        actionMovies.add("John Wick");
        actionMovies.add("Gladiator");
        actionMovies.add("The Matrix");
        actionMovies.add("Inception");
        actionMovies.add("Mission: Impossible - Fallout");
        actionMovies.add("Avengers: Endgame");
        // Add more action movies as needed
        return actionMovies;
    }

    private List<String> getDramaMovies() {
        List<String> dramaMovies = new ArrayList<>();
        dramaMovies.add("The Shawshank Redemption");
        dramaMovies.add("Forrest Gump");
        dramaMovies.add("The Godfather");
        dramaMovies.add("Schindler's List");
        dramaMovies.add("The Pianist");
        dramaMovies.add("A Beautiful Mind");
        dramaMovies.add("The Green Mile");
        dramaMovies.add("The Social Network");
        dramaMovies.add("American Beauty");
        dramaMovies.add("The Departed");
        // Add more drama movies as needed
        return dramaMovies;
    }

    private List<String> getComedyMovies() {
        List<String> comedyMovies = new ArrayList<>();
        comedyMovies.add("Dumb and Dumber");
        comedyMovies.add("Superbad");
        comedyMovies.add("Anchorman");
        comedyMovies.add("The Hangover");
        comedyMovies.add("Bridesmaids");
        comedyMovies.add("Shaun of the Dead");
        comedyMovies.add("Step Brothers");
        comedyMovies.add("Napoleon Dynamite");
        comedyMovies.add("Ferris Bueller's Day Off");
        comedyMovies.add("Airplane!");
        return comedyMovies;
    }

    private List<String> getSciFiMovies() {
        List<String> sciFiMovies = new ArrayList<>();
        sciFiMovies.add("Blade Runner");
        sciFiMovies.add("Star Wars: Episode IV - A New Hope");
        sciFiMovies.add("The Terminator");
        sciFiMovies.add("The Fifth Element");
        sciFiMovies.add("E.T. the Extra-Terrestrial");
        sciFiMovies.add("Interstellar");
        sciFiMovies.add("The Martian");
        sciFiMovies.add("Star Trek: The Motion Picture");
        sciFiMovies.add("The Matrix Reloaded");
        sciFiMovies.add("Arrival");
        // Add more sci-fi movies as needed
        return sciFiMovies;
    }

    private List<String> getHorrorMovies() {
        List<String> horrorMovies = new ArrayList<>();
        horrorMovies.add("The Shining");
        horrorMovies.add("Psycho");
        horrorMovies.add("Get Out");
        horrorMovies.add("A Nightmare on Elm Street");
        horrorMovies.add("The Conjuring");
        horrorMovies.add("It");
        horrorMovies.add("Hereditary");
        horrorMovies.add("Halloween");
        horrorMovies.add("The Exorcist");
        horrorMovies.add("Jaws");
        // Add more horror movies as needed
        return horrorMovies;
    }

    private List<String> getRomanceMovies() {
        List<String> romanceMovies = new ArrayList<>();
        romanceMovies.add("Titanic");
        romanceMovies.add("The Notebook");
        romanceMovies.add("La La Land");
        romanceMovies.add("Pride and Prejudice");
        romanceMovies.add("Before Sunrise");
        romanceMovies.add("Eternal Sunshine of the Spotless Mind");
        romanceMovies.add("Amélie");
        romanceMovies.add("Casablanca");
        romanceMovies.add("500 Days of Summer");
        romanceMovies.add("Romeo + Juliet");
        // Add more romance movies as needed
        return romanceMovies;
    }

    private List<String> getDocumentaryMovies() {
        List<String> documentaryMovies = new ArrayList<>();
        documentaryMovies.add("Bowling for Columbine");
        documentaryMovies.add("March of the Penguins");
        documentaryMovies.add("Supersize Me");
        documentaryMovies.add("Blackfish");
        documentaryMovies.add("An Inconvenient Truth");
        documentaryMovies.add("The Act of Killing");
        documentaryMovies.add("Jiro Dreams of Sushi");
        documentaryMovies.add("Man on Wire");
        documentaryMovies.add("Won't You Be My Neighbor?");
        documentaryMovies.add("RBG");
        // Add more documentary movies as needed
        return documentaryMovies;
    }
}
