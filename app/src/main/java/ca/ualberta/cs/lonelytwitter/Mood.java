package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
/**
 * Mood object associated with a tweet
 */

public abstract class Mood {
    private String mood;
    private Date date;
    private ArrayList<Mood> moods;

    /**
     * Constructs a Mood object
     * @param mood String mood
     */
    public Mood(String mood){
        this.mood = mood;
        date = new Date();
    }

    /**
     * Constructs a Mood object
     * @param mood String mood
     * @param date Date date
     */
    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * Gets mood
     * @return String mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * Gets date
     * @return Date date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    //public abstract Boolean isImportant();

}
