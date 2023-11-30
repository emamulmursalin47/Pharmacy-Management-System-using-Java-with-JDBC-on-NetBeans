/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pharmacy.java;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Medicine extends javax.swing.JFrame {

    /**
     * Creates new form Medicine
     */
    public Medicine() {
        initComponents();
        SelectMed();
        GetPatient();
    }
    Connection Con = null;
    Statement St = null,St1=null;
    ResultSet Rs= null,Rs1=null;
    java.util.Date FDate,EDate;
    java.sql.Date MyFabdate, MyExpDate;

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MedName = new javax.swing.JTextField();
        MedPrice = new javax.swing.JTextField();
        MedQty = new javax.swing.JTextField();
        MedId = new javax.swing.JTextField();
        CompCb = new javax.swing.JComboBox<>();
        DeleteBin = new javax.swing.JButton();
        AddBin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        UpdateBin = new javax.swing.JButton();
        ClearBin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 204, 153));

        jLabel2.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("MEDNAME");

        jLabel8.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("PRICE");

        jLabel9.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("QUANTITY");

        jLabel10.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("FABDATE");

        jLabel11.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("EXPDATE");

        jLabel12.setFont(new java.awt.Font("C059", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("COMPANY");

        MedName.setBackground(new java.awt.Color(204, 255, 204));
        MedName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        MedName.setForeground(new java.awt.Color(0, 153, 153));
        MedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedNameActionPerformed(evt);
            }
        });

        MedPrice.setBackground(new java.awt.Color(204, 255, 204));
        MedPrice.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        MedPrice.setForeground(new java.awt.Color(0, 153, 153));
        MedPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedPriceActionPerformed(evt);
            }
        });

        MedQty.setBackground(new java.awt.Color(204, 255, 204));
        MedQty.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        MedQty.setForeground(new java.awt.Color(0, 153, 153));
        MedQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedQtyActionPerformed(evt);
            }
        });

        MedId.setBackground(new java.awt.Color(204, 255, 204));
        MedId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        MedId.setForeground(new java.awt.Color(0, 153, 153));
        MedId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedIdMouseClicked(evt);
            }
        });
        MedId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedIdActionPerformed(evt);
            }
        });

        CompCb.setBackground(new java.awt.Color(204, 255, 204));
        CompCb.setFont(new java.awt.Font("C059", 0, 12)); // NOI18N
        CompCb.setForeground(new java.awt.Color(0, 102, 102));

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

        jLabel1.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MANAGE MEDICINE");

        MedicineTable.setBackground(new java.awt.Color(204, 255, 204));
        MedicineTable.setBorder(javax.swing.BorderFactory.createBevelBorder(null));
        MedicineTable.setFont(new java.awt.Font("C059", 0, 12)); // NOI18N
        MedicineTable.setForeground(new java.awt.Color(0, 0, 153));
        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "MEDPRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY"
            }
        ));
        MedicineTable.setGridColor(new java.awt.Color(0, 0, 0));
        MedicineTable.setRowHeight(23);
        MedicineTable.setSelectionBackground(new java.awt.Color(0, 255, 153));
        MedicineTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        MedicineTable.setShowHorizontalLines(true);
        MedicineTable.setShowVerticalLines(true);
        MedicineTable.setSurrendersFocusOnKeystroke(true);
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("MEDICINE LIST");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(83, 83, 83)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MedName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedQty, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel12)))
                                .addGap(42, 42, 42)
                                .addComponent(CompCb, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(AddBin)
                .addGap(32, 32, 32)
                .addComponent(UpdateBin)
                .addGap(40, 40, 40)
                .addComponent(DeleteBin)
                .addGap(39, 39, 39)
                .addComponent(ClearBin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(442, 442, 442))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(MedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CompCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(MedQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(AddBin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PharmaCenter");

        jLabel5.setFont(new java.awt.Font("C059", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AGENTS");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(405, 405, 405)
                    .addComponent(jLabel4)
                    .addContainerGap(520, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(jLabel4)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void SelectMed(){
     try{
     Con=DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
St = Con.createStatement();
Rs = St.executeQuery("Select * from MEDICINETBL");
MedicineTable.setModel(DbUtils.resultSetToTableModel(Rs));
     }catch(SQLException e)
     {
         e.printStackTrace();
     }
 }
 public void GetPatient()
 {
     try{
     Con=DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
St = Con.createStatement();
String query = "Select * from Shimul.COMPTBL";
Rs = St.executeQuery(query);
while(Rs.next()){
    String Mycomp =Rs.getString("COMPNAME");
    CompCb.addItem(Mycomp);
}
     }catch(SQLException e)
     {  
         e.printStackTrace();
     }
 }
    private void MedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedNameActionPerformed
       
    }//GEN-LAST:event_MedNameActionPerformed

    private void MedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedPriceActionPerformed

    private void MedQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedQtyActionPerformed

    private void MedIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedIdActionPerformed

    private void DeleteBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBinActionPerformed

    private void AddBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);        // TODO add your handling code her
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBinMouseClicked
        // TODO add your handling code here:
        FDate =FabDate.getDate();
        MyFabdate =new java.sql.Date(FDate.getTime());
        EDate=ExpDate.getDate();
        MyExpDate =new java.sql.Date(EDate.getTime());
        
        try{
             Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
             PreparedStatement add =Con.prepareStatement("insert into MEDICINETBL values(?,?,?,?,?,?,?)");
             add.setInt(1, Integer.valueOf(MedId.getText()));
             add.setString(2, MedName.getText());
             add.setInt(3, Integer.valueOf(MedPrice.getText()));
             add.setInt(4, Integer.valueOf(MedQty.getText()));
             add.setDate(5,MyFabdate);
             add.setDate(6, MyExpDate);
             add.setString(7, (String) CompCb.getSelectedItem());
             int row = add.executeUpdate();
             JOptionPane.showMessageDialog(this, "Midicine Successfully Added");
             Con.close();
              SelectMed();
             
    }//GEN-LAST:event_AddBinMouseClicked
catch(SQLException e)
{
    e.printStackTrace();
    
  
}
        
    }
    private void UpdateBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBinActionPerformed

    private void DeleteBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBinMouseClicked
     if (MedId.getText().isEmpty()){
         JOptionPane.showInputDialog(this,"Enter the Medicine To be Deleted");
     }
     else{
     try{
         Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
     String Id= MedId.getText();
     String Query ="Delete from Shimul.MEDICINETBL where MEDID="+Id;
     Statement Add= Con.createStatement();
     Add.executeUpdate (Query);
     SelectMed();
     JOptionPane.showMessageDialog(this,"Medicine Deleted Sucessfully");
     }catch(SQLException e)
     {
        e.printStackTrace();
     }
     }
     
    }//GEN-LAST:event_DeleteBinMouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
    DefaultTableModel model= (DefaultTableModel)MedicineTable.getModel();
    int Myindex =MedicineTable.getSelectedRow();
    MedId.setText(model.getValueAt(Myindex, 0).toString());
    MedName.setText(model.getValueAt(Myindex,1).toString());
    MedPrice.setText(model.getValueAt(Myindex, 2).toString());
    MedQty.setText(model.getValueAt(Myindex, 3).toString());
    
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void UpdateBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBinMouseClicked
     if(MedId.getText().isEmpty() || MedName.getText().isEmpty()||MedPrice.getText().isEmpty()||MedQty.getText().isEmpty())
     {
      JOptionPane.showMessageDialog(this, "Missing Information"); 
     }
     else
     {
         try{
             FDate=FabDate.getDate();
             MyFabdate= new java.sql.Date(FDate.getTime());
             EDate=ExpDate.getDate();
             MyExpDate= new java.sql.Date(EDate.getTime());
         
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/Pharmadb","Shimul","1234");
             String UpdateQuery= "Update Shimul.MEDICINETBL set MEDNAME='"+MedName.getText()+"'"+",MEDPRICE="+MedPrice.getText()+""+",MEDQTY="+MedQty.getText()+""+",MEDFAB="+MyFabdate+"'"+",MEDEXP='"+MyExpDate+"'"+",MEDCOMP='"+CompCb.getSelectedItem().toString()+"'"+"where MEDID="+MedId.getText();
        Statement Add= Con.createStatement();
        JOptionPane.showMessageDialog(this, "Medicine Updated Successfully");
        Add.executeUpdate(UpdateQuery);
         }catch(SQLException e)
         {
             e.printStackTrace();
            
         }
     SelectMed();  
     } 
         
    }//GEN-LAST:event_UpdateBinMouseClicked

    private void ClearBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBinMouseClicked
        MedId.setText("");
       MedName.setText("");
       MedPrice.setText("");
       MedQty.setText("");

    }//GEN-LAST:event_ClearBinMouseClicked

    private void ClearBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBinActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void MedIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MedIdMouseClicked

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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBin;
    private javax.swing.JButton ClearBin;
    private javax.swing.JComboBox<String> CompCb;
    private javax.swing.JButton DeleteBin;
    private javax.swing.JTextField MedId;
    private javax.swing.JTextField MedName;
    private javax.swing.JTextField MedPrice;
    private javax.swing.JTextField MedQty;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton UpdateBin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
