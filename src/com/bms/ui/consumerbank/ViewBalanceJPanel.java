/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bms.ui.consumerbank;


import com.bms.model.investmentbank.AccountProfile;
import com.bms.model.investmentbank.CompanyStock;
import com.bms.model.investmentbank.CurrencyStock;
import com.bms.model.investmentbank.StockProfile;
import com.bms.ui.investmentbank.CreateAccountJPanel;
import com.bms.ui.investmentbank.InvestmentMainJPanel;
import static com.bms.ui.investmentbank.InvestmentMainJPanel.HISTORYFILEPATH;
import static com.bms.ui.investmentbank.InvestmentMainJPanel.createAllStocks;
import static com.bms.ui.investmentbank.InvestmentMainJPanel.createHistoryFiles;
import static com.bms.ui.investmentbank.InvestmentMainJPanel.deleteHistoryFiles;
import static com.bms.ui.investmentbank.InvestmentMainJPanel.recalculationLoop;
import com.bms.ui.investmentbank.MakeInvestmentJPanel;
import com.bms.ui.MainJFrame;

import com.bms.model.BankAccount;
import com.bms.model.Business;
import com.bms.model.util.Customer;
import com.bms.model.util.User;
import java.awt.CardLayout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;


import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shabina
 */
public class ViewBalanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBalanceJPanel
     */
    JPanel cards;
    CardLayout cl;
    Customer customer;
    Business business;
    User loginUser;
    JSplitPane splitPane;
    StockProfile[][] profiles;
    //AccountProfile accProfile;
    boolean created = false;
    BankAccount account;


    public ViewBalanceJPanel(JPanel cards,Business business, User loginUser, JSplitPane splitPane, JPanel panel, Customer cust) {
        initComponents();
        this.cards = cards;
        this.cl =  (CardLayout)cards.getLayout();
        this.business = business;
        this.loginUser = loginUser;
        this.splitPane=splitPane;
        this.customer = cust;
        
        accountTypeCmbBx.addItem("Checking");
        accountTypeCmbBx.addItem("Savings");
        

        /**for(Customer cust: business.getConsumerBank().getCustomerDirectory().getCustomerDirectory()){
            if(loginUser.getPerson().equals(cust.getPerson())){
                this.customer = cust;
            }
        }**/
        System.out.println("Going");

        populateAccountsTable(customer.getAccounts());

        
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
        homePanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        investLbl1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        ViewAccountJPanel = new javax.swing.JPanel();
        accountFieldsPanel = new javax.swing.JPanel();
        accountIdLbl = new javax.swing.JLabel();
        accountBalanceLbl = new javax.swing.JLabel();
        accountIdField = new javax.swing.JTextField();
        accountBalanceField = new javax.swing.JTextField();
        accountTypeLbl = new javax.swing.JLabel();
        accountTypeCmbBx = new javax.swing.JComboBox<>();
        transferMoneyBtn = new javax.swing.JButton();
        viwStatementsBtn = new javax.swing.JButton();
        viewAccountScrlPn = new javax.swing.JScrollPane();
        viewAccountsTbl = new javax.swing.JTable();
        viewAccountBtn = new javax.swing.JButton();
        StockSimulatorJPanel = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        btnName = new javax.swing.JButton();

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
                .addComponent(makeTransactionsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        homePanel2Layout.setVerticalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(makeTransactionsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome Customer!");
        jLabel10.setToolTipText("");

        homePanel3.setBackground(new java.awt.Color(54, 33, 39));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bms/UI/images/money.png"))); // NOI18N

        investLbl1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        investLbl1.setForeground(new java.awt.Color(255, 255, 255));
        investLbl1.setText("Investment Banking");
        investLbl1.setToolTipText("");
        investLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                investLbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanel3Layout = new javax.swing.GroupLayout(homePanel3);
        homePanel3.setLayout(homePanel3Layout);
        homePanel3Layout.setHorizontalGroup(
            homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(investLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        homePanel3Layout.setVerticalGroup(
            homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(investLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(homePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(homePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(homePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(homePanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        accountIdLbl.setText("Account Number:");

        accountBalanceLbl.setText("Account Balance:");

        accountTypeLbl.setText("Account Type:");

        javax.swing.GroupLayout accountFieldsPanelLayout = new javax.swing.GroupLayout(accountFieldsPanel);
        accountFieldsPanel.setLayout(accountFieldsPanelLayout);
        accountFieldsPanelLayout.setHorizontalGroup(
            accountFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(accountFieldsPanelLayout.createSequentialGroup()
                        .addComponent(accountIdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accountFieldsPanelLayout.createSequentialGroup()
                        .addComponent(accountBalanceLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountBalanceField)))
                .addGap(32, 32, 32)
                .addComponent(accountTypeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountTypeCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accountFieldsPanelLayout.setVerticalGroup(
            accountFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountFieldsPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(accountFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountIdLbl)
                    .addComponent(accountIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTypeLbl)
                    .addComponent(accountTypeCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(accountFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountBalanceLbl)
                    .addComponent(accountBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        transferMoneyBtn.setBackground(new java.awt.Color(54, 33, 39));
        transferMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
        transferMoneyBtn.setText("Transfer Money");
        transferMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyBtnActionPerformed(evt);
            }
        });

        viwStatementsBtn.setBackground(new java.awt.Color(54, 33, 39));
        viwStatementsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viwStatementsBtn.setText("View Statements");
        viwStatementsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viwStatementsBtnActionPerformed(evt);
            }
        });

        viewAccountScrlPn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        viewAccountsTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        viewAccountsTbl.setGridColor(new java.awt.Color(255, 255, 255));
        viewAccountsTbl.setRowHeight(22);
        viewAccountScrlPn.setViewportView(viewAccountsTbl);

        viewAccountBtn.setBackground(new java.awt.Color(54, 33, 39));
        viewAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewAccountBtn.setText("View Account");
        viewAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccountBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewAccountJPanelLayout = new javax.swing.GroupLayout(ViewAccountJPanel);
        ViewAccountJPanel.setLayout(ViewAccountJPanelLayout);
        ViewAccountJPanelLayout.setHorizontalGroup(
            ViewAccountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewAccountJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewAccountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewAccountJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewAccountBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewAccountJPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(viwStatementsBtn)
                        .addGap(121, 121, 121)
                        .addComponent(transferMoneyBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accountFieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAccountScrlPn, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        ViewAccountJPanelLayout.setVerticalGroup(
            ViewAccountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewAccountJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewAccountScrlPn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewAccountBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewAccountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viwStatementsBtn)
                    .addComponent(transferMoneyBtn))
                .addContainerGap())
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Please click below to use stock Simulator");

        btnName.setText("Stock Simulator");
        btnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StockSimulatorJPanelLayout = new javax.swing.GroupLayout(StockSimulatorJPanel);
        StockSimulatorJPanel.setLayout(StockSimulatorJPanelLayout);
        StockSimulatorJPanelLayout.setHorizontalGroup(
            StockSimulatorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockSimulatorJPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(StockSimulatorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StockSimulatorJPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnName)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        StockSimulatorJPanelLayout.setVerticalGroup(
            StockSimulatorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockSimulatorJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(StockSimulatorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StockSimulatorJPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnName)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLayeredPane2.setLayer(ViewAccountJPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(StockSimulatorJPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(ViewAccountJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StockSimulatorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ViewAccountJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StockSimulatorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void viewAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccountBtnActionPerformed
        int selectedRowIndex = viewAccountsTbl.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select an account to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) viewAccountsTbl.getModel();
        BankAccount account = (BankAccount) model.getValueAt(selectedRowIndex, 0);
        this.account=account;
        populateAccountFields(account);        // TODO add your handling code here:
    }//GEN-LAST:event_viewAccountBtnActionPerformed

    private void viwStatementsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viwStatementsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viwStatementsBtnActionPerformed

    private void transferMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyBtnActionPerformed
        // initiate transaction
        MakeTransactionJPanel transactionPanel = new MakeTransactionJPanel(cards, business, loginUser, splitPane, this.account, this.customer);
        cards.add(transactionPanel, "mtPanel");
        splitPane.setRightComponent(cards);
        cl.show(cards, "mtPanel");
    }//GEN-LAST:event_transferMoneyBtnActionPerformed

    private void investLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_investLbl1MouseClicked
      
            // TODO add your handling code here:
          StockSimulatorJPanel.setVisible(true);
          ViewAccountJPanel.setVisible(false);
 
    }//GEN-LAST:event_investLbl1MouseClicked

    private void btnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameActionPerformed
        
        
        try {
            //  String btnName = evt.getActionCommand();
   
            InvestmentMainJPanel window = new InvestmentMainJPanel(cards);
            //ViewBalanceJPanel customerPanel = new ViewBalanceJPanel(cards,business,loginUser,splitPane,this.controlPanel);
            //cards.add(window, "IMPanel");
            //splitPane.setRightComponent(cards);
            //cl.show(cards, "IMPanel");
        } catch (IOException ex) {
            Logger.getLogger(ViewBalanceJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StockSimulatorJPanel;
    private javax.swing.JPanel ViewAccountJPanel;
    private javax.swing.JTextField accountBalanceField;
    private javax.swing.JLabel accountBalanceLbl;
    private javax.swing.JPanel accountFieldsPanel;
    private javax.swing.JTextField accountIdField;
    private javax.swing.JLabel accountIdLbl;
    private javax.swing.JComboBox<String> accountTypeCmbBx;
    private javax.swing.JLabel accountTypeLbl;
    private javax.swing.JButton btnName;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homePanel1;
    private javax.swing.JPanel homePanel2;
    private javax.swing.JPanel homePanel3;
    private javax.swing.JLabel investLbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel makeTransactionsLbl;
    private javax.swing.JButton transferMoneyBtn;
    private javax.swing.JButton viewAccountBtn;
    private javax.swing.JScrollPane viewAccountScrlPn;
    private javax.swing.JLabel viewAccountsLbl;
    private javax.swing.JTable viewAccountsTbl;
    private javax.swing.JLabel viewProfileLbl;
    private javax.swing.JButton viwStatementsBtn;
    // End of variables declaration//GEN-END:variables

    public void populateAccountsTable(ArrayList<BankAccount> accounts) {
        DefaultTableModel model = (DefaultTableModel) viewAccountsTbl.getModel();
        model.setRowCount(0);
        
        for(BankAccount account : accounts){
            Object[] row = new Object[11];
            row[0] = account;
            row[1] = account.getAccountType();
            row[2] = account.getCurrentBalance();         
            model.addRow(row);
        }
    }

    public void populateAccountFields(BankAccount account) {
        accountIdField.setText(String.valueOf(account.getAccountId()));
        accountTypeCmbBx.setSelectedItem(account.getAccountType());
        accountBalanceField.setText(String.valueOf( account.getCurrentBalance()));
    }

}
