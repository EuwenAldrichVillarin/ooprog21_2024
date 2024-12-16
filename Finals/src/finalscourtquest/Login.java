/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalscourtquest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
 * @author euwen
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new finalscourtquest.PanelRound();
        Title = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        Usernamelbl = new javax.swing.JLabel();
        Passwordlbl = new javax.swing.JLabel();
        Usernamefld = new finalscourtquest.TextField();
        Nextbtn = new finalscourtquest.MyButton();
        HaveAccount = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Passwordfld = new finalscourtquest.Passwordfield();
        Home = new finalscourtquest.MyButton();
        ShowPass = new javax.swing.JCheckBox();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(22, 22, 22));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Basketball", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText(" COURT QUEST");
        panelRound1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 70));

        Login.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        panelRound1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 22));

        Usernamelbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        Usernamelbl.setText("Username");
        panelRound1.add(Usernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        Passwordlbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        Passwordlbl.setText("Password");
        panelRound1.add(Passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        Usernamefld.setBackground(new java.awt.Color(204, 204, 204));
        Usernamefld.setFont(new java.awt.Font("Roboto Lt", 1, 12)); // NOI18N
        Usernamefld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamefldActionPerformed(evt);
            }
        });
        panelRound1.add(Usernamefld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 239, 40));

        Nextbtn.setBorder(null);
        Nextbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arroww.png"))); // NOI18N
        Nextbtn.setBorderColor(new java.awt.Color(255, 152, 0));
        Nextbtn.setColorClick(new java.awt.Color(255, 153, 51));
        Nextbtn.setColorOver(new java.awt.Color(255, 204, 51));
        Nextbtn.setRadius(100);
        Nextbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextbtnMouseEntered(evt);
            }
        });
        Nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextbtnActionPerformed(evt);
            }
        });
        panelRound1.add(Nextbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 40, 40));

        HaveAccount.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        HaveAccount.setForeground(new java.awt.Color(51, 51, 255));
        HaveAccount.setText("Don't have an account?");
        HaveAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HaveAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HaveAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HaveAccountMouseExited(evt);
            }
        });
        panelRound1.add(HaveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparentcourt (1).png"))); // NOI18N
        panelRound1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        Passwordfld.setBackground(new java.awt.Color(204, 204, 204));
        Passwordfld.setFont(new java.awt.Font("Roboto Lt", 0, 12)); // NOI18N
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
        panelRound1.add(Passwordfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 240, 40));

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
        panelRound1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        ShowPass.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ShowPass.setForeground(new java.awt.Color(255, 255, 255));
        ShowPass.setText("Show Password");
        ShowPass.setFocusable(false);
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        panelRound1.add(ShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 550));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login Bg.png"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextbtnMouseEntered
        Color hoverColor = Color.ORANGE;
        Nextbtn.setForeground(hoverColor);
        Nextbtn.setBackground(hoverColor);
    }//GEN-LAST:event_NextbtnMouseEntered

    private void NextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextbtnActionPerformed
        String Username,Password,query,passDb=null,user=null;
        String SUrl, SUser,SPass;
        SUrl = "jdbc:MySQL://localhost:3306/user_database";
        SUser="root";
        SPass = "";
        int notFound = 0;
        
        try {
            Class.forName("com.mysql.cj.jbdc.Driver");
            
            
        }catch(Exception e){
            try {
                Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
                Statement st = con.createStatement();
                if("".equals(Usernamefld.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Username is required!", "ERROR", JOptionPane.ERROR_MESSAGE);}
                else if("".equals(Passwordfld.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Password is required!", "ERROR", JOptionPane.ERROR_MESSAGE);}
                else {
                Username=Usernamefld.getText();
                Password=Passwordfld.getText();

                query = "SELECT * FROM users WHERE userName = '"+Username+"'";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()){
                    passDb=rs.getString("Password");
                    user = rs.getString("Username");
                    notFound=1;
                }
                if(notFound==1&&Password.equals(passDb)){
                    Home hm = new Home();
                    hm.setUser(user);
                    hm.setVisible(true);
                    setVisible(false);
                }else{
                 showMessageDialog(null,"Incorrect Credentials");
                }
                
                Usernamefld.setText("");
                Passwordfld.setText("");
               
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_NextbtnActionPerformed

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

    private void UsernamefldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernamefldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernamefldActionPerformed

    private void HaveAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HaveAccountMouseClicked
        SignUp su = new SignUp();
        su.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HaveAccountMouseClicked

    private void PasswordfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordfldActionPerformed

    private void PasswordfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordfldKeyPressed
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
         Nextbtn.doClick();
    }       
    }//GEN-LAST:event_PasswordfldKeyPressed

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Welcome wc = new Welcome();
        setVisible(false);
        wc.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
         if (ShowPass.isSelected()) {
                    Passwordfld.setEchoChar((char) 0);
                } else {
                    Passwordfld.setEchoChar('*');
                }
    }//GEN-LAST:event_ShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel HaveAccount;
    private finalscourtquest.MyButton Home;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Logo;
    private finalscourtquest.MyButton Nextbtn;
    private finalscourtquest.Passwordfield Passwordfld;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel Title;
    private finalscourtquest.TextField Usernamefld;
    private javax.swing.JLabel Usernamelbl;
    private finalscourtquest.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
