/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalscourtquest;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author euwen
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        Icon i= Logo.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(Logo.getWidth(),Logo.getHeight(),Image.SCALE_SMOOTH);
        Logo.setIcon (new ImageIcon(image)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavPanel = new finalscourtquest.PanelBottomRound();
        Socialslbl = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Loginlbl = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        CPhrase = new javax.swing.JLabel();
        AboutUs = new javax.swing.JLabel();
        Signupbtn1 = new finalscourtquest.MyButton();
        AboutUs4 = new javax.swing.JLabel();
        panelBottomRound1 = new finalscourtquest.PanelBottomRound();
        Title3 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        Signupbtn = new finalscourtquest.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavPanel.setBackground(new java.awt.Color(36, 40, 43));
        NavPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Socialslbl.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Socialslbl.setForeground(new java.awt.Color(255, 255, 255));
        Socialslbl.setText("OUR SOCIALS");
        Socialslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SocialslblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SocialslblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SocialslblMouseExited(evt);
            }
        });
        NavPanel.add(Socialslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 35, 110, -1));

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

        Loginlbl.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Loginlbl.setForeground(new java.awt.Color(255, 255, 255));
        Loginlbl.setText("Login");
        Loginlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginlblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginlblMousePressed(evt);
            }
        });
        NavPanel.add(Loginlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 35, 50, -1));

        Logo.setFont(new java.awt.Font("Basketball", 2, 48)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparentcourt (1).png"))); // NOI18N
        NavPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

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

        AboutUs.setBackground(new java.awt.Color(255, 153, 0));
        AboutUs.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs.setText("HOME");
        AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUsMouseExited(evt);
            }
        });
        NavPanel.add(AboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 35, 80, -1));

        Signupbtn1.setBackground(new java.awt.Color(255, 204, 0));
        Signupbtn1.setBorder(null);
        Signupbtn1.setText("Get Started");
        Signupbtn1.setBorderColor(new java.awt.Color(255, 204, 0));
        Signupbtn1.setBorderPainted(false);
        Signupbtn1.setColor(new java.awt.Color(255, 204, 0));
        Signupbtn1.setColorClick(new java.awt.Color(255, 204, 0));
        Signupbtn1.setColorOver(new java.awt.Color(255, 204, 51));
        Signupbtn1.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        Signupbtn1.setRadius(20);
        Signupbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Signupbtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Signupbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Signupbtn1MouseExited(evt);
            }
        });
        Signupbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signupbtn1ActionPerformed(evt);
            }
        });
        NavPanel.add(Signupbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 120, 30));

        AboutUs4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs4.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs4.setText("ABOUT US");
        AboutUs4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUs4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs4MouseExited(evt);
            }
        });
        NavPanel.add(AboutUs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 35, 80, -1));

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 90));

        panelBottomRound1.setBackground(new java.awt.Color(22, 22, 22));
        panelBottomRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title3.setFont(new java.awt.Font("Roboto Bk", 1, 48)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("near you with ease");
        Title3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Title3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Title3MouseExited(evt);
            }
        });
        panelBottomRound1.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 430, -1));

        Title2.setBackground(new java.awt.Color(255, 102, 0));
        Title2.setFont(new java.awt.Font("Roboto Bk", 1, 48)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 102, 0));
        Title2.setText("Basketball Court");
        Title2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Title2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Title2MouseExited(evt);
            }
        });
        panelBottomRound1.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 380, -1));

        Title4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("Start now and make every game count!");
        Title4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Title4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Title4MouseExited(evt);
            }
        });
        panelBottomRound1.add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 300, -1));

        Title1.setFont(new java.awt.Font("Roboto Bk", 1, 48)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Book a ");
        Title1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Title1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Title1MouseExited(evt);
            }
        });
        panelBottomRound1.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 220, -1));

        Signupbtn.setBackground(new java.awt.Color(255, 204, 0));
        Signupbtn.setBorder(null);
        Signupbtn.setText("Get Started");
        Signupbtn.setBorderColor(new java.awt.Color(255, 204, 0));
        Signupbtn.setBorderPainted(false);
        Signupbtn.setColor(new java.awt.Color(255, 204, 0));
        Signupbtn.setColorClick(new java.awt.Color(255, 204, 0));
        Signupbtn.setColorOver(new java.awt.Color(255, 204, 51));
        Signupbtn.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        Signupbtn.setRadius(20);
        Signupbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupbtnMouseExited(evt);
            }
        });
        Signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbtnActionPerformed(evt);
            }
        });
        panelBottomRound1.add(Signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 120, 30));

        getContentPane().add(panelBottomRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1160, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginlblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginlblMousePressed
        Login lg = new Login();
        lg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LoginlblMousePressed

    private void LoginlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginlblMouseExited
        Color defaultColor = Color.WHITE;
        Loginlbl.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_LoginlblMouseExited

    private void LoginlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginlblMouseEntered
        Color hoverColor = Color.BLUE;
        Loginlbl.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LoginlblMouseEntered

    private void TitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseExited
      
    }//GEN-LAST:event_TitleMouseExited

    private void TitleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseEntered
        
    }//GEN-LAST:event_TitleMouseEntered

    private void SocialslblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SocialslblMouseExited
        Color defaultColor = Color.WHITE;
        Socialslbl.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_SocialslblMouseExited

    private void SocialslblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SocialslblMouseEntered
        Color hoverColor = Color.BLUE;
        Socialslbl.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_SocialslblMouseEntered

    private void SignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignupbtnActionPerformed

    private void SignupbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupbtnMouseExited
        Color defaultColor = Color.BLACK;
        Signupbtn.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_SignupbtnMouseExited

    private void SignupbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupbtnMouseEntered
        Color hoverColor = Color.WHITE;
        Signupbtn.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_SignupbtnMouseEntered

    private void SignupbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupbtnMouseClicked
        SignUp su = new SignUp();
        su.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SignupbtnMouseClicked

    private void CPhraseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPhraseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CPhraseMouseEntered

    private void CPhraseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPhraseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CPhraseMouseExited

    private void Title4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title4MouseEntered
        
    }//GEN-LAST:event_Title4MouseEntered

    private void Title4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title4MouseExited
        
    }//GEN-LAST:event_Title4MouseExited

    private void Title3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Title3MouseEntered

    private void Title3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Title3MouseExited

    private void Title2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Title2MouseEntered

    private void Title2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Title2MouseExited

    private void AboutUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseEntered
        
    }//GEN-LAST:event_AboutUsMouseEntered

    private void AboutUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseExited
        
    }//GEN-LAST:event_AboutUsMouseExited

    private void Title1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Title1MouseEntered

    private void Title1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Title1MouseExited

    private void Signupbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signupbtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Signupbtn1MouseClicked

    private void Signupbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signupbtn1MouseEntered
         Color defaultColor = Color.WHITE;
        Signupbtn1.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Signupbtn1MouseEntered

    private void Signupbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signupbtn1MouseExited
         Color defaultColor = Color.BLACK;
        Signupbtn1.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_Signupbtn1MouseExited

    private void Signupbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signupbtn1ActionPerformed
        SignUp su = new SignUp();
        su.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Signupbtn1ActionPerformed

    private void AboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseClicked
   
      
    }//GEN-LAST:event_AboutUsMouseClicked

    private void SocialslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SocialslblMouseClicked
        OurSocials os = new OurSocials();
        setVisible(false);
        os.setVisible(true);
    }//GEN-LAST:event_SocialslblMouseClicked

    private void AboutUs4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs4MouseEntered
        Color hoverColor = Color.BLUE;
        AboutUs4.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AboutUs4MouseEntered

    private void AboutUs4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs4MouseExited
        Color defaultColor = Color.WHITE;
        AboutUs4.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AboutUs4MouseExited

    private void AboutUs4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs4MouseClicked
         AboutUsNA abn = new AboutUsNA();
       abn.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_AboutUs4MouseClicked

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUs;
    private javax.swing.JLabel AboutUs4;
    private javax.swing.JLabel CPhrase;
    private javax.swing.JLabel Loginlbl;
    private javax.swing.JLabel Logo;
    private finalscourtquest.PanelBottomRound NavPanel;
    private finalscourtquest.MyButton Signupbtn;
    private finalscourtquest.MyButton Signupbtn1;
    private javax.swing.JLabel Socialslbl;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private finalscourtquest.PanelBottomRound panelBottomRound1;
    // End of variables declaration//GEN-END:variables
}
