/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pharmacy.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author emamu
 */
public class Agents extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Agents() {
        initComponents();
        SelectMed();
    }

   Connection Con = null;
    Statement St = null,St1=null;
    ResultSet Rs= null,Rs1=null;
    @SuppressWarnings("unchecked")
    public void SelectMed(){
     try{
     Con=DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
St = Con.createStatement();
Rs = St.executeQuery("Select * from Shimul.AGENTTBL");
AgentTable.setModel(DbUtils.resultSetToTableModel(Rs));
     }catch(SQLException e)
     {
         e.printStackTrace();
     }
 }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Aname = new javax.swing.JTextField();
        Aage = new javax.swing.JTextField();
        Aphone = new javax.swing.JTextField();
        Aid = new javax.swing.JTextField();
        UpdateBin = new javax.swing.JButton();
        AddBin = new javax.swing.JButton();
        DeleteBin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgentTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        Apass = new javax.swing.JTextField();
        ClearBin = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 204, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(910, 535));

        jLabel2.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("NAME");

        jLabel8.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("AGE");

        jLabel9.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("PHONE");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));

        Aname.setBackground(new java.awt.Color(204, 255, 204));
        Aname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Aname.setForeground(new java.awt.Color(0, 153, 153));
        Aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnameActionPerformed(evt);
            }
        });

        Aage.setBackground(new java.awt.Color(204, 255, 204));
        Aage.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Aage.setForeground(new java.awt.Color(0, 153, 153));
        Aage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AageActionPerformed(evt);
            }
        });

        Aphone.setBackground(new java.awt.Color(204, 255, 204));
        Aphone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Aphone.setForeground(new java.awt.Color(0, 153, 153));
        Aphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AphoneActionPerformed(evt);
            }
        });

        Aid.setBackground(new java.awt.Color(204, 255, 204));
        Aid.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Aid.setForeground(new java.awt.Color(204, 255, 204));
        Aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AidActionPerformed(evt);
            }
        });

        UpdateBin.setBackground(new java.awt.Color(0, 153, 153));
        UpdateBin.setFont(new java.awt.Font("C059", 0, 14)); // NOI18N
        UpdateBin.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBin.setText("Update");
        UpdateBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBinMouseClicked(evt);
            }
        });
        UpdateBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBinActionPerformed(evt);
            }
        });

        AddBin.setBackground(new java.awt.Color(0, 153, 153));
        AddBin.setFont(new java.awt.Font("C059", 0, 14)); // NOI18N
        AddBin.setForeground(new java.awt.Color(255, 255, 255));
        AddBin.setText("Add");
        AddBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBinMouseClicked(evt);
            }
        });
        AddBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBinActionPerformed(evt);
            }
        });

        DeleteBin.setBackground(new java.awt.Color(0, 153, 153));
        DeleteBin.setFont(new java.awt.Font("C059", 0, 14)); // NOI18N
        DeleteBin.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBin.setText("Delete");
        DeleteBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBinMouseClicked(evt);
            }
        });
        DeleteBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBinActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MANAGE AGENTS");

        AgentTable.setBackground(new java.awt.Color(204, 255, 204));
        AgentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "PHONE", "PASSWORD", "GENDER"
            }
        ));
        AgentTable.setGridColor(new java.awt.Color(0, 0, 0));
        AgentTable.setRowHeight(25);
        AgentTable.setSelectionBackground(new java.awt.Color(0, 255, 204));
        AgentTable.setSelectionForeground(new java.awt.Color(0, 0, 153));
        AgentTable.setShowHorizontalLines(true);
        AgentTable.setShowVerticalLines(true);
        AgentTable.setSurrendersFocusOnKeystroke(true);
        AgentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgentTable);

        jLabel13.setFont(new java.awt.Font("C059", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("AGENT LIST");

        Apass.setBackground(new java.awt.Color(204, 255, 204));
        Apass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Apass.setForeground(new java.awt.Color(0, 153, 153));
        Apass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApassActionPerformed(evt);
            }
        });

        ClearBin.setBackground(new java.awt.Color(0, 153, 153));
        ClearBin.setFont(new java.awt.Font("C059", 0, 14)); // NOI18N
        ClearBin.setForeground(new java.awt.Color(255, 255, 255));
        ClearBin.setText("Clear");
        ClearBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBinMouseClicked(evt);
            }
        });
        ClearBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBinActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("PASSWORD");

        jLabel12.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("GENDER");

        GenderCb.setBackground(new java.awt.Color(204, 255, 204));
        GenderCb.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        GenderCb.setForeground(new java.awt.Color(0, 102, 102));
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderCbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Aage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(451, 451, 451)
                                    .addComponent(jLabel12)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Aid, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(451, 451, 451)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(451, 451, 451)
                                .addComponent(jLabel14)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Aphone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Apass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(DeleteBin)
                                    .addGap(53, 53, 53)
                                    .addComponent(ClearBin)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(125, 125, 125)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(AddBin)
                        .addGap(39, 39, 39)
                        .addComponent(UpdateBin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(Aphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Apass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Aage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jLabel6.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SELLING");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COMPANIES");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MEDICINES");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnameActionPerformed

    private void AageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AageActionPerformed

    private void AphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AphoneActionPerformed

    private void AidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AidActionPerformed

    private void UpdateBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBinActionPerformed

    private void AddBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBinActionPerformed

    private void DeleteBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBinActionPerformed

    private void ApassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApassActionPerformed

    private void ClearBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GenderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderCbActionPerformed

    private void AddBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBinMouseClicked
        try{
             Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
             PreparedStatement add =Con.prepareStatement("insert into AGENTTBL values(?,?,?,?,?,?)");
             add.setInt(1, Integer.valueOf(Aid.getText()));
             add.setString(2, Aname.getText());
             add.setInt(3, Integer.valueOf(Aage.getText()));
             add.setString(4, Aphone.getText());
            add.setString(5, Apass.getText());
             add.setString(6, (String) GenderCb.getSelectedItem());
             int row = add.executeUpdate();
             JOptionPane.showMessageDialog(this, "Agent Successfully Added");
             Con.close();
             SelectMed();
            }                                   
            catch(SQLException e)
            {
             e.printStackTrace();
            }
          
    }//GEN-LAST:event_AddBinMouseClicked

    private void ClearBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBinMouseClicked
       Aid.setText("");
       Aname.setText("");
       Aage.setText("");
       Aphone.setText("");
       Apass.setText("");
    }//GEN-LAST:event_ClearBinMouseClicked

    private void DeleteBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBinMouseClicked
      if (Aid.getText().isEmpty()){
         JOptionPane.showInputDialog(this,"Enter the Agent To be Deleted");
     }
     else{
     try{
         Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
     String Id= Aid.getText();
     String Query ="Delete from Shimul.AGENTTBL where AID="+Id;
     Statement Add= Con.createStatement();
     Add.executeUpdate (Query);
     SelectMed();
     JOptionPane.showMessageDialog(this,"Agent Deleted Sucessfully");
     }catch(SQLException e)
     {
        e.printStackTrace();
     }
     }
    }//GEN-LAST:event_DeleteBinMouseClicked

    private void UpdateBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBinMouseClicked
    if(Aid.getText().isEmpty() || Aname.getText().isEmpty()||Aage.getText().isEmpty()||Aphone.getText().isEmpty()||Apass.getText().isEmpty())
     {
      JOptionPane.showMessageDialog(this, "Missing Information"); 
     }
     else
     {
         try{
         
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
             String UpdateQuery= "Update Shimul.AGENTTBL set ANAME='"+Aname.getText()+"'"+",AAGE="+Aage.getText()+""+",APHONE="+Aphone.getText()+""+",APASS="+Apass.getText()+"'"+",AGENDER='"+GenderCb.getSelectedItem().toString()+"'"+"where AID="+Aid.getText();
        Statement Add= Con.createStatement();
        JOptionPane.showMessageDialog(this, "Agent Updated Successfully");
        
         }catch(SQLException e) 
         {
             e.printStackTrace();
             
         }
        //SelectMed();   
     } 
    }//GEN-LAST:event_UpdateBinMouseClicked

    private void AgentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgentTableMouseClicked
        DefaultTableModel model= (DefaultTableModel)AgentTable.getModel();
    int Myindex =AgentTable.getSelectedRow();
    Aid.setText(model.getValueAt(Myindex, 0).toString());
    Aname.setText(model.getValueAt(Myindex,1).toString());
    Aage.setText(model.getValueAt(Myindex, 2).toString());
    Aphone.setText(model.getValueAt(Myindex, 3).toString());
    Apass.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_AgentTableMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      new Selling().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

        
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
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aage;
    private javax.swing.JButton AddBin;
    private javax.swing.JTable AgentTable;
    private javax.swing.JTextField Aid;
    private javax.swing.JTextField Aname;
    private javax.swing.JTextField Apass;
    private javax.swing.JTextField Aphone;
    private javax.swing.JButton ClearBin;
    private javax.swing.JButton DeleteBin;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JButton UpdateBin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
