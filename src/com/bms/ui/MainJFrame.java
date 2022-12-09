/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bms.UI;

import com.bms.UI.employeerole.LoanOfficerJPanel;
import com.bms.UI.employeerole.BankTellerJPanel;
import com.bms.model.BankAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.bms.model.Business;
import com.bms.model.util.PersonDirectory;
import com.bms.model.consumerbank.ConsumerBank;
import com.bms.model.util.Customer;
import com.bms.model.util.CustomerDirectory;
import com.bms.model.util.DBConnection;
import com.bms.model.util.Person;
import com.bms.model.util.User;
import com.bms.model.util.UserDirectory;
import com.bms.ui.consumerbanking.ViewBalanceJPanel;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ashwini
 */


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    CardLayout cl;
    JPanel cards;
    Business business;  
    public MainJFrame() {
        initComponents();
        this.cl = new CardLayout();
        this.cards = new JPanel(cl);

        controlPanel.add(cards);

        this.business = new Business();
        PersonDirectory personDirectory = this.business.getPersonDirectory();
        ConsumerBank consumerBank = this.business.getConsumerBank();
        CustomerDirectory consumerDirectory = consumerBank.getCustomerDirectory();
        /**Person person = personDirectory.addNewPerson("Ashwini", "Khedkar", "Female", "Boston",
                29, "16172384404", "anibahs@gmail.com");
        
        ConsumerBank consumerBank = this.business.getConsumerBank();
        CustomerDirectory consumerDirectory = consumerBank.getCustomerDirectory();
        Customer customer = consumerDirectory.addNewCustomer(person);
        BankAccount account = new BankAccount(customer, "Checking", "ICIC0000075", 5);
        customer.addNewBankAccount(account);
        UserDirectory userDirectory = this.business.getUserDirectory();
        User user = userDirectory.addNewUser(person, "Customer", "ashwini123".toCharArray());**/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        sidePanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        loginscreenPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        unameTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        splitPane.setDividerLocation(200);

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePanel.setBackground(new java.awt.Color(54, 33, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bms/UI/images/home.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home Page");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 40));

        regPanel.setBackground(new java.awt.Color(54, 33, 39));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bms/UI/images/register.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register");
        jLabel6.setToolTipText("");
        jLabel6.setFocusCycleRoot(true);

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(regPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, -1));

        splitPane.setLeftComponent(sidePanel);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(122, 72, 221));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Commercial Banking");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Investment Banking");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Wealth Management");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Consumer Banking");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        loginscreenPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Username: ");

        jLabel13.setText("Password: ");

        jButton1.setBackground(new java.awt.Color(54, 33, 39));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("User Role: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Customer", "BankTeller", "LoanOfficer", "WealthManager", "RelationshipManager", "BranchManager" }));

        javax.swing.GroupLayout loginscreenPanelLayout = new javax.swing.GroupLayout(loginscreenPanel);
        loginscreenPanel.setLayout(loginscreenPanelLayout);
        loginscreenPanelLayout.setHorizontalGroup(
            loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginscreenPanelLayout.createSequentialGroup()
                .addGroup(loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginscreenPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(unameTextField)
                            .addComponent(jComboBox1, 0, 1, Short.MAX_VALUE)))
                    .addGroup(loginscreenPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)))
                .addContainerGap(609, Short.MAX_VALUE))
        );
        loginscreenPanelLayout.setVerticalGroup(
            loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginscreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginscreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginscreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(loginscreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(controlPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 841, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String selectedfield = jComboBox1.getSelectedItem().toString();

        String username = unameTextField.getText();
        String password = PasswordField.getText();

        if(selectedfield.equals("BankTeller")){

            BankTellerJPanel bpanel = new BankTellerJPanel(cards);
            cards.add(bpanel, "BTPanel");
            
            splitPane.setRightComponent(cards);
            cl.show(cards, "BTPanel");

        }else if(selectedfield.equals("Customer")){
            User loginUser;
            DBConnection con = new DBConnection();
            String query  = "Select username, password, type from users where username=? and password=?";
            ArrayList<Object> params = new ArrayList<Object>();
            params.add(username);
            params.add(password);
            try{
                ResultSet res = con.runSelect(cards, query, params, this.controlPanel);
                if(res.first()){
                    loginUser = new User(res.getString("username"),res.getString("password").toCharArray(),res.getString("type"));
                    JOptionPane.showMessageDialog(this,"You have successfully logged in");
                    
                    ViewBalanceJPanel customerPanel = new ViewBalanceJPanel(cards,business,loginUser,splitPane,this.controlPanel);
                    cards.add(customerPanel, "vbPanel");
                    splitPane.setRightComponent(cards);
                    cl.show(cards, "vbPanel");
                }else{
                    JOptionPane.showMessageDialog(this,"Wrong Username & Password");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }
        else if(selectedfield.equals("LoanOfficer")){

            LoanOfficerJPanel lpanel = new LoanOfficerJPanel(cards);
            cards.add(lpanel, "LOPanel");
            
            splitPane.setRightComponent(cards);
            cl.show(cards, "LOPanel");

        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid Username and password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        JPanel panel =(JPanel) cards.getComponent(0);
        cards.removeAll();
        cards.add(panel,"ControlPanel");
        cl.show(cards,"ControlPanel");
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel loginscreenPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel regPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField unameTextField;
    // End of variables declaration//GEN-END:variables
}
