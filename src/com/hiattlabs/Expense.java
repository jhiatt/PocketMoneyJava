package com.hiattlabs;

import java.math.BigDecimal;
import java.util.Date;

public class Expense {
    //attributes
    private Date date;
    private BigDecimal amount;
    private int userID;


    //Constructors
    public Expense(Date date, BigDecimal amount, int userID) {
        this.date = date;
        this.amount = amount;
        this.userID = userID;
    }

    //Getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    //behaviors

}
