/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summitscheduleria;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexelevathingal
 */
public class existingeventspanel extends javax.swing.JPanel {
mainscreen m;
    /**
     * Creates new form existingeventspanel
     */
    public existingeventspanel() {
        initComponents();
        mainscreen m = (mainscreen)this.getParent();
    }
    
    public void setFrame(mainscreen f){
        m = f;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        remove = new javax.swing.JButton();
        evtupdatebutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu3.setText("jMenu3");

        jToggleButton1.setText("jToggleButton1");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Description", "Priority", "Date", "Completed?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 102, 0));
        jTable1.setShowGrid(true);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        remove.setText("Remove Completed Events");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        evtupdatebutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        evtupdatebutton.setText("Update List");
        evtupdatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evtupdatebuttonActionPerformed(evt);
            }
        });

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(evtupdatebutton)
                        .addGap(192, 192, 192)
                        .addComponent(remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove)
                    .addComponent(evtupdatebutton)
                    .addComponent(jButton1))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i = 0;i<model.getRowCount();i++){
            if((boolean)jTable1.getValueAt(i, 5)==true){ //if the boolean value is marked "completed" on the column
               model.removeRow(i); //the table model will remove that particular row
                i--; //the i value will decrement in order to account for the recent change in row index
            } else{
               i++;
            }
        }
    }//GEN-LAST:event_removeActionPerformed

    private void evtupdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evtupdatebuttonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); 
        m.readEventFiles(); //this method will read the file of Events and create new Event Objects with it
        String confirm =m.getU();//returns the username of the user, which will be used as a confirmation
        ArrayList<Event> a = m.getEventList();//will return the populated ArrayList of Events
        for(int i = 0; i<a.size();i++){ //goes through all the Objects in the arrayList
            if (a.get(i).getConfirm().equals(confirm)){ //checks if the username of the user matches the username that is stored in the ArrayList
               Object[] row = {a.get(i).getEventName(),a.get(i).getEventType(),a.get(i).getDescription(),a.get(i).getPriority(),a.get(i).getDate(),false};
               //creates a row with each element of the Event in a different column, and adds it to the table
                model.addRow(row);       
            }
        }
        evtupdatebutton.setEnabled(false);
    }//GEN-LAST:event_evtupdatebuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                optionspanel b = new optionspanel();
                b.setFrame(m);
                
                b.setVisible(true);
                b.setLocation(20,0);
                b.setSize(506, 236);
                m.setSize(550,260);
                m.add(b);
                this.setVisible(false);
                
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton evtupdatebutton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables
}
