/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swings;

import com.database.InsertUserInfo;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Danish
 */
public class UserRegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form UserRegisterForm
     */
    public UserRegisterForm() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        profileImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        selectCountry = new javax.swing.JComboBox();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        loginId = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        repassword = new javax.swing.JPasswordField();
        accept = new javax.swing.JCheckBox();
        register = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        firstName.setText("Enter Your First Name");
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameKeyTyped(evt);
            }
        });

        lastName.setText("Enter Your Last Name");
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameKeyTyped(evt);
            }
        });

        profileImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/profile.jpg"))); // NOI18N
        profileImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileImageMouseClicked(evt);
            }
        });

        jLabel1.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Female");

        selectCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Country", "India", "Nepal", "Pakistan", "US", "UK" }));

        contact.setText("Enter Your Contact");
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });

        email.setText("Enter Your Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        loginId.setText("Enter Your Login Id");
        loginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIdActionPerformed(evt);
            }

            private void loginIdActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        loginId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginIdKeyTyped(evt);
            }
        });

        password.setText("Enter Your Password");
        password.setEchoChar('@');
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

        repassword.setText("Enter Repassword");
        repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repasswordActionPerformed(evt);
            }
        });
        repassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                repasswordKeyTyped(evt);
            }
        });

        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setForeground(new java.awt.Color(0, 0, 255));
        register.setText("Register");
        register.setEnabled(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(selectCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(lastName)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton2)))
                                    .addGap(50, 50, 50)
                                    .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(contact)
                                .addComponent(email)
                                .addComponent(loginId)
                                .addComponent(password)
                                .addComponent(repassword))
                            .addComponent(accept)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(register)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)))
                    .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selectCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void repasswordActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        if(validation()){
        
            int a = InsertUserInfo.insertUserInfo(userInfo);
            
            if(a>0){
                JOptionPane.showMessageDialog(this, "Register");
            }else{
                JOptionPane.showMessageDialog(this, "Plz try again");
            }
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void profileImageMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        
        FileDialog imageChooser = new FileDialog(this);
        
        imageChooser.setVisible(true);
        
        imagePath =imageChooser.getDirectory()+imageChooser.getFile();
        //as / is already added

        if(!imagePath.equals("a")){
        
            profileImage.setIcon(new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(98, 98, Image.SCALE_DEFAULT)));
            
        }
        
        
    }                                         

    private void firstNameKeyTyped(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        
        String text = firstName.getText();
        
        if(text.equalsIgnoreCase("Enter Your First Name")){
        
            firstName.setText("");
        }else if(text.isEmpty()){
            
                firstName.setText("Enter Your First Name");
        }
        
    }                                  

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
        
      int key = (int)evt.getKeyChar();
      
      if(key<48 || key>57){
         Toolkit.getDefaultToolkit().beep();
            evt.consume();
         
      }
        
        
        String text = contact.getText();
        
    
        
            if(text.equalsIgnoreCase("enter your contact")){
        
                contact.setText("");
            
            }else if(text.isEmpty()){
        
                 contact.setText("Enter Your Contact");
            }
        
        
        
    }                                

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        
        
            register.setEnabled(accept.isSelected());
        
    }                                      

    private void lastNameKeyTyped(java.awt.event.KeyEvent evt) {                                  
        // TODO add your handling code here:
        String text= lastName.getText();
        
        if(text.equalsIgnoreCase("Enter Your Last Name")){
            lastName.setText("");
        }else if(text.isEmpty()){
            lastName.setText("Enter Your Last Name");
        }
    }                                 

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {                               
        // TODO add your handling code here:
        String text=email.getText();
        
        if(text.equalsIgnoreCase("Enter Your Email")){
            email.setText("");
        }else if(text.isEmpty()){
            email.setText("Enter Your Email");
        }
    }                              

    private void loginIdKeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
        String text=loginId.getText();
          
        if(text.equalsIgnoreCase("Enter Your Login Id")){
            loginId.setText("");
        }else if(text.isEmpty()){
             loginId.setText("Enter Your Login Id");
        }
    }                                

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {                                  
        // TODO add your handling code here:
        String text=password.getText();
          
        if(text.equalsIgnoreCase("Enter Your Password")){
            password.setText("");
        }else if(text.isEmpty()){
             password.setText("Enter Your Password");
        }
    }                                 

    private void repasswordKeyTyped(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
        String text=repassword.getText();
          
        if(text.equalsIgnoreCase("Enter Repassword")){
            repassword.setText("");
        }else if(text.isEmpty()){
             repassword.setText("Enter Repassword");
        }
    }                                                                       

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox accept;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField loginId;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel profileImage;
    private javax.swing.JButton register;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JComboBox selectCountry;
    // End of variables declaration                   
    private String imagePath="a";
    //private ArrayList<String> userInfo;
    private HashMap<String,String>userInfo;
    
    

    private boolean validation() {
     
        String firstName = this.firstName.getText();
        String lastName = this.lastName.getText();
        String imagePath = this.imagePath;
        String contact = this.contact.getText();
        String email = this.email.getText();
        String loginId =this.loginId.getText();
        String password = this.password.getText();
        String rePassword = this.repassword.getText();
        String gender;
        String country =this.selectCountry.getSelectedItem().toString();
        
        if(jRadioButton1.isSelected()){
            gender="Male";
        }else{
        
            gender = "Female";
        }
        if(firstName.equalsIgnoreCase("enter your first name") || firstName.length()<4){
        
            JOptionPane.showMessageDialog(this, "Enter Valid first Name");
            return false;
        }else if(lastName.equalsIgnoreCase("Enter your last name") || lastName.length()<3){
        
            JOptionPane.showMessageDialog(this, "Enter Valid last name");
            return false;
        }else if(country.equalsIgnoreCase("select country")){
            JOptionPane.showMessageDialog(this, "Please Select your Country");
            return false;
        }else if(contact.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter valid phone number of 10 digits");
            return false;
        }else if(!(email.indexOf('@')>=3 && (email.indexOf('.')-(email.indexOf('@'))>=3) && ((email.length() - email.indexOf('.'))>=3))){
           
            JOptionPane.showMessageDialog(this,"Enter valid email address");
            return false;
        }else if(!password.equals(rePassword) || password.length()<7){
            
            JOptionPane.showMessageDialog(this, "Password does not match or it is less than 7 digits");
            return false;
        }
          
        else{
        
                userInfo = new HashMap<>();
                
                userInfo.put("first-name", firstName);
                userInfo.put("last-name", lastName);
                userInfo.put("contact",contact);
                userInfo.put("email",email);
                userInfo.put("login-id",loginId);
                userInfo.put("password",password);
                userInfo.put("gender",gender);
                userInfo.put("country",country);
                userInfo.put("image-path",imagePath);
                
            return true;
        }
        
    }    	
     
}
    

