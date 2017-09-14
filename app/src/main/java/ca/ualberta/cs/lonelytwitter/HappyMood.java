package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by villanue on 9/13/17.
 */

public class HappyMood extends Mood {

    public HappyMood(String mood)
    {
        super(mood);
    }

    public HappyMood(String message, Date date) {
        super(message, date);
    }

    public String getMoodMsg()
    {
        return "Happy";
    }
}
