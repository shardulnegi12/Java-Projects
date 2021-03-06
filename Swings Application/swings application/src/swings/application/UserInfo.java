/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swings.application;

import database.InsertUserInfo;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mukesh Arya
 */
public class UserInfo extends javax.swing.JFrame {

    /**
     * Creates new form UserInfo
     */
    public UserInfo() {
        initComponents();
        //loginIdExists.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        loginId = new javax.swing.JTextField();
        loginIdExists = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        profileImage = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText(" User Register ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User-Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name :-");

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email :- ");

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Contact :-");

        contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gender :- ");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setSelected(true);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address :- ");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Login Id :-");

        loginId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        loginIdExists.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginIdExists.setForeground(new java.awt.Color(255, 0, 0));
        loginIdExists.setText("* login id exists");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Password :-");

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 51, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 51, 204));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        profileImage.setToolTipText("set profile image");
        profileImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        profileImage.setPreferredSize(new java.awt.Dimension(100, 100));
        profileImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submit)
                        .addGap(130, 130, 130)
                        .addComponent(reset))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contact)
                                    .addComponent(email)
                                    .addComponent(name)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(female)
                                        .addGap(0, 60, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginIdExists, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginIdExists)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(reset))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void profileImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileImageMouseClicked
        // TODO add your handling code here:
        
        FileDialog fileDialog = new FileDialog(this);
        fileDialog.setVisible(true);
        
        String name =fileDialog.getFile();
        
        String directroy =fileDialog.getDirectory();
        
        imageLocation = directroy+name;
        
        if(!imageLocation.equals("a")){
        
            if(imageLocation.endsWith("jpg") || imageLocation.endsWith("png")){
            
                //profileImage.setIcon(new ImageIcon(imageLocation));
     
                profileImage.setIcon(new ImageIcon(new ImageIcon(imageLocation).getImage().getScaledInstance(98, 98, Image.SCALE_DEFAULT)));
            }
            
        }
        
        
        
    }//GEN-LAST:event_profileImageMouseClicked

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
        // TODO add your handling code here:
        
        int key = evt.getKeyChar();
        
        if(key<48 || key>57){
        
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_contactKeyTyped

    private void submitActionPerformed(java.awt.event.ActionEvent evt){
    
      if(isValidate()){
      
          int a = InsertUserInfo.inserUserInfo(userDetails);
          
          if(a>0){
              JOptionPane.showMessageDialog(this, "Register Successful");
          }else{
          
              JOptionPane.showMessageDialog(this, "Plz try again");
          }
      
      }
        
        
    }
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt){
    
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loginId;
    private javax.swing.JLabel loginIdExists;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel profileImage;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
    private String imageLocation="a";
    private HashMap<String,String> userDetails = new HashMap<>();

    private boolean isValidate() {
        
        String name = this.name.getText().trim();
        String email = this.email.getText().trim();
        String contact = this.contact.getText().trim();
        String gander = "";
        
        if(male.isSelected()){
            gander="M";
        }else{
            gander="F";
        }
        
        String address = this.address.getText();
        
        String loginId = this.loginId.getText().trim();
        
        String password = this.password.getText();
        
        if(name.isEmpty() || name.length()<3){
        
            JOptionPane.showMessageDialog(this, "Plz enter valid name");
            this.name.setText("\r");
            
            return false;
        }else if(email.isEmpty() || email.length()<5){
        
            JOptionPane.showMessageDialog(this, "Plz enter valid email");
            this.email.setText("\r");
            
            return false;      
        }else if(contact.isEmpty() || contact.length()<10){
        
            JOptionPane.showMessageDialog(this, "Plz enter valid contact");
            this.contact.setText("\r");
            
            return false;
        }else if(loginId.isEmpty() || loginId.length()<5){
        
            JOptionPane.showMessageDialog(this, "Plz enter valid login id");
            this.loginId.setText("\r");
            
            return false;
        
        }else if(address.isEmpty() || address.length()<10){
        
            JOptionPane.showMessageDialog(this, "Plz enter valid address");
            this.address.setText("\r");
            
            return false;
        }else if(password.isEmpty() || password.length()<5){
        
            JOptionPane.showMessageDialog(this, "Plz enter valid password");
            this.password.setText("\r");
            
            return false;
        }else if(imageLocation.equals("a")){
        
            JOptionPane.showMessageDialog(this, "Plz choose image");
        
            return false;
        }
        else{
            
            userDetails.put("name", name);
            userDetails.put("email", email);
            userDetails.put("contact",contact);
            userDetails.put("gender", gander);
            userDetails.put("address", address);
            userDetails.put("login-id", loginId);
            userDetails.put("password",password);
            userDetails.put("image",imageLocation);
        return true;
        }
    
    
    }

}
