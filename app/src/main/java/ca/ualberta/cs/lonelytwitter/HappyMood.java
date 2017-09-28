/*
 * Copyright 2017 villanue, CMPUT 301, University of Alberta - All Rights Reserved
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Class that is a child of Mood
 */

public class HappyMood extends Mood {

    /**
     * Constructs a Happy Mood
     * @param mood
     */
    public HappyMood(String mood)
    {
        super(mood);
    }

    /**
     * Constructs a Happy Mood
     * @param message
     * @param date
     */
    public HappyMood(String message, Date date) {
        super(message, date);
    }

    /**
     * Gets the Happy Mood message
     * @return
     */
    public String getMoodMsg()
    {
        return "Happy";
    }
}
