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
public class Company extends javax.swing.JFrame {

    /*2*
     * Creates new form Company
     */
    public Company() {
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
Rs = St.executeQuery("Select * from Shimul.COMPTBL");
CompTable.setModel(DbUtils.resultSetToTableModel(Rs));
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
        Compname = new javax.swing.JTextField();
        Compadd = new javax.swing.JTextField();
        Compexp = new javax.swing.JTextField();
        CompId = new javax.swing.JTextField();
        UpdateBin = new javax.swing.JButton();
        AddBin = new javax.swing.JButton();
        DeleteBin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        Compphone = new javax.swing.JTextField();
        ClearBin = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
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
        jLabel8.setText("ADDRESS");

        jLabel9.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("EXPERIENCE");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));

        Compname.setBackground(new java.awt.Color(204, 255, 204));
        Compname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Compname.setForeground(new java.awt.Color(0, 153, 153));
        Compname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompnameActionPerformed(evt);
            }
        });

        Compadd.setBackground(new java.awt.Color(204, 255, 204));
        Compadd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Compadd.setForeground(new java.awt.Color(0, 153, 153));
        Compadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompaddActionPerformed(evt);
            }
        });

        Compexp.setBackground(new java.awt.Color(204, 255, 204));
        Compexp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Compexp.setForeground(new java.awt.Color(0, 153, 153));
        Compexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompexpActionPerformed(evt);
            }
        });

        CompId.setBackground(new java.awt.Color(204, 255, 204));
        CompId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        CompId.setForeground(new java.awt.Color(0, 153, 153));
        CompId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompIdActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MANAGE COMPANY");

        CompTable.setBackground(new java.awt.Color(204, 255, 204));
        CompTable.setFont(new java.awt.Font("C059", 0, 10)); // NOI18N
        CompTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                " ID", " NAME", "ADDRESS", "EXPERIENCE", "PHONE"
            }
        ));
        CompTable.setGridColor(new java.awt.Color(0, 0, 0));
        CompTable.setMinimumSize(new java.awt.Dimension(90, 100));
        CompTable.setRowHeight(25);
        CompTable.setSelectionBackground(new java.awt.Color(0, 255, 204));
        CompTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        CompTable.setShowHorizontalLines(true);
        CompTable.setShowVerticalLines(true);
        CompTable.setSurrendersFocusOnKeystroke(true);
        CompTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CompTable);

        jLabel13.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("COMPANIES LISTS");

        Compphone.setBackground(new java.awt.Color(204, 255, 204));
        Compphone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Compphone.setForeground(new java.awt.Color(0, 153, 153));
        Compphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompphoneActionPerformed(evt);
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
        jLabel14.setText("PHONE");

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
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Compname)
                    .addComponent(CompId, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(Compadd))
                .addGap(217, 217, 217)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel9))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Compexp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Compphone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DeleteBin)
                        .addGap(47, 47, 47)
                        .addComponent(ClearBin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(AddBin)
                .addGap(42, 42, 42)
                .addComponent(UpdateBin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(448, 448, 448))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(413, 413, 413))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CompId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Compexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(Compname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Compphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Compadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jLabel13)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jLabel6.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SELLING");

        jLabel7.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEDICINES");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AGENTS");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 64, Short.MAX_VALUE))
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

    private void CompnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompnameActionPerformed

    private void CompaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompaddActionPerformed

    private void CompexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompexpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompexpActionPerformed

    private void CompIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompIdActionPerformed

    private void UpdateBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBinActionPerformed

    private void AddBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBinActionPerformed

    private void DeleteBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBinActionPerformed

    private void CompphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompphoneActionPerformed

    private void ClearBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBinMouseClicked
     try{
             Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
             PreparedStatement add =Con.prepareStatement("insert into COMPTBL values(?,?,?,?,?)");
             add.setInt(1, Integer.valueOf(CompId.getText()));
             add.setString(2, Compname.getText());
            add.setString(3, Compadd.getText());
             add.setString(4,Compexp.getText());
               add.setString(5, Compphone.getText());
            
             int row = add.executeUpdate();
             JOptionPane.showMessageDialog(this, "Company Successfully Added");
             Con.close();
              //SelectMed();
             
    }                                   
catch(SQLException e)
{
    e.printStackTrace();
    
  
}
    }//GEN-LAST:event_AddBinMouseClicked

    private void DeleteBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBinMouseClicked
if (CompId.getText().isEmpty()){
         JOptionPane.showInputDialog(this,"Enter the Agent To be Deleted");
     }
     else{
     try{
         Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
     String Id= CompId.getText();
     String Query ="Delete from Shimul.COMPTBL where COMPID="+Id;
     Statement Add= Con.createStatement();
     Add.executeUpdate (Query);
     SelectMed();
     JOptionPane.showMessageDialog(this,"Company Deleted Sucessfully");
     }catch(SQLException e)
     {
        e.printStackTrace();
     }
     }
    }//GEN-LAST:event_DeleteBinMouseClicked

    private void ClearBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBinMouseClicked
        CompId.setText("");
       Compname.setText("");
       Compexp.setText("");
       Compphone.setText("");
       Compadd.setText("");
    }//GEN-LAST:event_ClearBinMouseClicked

    private void CompTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompTableMouseClicked
    DefaultTableModel model= (DefaultTableModel)CompTable.getModel();
    int Myindex =CompTable.getSelectedRow();
    CompId.setText(model.getValueAt(Myindex, 0).toString());
    Compname.setText(model.getValueAt(Myindex,1).toString());
    Compadd.setText(model.getValueAt(Myindex, 2).toString());
    Compexp.setText(model.getValueAt(Myindex, 3).toString());
    Compphone.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_CompTableMouseClicked

    private void UpdateBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBinMouseClicked
      if(CompId.getText().isEmpty() || Compname.getText().isEmpty()||Compadd.getText().isEmpty()||Compexp.getText().isEmpty()||Compphone.getText().isEmpty())
     {
      JOptionPane.showMessageDialog(this, "Missing Information"); 
     }
     else
     {
         try{
         
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
             String UpdateQuery= "Update Shimul.COMPTBL set COMPID='"+CompId.getText()+"'"+",COMPNAME="+Compname.getText()+""+",COMPEXP="+Compexp.getText()+""+",COMPPHONE="+Compphone.getText()+"'"+"where AID="+CompId.getText();
        Statement Add= Con.createStatement();
        JOptionPane.showMessageDialog(this, "Agent Updated Successfully");
        
         }catch(SQLException e) 
         {
             e.printStackTrace();
             
         }
       //SelectMed();   
     }
    }//GEN-LAST:event_UpdateBinMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBin;
    private javax.swing.JButton ClearBin;
    private javax.swing.JTextField CompId;
    private javax.swing.JTable CompTable;
    private javax.swing.JTextField Compadd;
    private javax.swing.JTextField Compexp;
    private javax.swing.JTextField Compname;
    private javax.swing.JTextField Compphone;
    private javax.swing.JButton DeleteBin;
    private javax.swing.JButton UpdateBin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
