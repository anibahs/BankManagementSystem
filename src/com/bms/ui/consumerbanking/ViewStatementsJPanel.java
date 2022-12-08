/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bms.ui.consumerbanking;

/**
 *
 * @author Shabina
 */
public class ViewStatementsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBalanceJPanel
     */
    public ViewStatementsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewProfileLbl = new javax.swing.JLabel();
        homePanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        viewAccountsLbl = new javax.swing.JLabel();
        homePanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        makeTransactionsLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        transferMoneyBtn1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        transferMoneyBtn2 = new javax.swing.JButton();
        accountBalanceLbl = new javax.swing.JLabel();
        recipientLbl = new javax.swing.JLabel();
        accountBalanceField = new javax.swing.JTextField();
        transferMoneyField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        accountIdLbl = new javax.swing.JLabel();
        accoutIdField = new javax.swing.JTextField();
        transferMoneyBtn = new javax.swing.JButton();
        accountTypeLbl = new javax.swing.JLabel();
        transferMoneyLbl1 = new javax.swing.JLabel();
        accoutTypeCmbBx = new javax.swing.JComboBox<>();
        recipientCmbBx = new javax.swing.JComboBox<>();
        transferMoneyLbl = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(122, 72, 221));

        homePanel.setBackground(new java.awt.Color(54, 33, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bms/UI/images/login.png"))); // NOI18N

        viewProfileLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewProfileLbl.setForeground(new java.awt.Color(255, 255, 255));
        viewProfileLbl.setText("Profile");
        viewProfileLbl.setToolTipText("");
        viewProfileLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewProfileLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewProfileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(viewProfileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homePanel1.setBackground(new java.awt.Color(54, 33, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bms/UI/images/search.png"))); // NOI18N

        viewAccountsLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewAccountsLbl.setForeground(new java.awt.Color(255, 255, 255));
        viewAccountsLbl.setText("View Accounts");
        viewAccountsLbl.setToolTipText("");
        viewAccountsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewAccountsLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewAccountsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewAccountsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homePanel2.setBackground(new java.awt.Color(54, 33, 39));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bms/UI/images/money.png"))); // NOI18N

        makeTransactionsLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        makeTransactionsLbl.setForeground(new java.awt.Color(255, 255, 255));
        makeTransactionsLbl.setText("Withdraw/Deposit");
        makeTransactionsLbl.setToolTipText("");
        makeTransactionsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makeTransactionsLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanel2Layout = new javax.swing.GroupLayout(homePanel2);
        homePanel2.setLayout(homePanel2Layout);
        homePanel2Layout.setHorizontalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(makeTransactionsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        homePanel2Layout.setVerticalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(makeTransactionsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome Customer!");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(homePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(homePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        transferMoneyBtn1.setBackground(new java.awt.Color(54, 33, 39));
        transferMoneyBtn1.setForeground(new java.awt.Color(255, 255, 255));
        transferMoneyBtn1.setText("Add New Recipient");
        transferMoneyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyBtn1ActionPerformed(evt);
            }
        });

        jLabel17.setText("or");

        transferMoneyBtn2.setBackground(new java.awt.Color(54, 33, 39));
        transferMoneyBtn2.setForeground(new java.awt.Color(255, 255, 255));
        transferMoneyBtn2.setText("View Statements");
        transferMoneyBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyBtn2ActionPerformed(evt);
            }
        });

        accountBalanceLbl.setText("Account Balance:");

        recipientLbl.setText("Choose Recipient:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123456789", "Checking", "0"},
                {null, null, null}
            },
            new String [] {
                "Account Number", "Account Type", "Balance ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        accountIdLbl.setText("Account Number:");

        transferMoneyBtn.setBackground(new java.awt.Color(54, 33, 39));
        transferMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
        transferMoneyBtn.setText("Transfer");
        transferMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyBtnActionPerformed(evt);
            }
        });

        accountTypeLbl.setText("Account Type:");

        transferMoneyLbl1.setText("Transaction Amount:");

        accoutTypeCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "RoxburyCrossing", "Prudential", "Huntington" }));

        recipientCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "RoxburyCrossing", "Prudential", "Huntington" }));

        transferMoneyLbl.setText("Wire Transfer:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(transferMoneyLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferMoneyField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(transferMoneyBtn))
                    .addComponent(jLabel17)
                    .addComponent(transferMoneyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountIdLbl)
                            .addComponent(accountBalanceLbl)
                            .addComponent(transferMoneyLbl)
                            .addComponent(recipientLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accoutIdField)
                            .addComponent(accountBalanceField)
                            .addComponent(recipientCmbBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(accountTypeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accoutTypeCmbBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(transferMoneyBtn2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(accountIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accoutTypeCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accoutIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountBalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferMoneyBtn2))
                .addGap(18, 18, 18)
                .addComponent(transferMoneyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recipientLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recipientCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferMoneyBtn1)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferMoneyLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferMoneyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferMoneyBtn))
                .addGap(43, 43, 43))
        );

        jLayeredPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 159, 793, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewProfileLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProfileLblMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewProfileLblMouseClicked

    private void viewAccountsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAccountsLblMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_viewAccountsLblMouseClicked

    private void makeTransactionsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makeTransactionsLblMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_makeTransactionsLblMouseClicked

    private void transferMoneyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferMoneyBtn1ActionPerformed

    private void transferMoneyBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferMoneyBtn2ActionPerformed

    private void transferMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyBtnActionPerformed

    }//GEN-LAST:event_transferMoneyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountBalanceField;
    private javax.swing.JLabel accountBalanceLbl;
    private javax.swing.JLabel accountIdLbl;
    private javax.swing.JLabel accountTypeLbl;
    private javax.swing.JTextField accoutIdField;
    private javax.swing.JComboBox<String> accoutTypeCmbBx;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homePanel1;
    private javax.swing.JPanel homePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel makeTransactionsLbl;
    private javax.swing.JComboBox<String> recipientCmbBx;
    private javax.swing.JLabel recipientLbl;
    private javax.swing.JButton transferMoneyBtn;
    private javax.swing.JButton transferMoneyBtn1;
    private javax.swing.JButton transferMoneyBtn2;
    private javax.swing.JTextField transferMoneyField;
    private javax.swing.JLabel transferMoneyLbl;
    private javax.swing.JLabel transferMoneyLbl1;
    private javax.swing.JLabel viewAccountsLbl;
    private javax.swing.JLabel viewProfileLbl;
    // End of variables declaration//GEN-END:variables
}
