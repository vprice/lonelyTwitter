/*
 * Copyright 2017 villanue, CMPUT 301, University of Alberta - All Rights Reserved
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Class that is a child of the Tweet
 */

public class importantTweet extends Tweet {

    /**
     * Constructs an important Tweet
     * @param message
     */
    public importantTweet(String message)
    {
        super(message);
    }

    /**
     * Constructs an important tweet
     * @param message
     * @param date
     */
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
