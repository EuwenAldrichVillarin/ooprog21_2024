package finalscourtquest;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Home extends javax.swing.JFrame {
   
   private static final String[][] images = {
        {"Mandaue1.jpg","Talisay1.jpg","CebuCity1.png"},
        {"Mandaue2.jpg","Talisay2.jpg","CebuCity2.png"},
        {"Mandaue3.jpg","Talisay3.jpg","CebuCity3.jpg"},
        {"Mandaue4.png","Talisay4.jpg","CebuCity4.png"}
    };
     public static int currentPlaceIndex = 0;
       private static final String[][] imageTexts = {
        {"Eduardo Cabahug Basketball Court", "House of Curry Basketball Court", "Judaya's Sports Compound","Urban DECA Homes Basketball Court"},
        {"San Jose Village Court", "Talisay Sports Complex", "Tabunok Sports Complex","San Isidro Talisay Activity Center"},
        {"Casals Village Basketball Court", "El Dorado Basketball Court", "Pasil Sports Complex","Visayan Glass Basketball Gym"},
        
    };
       private static final String[] citiesText = {"Mandaue","Talisay","Cebu City"};
    private String usernamee;
   
    public Home() {
        initComponents();
        loadImage();
        Icon i= Logo.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(Logo.getWidth(),Logo.getHeight(),Image.SCALE_SMOOTH);
        Logo.setIcon (new ImageIcon(image)); 
        
        Icon o= Logo1.getIcon();
        ImageIcon icon1 = (ImageIcon)o;
        Image image1 = icon1.getImage().getScaledInstance(Logo1.getWidth(),Logo1.getHeight(),Image.SCALE_SMOOTH);
        Logo1.setIcon (new ImageIcon(image1)); 
        
    }
    private void loadImage() {
        
        if (currentPlaceIndex >= 0 && currentPlaceIndex < images.length) {
            Place1img.setIcon(new ImageIcon(getClass().getResource("/Images/" + images[0][currentPlaceIndex])));
            Place2img.setIcon(new ImageIcon(getClass().getResource("/Images/" + images[1][currentPlaceIndex])));
            Place3img.setIcon(new ImageIcon(getClass().getResource("/Images/" + images[2][currentPlaceIndex])));
            Place4img.setIcon(new ImageIcon(getClass().getResource("/Images/" + images[3][currentPlaceIndex])));
            place1.setText(imageTexts[currentPlaceIndex][0]);
            place2.setText(imageTexts[currentPlaceIndex][1]);
            place3.setText(imageTexts[currentPlaceIndex][2]);
            place4.setText(imageTexts[currentPlaceIndex][3]);
            Place.setText(citiesText[currentPlaceIndex]);
        }
    }
   
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavPanel = new finalscourtquest.PanelBottomRound();
        Logout = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        CPhrase = new javax.swing.JLabel();
        AboutUs = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Socialslbl1 = new javax.swing.JLabel();
        AboutUs2 = new javax.swing.JLabel();
        Main = new finalscourtquest.PanelBottomRound();
        Place1 = new finalscourtquest.PanelRoundAll();
        Place1img = new javax.swing.JLabel();
        Place4 = new finalscourtquest.PanelRoundAll();
        Place4img = new javax.swing.JLabel();
        Place2 = new finalscourtquest.PanelRoundAll();
        Place2img = new javax.swing.JLabel();
        Place3 = new finalscourtquest.PanelRoundAll();
        Place3img = new javax.swing.JLabel();
        Nextbtn = new finalscourtquest.MyButton();
        Backbtn = new finalscourtquest.MyButton();
        AboutUs3 = new javax.swing.JLabel();
        Place = new javax.swing.JLabel();
        place1 = new javax.swing.JLabel();
        place2 = new javax.swing.JLabel();
        place3 = new javax.swing.JLabel();
        place4 = new javax.swing.JLabel();

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

        AboutUs.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        AboutUs.setForeground(new java.awt.Color(255, 153, 0));
        AboutUs.setText("HOME");
        AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUsMouseExited(evt);
            }
        });
        NavPanel.add(AboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 35, 50, -1));

        Username.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        NavPanel.add(AboutUs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 35, 80, -1));

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 90));

        Main.setBackground(new java.awt.Color(22, 22, 22));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Place1.setBackground(new java.awt.Color(255, 153, 0));
        Place1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Place1img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place1imgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place1imgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place1imgMouseExited(evt);
            }
        });
        Place1.add(Place1img, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 190, 190));

        Main.add(Place1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, 220));

        Place4.setBackground(new java.awt.Color(255, 153, 0));
        Place4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Place4img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place4imgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place4imgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place4imgMouseExited(evt);
            }
        });
        Place4.add(Place4img, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 190, 190));

        Main.add(Place4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 220, 220));

        Place2.setBackground(new java.awt.Color(255, 153, 0));
        Place2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Place2img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place2imgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place2imgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place2imgMouseExited(evt);
            }
        });
        Place2.add(Place2img, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 190, 190));

        Main.add(Place2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 220, 220));

        Place3.setBackground(new java.awt.Color(255, 153, 0));
        Place3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Place3img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Place3img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Place3imgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Place3imgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Place3imgMouseExited(evt);
            }
        });
        Place3.add(Place3img, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 190, 190));

        Main.add(Place3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 220, 220));

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextbtnMouseExited(evt);
            }
        });
        Nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextbtnActionPerformed(evt);
            }
        });
        Main.add(Nextbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 230, 40, 40));

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
        Main.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 40));

        AboutUs3.setFont(new java.awt.Font("Roboto Cn", 1, 48)); // NOI18N
        AboutUs3.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs3.setText("RENT A VENUE");
        AboutUs3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUs3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUs3MouseExited(evt);
            }
        });
        Main.add(AboutUs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 290, -1));

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

        place1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        place1.setForeground(new java.awt.Color(255, 255, 255));
        place1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        place1.setText("Place1");
        place1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                place1MouseClicked(evt);
            }
        });
        Main.add(place1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 300, 20));

        place2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        place2.setForeground(new java.awt.Color(255, 255, 255));
        place2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        place2.setText("Place1");
        Main.add(place2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 300, 20));

        place3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        place3.setForeground(new java.awt.Color(255, 255, 255));
        place3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        place3.setText("Place1");
        Main.add(place3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 300, 20));

        place4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        place4.setForeground(new java.awt.Color(255, 255, 255));
        place4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        place4.setText("Place1");
        Main.add(place4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 290, 20));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1160, 490));

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
        
    }//GEN-LAST:event_CPhraseMouseEntered

    private void CPhraseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPhraseMouseExited
        
    }//GEN-LAST:event_CPhraseMouseExited

    private void AboutUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseEntered
        
    }//GEN-LAST:event_AboutUsMouseEntered

    private void AboutUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseExited
       
    }//GEN-LAST:event_AboutUsMouseExited

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

    private void NextbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextbtnMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_NextbtnMouseEntered

    private void NextbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextbtnMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_NextbtnMouseExited

    private void NextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextbtnActionPerformed
        if(currentPlaceIndex < images[0].length-1){
             currentPlaceIndex++;
         }else{
             currentPlaceIndex =0;
         }
         loadImage();
    }//GEN-LAST:event_NextbtnActionPerformed

    private void BackbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseEntered
        
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BackbtnMouseEntered

    private void BackbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_BackbtnMouseExited

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
         if (currentPlaceIndex > 0) {
            currentPlaceIndex--;
        } else {
            currentPlaceIndex = images[0].length - 1;
        }
        loadImage();
    }//GEN-LAST:event_BackbtnActionPerformed

    private void AboutUs3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs3MouseEntered

    private void AboutUs3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUs3MouseExited

    private void PlaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceMouseEntered

    private void PlaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceMouseExited

    private void AboutUs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUs2MouseClicked
        AboutUs au = new AboutUs();
        au.setVisible(true);
        setVisible(false);
        au.setUser(usernamee);
    }//GEN-LAST:event_AboutUs2MouseClicked

    private void Socialslbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Socialslbl1MouseClicked
        Transactions tn = Transactions.getInstance();
        tn.setVisible(true);
        setVisible(false);
        tn.setUsername(usernamee);
    }//GEN-LAST:event_Socialslbl1MouseClicked
    public String getUser(){
        return usernamee;
    }
    private void Place1imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place1imgMouseClicked
        getUser();
        if(place1.getText().contains("Eduardo")){
          String add = "135 A.Cabahug, Mandaue City, Cebu";
          Information it = new Information(0,0);
          it.setPrice(250);
          it.setVisible(true);
          it.setAdd(add);
          setVisible(false);
          it.setCourtName("Eduardo Cabahug Basketball Court");
          it.setUsername(usernamee);
        }
        if(place1.getText().contains("Jose")){
          String add = "Bliss Housing Complex, Talisay";
          Information it = new Information(0,1);
          it.setPrice(320);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("San Jose Village Court");
          it.setUsername(usernamee);
        }
        if(place1.getText().contains("Casals")){
          String add =  "Cebu City, 6000 Cebu";
          Information it = new Information(0,2);
          it.setPrice(200);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("Casals Village Basketball Court");
          it.setUsername(usernamee);
        }
            
    }//GEN-LAST:event_Place1imgMouseClicked

    private void place1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_place1MouseClicked
        
    }//GEN-LAST:event_place1MouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Welcome wc = new Welcome();
        wc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

    private void Place2imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place2imgMouseClicked
        if(place2.getText().contains("House")){
          String add ="A. S. Fortuna St, Mandaue City, Cebu";
          Information it = new Information(1,0);
          it.setPrice(420);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("House of Curry Basketball Court");
          it.setUsername(usernamee);
        }
        if(place2.getText().contains("Talisay Sports")){
           String add ="UH, V.H.Garces, Poblacion, Talisay";
          Information it = new Information(1,1);
          it.setPrice(250);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("Talisay Sports Complex");
          it.setUsername(usernamee);
        }
        if(place2.getText().contains("Dorado")){
          String add ="Cebu City, 6000 Cebu";
          Information it = new Information(1,2);
          it.setPrice(310);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("El Dorado Basketball Court");
          it.setUsername(usernamee);
        }
    }//GEN-LAST:event_Place2imgMouseClicked

    private void Place3imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place3imgMouseClicked
        if(place3.getText().contains("Judaya")){
          String add ="Labogon Rd, Mandaue City, 6014 Cebu";
          Information it = new Information(2,0);
          it.setPrice(175);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("Judaya's Sports Compound");
          it.setUsername(usernamee);
        }
        if(place3.getText().contains("Tabunok")){
          String add ="Talisay, Cebu";
          Information it = new Information(2,1);
          it.setPrice(225);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("Tabunok Sports Complex");
          it.setUsername(usernamee);
        }
        if(place3.getText().contains("Pasil")){
          String add ="Cebu City, 6000 Cebu";
          Information it = new Information(2,2);
          it.setPrice(250);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("Pasil Sports Complex");
          it.setUsername(usernamee);
        }
    }//GEN-LAST:event_Place3imgMouseClicked

    private void Place4imgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place4imgMouseEntered
        Color hoverColor = Color.RED;
        Place4.setBackground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place4imgMouseEntered

    private void Place4imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place4imgMouseClicked
        if(place4.getText().contains("Urban")){
          String add ="Main Street, Urban DECA Homes, Mandaue City, Cebu";
          Information it = new Information(3,0);
          it.setVisible(true);
          it.setAdd(add);
          it.setPrice(320);
          setVisible(false);
          it.setCourtName("Urban DECA Homes Basketball Court");
          it.setUsername(usernamee);
        }
        if(place4.getText().contains("San Isidro")){
          String add ="Antuwanga, Talisay, Cebu"; 
          Information it = new Information(3,1);
          it.setPrice(275);
          it.setAdd(add);
          it.setVisible(true);
          setVisible(false);
          it.setCourtName("San Isidro Talisay Activity Center");
          it.setUsername(usernamee);
        }
        if(place4.getText().contains("Visayan")){
          String add ="Hipolito St, Cebu City, 6000 Cebu";
          Information it = new Information(3,2);
          it.setVisible(true);
          it.setPrice(275);
          it.setAdd(add);
          setVisible(false);
          it.setCourtName("Visayan Glass Basketball Gym");
          it.setUsername(usernamee);
        }    }//GEN-LAST:event_Place4imgMouseClicked

    private void Place1imgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place1imgMouseEntered
        Color hoverColor = Color.RED;
        Place1.setBackground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place1imgMouseEntered

    private void Place1imgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place1imgMouseExited
        Color defaultColor = Color.decode("#FF9900");
        Place1.setBackground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_Place1imgMouseExited

    private void Place2imgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place2imgMouseEntered
         Color hoverColor = Color.RED;
        Place2.setBackground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place2imgMouseEntered

    private void Place2imgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place2imgMouseExited
        Color defaultColor = Color.decode("#FF9900");
        Place2.setBackground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_Place2imgMouseExited

    private void Place3imgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place3imgMouseEntered
        Color hoverColor = Color.RED;
        Place3.setBackground(hoverColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Place3imgMouseEntered

    private void Place3imgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place3imgMouseExited
         Color defaultColor = Color.decode("#FF9900");
        Place3.setBackground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_Place3imgMouseExited

    private void Place4imgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Place4imgMouseExited
        Color defaultColor = Color.decode("#FF9900");
        Place4.setBackground(defaultColor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_Place4imgMouseExited
    public void setUser(String name){
        this.usernamee=name;
        Username.setText(name);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUs;
    private javax.swing.JLabel AboutUs2;
    private javax.swing.JLabel AboutUs3;
    private finalscourtquest.MyButton Backbtn;
    private javax.swing.JLabel CPhrase;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logout;
    private finalscourtquest.PanelBottomRound Main;
    private finalscourtquest.PanelBottomRound NavPanel;
    private finalscourtquest.MyButton Nextbtn;
    private javax.swing.JLabel Place;
    private finalscourtquest.PanelRoundAll Place1;
    private javax.swing.JLabel Place1img;
    private finalscourtquest.PanelRoundAll Place2;
    private javax.swing.JLabel Place2img;
    private finalscourtquest.PanelRoundAll Place3;
    private javax.swing.JLabel Place3img;
    private finalscourtquest.PanelRoundAll Place4;
    private javax.swing.JLabel Place4img;
    private javax.swing.JLabel Socialslbl1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel place1;
    private javax.swing.JLabel place2;
    private javax.swing.JLabel place3;
    private javax.swing.JLabel place4;
    // End of variables declaration//GEN-END:variables
}
