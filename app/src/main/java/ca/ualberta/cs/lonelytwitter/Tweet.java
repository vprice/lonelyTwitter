/*
 * Tweet
 * Copyright 2017 villanue, CMPUT 301, University of Alberta - All Rights Reserved
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 *
 * Version 1.0
 *
 * September 27, 2017
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    /**
     * Constructs a Tweet Object
     *
     * @param message Tweet message
     */
    public Tweet(String message){
        this.message = message;
        date = new Date();
    }

    /**
     * Constructs a Tweet Object
     *
     * @param message Tweet message
     * @param date Tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }



    public String getMessage() {
        return message;
    }

    /**
     * Sets the Tweet message
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString()
    {
        return date.toString() + " | \n" + message;
    }

}
