package finalscourtquest;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class AboutUsNA extends javax.swing.JFrame {
    public AboutUsNA() {
        initComponents();
        Icon o= Logo1.getIcon();
        ImageIcon icon1 = (ImageIcon)o;
        Image image1 = icon1.getImage().getScaledInstance(Logo1.getWidth(),Logo1.getHeight(),Image.SCALE_SMOOTH);
        Logo1.setIcon (new ImageIcon(image1)); 
    }
   
   
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavPanel = new finalscourtquest.PanelBottomRound();
        Title = new javax.swing.JLabel();
        CPhrase = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Socialslbl1 = new javax.swing.JLabel();
        AboutUs4 = new javax.swing.JLabel();
        Signupbtn1 = new finalscourtquest.MyButton();
        Loginlbl = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Main = new finalscourtquest.PanelBottomRound();
        AboutUs3 = new javax.swing.JLabel();
        AboutUs5 = new javax.swing.JLabel();
        AboutUs6 = new javax.swing.JLabel();
        AboutUs7 = new javax.swing.JLabel();
        AboutUs8 = new javax.swing.JLabel();
        AboutUs9 = new javax.swing.JLabel();
        AboutUs10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Logo1.setFont(new java.awt.Font("Basketball", 2, 48)); // NOI18N
        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparentcourt (1).png"))); // NOI18N
        NavPanel.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        Socialslbl1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Socialslbl1.setForeground(new java.awt.Color(255, 255, 255));
        Socialslbl1.setText("OUR SOCIALS");
        Socialslbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Socialslbl1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Socialslbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Socialslbl1MouseExited(evt);
            }
        });
        NavPanel.add(Socialslbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 35, -1, -1));

        AboutUs4.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs4.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs4.setText("ABOUT US");
        AboutUs4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs4MouseExited(evt);
            }
        });
        NavPanel.add(AboutUs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 35, 80, -1));

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

        Home.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("HOME");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        NavPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 35, 50, -1));

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 90));

        Main.setBackground(new java.awt.Color(22, 22, 22));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AboutUs3.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs3.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs3.setText("and drive of basketball players everywhere.");
        AboutUs3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs3MouseExited(evt);
            }
        });
        Main.add(AboutUs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 720, 20));

        AboutUs5.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs5.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs5.setText("At CourtQuest, we are dedicated to making basketball more accessible and convenient for");
        AboutUs5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs5MouseExited(evt);
            }
        });
        Main.add(AboutUs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 720, 20));

        AboutUs6.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs6.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs6.setText("athletes of all levels. Our mission is to help players find and book basketball courts with ease, so they");
        AboutUs6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs6MouseExited(evt);
            }
        });
        Main.add(AboutUs6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 720, 20));

        AboutUs7.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs7.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs7.setText("can focus on what truly matters—improving their game. Whether you're a seasoned pro or just");
        AboutUs7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs7MouseExited(evt);
            }
        });
        Main.add(AboutUs7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 720, 20));

        AboutUs8.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs8.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs8.setText("starting out, we provide a seamless platform to discover, reserve, and access courts in your area.");
        AboutUs8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs8MouseExited(evt);
            }
        });
        Main.add(AboutUs8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 720, 20));

        AboutUs9.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs9.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs9.setText("With a wide range of facilities to choose from, we ensure that athletes can play whenever and");
        AboutUs9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs9MouseExited(evt);
            }
        });
        Main.add(AboutUs9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 720, 20));

        AboutUs10.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs10.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs10.setText("wherever they need. At CourtQuest, we're committed to supporting the passion, dedication,");
        AboutUs10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs10MouseExited(evt);
            }
        });
        Main.add(AboutUs10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 720, 20));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1160, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      
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

    private void Socialslbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Socialslbl1MouseEntered
        Color hoverColor = Color.BLUE;
        Socialslbl1.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Socialslbl1MouseEntered

    private void Socialslbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Socialslbl1MouseExited
   Color defaultColor = Color.WHITE;
        Socialslbl1.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_Socialslbl1MouseExited

    private void Socialslbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Socialslbl1MouseClicked
        OurSocials os = new OurSocials();
        os.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Socialslbl1MouseClicked

    private void AboutUs3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs3MouseEntered

    private void AboutUs3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs3MouseExited

    private void AboutUs4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs4MouseEntered

    private void AboutUs4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs4MouseExited

    private void AboutUs5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs5MouseEntered

    private void AboutUs5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs5MouseExited

    private void AboutUs6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs6MouseEntered

    private void AboutUs6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs6MouseExited

    private void AboutUs7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs7MouseEntered

    private void AboutUs7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs7MouseExited

    private void AboutUs8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs8MouseEntered

    private void AboutUs8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs8MouseExited

    private void AboutUs9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs9MouseEntered

    private void AboutUs9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs9MouseExited

    private void AboutUs10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs10MouseEntered

    private void AboutUs10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs10MouseExited

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

    private void LoginlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginlblMouseEntered
        Color hoverColor = Color.BLUE;
        Loginlbl.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LoginlblMouseEntered

    private void LoginlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginlblMouseExited
        Color defaultColor = Color.WHITE;
        Loginlbl.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_LoginlblMouseExited

    private void LoginlblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginlblMousePressed
        Login lg = new Login();
        lg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LoginlblMousePressed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Welcome wc = new Welcome();
        wc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        Color hoverColor = Color.BLUE;
        Home.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Color defaultColor = Color.WHITE;
        Home.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_HomeMouseExited
   
   
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
            java.util.logging.Logger.getLogger(AboutUsNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUsNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUsNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUsNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUsNA().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUs10;
    private javax.swing.JLabel AboutUs3;
    private javax.swing.JLabel AboutUs4;
    private javax.swing.JLabel AboutUs5;
    private javax.swing.JLabel AboutUs6;
    private javax.swing.JLabel AboutUs7;
    private javax.swing.JLabel AboutUs8;
    private javax.swing.JLabel AboutUs9;
    private javax.swing.JLabel CPhrase;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Loginlbl;
    private javax.swing.JLabel Logo1;
    private finalscourtquest.PanelBottomRound Main;
    private finalscourtquest.PanelBottomRound NavPanel;
    private finalscourtquest.MyButton Signupbtn1;
    private javax.swing.JLabel Socialslbl1;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
