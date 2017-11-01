package com.hiattlabs;

import java.util.Calendar;
import java.util.Date;

public class ScheduledExpense extends Expense{
    //attributes
    //DON'T FORGET TO ADD CONSTRUCTORS AND GETTERS AND SETTERS
    private boolean repeateMonthly;
    private Date nextDate;
    private RollForward rollforwardMethod;

    public enum RollForward {Monthly, Weekdays, Weekly, Biweekly, EveryDay}


    //behaviors

    //add dates until set date
    public void rollScheduledExpense() {

    }

    //add one date at a time so we just need the next date to add
    public void resetNextDate() {
        if (rollforwardMethod == RollForward.Monthly) {
            nextDate = nextDate.add(Calendar.MONTH, 1);
        }
        if (rollforwardMethod == RollForward.Weekdays) {
            if (nextDate.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                nextDate = nextDate.add(Calendar.DATE, 3);
            } else {
                nextDate = nextDate.add(Calendar.DATE, 1);
            }
        }
    }
}
