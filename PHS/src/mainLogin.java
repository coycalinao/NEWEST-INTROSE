/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ProgramCodes.Admin;
import ProgramCodes.Coordinator;
import ProgramCodes.Employee;
import ProgramCodes.Faculty;
import ProgramCodes.Principal;
import databaseCodes.EmployeeDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class mainLogin extends javax.swing.JFrame {
    /**
     * Creates new form mainLogin
     */
    EmployeeDAO ed = new EmployeeDAO();
    UIAdmin UIA;
    Splash UIF;
    UIPrincipal UIP;
    public mainLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        txtPWord = new javax.swing.JPasswordField();
        userName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        logIn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bLogIn = new javax.swing.JLabel();
        login_form = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 200, -1));

        txtPWord.setText("txtPWord");
        txtPWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPWordActionPerformed(evt);
            }
        });
        txtPWord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPWordFocusLost(evt);
            }
        });
        txtPWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPWordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 200, -1));

        userName.setFont(new java.awt.Font("Prestige Elite Std", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("UserID:");
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        password.setFont(new java.awt.Font("Prestige Elite Std", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        logIn.setFont(new java.awt.Font("Prestige Elite Std", 0, 28)); // NOI18N
        logIn.setForeground(new java.awt.Color(255, 255, 255));
        logIn.setText("Log in");
        getContentPane().add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Prestige Elite Std", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please fill in your Basic info:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phila-logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 120, -1));

        bLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_button.png"))); // NOI18N
        bLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainLogin.this.mouseClicked(evt);
            }
        });
        getContentPane().add(bLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        login_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_form3.png"))); // NOI18N
        login_form.setText("jLabel1");
        getContentPane().add(login_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 390, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phila_bg.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPWordActionPerformed

    private void txtPWordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWordFocusGained
        String pass = String.copyValueOf(txtPWord.getPassword());

        if (pass.equals("txtPWord")) {
            txtPWord.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtPWordFocusGained
    }
   public void LogIn()
   {
       String pass =  String.copyValueOf(txtPWord.getPassword());
       Employee emp = ed.getLoginReq(txtUsername.getText(),pass);
       if(emp!= null){
       if(emp.getPosition().equals("Administrator")){
           UIA = new UIAdmin((Admin) emp);
           UIA.setVisible(true);
       }
       else if(emp.getPosition().equals("Subject Teacher"))
       {
           UIF = new Splash((Faculty) emp);
           UIF.setVisible(true);
       }
       else if(emp.getPosition().equals("Principal")|| emp.getPosition().equals("Coordinator"))
       {
           if(emp.getPosition().equals("Principal"))
                UIP = new UIPrincipal((Principal) emp);
           else if(emp.getPosition().equals("Coordinator"))
                UIP = new UIPrincipal((Coordinator) emp);
           UIP.setVisible(true);
       }
           this.setVisible(false);
       }
       else
           JOptionPane.showMessageDialog(rootPane, "ID Number or Password is incorrect!");
   }
    private void txtPWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPWordKeyPressed
        
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){  
              LogIn();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtPWordKeyPressed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if(txtUsername.getText().equals("userid"))
            txtUsername.setText("");
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if(txtUsername.getText().equals(""))
            txtUsername.setText("userid");
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPWordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWordFocusLost
           String pass = String.copyValueOf(txtPWord.getPassword());
           if (pass.equals("")) 
            txtPWord.setText("txtPWord");    
    }//GEN-LAST:event_txtPWordFocusLost

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
                 LogIn();
    }//GEN-LAST:event_mouseClicked
    
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
            java.util.logging.Logger.getLogger(mainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bLogIn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logIn;
    private javax.swing.JLabel login_form;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txtPWord;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}