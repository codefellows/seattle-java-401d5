package com.codefellows.People.Models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.*;

@DynamoDBTable(tableName = "people")
public class Customer {

    private String id;
    private String name;
    private String pic;
    private boolean old;
//    private List<Map<String, String>> history = new ArrayList<>();

    public Customer() {}

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }
    public void setId(String id) { this.id = id; }

    @DynamoDBAttribute
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    @DynamoDBAttribute
    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }

    @DynamoDBAttribute
    public boolean getOld() {
        return old;
    }
    public void setOld(boolean old) {
        this.old = old;
    }

//   @DynamoDBAttribute
//   public List<Map<String, String>> getHistory() { return history; }
//
//   public void setHistory(String action, String activity) {
//       Map<String, String> history = new HashMap<String, String>();
//       history.put(action, activity);
//       this.history.add(history);
//   }

}