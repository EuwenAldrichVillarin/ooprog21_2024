
package finalscourtquest;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.*;
import java.util.Date;


public class Booking extends javax.swing.JFrame {
    private int pc;
    private String userification;
    private String courtname;
  
    public Booking() {
        initComponents();
        setupDateTimeComponents(); 
        Icon i= Logo.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(Logo.getWidth(),Logo.getHeight(),Image.SCALE_SMOOTH);
        Logo.setIcon (new ImageIcon(image)); 
        
        Icon o= Bg.getIcon();
        ImageIcon icon1 = (ImageIcon)o;
        Image image1 = icon1.getImage().getScaledInstance(Bg.getWidth(),Bg.getHeight(),Image.SCALE_SMOOTH);
        Bg.setIcon (new ImageIcon(image1)); 
        
        Icon p= UserIcon.getIcon();
        ImageIcon icon2 = (ImageIcon)p;
        Image image2 = icon2.getImage().getScaledInstance(UserIcon.getWidth(),UserIcon.getHeight(),Image.SCALE_SMOOTH);
        UserIcon.setIcon (new ImageIcon(image2)); 
        
    }
    private void setupDateTimeComponents() {
        Date initialDate = new Date(); 
        initialDate.setHours(7);  
        initialDate.setMinutes(0);
        initialDate.setSeconds(0);
        SpinnerDateModel model1 = new SpinnerDateModel(initialDate, null, null, java.util.Calendar.HOUR_OF_DAY);
        initialDate.setHours(8);
        SpinnerDateModel model2 = new SpinnerDateModel(initialDate, null, null, java.util.Calendar.HOUR_OF_DAY);
        JTextField dateTextField = (JTextField) datechooser.getDateEditor().getUiComponent();
        dateTextField.setEditable(false); 
        timeSpinnerStart.setModel(model1);
        timeSpinnerEnd.setModel(model2);
        JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(timeSpinnerStart, "HH:mm:ss");
        timeSpinnerStart.setEditor(timeEditor1);
        JTextField editorField1 = ((JSpinner.DefaultEditor) timeSpinnerStart.getEditor()).getTextField();
        editorField1.setEditable(false);
        JSpinner.DateEditor timeEditor2 = new JSpinner.DateEditor(timeSpinnerEnd, "HH:mm:ss");
        timeSpinnerEnd.setEditor(timeEditor2);
        JTextField editorField2 = ((JSpinner.DefaultEditor) timeSpinnerEnd.getEditor()).getTextField();
        editorField2.setEditable(false); 
    }
    
    public void setPrice(int price) {
        this.pc = price;
    }
    public void setUser(String User){
        this.userification = User;
        Username.setText(User);
    }
    
