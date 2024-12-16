
package finalscourtquest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Euwen
 */
public class SignUp extends javax.swing.JFrame {

   
    public SignUp() {
       
       
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpPanel = new finalscourtquest.PanelRound();
        Home = new finalscourtquest.MyButton();
        SignUplbl = new javax.swing.JLabel();
        Usernamelbl = new javax.swing.JLabel();
        Usernamefld = new finalscourtquest.TextField();
        Firstnamelbl = new javax.swing.JLabel();
        Firstnamefld = new finalscourtquest.TextField();
        Lastnamelbl = new javax.swing.JLabel();
        Lastnamefld = new finalscourtquest.TextField();
        Emaillbl = new javax.swing.JLabel();
        Emailfld = new finalscourtquest.TextField();
        Passwordlbl = new javax.swing.JLabel();
        CPasswordlbl = new javax.swing.JLabel();
        HaveAccount = new javax.swing.JLabel();
        Nextbtn = new finalscourtquest.MyButton();
        Namelbl1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Passwordfld = new finalscourtquest.Passwordfield();
        CPasswordfld = new finalscourtquest.Passwordfield();
        BgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUpPanel.setBackground(new java.awt.Color(22, 22, 22));
        SignUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBorder(null);
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arrowww.png"))); // NOI18N
        Home.setBorderColor(new java.awt.Color(255, 152, 0));
        Home.setColorClick(new java.awt.Color(255, 153, 51));
        Home.setColorOver(new java.awt.Color(255, 204, 51));
        Home.setRadius(100);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        SignUpPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        SignUplbl.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        SignUplbl.setForeground(new java.awt.Color(255, 255, 255));
        SignUplbl.setText("Sign Up");
        SignUpPanel.add(SignUplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 22));

        Usernamelbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        Usernamelbl.setText("Username");
        SignUpPanel.add(Usernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        Usernamefld.setBackground(new java.awt.Color(204, 204, 204));
        Usernamefld.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        Usernamefld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamefldActionPerformed(evt);
            }
        });
        Usernamefld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernamefldKeyPressed(evt);
            }
        });
        SignUpPanel.add(Usernamefld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, 310, 40));

        Firstnamelbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Firstnamelbl.setForeground(new java.awt.Color(255, 255, 255));
        Firstnamelbl.setText("Firstname");
        SignUpPanel.add(Firstnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, -1, -1));

        Firstnamefld.setBackground(new java.awt.Color(204, 204, 204));
        Firstnamefld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstnamefldMouseEntered(evt);
            }
        });
        Firstnamefld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnamefldActionPerformed(evt);
            }
        });
        Firstnamefld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FirstnamefldKeyPressed(evt);
            }
        });
        SignUpPanel.add(Firstnamefld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 315, 146, 40));

        Lastnamelbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Lastnamelbl.setForeground(new java.awt.Color(255, 255, 255));
        Lastnamelbl.setText("Lastname");
        SignUpPanel.add(Lastnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 295, -1, -1));

        Lastnamefld.setBackground(new java.awt.Color(204, 204, 204));
        Lastnamefld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnamefldActionPerformed(evt);
            }
        });
        Lastnamefld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LastnamefldKeyPressed(evt);
            }
        });
        SignUpPanel.add(Lastnamefld, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 315, 150, 40));

        Emaillbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Emaillbl.setForeground(new java.awt.Color(255, 255, 255));
        Emaillbl.setText("Email");
        SignUpPanel.add(Emaillbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 345, -1, -1));

        Emailfld.setBackground(new java.awt.Color(204, 204, 204));
        Emailfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailfldActionPerformed(evt);
            }
        });
        Emailfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailfldKeyPressed(evt);
            }
        });
        SignUpPanel.add(Emailfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 365, 310, 40));

        Passwordlbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        Passwordlbl.setText("Password");
        SignUpPanel.add(Passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        CPasswordlbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        CPasswordlbl.setForeground(new java.awt.Color(255, 255, 255));
        CPasswordlbl.setText("Confirm Password");
        SignUpPanel.add(CPasswordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        HaveAccount.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        HaveAccount.setForeground(new java.awt.Color(51, 51, 255));
        HaveAccount.setText("I already have an account");
        HaveAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HaveAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HaveAccountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HaveAccountMousePressed(evt);
            }
        });
        SignUpPanel.add(HaveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        Nextbtn.setBorder(null);
        Nextbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arroww.png"))); // NOI18N
        Nextbtn.setBorderColor(new java.awt.Color(255, 152, 0));
        Nextbtn.setRadius(100);
        Nextbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextbtnMouseExited(evt);
            }
        });
        Nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextbtnActionPerformed(evt);
            }
        });
        SignUpPanel.add(Nextbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 40, 40));

        Namelbl1.setFont(new java.awt.Font("Basketball", 0, 48)); // NOI18N
        Namelbl1.setForeground(new java.awt.Color(255, 255, 255));
        Namelbl1.setText(" COURT QUEST");
        SignUpPanel.add(Namelbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 260, 70));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparentcourt (1).png"))); // NOI18N
        SignUpPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        Passwordfld.setBackground(new java.awt.Color(204, 204, 204));
        Passwordfld.setName(""); // NOI18N
        Passwordfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordfldActionPerformed(evt);
            }
        });
        Passwordfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordfldKeyPressed(evt);
            }
        });
        SignUpPanel.add(Passwordfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 150, 40));

        CPasswordfld.setBackground(new java.awt.Color(204, 204, 204));
        CPasswordfld.setName(""); // NOI18N
        CPasswordfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPasswordfldActionPerformed(evt);
            }
        });
        CPasswordfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CPasswordfldKeyPressed(evt);
            }
        });
        SignUpPanel.add(CPasswordfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 150, 40));

        getContentPane().add(SignUpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 540));

        BgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        BgImage.setPreferredSize(new java.awt.Dimension(799, 405));
        getContentPane().add(BgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1170, 700));

        setSize(new java.awt.Dimension(1116, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernamefldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernamefldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernamefldActionPerformed

    private void LastnamefldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnamefldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnamefldActionPerformed

    private void NextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextbtnActionPerformed
        String userName,firstName,lastName,email,password,confirmPassword,query;
        String SUrl, SUser,SPass;
        SUrl = "jdbc:MySQL://localhost:3306/user_database";
        SUser="root";
        SPass = "";
        
        try {
            Class.forName("com.mysql.cj.jbdc.Driver");
            
            
        }catch(Exception e){
            try {
                Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
                Statement st = con.createStatement();
                if("".equals(Usernamefld.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Username is required!", "ERROR", JOptionPane.ERROR_MESSAGE);}
                else if("".equals(Firstnamefld.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "First Name is required!", "ERROR", JOptionPane.ERROR_MESSAGE);}
                else if("".equals(Lastnamefld.getText()))
                    JOptionPane.showMessageDialog(new JFrame(), "Last name is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
                else if("".equals(Emailfld.getText()))
                    JOptionPane.showMessageDialog(new JFrame(), "Email is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
                else if (!Emailfld.getText().endsWith("@gmail.com"))
                    JOptionPane.showMessageDialog(null, "Invalid Email Address");
                else if("".equals(Passwordfld.getText()))
                    JOptionPane.showMessageDialog(new JFrame(), "Password is required!", "ERROR", JOptionPane.ERROR_MESSAGE);
                else if (Passwordfld.getText().length() < 8) 
                    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long.");
                else if(!Passwordfld.getText().equals(CPasswordfld.getText()))
                    JOptionPane.showMessageDialog(new JFrame(), "Password does not Match", "ERROR", JOptionPane.ERROR_MESSAGE);
                else {
                userName=Usernamefld.getText();
                firstName=Firstnamefld.getText();
                lastName =Lastnamefld.getText();
                email=Emailfld.getText();
                password=Passwordfld.getText();
                confirmPassword=CPasswordfld.getText();
                query = "INSERT INTO users(userName,firstName,lastName,email,password,confirmPassword)"+
                        "VALUES('"+userName+"','"+firstName+"','"+lastName+"','"+email+"','"+password+"','"+confirmPassword+"')";
                st.execute(query);
                Usernamefld.setText("");
                Firstnamefld.setText("");
                Lastnamefld.setText("");
                Emailfld.setText("");
                Passwordfld.setText("");
                CPasswordfld.setText("");
                showMessageDialog(null,"Account Created Successfully");
                
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_NextbtnActionPerformed

    private void NextbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextbtnMouseEntered
        Color hoverColor = Color.ORANGE;
        Nextbtn.setForeground(hoverColor);
        Nextbtn.setBackground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_NextbtnMouseEntered

    private void EmailfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailfldActionPerformed

    private void FirstnamefldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnamefldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnamefldActionPerformed

    private void HaveAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HaveAccountMouseEntered
        Color hoverColor = Color.CYAN;
        HaveAccount.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        
    }//GEN-LAST:event_HaveAccountMouseEntered

    private void HaveAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HaveAccountMouseExited
       Color DefaultColor = Color.BLUE;
       HaveAccount.setForeground(DefaultColor);
       setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_HaveAccountMouseExited

    private void NextbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextbtnMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_NextbtnMouseExited

    private void HaveAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HaveAccountMousePressed
        Login lg = new Login();
        lg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HaveAccountMousePressed

    private void PasswordfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordfldActionPerformed

    private void CPasswordfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPasswordfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPasswordfldActionPerformed

    private void UsernamefldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernamefldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Nextbtn.doClick();
    }       
    }//GEN-LAST:event_UsernamefldKeyPressed

    private void FirstnamefldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstnamefldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnamefldMouseEntered

    private void FirstnamefldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstnamefldKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Nextbtn.doClick();
    }       
    }//GEN-LAST:event_FirstnamefldKeyPressed

    private void LastnamefldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastnamefldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Nextbtn.doClick();
    }       
    }//GEN-LAST:event_LastnamefldKeyPressed

    private void EmailfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailfldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Nextbtn.doClick();
    }       
    }//GEN-LAST:event_EmailfldKeyPressed

    private void PasswordfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordfldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Nextbtn.doClick();
    }       
    }//GEN-LAST:event_PasswordfldKeyPressed

    private void CPasswordfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPasswordfldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Nextbtn.doClick();
    }       
    }//GEN-LAST:event_CPasswordfldKeyPressed

    private void NextbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NextbtnMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Welcome wc = new Welcome();
        setVisible(false);
        wc.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

   
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BgImage;
    private finalscourtquest.Passwordfield CPasswordfld;
    private javax.swing.JLabel CPasswordlbl;
    private finalscourtquest.TextField Emailfld;
    private javax.swing.JLabel Emaillbl;
    private finalscourtquest.TextField Firstnamefld;
    private javax.swing.JLabel Firstnamelbl;
    private javax.swing.JLabel HaveAccount;
    private finalscourtquest.MyButton Home;
    private finalscourtquest.TextField Lastnamefld;
    private javax.swing.JLabel Lastnamelbl;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Namelbl1;
    private finalscourtquest.MyButton Nextbtn;
    private finalscourtquest.Passwordfield Passwordfld;
    private javax.swing.JLabel Passwordlbl;
    private finalscourtquest.PanelRound SignUpPanel;
    private javax.swing.JLabel SignUplbl;
    private finalscourtquest.TextField Usernamefld;
    private javax.swing.JLabel Usernamelbl;
    // End of variables declaration//GEN-END:variables
}
