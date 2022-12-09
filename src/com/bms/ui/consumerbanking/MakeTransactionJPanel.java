/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bms.ui.consumerbanking;

import com.bms.model.BankAccount;
import com.bms.model.Business;
import com.bms.model.consumerbank.Transaction;
import com.bms.model.util.Customer;
import com.bms.model.util.User;
import java.awt.CardLayout;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Shabina
 */
public class MakeTransactionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBalanceJPanel
     */
    JPanel cards;
    CardLayout cl;
    Customer customer;
    Business business;
    User loginUser;
    JSplitPane splitPane;
    Transaction transaction;
    public MakeTransactionJPanel(JPanel cards,Business business, User loginUser, JSplitPane spltPn) {
        initComponents();
        this.cards = cards;
        this.cl =  (CardLayout)cards.getLayout();
        this.business = business;
        this.loginUser = loginUser;
        this.splitPane=splitPane;
        this.transaction= new Transaction();
        
        for(BankAccount account: customer.getAccounts()){
            fromAccountCmbBx.addItem(account.toString());
        }     
          
        for(Customer customer: business.getConsumerBank().getCustomerDirectory().getCustomerDirectory()){
            if(loginUser.getPerson().equals(customer.getPerson())){
                this.customer = customer;
            }
        }
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
        destRoutingNumberLbl = new javax.swing.JLabel();
        accountBalanceField = new javax.swing.JTextField();
        recipientNameLbl = new javax.swing.JLabel();
        transactionAmountField = new javax.swing.JTextField();
        toRecipientNameField = new javax.swing.JTextField();
        transferMoneyBtn = new javax.swing.JButton();
        recipientAddressLbl = new javax.swing.JLabel();
        transferMoneyLbl1 = new javax.swing.JLabel();
        toRecipientAddressField = new javax.swing.JTextField();
        addRecipientBtn = new javax.swing.JButton();
        fromAccountLbl = new javax.swing.JLabel();
        fromAccountCmbBx = new javax.swing.JComboBox<>();
        transferMoneyLbl = new javax.swing.JLabel();
        toRoutingNumberField = new javax.swing.JTextField();
        accountIdLbl1 = new javax.swing.JLabel();
        accountBalanceLbl = new javax.swing.JLabel();
        toAccountIdField = new javax.swing.JTextField();
        transferMoneyLbl2 = new javax.swing.JLabel();

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

        destRoutingNumberLbl.setText("Routing Number:");

        recipientNameLbl.setText("Recipient Name:");

        toRecipientNameField.setEnabled(false);

        transferMoneyBtn.setBackground(new java.awt.Color(54, 33, 39));
        transferMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
        transferMoneyBtn.setText("Transfer");
        transferMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyBtnActionPerformed(evt);
            }
        });

        recipientAddressLbl.setText("Recipient Address:");

        transferMoneyLbl1.setText("Transaction Amount:");

        toRecipientAddressField.setEnabled(false);

        addRecipientBtn.setBackground(new java.awt.Color(54, 33, 39));
        addRecipientBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRecipientBtn.setText("Verify Recipient");
        addRecipientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecipientBtnActionPerformed(evt);
            }
        });

        fromAccountLbl.setText("From Account:");

        fromAccountCmbBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromAccountCmbBxActionPerformed(evt);
            }
        });

        transferMoneyLbl.setText("From:");

        accountIdLbl1.setText("Account Number:");

        accountBalanceLbl.setText("Account Balance:");

        transferMoneyLbl2.setText("To:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addComponent(transferMoneyLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transferMoneyField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(transferMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fromAccountLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromAccountCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accountBalanceLbl)
                        .addGap(39, 39, 39)
                        .addComponent(accountBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
=======
                        .addComponent(transferMoneyLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
>>>>>>> c216c88da0b71bf98438ec698029507d041b07de
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(transferMoneyLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transactionAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transferMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(recipientNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(toRecipientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(recipientAddressLbl)
                                .addGap(34, 34, 34)
                                .addComponent(toRecipientAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(accountIdLbl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(toAccountIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fromAccountLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fromAccountCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(transferMoneyLbl2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(accountBalanceLbl)
                                        .addGap(39, 39, 39)
                                        .addComponent(accountBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(destRoutingNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(toRoutingNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addRecipientBtn)))
                        .addGap(34, 34, 34))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {accountIdLbl1, fromAccountLbl, recipientNameLbl, transferMoneyLbl, transferMoneyLbl1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transferMoneyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fromAccountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromAccountCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(transferMoneyLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(accountIdLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toAccountIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountBalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destRoutingNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(toRoutingNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addComponent(addRecipientBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(recipientNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toRecipientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toRecipientAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(recipientAddressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transferMoneyLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transactionAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(transferMoneyBtn)))
                .addGap(41, 41, 41))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
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

    private void transferMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyBtnActionPerformed
        this.transaction.setTransactionAmount(Integer.parseInt(transactionAmountField.getText()));
        this.transaction.setTimestamp(new Date(System.currentTimeMillis()));
        //add function to remove and add money
        transaction.execute();
        JOptionPane.showMessageDialog(this,"Money has been Transferred.");

    }//GEN-LAST:event_transferMoneyBtnActionPerformed

    private void addRecipientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecipientBtnActionPerformed
        for( BankAccount account: business.getAccountDirectory().getBankAccountDirectory()){
            if(toAccountIdField.getText().equals(account.getAccountId())){
                if(toRoutingNumberField.getText().equals(account.getRoutingNumber())){
                    toRecipientNameField.setText(account.getCustomer().getPerson().getFirstName()+" "+account.getCustomer().getPerson().getLastName());
                    toRecipientAddressField.setText(account.getCustomer().getPerson().getAddress());
                    this.transaction.setToAccount(account);
                }
            }
        
        }
        toRoutingNumberField.getText();
                
    }//GEN-LAST:event_addRecipientBtnActionPerformed

    private void fromAccountCmbBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromAccountCmbBxActionPerformed
        // TODO add your handling code here:
        int accountid=Integer.parseInt(fromAccountCmbBx.getSelectedItem().toString());
        for(BankAccount account: customer.getAccounts()){
            if((Integer.toString(account.getAccountId())).equals(accountid)){
                accountBalanceField.setText(Integer.toString(account.getCurrentBalance()));
                this.transaction.setFromAccount(account);
            }
        }
    }//GEN-LAST:event_fromAccountCmbBxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountBalanceField;
    private javax.swing.JLabel accountBalanceLbl;
    private javax.swing.JLabel accountIdLbl1;
    private javax.swing.JButton addRecipientBtn;
    private javax.swing.JLabel destRoutingNumberLbl;
    private javax.swing.JComboBox<String> fromAccountCmbBx;
    private javax.swing.JLabel fromAccountLbl;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homePanel1;
    private javax.swing.JPanel homePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel makeTransactionsLbl;
    private javax.swing.JLabel recipientAddressLbl;
    private javax.swing.JLabel recipientNameLbl;
    private javax.swing.JTextField toAccountIdField;
    private javax.swing.JTextField toRecipientAddressField;
    private javax.swing.JTextField toRecipientNameField;
    private javax.swing.JTextField toRoutingNumberField;
    private javax.swing.JTextField transactionAmountField;
    private javax.swing.JButton transferMoneyBtn;
    private javax.swing.JLabel transferMoneyLbl;
    private javax.swing.JLabel transferMoneyLbl1;
    private javax.swing.JLabel transferMoneyLbl2;
    private javax.swing.JLabel viewAccountsLbl;
    private javax.swing.JLabel viewProfileLbl;
    // End of variables declaration//GEN-END:variables
}
