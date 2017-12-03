/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure.DateTime;

import com.java.jong.UserInterface.JSpinner.JSpinnerTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* This class is used for manipulate time and date to make sure that they are in the readable format
maintainable by both system and database.
*/
public class ChangeDateTime {
    private static final String dateFormatStr = "yyyy-MM-dd"; // date format
    private static final String timeFormatStr = "HH:mm"; // time format
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatStr); // format date
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat(timeFormatStr); // format time
    
            /* this method is used for changing string sequence which holds the date value into actual date format
                where the system can be able to manipulate properly.
            */
            public static Date stringToDate(String date){
                try {
                    return dateFormat.parse(date);
                } catch (ParseException e){
                    return new Date();
                }
            }
            /* this method is used for changing string sequence which is a representation of a time value into 
                an actual date format but only the time value is returned.*/
            public static Date stringToTime(String time){
                try {
                return timeFormat.parse(time);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return new Date();
                }
            }
            /*this method is used for changing programmable date data type into string representation
              of the date value given.*/
            public static String dateToString(Date date){
                return dateFormat.format(date);
            }
            /*this method is used for formatting time value in date data type into a string representation of 
            the date value given, but only time is returned.*/
            public static String timeToString(Date time){
                return  timeFormat.format(time);
            }
            /*this method is used for retrieving the hour and minute value from JSpinner HourSpinner and JSpinner MinuteSpinner
                and return these two values as the concatenated form of string representation of time value.*/
            public static String getTime(){
                String timesep = ":";
                return JSpinnerTime.HourSpinner.getValue().toString() + timesep + JSpinnerTime.MinuteSpinner.getValue().toString();
            }
}

