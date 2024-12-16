package finalscourtquest;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class OurSocials extends javax.swing.JFrame {
    public OurSocials() {
        initComponents();
        Icon o= Logo1.getIcon();
        ImageIcon icon1 = (ImageIcon)o;
        Image image1 = icon1.getImage().getScaledInstance(Logo1.getWidth(),Logo1.getHeight(),Image.SCALE_SMOOTH);
        Logo1.setIcon (new ImageIcon(image1)); 
        
        Icon i= Instaicon.getIcon();
        ImageIcon icon2 = (ImageIcon)i;
        Image image2 = icon2.getImage().getScaledInstance(Instaicon.getWidth(),Instaicon.getHeight(),Image.SCALE_SMOOTH);
        Instaicon.setIcon (new ImageIcon(image2)); 
        
        Icon p= Fbicon.getIcon();
        ImageIcon icon3 = (ImageIcon)p;
        Image image3 = icon3.getImage().getScaledInstance(Fbicon.getWidth(),Fbicon.getHeight(),Image.SCALE_SMOOTH);
        Fbicon.setIcon (new ImageIcon(image3)); 
    }
   
   
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavPanel = new finalscourtquest.PanelBottomRound();
        Title = new javax.swing.JLabel();
        CPhrase = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Socialslbl1 = new javax.swing.JLabel();
        AboutUs2 = new javax.swing.JLabel();
        Loginlbl = new javax.swing.JLabel();
        Signupbtn1 = new finalscourtquest.MyButton();
        Main = new finalscourtquest.PanelBottomRound();
        Place = new javax.swing.JLabel();
        INSTAGRAM = new javax.swing.JLabel();
        Instaicon = new javax.swing.JLabel();
        INSTAGRAM1 = new javax.swing.JLabel();
        Fbicon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        Logo1.setFont(new java.awt.Font("Basketball", 2, 48)); // NOI18N
        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparentcourt (1).png"))); // NOI18N
        NavPanel.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        Socialslbl1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Socialslbl1.setForeground(new java.awt.Color(255, 153, 0));
        Socialslbl1.setText("OUR SOCIALS");
        Socialslbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Socialslbl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Socialslbl1MouseExited(evt);
            }
        });
        NavPanel.add(Socialslbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 35, 110, -1));

        AboutUs2.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs2.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs2.setText("ABOUT US");
        AboutUs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUs2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs2MouseExited(evt);
            }
        });
        NavPanel.add(AboutUs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 35, 80, -1));

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

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 90));

        Main.setBackground(new java.awt.Color(22, 22, 22));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Place.setFont(new java.awt.Font("Roboto Cn", 1, 24)); // NOI18N
        Place.setForeground(new java.awt.Color(255, 255, 255));
        Place.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Place.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlaceMouseExited(evt);
            }
        });
        Main.add(Place, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 450, 190, -1));

        INSTAGRAM.setFont(new java.awt.Font("Roboto Cn", 0, 36)); // NOI18N
        INSTAGRAM.setForeground(new java.awt.Color(255, 153, 0));
        INSTAGRAM.setText("@COURTQUEST");
        Main.add(INSTAGRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        Instaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Instagram.png"))); // NOI18N
        Main.add(Instaicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 100));

        INSTAGRAM1.setFont(new java.awt.Font("Roboto Cn", 0, 36)); // NOI18N
        INSTAGRAM1.setForeground(new java.awt.Color(255, 153, 0));
        INSTAGRAM1.setText("@COURTQUEST");
        Main.add(INSTAGRAM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        Fbicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Facebook.png"))); // NOI18N
        Main.add(Fbicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 100, 100));

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

    private void Socialslbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Socialslbl1MouseEntered
        
    }//GEN-LAST:event_Socialslbl1MouseEntered

    private void Socialslbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Socialslbl1MouseExited
   
    }//GEN-LAST:event_Socialslbl1MouseExited

    private void AboutUs2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs2MouseEntered
     Color hoverColor = Color.BLUE;
        AboutUs2.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AboutUs2MouseEntered

    private void AboutUs2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs2MouseExited
      Color defaultColor = Color.WHITE;
        AboutUs2.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AboutUs2MouseExited

    private void PlaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceMouseExited

    private void PlaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceMouseEntered

    private void AboutUs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs2MouseClicked
        AboutUsNA au = new AboutUsNA();
        au.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AboutUs2MouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Welcome wc = new Welcome();
        wc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

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
            java.util.logging.Logger.getLogger(OurSocials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OurSocials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OurSocials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OurSocials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OurSocials().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUs2;
    private javax.swing.JLabel CPhrase;
    private javax.swing.JLabel Fbicon;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel INSTAGRAM;
    private javax.swing.JLabel INSTAGRAM1;
    private javax.swing.JLabel Instaicon;
    private javax.swing.JLabel Loginlbl;
    private javax.swing.JLabel Logo1;
    private finalscourtquest.PanelBottomRound Main;
    private finalscourtquest.PanelBottomRound NavPanel;
    private javax.swing.JLabel Place;
    private finalscourtquest.MyButton Signupbtn1;
    private javax.swing.JLabel Socialslbl1;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
