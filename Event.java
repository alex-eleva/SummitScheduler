/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summitscheduleria;



/**
 *
 * @author alexelevathingal
 */
public class Event extends neweventpanel { //necessary structs
    private String eventName;
    private String eventType;
    private String description;
    private String priority;
    private String date;
    private String userconfirm; //the userconfirm will be retreived with the getU() method found in the mainscreen source code
   

    public Event (){
    
    }

    public Event (String eventName,String eventType, String description, String priority,String date, String userconfirm ){ //constructor
        this.eventName= eventName;
        this.eventType=eventType;
        this.description=description;
        this.priority = priority;  
        this.date = date;
        this.userconfirm=userconfirm;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }
    
    public String getEventName(){
        return eventName;
    }
    
    public String getEventType(){
        return eventType;
    }
    public String getDescription(){
        return description;
    }
    
    public String getPriority(){
        return priority;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getConfirm(){
        return userconfirm;
    }
    
    public String toString(){
        String atr = eventName + " " + eventType + " " + description + " " + priority + " " + date;
        return atr;
    }
   
    

}





