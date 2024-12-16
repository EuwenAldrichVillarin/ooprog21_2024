
package finalscourtquest;
   
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author euwen
 */
public class PaymentMethod extends javax.swing.JFrame {
    
    private float tprice;
    private int pph;
   
    private int hoursDiff;
    private float tF;
    private String user;
    private String courtname;
    private Date date;
    /**
     * Creates new form PaymentMethod
     */
    public PaymentMethod() {
        initComponents();
        Icon i= Gcash.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(Gcash.getWidth(),Gcash.getHeight(),Image.SCALE_SMOOTH);
        Gcash.setIcon (new ImageIcon(image)); 
        
        Icon o= PayPal.getIcon();
        ImageIcon icon1 = (ImageIcon)o;
        Image image1 = icon1.getImage().getScaledInstance(PayPal.getWidth(),PayPal.getHeight(),Image.SCALE_SMOOTH);
        PayPal.setIcon (new ImageIcon(image1)); 
        
        
    }

    public void setPrice(int PricePerHour){
        this.pph = PricePerHour;
        Price.setText(String.valueOf(pph));
    }
    
    
    public void setTotalPrice(float TotalPrice){
        this.tprice=TotalPrice;
        TPrice.setText(String.valueOf(tprice));
    }
    
    public void setHours(int timeDiff){
        this.hoursDiff = timeDiff;
        Hours.setText(String.valueOf(hoursDiff));
    }
    public void setTransactionFee(float tFee){
        this.tF = tFee;
        TransactionFee.setText(String.valueOf(tF));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRoundAll1 = new finalscourtquest.PanelRoundAll();
        PricePerHourlbl = new javax.swing.JLabel();
        GcashPanel = new finalscourtquest.PanelRoundAll();
        Gcash = new javax.swing.JLabel();
        PaypalPanel = new finalscourtquest.PanelRoundAll();
        PayPal = new javax.swing.JLabel();
        PricePerHourlbl3 = new javax.swing.JLabel();
        TotalPricelbl = new javax.swing.JLabel();
        TPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Hours = new javax.swing.JLabel();
        TransactionFee = new javax.swing.JLabel();
        PricePerHourlbl2 = new javax.swing.JLabel();
        PricePerHourlbl1 = new javax.swing.JLabel();
        CourtNamelbl = new javax.swing.JLabel();
        Courtname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRoundAll1.setBackground(new java.awt.Color(255, 255, 255));

        PricePerHourlbl.setText("PRICE PER HOUR:");

        GcashPanel.setBackground(new java.awt.Color(255, 255, 255));

        Gcash.setBackground(new java.awt.Color(255, 255, 255));
        Gcash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GcashIcon.png"))); // NOI18N
        Gcash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GcashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GcashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GcashMouseExited(evt);
            }
        });

        javax.swing.GroupLayout GcashPanelLayout = new javax.swing.GroupLayout(GcashPanel);
        GcashPanel.setLayout(GcashPanelLayout);
        GcashPanelLayout.setHorizontalGroup(
            GcashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GcashPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Gcash, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        GcashPanelLayout.setVerticalGroup(
            GcashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GcashPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(Gcash, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        Gcash.getAccessibleContext().setAccessibleDescription("");

        PaypalPanel.setBackground(new java.awt.Color(255, 255, 255));

        PayPal.setBackground(new java.awt.Color(255, 255, 255));
        PayPal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Paypal.png"))); // NOI18N
        PayPal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayPalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PayPalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PayPalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PaypalPanelLayout = new javax.swing.GroupLayout(PaypalPanel);
        PaypalPanel.setLayout(PaypalPanelLayout);
        PaypalPanelLayout.setHorizontalGroup(
            PaypalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
            .addGroup(PaypalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaypalPanelLayout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(PayPal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );
        PaypalPanelLayout.setVerticalGroup(
            PaypalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PaypalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaypalPanelLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(PayPal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
                    .addGap(41, 41, 41)))
        );

        PricePerHourlbl3.setFont(new java.awt.Font("Roboto Bk", 0, 48)); // NOI18N
        PricePerHourlbl3.setText("COURTQUEST");

        TotalPricelbl.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        TotalPricelbl.setText("TOTAL PRICE:");

        TPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TPrice.setText("1000");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("TRANSACTION FEE (2%) :");

        Price.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Price.setText("200");

        Hours.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Hours.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Hours.setText("1");

        TransactionFee.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TransactionFee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TransactionFee.setText("20");

        PricePerHourlbl2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        PricePerHourlbl2.setText("PRICE PER HOUR:");

        PricePerHourlbl1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        PricePerHourlbl1.setText("HOURS RENTED:");

        CourtNamelbl.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        CourtNamelbl.setText("COURTNAME:");

        Courtname.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Courtname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Courtname.setText("NAME");

        javax.swing.GroupLayout panelRoundAll1Layout = new javax.swing.GroupLayout(panelRoundAll1);
        panelRoundAll1.setLayout(panelRoundAll1Layout);
        panelRoundAll1Layout.setHorizontalGroup(
            panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundAll1Layout.createSequentialGroup()
                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoundAll1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRoundAll1Layout.createSequentialGroup()
                                .addComponent(GcashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(PaypalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PricePerHourlbl3)))
                    .addGroup(panelRoundAll1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRoundAll1Layout.createSequentialGroup()
                                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CourtNamelbl)
                                    .addGroup(panelRoundAll1Layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Price)
                                            .addComponent(Courtname)
                                            .addComponent(Hours))))
                                .addGap(430, 430, 430)
                                .addComponent(PricePerHourlbl))
                            .addGroup(panelRoundAll1Layout.createSequentialGroup()
                                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TotalPricelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(PricePerHourlbl2)
                                    .addComponent(PricePerHourlbl1))
                                .addGap(48, 48, 48)
                                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TransactionFee)
                                    .addComponent(TPrice))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRoundAll1Layout.setVerticalGroup(
            panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundAll1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(PricePerHourlbl3)
                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoundAll1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PricePerHourlbl))
                    .addGroup(panelRoundAll1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CourtNamelbl)
                            .addComponent(Courtname))))
                .addGap(8, 8, 8)
                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price)
                    .addComponent(PricePerHourlbl2))
                .addGap(30, 30, 30)
                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hours)
                    .addComponent(PricePerHourlbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TransactionFee))
                .addGap(31, 31, 31)
                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPricelbl)
                    .addComponent(TPrice))
                .addGap(48, 48, 48)
                .addGroup(panelRoundAll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GcashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaypalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );

        getContentPane().add(panelRoundAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 510, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GcashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GcashMouseExited
        Color defaultColor = Color.WHITE;
        GcashPanel.setBackground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_GcashMouseExited

    private void GcashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GcashMouseEntered
        Color hoverColor = Color.decode("#FF6600");
        GcashPanel.setBackground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_GcashMouseEntered

    private void PayPalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayPalMouseEntered
        Color hoverColor = Color.decode("#FF6600");
        PaypalPanel.setBackground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_PayPalMouseEntered

    private void PayPalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayPalMouseExited
        Color defaultColor = Color.WHITE;
        PaypalPanel.setBackground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_PayPalMouseExited

    private void GcashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GcashMouseClicked
        JOptionPane.showMessageDialog(null,"PAYMENT METHOD: GCASH \n\nTRANSACTION COMPLETE!");
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd");
        Home hm = new Home();
        hm.setVisible(true);
        setVisible(false);
        hm.setUser(user);
        Transactions transactions = Transactions.getInstance();
        transactions.AddDetailsToTable(new Object[]{
            courtname,
            sdf.format(date),
            tprice,
            "GCash"
        
        });
    }//GEN-LAST:event_GcashMouseClicked
    public void setCourtName(String cName){
    this.courtname = cName;
    Courtname.setText(courtname);
    }
    public void setDate(Date dateset){
        this.date = dateset;
    }
    private void PayPalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayPalMouseClicked
        JOptionPane.showMessageDialog(null,"PAYMENT METHOD: PAYPAL \n\nTRANSACTION COMPLETE!");
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd");
        Home hm = new Home();
        hm.setVisible(true);
        setVisible(false);
        hm.setUser(user);
        Transactions transactions = Transactions.getInstance();
        transactions.AddDetailsToTable(new Object[]{
            courtname,
            sdf.format(date),
            tprice,
            "PayPal"
        
        });
        

    }//GEN-LAST:event_PayPalMouseClicked
    public void setUser(String user){
        this.user = user;
    }
    
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
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourtNamelbl;
    private javax.swing.JLabel Courtname;
    private javax.swing.JLabel Gcash;
    private finalscourtquest.PanelRoundAll GcashPanel;
    private javax.swing.JLabel Hours;
    private javax.swing.JLabel PayPal;
    private finalscourtquest.PanelRoundAll PaypalPanel;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel PricePerHourlbl;
    private javax.swing.JLabel PricePerHourlbl1;
    private javax.swing.JLabel PricePerHourlbl2;
    private javax.swing.JLabel PricePerHourlbl3;
    private javax.swing.JLabel TPrice;
    private javax.swing.JLabel TotalPricelbl;
    private javax.swing.JLabel TransactionFee;
    private javax.swing.JLabel jLabel1;
    private finalscourtquest.PanelRoundAll panelRoundAll1;
    // End of variables declaration//GEN-END:variables
}
