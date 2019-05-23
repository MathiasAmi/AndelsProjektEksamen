package dk.cosby.andelsprojekt.model;

import android.util.Log;

import java.util.Date;
import java.util.regex.Pattern;

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
    private UserType type;

    //no-arg constructor
    public User() {
        emailAdresse = "";
        password = "";

        Log.i(TAG, "Et nyt User object blev skabt ved brug af no-arg constructoren");
    }

    //Constructor (brugt under udvikling)
    public User(String emailAdresse, String password, UserType type) {
        this.emailAdresse = emailAdresse;
        this.password = password;
        this.type = type;
        timestamp = new Date().toString();

        Log.i(TAG, "Et nyt User object blev skabt");
    }

    /**
     * Bruger en regular expression til at finde ud af om en email overholder den
     * normale opbygning for en email.
     *
     * @param email email der skal tjekkes
     * @return true hvis emailen overholder RFC-5322
     */
    public boolean isEmailValid(String email) {
        return Pattern.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", email);
    }

    /**
     * Bruger en regular expression til at finde ud af om et password overholder følgene regler:
     *  1. passwordet er mindst 8 karakterer langt
     *  2. passwordet indeholder mindst 1 stort bogstav
     *  3. passwordet indeholder mindst 1 lille bogstav
     *  4. passwordet indeholder mindst 1 tal/tegn
     *
     * @param password password der skal tjekkes
     * @return true hvis passwordet overholder ovenstående regler
     */
    public boolean isPasswordValid(String password) {
        return Pattern.matches("(?-i)(?=^.{8,}$)((?!.*\\s)(?=.*[A-Z])(?=.*[a-z]))((?=(.*\\d){1,})|(?=(.*\\W){1,}))^.*$", password);
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

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
