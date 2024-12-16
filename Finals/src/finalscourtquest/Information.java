package finalscourtquest;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Information extends javax.swing.JFrame {
    private int pcr;
    private static final String[][] images = {
        {"Mandaue1.jpg","Talisay1.jpg","CebuCity1.png"},
        {"Mandaue2.jpg","Talisay2.jpg","CebuCity2.png"},
        {"Mandaue3.jpg","Talisay3.jpg","CebuCity3.jpg"},
        {"Mandaue4.png","Talisay4.jpg","CebuCity4.png"}
    };
     public static int currentPlaceIndex;
       
    private String userification;
    private String cName;
    public Information(int pass, int passed) {
        initComponents();
   
        Icon i= Logo.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(Logo.getWidth(),Logo.getHeight(),Image.SCALE_SMOOTH);
        Logo.setIcon (new ImageIcon(image)); 
        
        Icon o= Logo1.getIcon();
        ImageIcon icon1 = (ImageIcon)o;
        Image image1 = icon1.getImage().getScaledInstance(Logo1.getWidth(),Logo1.getHeight(),Image.SCALE_SMOOTH);
        Logo1.setIcon (new ImageIcon(image1)); 
        loadImage(pass,passed);
    }
    public void setUsername(String User){
        this.userification = User;
        Username.setText(User);
    }
     private void loadImage(int pass, int passed) {
            Courtpic.setIcon(new ImageIcon(getClass().getResource("/ImagePrev/" + images[pass][passed])));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavPanel = new finalscourtquest.PanelBottomRound();
        Logout = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        CPhrase = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Socialslbl1 = new javax.swing.JLabel();
        AboutUs4 = new javax.swing.JLabel();
        Main = new finalscourtquest.PanelBottomRound();
        panelRoundAll1 = new finalscourtquest.PanelRoundAll();
        Courtpic = new javax.swing.JLabel();
        Courtname = new javax.swing.JLabel();
        Details = new finalscourtquest.PanelRoundAll();
        Price = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Pricelbl = new javax.swing.JLabel();
        Addresslbl = new javax.swing.JLabel();
        Bookbtn = new finalscourtquest.MyButton();
        Backbtn = new finalscourtquest.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavPanel.setBackground(new java.awt.Color(36, 40, 43));
        NavPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("LOGOUT");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        NavPanel.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 35, 70, -1));

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

        Logo.setFont(new java.awt.Font("Basketball", 2, 48)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User icon.png"))); // NOI18N
        NavPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 50, 50));

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
        NavPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 35, 50, -1));

        Username.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("User");
        NavPanel.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 110, 40));

        Logo1.setFont(new java.awt.Font("Basketball", 2, 48)); // NOI18N
        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Transparentcourt (1).png"))); // NOI18N
        NavPanel.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        Socialslbl1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Socialslbl1.setForeground(new java.awt.Color(255, 255, 255));
        Socialslbl1.setText("TRANSACTIONS");
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
        NavPanel.add(Socialslbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 35, 120, -1));

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
        NavPanel.add(AboutUs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 35, 80, -1));

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 90));

        Main.setBackground(new java.awt.Color(22, 22, 22));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRoundAll1.setBackground(new java.awt.Color(255, 153, 0));
        panelRoundAll1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Courtpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRoundAll1.add(Courtpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 650, 320));

        Courtname.setFont(new java.awt.Font("Roboto Cn", 0, 24)); // NOI18N
        Courtname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRoundAll1.add(Courtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 690, 70));

        Main.add(panelRoundAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 690, 410));

        Details.setBackground(new java.awt.Color(255, 153, 0));
        Details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Price.setFont(new java.awt.Font("Roboto Cn", 1, 20)); // NOI18N
        Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Price.setText("1");
        Details.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 300, 50));

        Address.setFont(new java.awt.Font("Roboto Cn", 1, 20)); // NOI18N
        Address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Address.setText("1");
        Details.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 330, 70));

        Pricelbl.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        Pricelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pricelbl.setText("Price");
        Details.add(Pricelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 300, 50));

        Addresslbl.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        Addresslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addresslbl.setText("Address");
        Details.add(Addresslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 190, 70));

        Main.add(Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 330, 240));

        Bookbtn.setBackground(new java.awt.Color(255, 204, 0));
        Bookbtn.setText("Book now");
        Bookbtn.setBorderColor(new java.awt.Color(255, 204, 0));
        Bookbtn.setColor(new java.awt.Color(255, 204, 0));
        Bookbtn.setColorClick(new java.awt.Color(255, 204, 0));
        Bookbtn.setColorOver(new java.awt.Color(255, 204, 51));
        Bookbtn.setRadius(15);
        Bookbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BookbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BookbtnMouseExited(evt);
            }
        });
        Bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookbtnActionPerformed(evt);
            }
        });
        Main.add(Bookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

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
        Main.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 40, 40));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1170, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Color hoverColor = Color.BLUE;
        Logout.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Color defaultColor = Color.WHITE;
        Logout.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_LogoutMouseExited

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
        Transactions tn = Transactions.getInstance();
        tn.setVisible(true);
        setVisible(false);
        tn.setUsername(userification);
    }//GEN-LAST:event_Socialslbl1MouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Home hm = new Home();
        hm.setVisible(true);
        setVisible(false);
        setUsername(userification);
    }//GEN-LAST:event_HomeMouseClicked

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

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Welcome wc = new Welcome();
        wc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

    private void BookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookbtnActionPerformed
    Booking bk = new Booking();
    bk.setPrice(pcr);
    bk.setUser(userification);  
    bk.setVisible(true);    
    setVisible(false);
    bk.setCourtName(cName);
    }//GEN-LAST:event_BookbtnActionPerformed

    private void BackbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseEntered

        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BackbtnMouseEntered

    private void BackbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_BackbtnMouseExited

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
        setVisible(false);
        hm.setUser(userification);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void AboutUs4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs4MouseClicked
        AboutUs au = new AboutUs();
        au.setVisible(true);
        setVisible(false);
        au.setUser(userification);
    }//GEN-LAST:event_AboutUs4MouseClicked

    private void BookbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookbtnMouseEntered
        Color hoverColor = Color.WHITE;
        Bookbtn.setForeground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BookbtnMouseEntered

    private void BookbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookbtnMouseExited
        Color defaultColor = Color.BLACK;
        Bookbtn.setForeground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_BookbtnMouseExited
   
   public void setPrice(int pc){
        this.pcr = pc;
        Price.setText(String.valueOf("P"+pc));
    }
   public int getPrice(){
       return pcr;
   }
   public void setAdd(String add){
       Address.setText(add);
   }
   public void setCourtName(String Cname){
       this.cName = Cname;
       Courtname.setText(Cname);
   }
   public String getCourtName(){
       return Courtname.getText();
   }
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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUs4;
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Addresslbl;
    private finalscourtquest.MyButton Backbtn;
    private finalscourtquest.MyButton Bookbtn;
    private javax.swing.JLabel CPhrase;
    private javax.swing.JLabel Courtname;
    private javax.swing.JLabel Courtpic;
    private finalscourtquest.PanelRoundAll Details;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logout;
    private finalscourtquest.PanelBottomRound Main;
    private finalscourtquest.PanelBottomRound NavPanel;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Pricelbl;
    private javax.swing.JLabel Socialslbl1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username;
    private finalscourtquest.PanelRoundAll panelRoundAll1;
    // End of variables declaration//GEN-END:variables

   
}
