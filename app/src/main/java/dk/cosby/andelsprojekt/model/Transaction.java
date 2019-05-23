package dk.cosby.andelsprojekt.model;

import android.util.Log;

/**
 * Denne klasse kan tage varer om en transaktion mellem to Users.
 *
 * @version 1.0
 * @author Cosby
 */

public class Transaction {

    private static final String TAG = "Transaktion";

    private User sender;
    private User modtager;
    private double beloeb;

    //Constructor
    public Transaction(User sender, User modtager, double beloeb) {
        this.sender = sender;
        this.modtager = modtager;
        this.beloeb = beloeb;

        Log.i(TAG, "Et nyt Transaction objekt blev skabt!");
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sender=" + sender +
                ", modtager=" + modtager +
                ", beloeb=" + beloeb +
                '}';
    }

    ////////////////////////// getters and setters ///////////////////////////////

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getModtager() {
        return modtager;
    }

    public void setModtager(User modtager) {
        this.modtager = modtager;
    }

    public double getBeloeb() {
        return beloeb;
    }

    public void setBeloeb(double beloeb) {
        this.beloeb = beloeb;
    }
}
