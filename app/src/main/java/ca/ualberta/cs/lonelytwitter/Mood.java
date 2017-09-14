package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
/**
 * Created by villanue on 9/13/17.
 */

public abstract class Mood {
    private String mood;
    private Date date;
    private ArrayList<Mood> moods;

    public Mood(String mood){
        this.mood = mood;
        date = new Date();
    }

    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //public abstract Boolean isImportant();

}