    public int getPrice() {
        return pc;
    }
    public void setCourtName(String cName){
        this.courtname = cName;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRoundAll1 = new finalscourtquest.PanelRoundAll();
        datechooser = new com.toedter.calendar.JDateChooser();
        timeSpinnerStart = new javax.swing.JSpinner();
        timeSpinnerEnd = new javax.swing.JSpinner();
        bookbtn = new finalscourtquest.MyButton();
        TimeInlbl = new javax.swing.JLabel();
        Timeoutlbl = new javax.swing.JLabel();
        NavPanel = new finalscourtquest.PanelBottomRound();
        Title = new javax.swing.JLabel();
        CPhrase = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        panelBottomRound1 = new finalscourtquest.PanelBottomRound();
        Backbtn = new finalscourtquest.MyButton();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRoundAll1.setBackground(new java.awt.Color(255, 153, 51));
        panelRoundAll1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datechooser.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        panelRoundAll1.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 42, 140, -1));
        panelRoundAll1.add(timeSpinnerStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 116, 160, -1));
        panelRoundAll1.add(timeSpinnerEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 176, 160, -1));

        bookbtn.setBackground(new java.awt.Color(255, 204, 0));
        bookbtn.setText("Book now");
        bookbtn.setBorderColor(new java.awt.Color(255, 204, 0));
        bookbtn.setColor(new java.awt.Color(255, 204, 0));
        bookbtn.setColorClick(new java.awt.Color(255, 204, 0));
        bookbtn.setColorOver(new java.awt.Color(255, 204, 51));
        bookbtn.setRadius(20);
        bookbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookbtnMouseExited(evt);
            }
        });
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });
        panelRoundAll1.add(bookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        TimeInlbl.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        TimeInlbl.setText("TIME OUT:");
        panelRoundAll1.add(TimeInlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        Timeoutlbl.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        Timeoutlbl.setText("TIME IN:");
        panelRoundAll1.add(Timeoutlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        getContentPane().add(panelRoundAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 290, 290));

        NavPanel.setBackground(new java.awt.Color(36, 40, 43));
        NavPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Basketball", 1, 20)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("COURTQUEST");
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TitleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TitleMouseExited(evt);
            }
        });
        NavPanel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 25, 110, -1));

        CPhrase.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        CPhrase.setForeground(new java.awt.Color(255, 255, 255));
        CPhrase.setText("Find Your Court, Play Your Game");
        CPhrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CPhraseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CPhraseMouseExited(evt);
            }
        });
        NavPanel.add(CPhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, 160, -1));

        Username.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("User");
        NavPanel.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 110, 40));

        Logo.setFont(new java.awt.Font("Basketball", 2, 48)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparentcourt (1).png"))); // NOI18N
        NavPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        UserIcon.setFont(new java.awt.Font("Basketball", 2, 48)); // NOI18N
        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User icon.png"))); // NOI18N
        NavPanel.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 50, 50));

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 90));

        panelBottomRound1.setBackground(new java.awt.Color(22, 22, 22));
        panelBottomRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backbtn.setBorder(null);
        Backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arrowww.png"))); // NOI18N
        Backbtn.setBorderColor(new java.awt.Color(255, 152, 0));
        Backbtn.setColorClick(new java.awt.Color(255, 153, 51));
        Backbtn.setColorOver(new java.awt.Color(255, 204, 51));
        Backbtn.setRadius(100);
        Backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackbtnMouseExited(evt);
            }
        });
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        panelBottomRound1.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, 40));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login Bg.png"))); // NOI18N
        panelBottomRound1.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 689, 400));

        getContentPane().add(panelBottomRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 680, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
        Date selectedDate = datechooser.getDate();
        Date selectedTimeStart = (Date) timeSpinnerStart.getValue();
        Date selectedTimeEnd = (Date) timeSpinnerEnd.getValue();
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinnerStart, "HH:mm:ss");
        timeSpinnerStart.setEditor(timeEditor);
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Please choose a date", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (selectedTimeStart == null || selectedTimeEnd == null) {
            JOptionPane.showMessageDialog(null, "Please choose both times", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            selectedDate.setHours(selectedTimeStart.getHours());
            selectedDate.setMinutes(selectedTimeStart.getMinutes());
            selectedDate.setSeconds(selectedTimeStart.getSeconds());
            Date selectedDate2 = (Date) selectedDate.clone();
            selectedDate2.setHours(selectedTimeEnd.getHours());
            selectedDate2.setMinutes(selectedTimeEnd.getMinutes());
            selectedDate2.setSeconds(selectedTimeEnd.getSeconds());
            int timeDifference = selectedDate2.getHours() - selectedDate.getHours();
           if (timeDifference <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid Time, End Time is Less or Equal to Starting Time");
            } else {
               int price = getPrice();
               int subtotal = (price*timeDifference);
               float transactionfee = (float) (subtotal*0.02);
               float total = subtotal+transactionfee;
               PaymentMethod pm = new PaymentMethod();
               pm.setVisible(true);
               setVisible(false);
               pm.setPrice(price);
               pm.setTotalPrice(total);
               pm.setHours(timeDifference);
               pm.setTransactionFee(transactionfee);
               pm.setUser(userification);
               pm.setCourtName(courtname);
               pm.setDate(selectedDate);
        }
        }
    }//GEN-LAST:event_bookbtnActionPerformed

    private void TitleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseEntered

    }//GEN-LAST:event_TitleMouseEntered

    private void TitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseExited

    }//GEN-LAST:event_TitleMouseExited

    private void CPhraseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPhraseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CPhraseMouseEntered

    private void CPhraseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPhraseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CPhraseMouseExited

    private void BackbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseEntered

        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BackbtnMouseEntered

    private void BackbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_BackbtnMouseExited

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
    Home hm = new Home();
    setVisible(false);
    hm.setVisible(true);
    hm.setUser(userification);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void bookbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookbtnMouseEntered
        Color hoverColor = Color.WHITE;
        bookbtn.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_bookbtnMouseEntered

    private void bookbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookbtnMouseExited
        Color defaultColor = Color.BLACK;
        bookbtn.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_bookbtnMouseExited

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalscourtquest.MyButton Backbtn;
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel CPhrase;
    private javax.swing.JLabel Logo;
    private finalscourtquest.PanelBottomRound NavPanel;
    private javax.swing.JLabel TimeInlbl;
    private javax.swing.JLabel Timeoutlbl;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JLabel Username;
    private finalscourtquest.MyButton bookbtn;
    private com.toedter.calendar.JDateChooser datechooser;
    private finalscourtquest.PanelBottomRound panelBottomRound1;
    private finalscourtquest.PanelRoundAll panelRoundAll1;
    private javax.swing.JSpinner timeSpinnerEnd;
    private javax.swing.JSpinner timeSpinnerStart;
    // End of variables declaration//GEN-END:variables

   
   
}
