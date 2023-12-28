// app/src/main/java/com/example/movies/Controller/LoginController.java
package com.example.movies.Controller;

import android.content.Context;
import android.content.Intent;

import com.example.movies.View.GenreSelectionActivity;

public class LoginController {

    private static LoginController instance;

    private LoginController() {
    }

    public static LoginController getInstance() {
        if (instance == null) {
            instance = new LoginController();
        }
        return instance;
    }

    public void handleLogin(Context context, String username, String password) {
        Intent intent = new Intent(context, GenreSelectionActivity.class);
        context.startActivity(intent);
    }
}

