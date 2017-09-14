package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by villanue on 9/13/17.
 */

public class importantTweet extends Tweet {

    public importantTweet(String message)
    {
        super(message);
    }

    public importantTweet(String message, Date date)
    {
        super(message, date);
    }

    @Override
    public Boolean isImportant()
    {
        return Boolean.TRUE;
    }


}
