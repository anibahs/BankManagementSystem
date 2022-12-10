/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bms.UI.employeerole;

import com.bms.model.Business;
import com.bms.model.CommercialBank.CommercialBank;
import com.bms.model.CommercialBank.Loan;
import com.bms.model.util.Customer;
import com.bms.model.util.DBConnection;
import com.bms.model.util.employeerole.LoanOfficer;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashwini
 */
public class LoanEstimatorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoanEstimatorJPanel
     */
    CommercialBank commercialbank;
    Customer customer;
    Business business;
    double loanamt;
    Loan loanapp;
    private double interestRate;
    private double month;
    private double payment;
    private double MonthlyPayment;
    JPanel cards;
    JSplitPane splitPane;
    CardLayout cl;
    
    
    public LoanEstimatorJPanel(JPanel cards, Business business,JSplitPane splitPane) {
        this.cards = cards;
        this.business = business;
        this.splitPane=splitPane;
        this.cl = (CardLayout) cards.getLayout();
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
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtLoan = new javax.swing.JTextField();
        jTxtInterest = new javax.swing.JTextField();
        jTxtNoPayment = new javax.swing.JTextField();
        jTextMonthlyPayment = new javax.swing.JTextField();
        jLoanBtnLoanCalculator = new javax.swing.JButton();
        jLoanbtnReset = new javax.swing.JButton();
        jLoanBtnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        repaymentField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(122, 72, 221));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Monthly EMI Predictor");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel2.setText("Amount of loan:");

        jLabel3.setText("Interest Rate:");

        jLabel4.setText("Number of Payments:");

        jLabel5.setText("Monthly Payment:");

        jTxtInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtInterestActionPerformed(evt);
            }
        });

        jLoanBtnLoanCalculator.setText("Loan Calculator");
        jLoanBtnLoanCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoanBtnLoanCalculatorActionPerformed(evt);
            }
        });

        jLoanbtnReset.setText("Reset");
        jLoanbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoanbtnResetActionPerformed(evt);
            }
        });

        jLoanBtnExit.setText("Exit");
        jLoanBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoanBtnExitActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "LoanAmt", "ROI", "NumberofPayments", "RepaymentLoan", "MonthlyEMI"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("TotalRepayment: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLoanBtnLoanCalculator)
                        .addGap(26, 26, 26)
                        .addComponent(jLoanbtnReset)
                        .addGap(18, 18, 18)
                        .addComponent(jLoanBtnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtLoan)
                            .addComponent(jTxtInterest)
                            .addComponent(jTxtNoPayment)
                            .addComponent(jTextMonthlyPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(repaymentField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtNoPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(repaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoanBtnLoanCalculator)
                    .addComponent(jLoanbtnReset)
                    .addComponent(jLoanBtnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLoanBtnLoanCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoanBtnLoanCalculatorActionPerformed
        // TODO add your handling code here:

        //String monthlyPayment = String.format(jTextMonthlyPayment.getText());

        if (jTxtLoan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter loan amount to borrow","Loan System", JOptionPane.INFORMATION_MESSAGE );
        }

        else
        {
            loanamt = Double.parseDouble(jTxtLoan.getText());
            
        }

        ///////////////////////////////////////////
        if (jTxtInterest.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter Interest rate","Loan System", JOptionPane.INFORMATION_MESSAGE );
        }

        else
        {
            interestRate = Double.parseDouble(jTxtInterest.getText());
        }

        //////////////////////////////////////////
        if (jTxtNoPayment.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter number of Installments","Loan System", JOptionPane.INFORMATION_MESSAGE );
        }

        else
        {
            month = Double.parseDouble(jTxtNoPayment.getText());
        }
        //////////////////////////////////////////

        
        commercialbank = new CommercialBank();
        loanapp = new Loan();
        
        loanapp.setLoan(loanamt);
        loanapp.setInterestRate(interestRate);
        loanapp.setMonth(month);
        MonthlyPayment = loanapp.CalculateMonthlyEMI(loanamt,interestRate,month);
        payment = loanapp.CalculateTotalLoanPayment(loanamt, interestRate);
        
        
        jTxtLoan.setText(String.valueOf(loanamt));
        jTxtInterest.setText(String.valueOf(interestRate));
        jTxtNoPayment.setText(String.valueOf(month));
        repaymentField.setText(String.valueOf(payment));
        jTextMonthlyPayment.setText(String.valueOf(MonthlyPayment));
        
        
        
        commercialbank.addLoan(loanapp);
        System.out.print(this.commercialbank.getLoans());
        PopulateTable(this.commercialbank.getLoans());
        
        
        /*
        jLoanReport.append("\tLoan Predictor:\n\n"+
            "Amount of Loan:\t\t" + loanamt
            + "\nInterest Rate:\t\t" + interestRate
            + "\nNumber of Installments:\t\t" + month
            + "\nTotal Loan Payment:\t\t" + payment
            + "\nPer Monthly Installment:\t\t" + MonthlyPayment
        );
        */
    }//GEN-LAST:event_jLoanBtnLoanCalculatorActionPerformed

    private void jLoanbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoanbtnResetActionPerformed
        // TODO add your handling code here:
        jTxtLoan.setText("");
        jTxtInterest.setText("");
        jTxtNoPayment.setText("");
        repaymentField.setText("");
        jTextMonthlyPayment.setText("");
    }//GEN-LAST:event_jLoanbtnResetActionPerformed

    private void jLoanBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoanBtnExitActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowindex = jTable1.getSelectedRow();
        
        double loanamt = (Double)model.getValueAt(rowindex, 0);
        double roi = (Double)model.getValueAt(rowindex, 1);
        double month = (Double)model.getValueAt(rowindex, 2);
        double totalrepay = (Double)model.getValueAt(rowindex, 3);
        double monemi = (Double)model.getValueAt(rowindex, 4);
        
        
        AddLoanstoDB(loanamt,roi,month,totalrepay,monemi);
        
        Loan loan = new Loan();
        loan.setLoan(loanamt);
        loan.setInterestRate(roi);
        loan.setMonth(month);
        loan.setPayment(totalrepay);
        loan.setMonthlyPayment(monemi);
        LoanOfficerJPanel jpanel = new LoanOfficerJPanel(cards,business,splitPane,loan);
        cards.add(jpanel, "LOPanel");
        splitPane.setRightComponent(cards);
        cl.show(cards, "LOPanel");
        //cl.previous(cards);
        
    }//GEN-LAST:event_jLoanBtnExitActionPerformed

    private void jTxtInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtInterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtInterestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLoanBtnExit;
    private javax.swing.JButton jLoanBtnLoanCalculator;
    private javax.swing.JButton jLoanbtnReset;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextMonthlyPayment;
    private javax.swing.JTextField jTxtInterest;
    private javax.swing.JTextField jTxtLoan;
    private javax.swing.JTextField jTxtNoPayment;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField repaymentField;
    // End of variables declaration//GEN-END:variables

    private void PopulateTable(ArrayList<Loan> loans) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
      
        
        for(Loan loan: loans){
            
        Object[] row = new Object[6];
        row[0] = loan.getLoan();
        row[1] = loan.getInterestRate();
        row[2] = loan.getMonth();
        row[3] = loan.getPayment();
        row[4] = loan.getMonthlyPayment();
        model.addRow(row);
    }
}

    private void AddLoanstoDB(Double loanamt,Double roi,Double month,Double repay,Double monemi) {
        
        
        ArrayList<Loan> loans = new ArrayList<Loan>();
        DBConnection con = new DBConnection();
        int loanid = 0;
        //Double loanamt = Double.parseInt
        String query = "Insert into loan (loanamt,InterestRate,NoofMonths,RepaymentTotal,MonthlyEMI,loanID) values (?,?,?,?,?,?)";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(loanamt);
        params.add(roi);
        params.add(month);
        params.add(repay);
        params.add(monemi);
        params.add(5);
        //params.add(customerAccountIds);
        con.runInsertloan(cards, query, params);
        
    }
}
