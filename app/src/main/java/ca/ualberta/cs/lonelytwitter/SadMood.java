/*
 * Copyright 2017 villanue, CMPUT 301, University of Alberta - All Rights Reserved
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Class that is a a child of Tweet that is Sad Mood
 */

public class SadMood extends Mood {

    /**
     * Constructs a Sad Mood
     * @param mood String mood
     */
    public SadMood(String mood) {
        super(mood);
    }

    /**
     * Constructs a Sad Mood
     * @param message
     * @param date
     */
    public SadMood(String message, Date date) {
        super(message, date);
    }

    /**
     * Gets a message that is Sad
     * @return
     */
    public String getMoodMsg()
    {
        return "Sad";
    }
}
