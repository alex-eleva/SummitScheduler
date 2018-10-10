/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summitscheduleria;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author alexelevathingal
 */
public class User extends mainscreen { //the necessary structs for the User object
    private String username;
    private String password;
    
    
    
    mainscreen m;
    public User (){
        
    }
    public User(String username, String password){ //constructor
        this.username=username;
        this.password=password;    
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
 
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String toString(){ //toString() method prints the username and password as one string
        String str = username + " " + password;
        return str;
    }
    
    
    
    
}
