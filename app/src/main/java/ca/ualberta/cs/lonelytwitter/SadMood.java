package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by villanue on 9/13/17.
 */

public class SadMood extends Mood {

    public SadMood(String mood) {
        super(mood);
    }

    public SadMood(String message, Date date) {
        super(message, date);
    }

    public String getMoodMsg()
    {
        return "Sad";
    }
}
