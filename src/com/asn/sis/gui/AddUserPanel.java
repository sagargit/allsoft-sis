
package com.asn.sis.gui;

import com.asn.sis.dao.UserDAO;
import com.asn.sis.dto.UserDTO;
import java.sql.SQLException;
import com.mabimal.crypt.BCrypt;


public class AddUserPanel extends javax.swing.JPanel {

    
    public AddUserPanel() {
        initComponents();
        loadDatas();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userIDTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        middleNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        perAddressTxt = new javax.swing.JTextField();
        tempAddressTxt = new javax.swing.JTextField();
        contactNumberTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        addBttn = new javax.swing.JButton();
        editBttn = new javax.swing.JButton();
        deleteBttn = new javax.swing.JButton();
        closeBttn = new javax.swing.JButton();
        passwordTxt = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        errorLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        jLabel1.setText("User ID:");

        userIDTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userIDTxtFocusLost(evt);
            }
        });
        userIDTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userIDTxtKeyReleased(evt);
            }
        });

        jLabel2.setText("Username:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Middle Name:");

        jLabel5.setText("Last Name:");

        jLabel6.setText("Password:");

        jLabel7.setText("Permanent Address:");

        jLabel8.setText("Temporary Address:");

        jLabel9.setText("Moblie Number:");

        jLabel10.setText("Email:");

        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTxtFocusLost(evt);
            }
        });
        usernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTxtKeyReleased(evt);
            }
        });

        firstNameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTxtFocusLost(evt);
            }
        });
        firstNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTxtKeyReleased(evt);
            }
        });

        lastNameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTxtFocusLost(evt);
            }
        });
        lastNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTxtKeyReleased(evt);
            }
        });

        perAddressTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                perAddressTxtFocusLost(evt);
            }
        });
        perAddressTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                perAddressTxtKeyReleased(evt);
            }
        });

        tempAddressTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tempAddressTxtFocusLost(evt);
            }
        });
        tempAddressTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tempAddressTxtKeyReleased(evt);
            }
        });

        contactNumberTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactNumberTxtFocusLost(evt);
            }
        });
        contactNumberTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactNumberTxtKeyReleased(evt);
            }
        });

        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });
        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtKeyReleased(evt);
            }
        });

        addBttn.setText("Add");
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        editBttn.setText("Edit");
        editBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttnActionPerformed(evt);
            }
        });

        deleteBttn.setText("Delete");
        deleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBttnActionPerformed(evt);
            }
        });

        closeBttn.setText("Close");
        closeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBttnActionPerformed(evt);
            }
        });

        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTxtFocusLost(evt);
            }
        });
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTxtKeyReleased(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(0, 255, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(contactNumberTxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTxt)
                            .addComponent(firstNameTxt)
                            .addComponent(middleNameTxt)
                            .addComponent(userIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(addBttn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(closeBttn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editBttn, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {contactNumberTxt, emailTxt, firstNameTxt, lastNameTxt, middleNameTxt, passwordTxt, perAddressTxt, tempAddressTxt, userIDTxt, usernameTxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBttn, closeBttn, deleteBttn, editBttn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(middleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(perAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tempAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(contactNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        UserDTO user = new UserDTO();
        user.setId(Integer.parseInt(userIDTxt.getText()));
        user.setUsername(usernameTxt.getText());
        user.setFirstName(firstNameTxt.getText());
        user.setMiddleName(middleNameTxt.getText());
        user.setLastName(lastNameTxt.getText());
        //user.setPassword(new String(passwordTxt.getPassword()));
        user.setPassword(BCrypt.hashpw(new String(passwordTxt.getPassword()),BCrypt.gensalt(5)));
        /*if(BCrypt.checkpw(password,database baata taneko password){
        open Dashboard
    }*/
        user.setPerAddress(perAddressTxt.getText());
        user.setTempAddress(tempAddressTxt.getText());
        user.setContact(contactNumberTxt.getText());
        user.setEmail(emailTxt.getText());
        new UserDAO().addUser(user);
        clearFields();
        loadDatas();
    }//GEN-LAST:event_addBttnActionPerformed

    private void userIDTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIDTxtFocusLost
        if (userIDTxt.getText().equals("")) {
            errorLabel.setText("User ID can't be empty");
            userIDTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_userIDTxtFocusLost

    private void userIDTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userIDTxtKeyReleased
        if (userIDTxt.getText().equals("")) {
            errorLabel.setText("User ID can't be empty");
            userIDTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_userIDTxtKeyReleased

    private void usernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusLost
        if (usernameTxt.getText().equals("")) {
            errorLabel.setText("User name can't be empty");
            usernameTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_usernameTxtFocusLost

    private void usernameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyReleased
        if (usernameTxt.getText().equals("")) {
            errorLabel.setText("User name can't be empty");
            usernameTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_usernameTxtKeyReleased

    private void firstNameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTxtFocusLost
        if (firstNameTxt.getText().equals("")) {
            errorLabel.setText("First name can't be empty");
            firstNameTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_firstNameTxtFocusLost

    private void firstNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTxtKeyReleased
        if (firstNameTxt.getText().equals("")) {
            errorLabel.setText("First name can't be empty");
            firstNameTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_firstNameTxtKeyReleased

    private void lastNameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTxtFocusLost
        if (lastNameTxt.getText().equals("")) {
            errorLabel.setText("last name can't be empty");
            lastNameTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_lastNameTxtFocusLost

    private void lastNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTxtKeyReleased
        if (lastNameTxt.getText().equals("")) {
            errorLabel.setText("last name can't be empty");
            lastNameTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_lastNameTxtKeyReleased

    private void passwordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusLost
        if (new String(passwordTxt.getPassword()).equals("")) {
            errorLabel.setText("password can't be empty");
            passwordTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_passwordTxtFocusLost

    private void passwordTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyReleased
        if (new String(passwordTxt.getPassword()).equals("")) {
            errorLabel.setText("password can't be empty");
            passwordTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_passwordTxtKeyReleased

    private void perAddressTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_perAddressTxtFocusLost
        if (perAddressTxt.getText().equals("")) {
            errorLabel.setText("Permanent address can't be empty");
            perAddressTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_perAddressTxtFocusLost

    private void perAddressTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perAddressTxtKeyReleased
        if (perAddressTxt.getText().equals("")) {
            errorLabel.setText("Permanent address can't be empty");
            perAddressTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_perAddressTxtKeyReleased

    private void tempAddressTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempAddressTxtFocusLost
        if (tempAddressTxt.getText().equals("")) {
            errorLabel.setText("Temp address can't be empty");
            tempAddressTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_tempAddressTxtFocusLost

    private void tempAddressTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempAddressTxtKeyReleased
        if (tempAddressTxt.getText().equals("")) {
            errorLabel.setText("Temp address can't be empty");
            tempAddressTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_tempAddressTxtKeyReleased

    private void contactNumberTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNumberTxtFocusLost
        if (contactNumberTxt.getText().equals("")) {
            errorLabel.setText(" Contact number can't be empty");
            contactNumberTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberTxtFocusLost

    private void contactNumberTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNumberTxtKeyReleased
        if (contactNumberTxt.getText().equals("")) {
            errorLabel.setText("Contact number can't be empty");
            contactNumberTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_contactNumberTxtKeyReleased

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        if (emailTxt.getText().equals("")) {
            errorLabel.setText("Email can't be empty");
            emailTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtFocusLost

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased
        if (emailTxt.getText().equals("")) {
            errorLabel.setText("Email can't be empty");
            emailTxt.requestFocus();
        } else {
            errorLabel.setText("");
        }
    }//GEN-LAST:event_emailTxtKeyReleased

    private void editBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttnActionPerformed
        if (editBttn.getText().equalsIgnoreCase("Edit")) {
            editBttn.setText("Update");
            UserDTO userEdit = new UserDAO().editUser(userTable);
            userIDTxt.setText(String.valueOf(userEdit.getId()));
            userIDTxt.setEditable(false);
            usernameTxt.setText(userEdit.getUsername());
            firstNameTxt.setText(userEdit.getFirstName());
            middleNameTxt.setText(userEdit.getMiddleName());
            lastNameTxt.setText(userEdit.getLastName());
            passwordTxt.setText(userEdit.getPassword());
         
            perAddressTxt.setText(userEdit.getPerAddress());
            tempAddressTxt.setText(userEdit.getTempAddress());
            contactNumberTxt.setText(userEdit.getContact());
            emailTxt.setText(userEdit.getEmail());
            loadDatas();

        } else {

            editBttn.setText("Edit");
            UserDTO userUpdate = new UserDTO();
            userUpdate.setId(Integer.parseInt(userIDTxt.getText()));
            
            userUpdate.setUsername(usernameTxt.getText());
            userUpdate.setFirstName(firstNameTxt.getText());
            userUpdate.setMiddleName(middleNameTxt.getText());
            userUpdate.setLastName(lastNameTxt.getText());
            userUpdate.setPassword(new String(passwordTxt.getPassword()));
            userUpdate.setPerAddress(perAddressTxt.getText());
            userUpdate.setTempAddress(tempAddressTxt.getText());
            userUpdate.setContact(contactNumberTxt.getText());
            userUpdate.setEmail(emailTxt.getText());
            new UserDAO().updateUser(userUpdate);
            loadDatas();
            clearFields();
            userIDTxt.setEditable(true);

        }
    }//GEN-LAST:event_editBttnActionPerformed

    private void deleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBttnActionPerformed
       new UserDAO().delete(String.valueOf(userTable.getValueAt(userTable.getSelectedRow(),0)));//0 means value of first column in the table
       loadDatas();
    }//GEN-LAST:event_deleteBttnActionPerformed

    private void closeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBttnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBttnActionPerformed
    public void clearFields() {
        userIDTxt.setText("");
        usernameTxt.setText("");
        firstNameTxt.setText("");
        middleNameTxt.setText("");
        lastNameTxt.setText("");
        passwordTxt.setText("");
        perAddressTxt.setText("");
        tempAddressTxt.setText("");
        contactNumberTxt.setText("");
        emailTxt.setText("");

    }

    public void loadDatas() {
        UserDAO userDAO = new UserDAO();
        try {
            userTable.setModel(userDAO.buildTableModel(userDAO.getQueryResult()));
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JButton closeBttn;
    private javax.swing.JTextField contactNumberTxt;
    private javax.swing.JButton deleteBttn;
    private javax.swing.JButton editBttn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField middleNameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField perAddressTxt;
    private javax.swing.JTextField tempAddressTxt;
    private javax.swing.JTextField userIDTxt;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
