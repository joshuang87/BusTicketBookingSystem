
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Date;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author user
 */
public class BookingPage extends javax.swing.JFrame {
    
    double amount;
    double tax;
    double totalAmount;
    DecimalFormat decfor = new DecimalFormat("0.00");
    

    /**
     * Creates new form BookingPage
     */
    public BookingPage() {
        initComponents();
        
        Date nowDate = new Date();
        
        dateChooser.getJCalendar().setMinSelectableDate(nowDate);
        
        setIcon();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        destinantionSelectBox = new javax.swing.JComboBox<>();
        dateChooser = new com.toedter.calendar.JDateChooser();
        departureSelectBox = new javax.swing.JComboBox<>();
        singleButton = new javax.swing.JRadioButton();
        doubleButton = new javax.swing.JRadioButton();
        confirmButton = new javax.swing.JButton();
        stratingPointSelectBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        systemTitleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        taxField = new javax.swing.JTextField();
        totalAmountField = new javax.swing.JTextField();
        buyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Southern Bus Ticket Booking System");
        setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1190, 550));
        setName("frame0"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setText("Date of Journey :");

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel4.setText("Departure :");

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel5.setText("No. of Passengers :");

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel2.setText("Destinantion :");

        destinantionSelectBox.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        destinantionSelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Malacca", "Negeri Sembilan", "Putrajaya", "Pahang", "Selangor", "Terengganu", "Kelantan", "Perek", "Kedah", "Penang", "Perlis" }));
        destinantionSelectBox.setToolTipText("");
        destinantionSelectBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinantionSelectBoxActionPerformed(evt);
            }
        });

        dateChooser.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N

        departureSelectBox.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        departureSelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 A.M.", "8:30 A.M.", "10:45 A.M.", "1:00 P.M.", "3:30 P.M.", "5:10 P.M.", "7:20 P.M." }));
        departureSelectBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureSelectBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(singleButton);
        singleButton.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        singleButton.setText("Single");

        buttonGroup1.add(doubleButton);
        doubleButton.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        doubleButton.setText("Double");

        confirmButton.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        stratingPointSelectBox.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        stratingPointSelectBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Malacca", "Negeri Sembilan", "Putrajaya", "Pahang", "Selangor", "Terengganu", "Kelantan", "Perek", "Kedah", "Penang", "Perlis" }));

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel8.setText("From :");

        resetButton.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(destinantionSelectBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(departureSelectBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(singleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doubleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stratingPointSelectBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(confirmButton)
                .addGap(18, 18, 18)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stratingPointSelectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinantionSelectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(departureSelectBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(singleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doubleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmButton)
                    .addComponent(resetButton))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 530, 300));

        systemTitleLabel.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        systemTitleLabel.setText("  Bus Ticket Booking System");
        systemTitleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(systemTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 700, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel1.setText("Amount :");

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel6.setText("Tax :");

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel7.setText("Total Amount :");

        amountField.setText("");

        taxField.setText("");

        totalAmountField.setText("");

        buyButton.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        buyButton.setText("Buy Ticket");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amountField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(taxField)
                            .addComponent(totalAmountField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(buyButton)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(amountField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(taxField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buyButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 450, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destinantionSelectBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinantionSelectBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinantionSelectBoxActionPerformed

    private void departureSelectBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureSelectBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureSelectBoxActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        if( (stratingPointSelectBox.getSelectedIndex() == destinantionSelectBox.getSelectedIndex()) & (!(singleButton.isSelected()) & !(doubleButton.isSelected())) & (!(singleButton.isSelected()) & !(doubleButton.isSelected())) ) {
            JOptionPane.showMessageDialog(null,"Please input your booking information !!!","System Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if( (stratingPointSelectBox.getSelectedIndex() == destinantionSelectBox.getSelectedIndex()) & (dateChooser.getDate() == null) ) {
            JOptionPane.showMessageDialog(null,"Please input avilable Strating Point,Destinantion and choose a date !!!","System Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if( (!(singleButton.isSelected()) & !(doubleButton.isSelected())) & (dateChooser.getDate() == null) ){
            JOptionPane.showMessageDialog(null,"Please select number of passengers and choose a date !!!","System Error",JOptionPane.WARNING_MESSAGE);
            return;
        }        
        
        if(stratingPointSelectBox.getSelectedIndex() == destinantionSelectBox.getSelectedIndex()) {
            JOptionPane.showMessageDialog(null,"Please input avilable Strating Point and Destinantion !!!","System Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(!(singleButton.isSelected()) & !(doubleButton.isSelected())){
            JOptionPane.showMessageDialog(null,"Please select number of passengers !!!","System Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(dateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null,"Please choose a date !!!","System Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int numOfPassengers;
        
        if(singleButton.isSelected()) {
            numOfPassengers = 1;
        }
        else {
            numOfPassengers = 2;
        }
        
        if((Math.abs(destinantionSelectBox.getSelectedIndex() - stratingPointSelectBox.getSelectedIndex())) <= 4) {
            
            amount = 10 * 1 * numOfPassengers;
            tax = (amount * 5) / 100;
            totalAmount = amount + tax;
            
            String amountStr = String.valueOf(decfor.format(amount));
            String taxStr = String.valueOf(decfor.format(tax));
            String totalAmountStr = String.valueOf(decfor.format(totalAmount));
            
            amountField.setText("RM" + amountStr);
            taxField.setText("RM" + taxStr);
            totalAmountField.setText("RM" + totalAmountStr);
        }
        else if((Math.abs(destinantionSelectBox.getSelectedIndex() - stratingPointSelectBox.getSelectedIndex())) <= 8) {
            
            amount = 10* 1.7 * numOfPassengers;
            tax = (amount * 5) / 100;
            totalAmount = amount + tax;
            
            String amountStr = String.valueOf(decfor.format(amount));
            String taxStr = String.valueOf(decfor.format(tax));
            String totalAmountStr = String.valueOf(decfor.format(totalAmount));
            
            amountField.setText("RM" + amountStr);
            taxField.setText("RM" + taxStr);
            totalAmountField.setText("RM" + totalAmountStr);
        }
        else {
             
            amount = 10 * 2.3 * numOfPassengers;
            tax = (amount * 5) / 100;
            totalAmount = amount + tax;
            
            String amountStr = String.valueOf(decfor.format(amount));
            String taxStr = String.valueOf(decfor.format(tax));
            String totalAmountStr = String.valueOf(decfor.format(totalAmount));
            
            amountField.setText("RM" + amountStr);
            taxField.setText("RM" + taxStr);
            totalAmountField.setText("RM" + totalAmountStr);           
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        stratingPointSelectBox.setSelectedIndex(0);
        destinantionSelectBox.setSelectedIndex(0);
        departureSelectBox.setSelectedIndex(0);
        dateChooser.setCalendar(null);
        buttonGroup1.clearSelection();
        amountField.setText(null);
        taxField.setText(null);
        totalAmountField.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
        
        if(amountField.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null,"Please input your booking information !!!","System Error",JOptionPane.WARNING_MESSAGE);
        }
        else {
            dispose();
            ThankYouPage thanksPage = new ThankYouPage();
            thanksPage.setVisible(true);
        }
    }//GEN-LAST:event_buyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookingPage().setVisible(true);
            }
        });
    }
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(".//image//suc.png"));
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton buyButton;
    private javax.swing.JButton confirmButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JComboBox<String> departureSelectBox;
    private javax.swing.JComboBox<String> destinantionSelectBox;
    private javax.swing.JRadioButton doubleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton resetButton;
    private javax.swing.JRadioButton singleButton;
    private javax.swing.JComboBox<String> stratingPointSelectBox;
    private javax.swing.JLabel systemTitleLabel;
    private javax.swing.JTextField taxField;
    private javax.swing.JTextField totalAmountField;
    // End of variables declaration//GEN-END:variables

}
