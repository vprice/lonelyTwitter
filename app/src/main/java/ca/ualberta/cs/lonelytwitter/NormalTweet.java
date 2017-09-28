/*
 * Copyright 2017 villanue, CMPUT 301, University of Alberta - All Rights Reserved
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by villanue on 9/13/17.
 */

public class NormalTweet extends Tweet{


    /**
     * Constructs a Normal Tweet
     *
     * @param message Tweet message
     */
    public NormalTweet(String message)
    {
        super(message);
    }

    /**
     * Constructs a Normal Tweet
     * @param message Tweet message
     * @param date Tweet Date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant()
    {
        return Boolean.FALSE;
    }
}
