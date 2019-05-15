package dk.cosby.andelsprojekt;

import android.util.Log;

import java.util.Date;

/**
 * Denne klasse indeholder al brugerinformation samt en constructor til at oprette brugere.
 *
 * @version 1.0
 * @author Cosby
 */

public class User {

    private static final String TAG = "User";

    private int user_id;
    private String emailAdresse;
    private String password;
    private String timestamp;

    //Constructor
    public User(String emailAdresse, String password) {
        this.emailAdresse = emailAdresse;
        this.password = password;
        timestamp = new Date().toString();

        Log.i(TAG, "Et nyt User object blev skabt");
    }

    /////////////////////////////// getters and setters ////////////////////////////////////

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public void setEmailAdresse(String emailAdresse) {
        this.emailAdresse = emailAdresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
