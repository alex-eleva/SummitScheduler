
package summitscheduleria;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class mainscreen extends javax.swing.JFrame {
//these variables are referred to throughout the program
private final ArrayList<User> userlist = new ArrayList<User>();
private final ArrayList<Event> eventlist = new ArrayList<Event>();
String fileName = "userinfo.txt";
String eventFile = "eventinfo.txt";
String u = "";

public mainscreen() {
        initComponents();
        welcomescreenpanel a = new welcomescreenpanel();
        this.add(a);
        a.setVisible(true);
        a.setLocation(0,0);   
        a.setSize(700,500);
        a.setFrame(this);
    }
//Two getter methods so that I can retrieve the ArrayLists   
public ArrayList<User> getArrayList(){
    return userlist;
    }

public ArrayList<Event> getEventList(){
    return eventlist;
}

public void saveUserToFile() {
     for(int i = 0; i<userlist.size();i++){ //goes through the number of User Objects in the ArrayList
    try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(userlist.get(i).toString());
            bw.newLine();
            bw.close(); 
            userlist.clear(); //clears the ArrayList at the end so there are no duplicate Objects
        }
        catch(IOException ex){
            ex.printStackTrace();
            System.out.println("Error writing to files");
        }
     }
}

public void readUserFile (){ //allows for me to read the file of User information
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            Scanner s = new Scanner(line); //use of a scanner to parse the line and assign its tokens to different variables
//each line corresponds to the values of a User object
                while(s.hasNext()){
                    String usrname = s.next();
                    String pass = s.next();
                    User u = new User(usrname,pass);
                    userlist.add(u);//added to the list
             }
             
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public void writeEvent(){ //writes the different parts of an event onto an individual line
    for (int i = 0; i<eventlist.size();i++){
        try {
        FileWriter fw = new FileWriter(eventFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(eventlist.get(i).getConfirm()); //this is the username of whoever is writing the event, which will be used as a confirmation later
            bw.newLine();
            bw.write(eventlist.get(i).getEventName());
            bw.newLine();
            bw.write(eventlist.get(i).getEventType());
            bw.newLine();
            bw.write(eventlist.get(i).getDescription());
            bw.newLine();
            bw.write(eventlist.get(i).getPriority());
            bw.newLine();
            bw.write(eventlist.get(i).getDate());
            bw.newLine();
            eventlist.clear(); //clears the ArrayList to prevent duplicate events showing up
            bw.close();
            //each event will take up 6 lines in the file
        }
        catch(IOException ex){
            ex.printStackTrace();
            System.out.println("Error writing to files");
        }
    }    
    
    }
public int countLine(){ 
    int lines = 0;
    try{
      BufferedReader reader = new BufferedReader(new FileReader(eventFile));
        while (reader.readLine() != null) lines++; //counts how many lines of text there are in the file 
    } 
    
    catch (IOException e) {
            e.printStackTrace();
        }
    return lines;
     
}
public void readEventFiles(){
    try {
            FileReader reader = new FileReader(eventFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            eventlist.clear();
            for (int i=1; i<=(this.countLine())/6;i++){ //the for loop continues for the amount of lines in the file divided by 6
                    String userconfirm = bufferedReader.readLine();
                    String eventName = bufferedReader.readLine();
                    String eventType = bufferedReader.readLine();
                    String eventDescription = bufferedReader.readLine();
                    String priority = bufferedReader.readLine();
                    String date = bufferedReader.readLine();
                    Event u = new Event(eventName, eventType,eventDescription,priority, date, userconfirm);//creates an instance of the Event and adds to list
                    eventlist.add(u); 
                }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
}

public void setU(String f){ //gives me a way to store the username of whoever is using the program
    u = f;
}
    
public String getU(){ //getter method
    return u;
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainscreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
