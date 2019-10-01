package com.codefellows.People.Models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.util.Date;

@DynamoDBDocument
public class HistoryItem {

    private String timestamp;
    private String action;
    private String activity;

    public HistoryItem(){}
    public HistoryItem(String action, String activity){
        this.timestamp = new Date().toString();
        this.action = action;
        this.activity = activity;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String action) {
        this.activity = activity;
    }

}
