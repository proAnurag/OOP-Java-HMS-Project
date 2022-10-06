/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.meco.MainPages.User;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import com.meco.DB.DB;
import com.meco.MainPages.Admin.adminUtils;

/**
 *
 * @author ashishkumar
 */
public class UserRoomBooking extends javax.swing.JFrame {

    /**
     * Creates new form UserRoomBooking
     */
    public UserRoomBooking() {
        initComponents();
        ac_nonAcBtnGroup.add(acRadioBtn);
        ac_nonAcBtnGroup.add(nonAcRadioBtn);

        single_doubleBedBtnGroup.add(singleBedRadioBtn);
        single_doubleBedBtnGroup.add(doubleBedRadioBtn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ac_nonAcBtnGroup = new javax.swing.ButtonGroup();
        single_doubleBedBtnGroup = new javax.swing.ButtonGroup();
        ageField = new javax.swing.JTextField();
        phoneNoLabel = new javax.swing.JLabel();
        phoneNoField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        roomNoLabel = new javax.swing.JLabel();
        roomDetailsLabel = new javax.swing.JLabel();
        roomNoField = new javax.swing.JTextField();
        mealComboRadioBtn = new javax.swing.JRadioButton();
        singleBedRadioBtn = new javax.swing.JRadioButton();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        bookRoomBtn = new javax.swing.JButton();
        ageLabel = new javax.swing.JLabel();
        acRadioBtn = new javax.swing.JRadioButton();
        nonAcRadioBtn = new javax.swing.JRadioButton();
        doubleBedRadioBtn = new javax.swing.JRadioButton();
        checkInLabel = new javax.swing.JLabel();
        checkOutLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        checkInDateChooser = new com.toedter.calendar.JDateChooser();
        checkOutDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ageField.setText("Enter age");
        ageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFieldFocusLost(evt);
            }
        });

        phoneNoLabel.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        phoneNoLabel.setText("Phone No.");

        phoneNoField.setText("Enter Phone No.");
        phoneNoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNoFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNoFieldFocusLost(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        addressLabel.setText("Address");

        addressField.setText("Enter address");
        addressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFieldFocusLost(evt);
            }
        });

        roomNoLabel.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        roomNoLabel.setText("Room No.");

        roomDetailsLabel.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        roomDetailsLabel.setText("Room Details");

        roomNoField.setText("0");
        roomNoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roomNoFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                roomNoFieldFocusLost(evt);
            }
        });

        mealComboRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        mealComboRadioBtn.setText("Meal Combo");

        singleBedRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        singleBedRadioBtn.setText("Single Bed");

        emailField.setText("Enter email ID");
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        emailLabel.setText("Email");

        nameField.setText("Enter name");
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        nameLabel.setText("Name");

        titleLabel.setFont(new java.awt.Font("AppleGothic", 1, 48)); // NOI18N
        titleLabel.setText("Book a Room now!");

        bookRoomBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookRoomBtn.setText("Book Room");
        bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomBtnActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        ageLabel.setText("Age");

        acRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        acRadioBtn.setText("AC Room");

        nonAcRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        nonAcRadioBtn.setText("Non-AC Room");

        doubleBedRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        doubleBedRadioBtn.setText("Double Bed");

        checkInLabel.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        checkInLabel.setText("Check-In Date");

        checkOutLabel.setFont(new java.awt.Font("AppleGothic", 0, 14)); // NOI18N
        checkOutLabel.setText("Check-Out Date");

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        checkInDateChooser.setBackground(new java.awt.Color(255, 255, 255));

        checkOutDateChooser.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(bookRoomBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel)
                                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel)
                                    .addComponent(phoneNoLabel)
                                    .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(roomDetailsLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mealComboRadioBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roomNoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(roomNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(acRadioBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nonAcRadioBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(singleBedRadioBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(doubleBedRadioBtn)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkOutLabel)
                                    .addComponent(checkInLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkInDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkOutDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(addressField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phoneNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(roomDetailsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(roomNoLabel)
                                    .addComponent(roomNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(mealComboRadioBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkInDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(acRadioBtn)
                                        .addComponent(nonAcRadioBtn)
                                        .addComponent(checkInLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(singleBedRadioBtn)
                                        .addComponent(doubleBedRadioBtn)
                                        .addComponent(checkOutLabel))
                                    .addComponent(checkOutDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusGained
        if (ageField.getText().equals("Enter age")) {
            ageField.setText("");
        }
    }//GEN-LAST:event_ageFieldFocusGained

    private void ageFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusLost
        if (ageField.getText().equals("") || ageField.getText().equals("Enter age")) {
            ageField.setText("Enter age");
        }
    }//GEN-LAST:event_ageFieldFocusLost

    private void phoneNoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoFieldFocusGained
        if (phoneNoField.getText().equals("Enter Phone No.")) {
            phoneNoField.setText("");
        }
    }//GEN-LAST:event_phoneNoFieldFocusGained

    private void phoneNoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoFieldFocusLost
        if (phoneNoField.getText().equals("") || phoneNoField.getText().equals("Enter Phone No.")) {
            phoneNoField.setText("Enter Phone No.");
        }
    }//GEN-LAST:event_phoneNoFieldFocusLost

    private void addressFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFieldFocusGained
        if (addressField.getText().equals("Enter address")) {
            addressField.setText("");
        }
    }//GEN-LAST:event_addressFieldFocusGained

    private void addressFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFieldFocusLost
        if (addressField.getText().equals("") || addressField.getText().equals("Enter address")) {
            addressField.setText("Enter address");
        }
    }//GEN-LAST:event_addressFieldFocusLost

    private void roomNoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomNoFieldFocusGained
        if (roomNoField.getText().equals("0")) {
            roomNoField.setText("");
        }
    }//GEN-LAST:event_roomNoFieldFocusGained

    private void roomNoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomNoFieldFocusLost
        if (roomNoField.getText().equals("") || roomNoField.getText().equals("0")) {
            roomNoField.setText("0");
        }
    }//GEN-LAST:event_roomNoFieldFocusLost

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        if (emailField.getText().equals("Enter email ID")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        if (emailField.getText().equals("") || emailField.getText().equals("Enter email ID")) {
            emailField.setText("Enter email ID");
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        if (nameField.getText().equals("Enter name")) {
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        if (nameField.getText().equals("") || nameField.getText().equals("Enter name")) {
            nameField.setText("Enter name");
        }
    }//GEN-LAST:event_nameFieldFocusLost

    private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomBtnActionPerformed
        String name = nameField.getText();
        String email = emailField.getText();
        String age = ageField.getText();
        String phoneNo = phoneNoField.getText();
        String address = addressField.getText();
        String roomNoString = roomNoField.getText();

        boolean validRoomNumber = false;
        if (!roomNoString.equals("0")) {
            for (int i : adminUtils.getRoomNumbers()) {
                if (roomNoString.equals(String.valueOf(i))) {validRoomNumber = true; break;}
            }
        }
        String roomStatus = DB.getRoomStatus(Integer.parseInt(roomNoString)); // getting the status of the room

        // get the value of ac or non ac room field from the radio buttonGroup
        String ac_nonAcRoom = null;
        if (acRadioBtn.isSelected()) ac_nonAcRoom = "AC Room";
        else if (nonAcRadioBtn.isSelected()) ac_nonAcRoom = "Non-AC Room";
        else ac_nonAcRoom = "No input provided";

        // get the value of single or double bed field from the radio buttonGroup
        String single_doubleBedRoom = null;
        if (singleBedRadioBtn.isSelected()) single_doubleBedRoom = "Single-Bed Room";
        else if (doubleBedRadioBtn.isSelected()) single_doubleBedRoom = "Double-Bed Room";
        else single_doubleBedRoom = "No input provided";

        // check if the email exists in the database
        String storedEmail = null;
        Statement stmt;
        String query = "SELECT email FROM userData WHERE email = '" + email +"';";
        try {
            stmt = DB.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {storedEmail = rs.getString(1);}
        } catch (Exception e) {System.out.println(e.getMessage());}
        
        // get the value of the meal combo radio button
        String mealCombo = null;
        if (mealComboRadioBtn.isSelected()) mealCombo = "Meal Combo";
        else mealCombo = "No Meal Combo";

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String checkInDateString = sdf.format(checkInDateChooser.getDate());
        String checkOutDateString = sdf.format(checkOutDateChooser.getDate());

        java.util.Date checkInDate = null;
        java.util.Date checkOutDate = null;
        try {
            checkInDate = sdf.parse(checkInDateString);
            checkOutDate = sdf.parse(checkOutDateString);
        } catch (ParseException e) {System.out.println(e.getMessage());}

        // safety checks for entering the data in the database
        if (name.equals(null) || name.equals("Enter name")) {
            JOptionPane.showMessageDialog(null, "Invalid name entered", "Booking Fail", 2);
        } 
        else if (email.equals(null) || email.equals("Enter email") || !email.equals(storedEmail)) {
            JOptionPane.showMessageDialog(null, "Invalid email entered", "Booking Fail", 2); 
        } 
        else if (age.equals(null) || age.equals("Enter age") || Integer.parseInt(age) < 0 || Integer.parseInt(age) > 100) {
            JOptionPane.showMessageDialog(null, "Invalid age entered", "Booking Fail", 2);
        } 
        else if (phoneNo.equals(null) || phoneNo.equals("Enter Phone No.") || phoneNo.length() < 10) {
            JOptionPane.showMessageDialog(null, "Invalid Phone No. entered", "Booking Fail", 2);
        }
        else if (address.equals(null) || address.equals("Enter address")) {
            JOptionPane.showMessageDialog(null, "Invalid address entered", "Booking Fail", 2);
        }
        else if (!validRoomNumber || !roomStatus.equals("0")) { // roomStatus == 0 means room is available
            JOptionPane.showMessageDialog(null, "Invalid room number entered", "Booking Fail", 2);
        }
        else if (ac_nonAcRoom.equals("No input provided") || single_doubleBedRoom.equals("No input provided")) {
            JOptionPane.showMessageDialog(null, "Select a valid Input!", "Booking Fail", 2);
        }
        else if (checkInDate.after(checkOutDate)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Date!", "Booking Fail", 2);
        }
        else { // means all values are valid and display this on admin panel
            JOptionPane.showMessageDialog(null, "Your booking confirmation will be soon shared! Please check your email or sms, and if no message is available is recived contact the admin!", "Booking Success", 2);
            // open waiting notification window
            UserWaitingWindow page = new UserWaitingWindow();
            page.setVisible(true);
            page.pack();
            page.setLocationRelativeTo(null);
            this.dispose();
            System.out.println("room booked");
        }
    }//GEN-LAST:event_bookRoomBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        UserPage page = new UserPage();
        page.setVisible(true);
        page.pack();
        page.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRoomBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton acRadioBtn;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookRoomBtn;
    private com.toedter.calendar.JDateChooser checkInDateChooser;
    private javax.swing.JLabel checkInLabel;
    private com.toedter.calendar.JDateChooser checkOutDateChooser;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JRadioButton doubleBedRadioBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton mealComboRadioBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton nonAcRadioBtn;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JLabel roomDetailsLabel;
    private javax.swing.JTextField roomNoField;
    private javax.swing.JLabel roomNoLabel;
    private javax.swing.JRadioButton singleBedRadioBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.ButtonGroup single_doubleBedBtnGroup;    
    private javax.swing.ButtonGroup ac_nonAcBtnGroup;
    // End of variables declaration//GEN-END:variables
}