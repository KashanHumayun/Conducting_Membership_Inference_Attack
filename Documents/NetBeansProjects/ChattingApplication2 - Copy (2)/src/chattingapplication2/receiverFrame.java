/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chattingapplication2;

import static chattingapplication2.LoginFrame.connection;
import static chattingapplication2.LoginFrame.resultSet;
import static chattingapplication2.LoginFrame.statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author khan
 */
public class receiverFrame extends javax.swing.JFrame {

    private final String user;
public static Connection connection = null;
public static Statement statement;
public static ResultSet resultSet;
    /**
     * Creates new form receiverFrame
     */
    public receiverFrame(String user) throws ClassNotFoundException, SQLException {
        this.user=user;
        Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6588731",
                "sql6588731", "ivhiPFkH3N");
            
            statement = connection.createStatement();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ipTxt = new javax.swing.JTextField();
        rcvrTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Enter IP(Server):");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Enter receiver Name:");

        ipTxt.setBackground(new java.awt.Color(153, 153, 255));
        ipTxt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ipTxt.setForeground(new java.awt.Color(255, 255, 255));
        ipTxt.setBorder(null);

        rcvrTxt.setBackground(new java.awt.Color(153, 153, 255));
        rcvrTxt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        rcvrTxt.setBorder(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(ipTxt)
                    .addComponent(rcvrTxt)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcvrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(!rcvrTxt.getText().isEmpty()&&!ipTxt.getText().toString().isEmpty()){
            int namecount=0;
                String query="Select * from Customer where _Username= \""+rcvrTxt.getText().toString()+"\";";
                try {
                    resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        namecount++;
                    }
                }    catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                   // Logger.getLogger(SignUpFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(namecount==0){
                    JOptionPane.showMessageDialog(null, "Invalid Name! Please Enter a valid name.");
                    rcvrTxt.setText("");
                }
            
            String IP=ipTxt.getText().toString();
            String msg="";
            if(namecount!=0){
            Client c=new Client(user,IP,rcvrTxt.getText().toString());
            query="Select * from Message where User1= \""+user+"\" and User2=\""+rcvrTxt.getText().toString()+"\";";
            int count3=0;    
            try {
                    resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        
                        msg=msg+"\n"+resultSet.getString("Message");
                        count3++;
                    }
                }    catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            if(count3==0){
                String User1=user, User2=rcvrTxt.getText().toString(), newmsg="";
             
//            JOptionPane.showMessageDialog(null,"User_ID :\t" + User_ID
//                                   + "\t_Username:\t" + _Username + "\tPassword:\t"+_Password+"\tGender\t"+_Gender+"\tEmail\t"+_Email);
            //JOptionPane.showMessageDialog(null,"INSERT INTO Message (User1,User2,Message)"+ "VALUES(\""+User1+"\",\""+User2+"\""+",\""+newmsg+"\");");
            query="INSERT INTO Message (User1,User2,Message)"+ "VALUES(\""+User1+"\",\""+User2+"\""+",\""+newmsg+"\");";
            statement.executeUpdate(query);
            }
            //JOptionPane.showMessageDialog(null,msg);
            c.setTxtField(msg); 
            c.setVisible(true);
            this.dispose();
            }
            }
            else JOptionPane.showMessageDialog(null, "Please enter all Fields!");
        } catch (Exception ex) {
            Logger.getLogger(receiverFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(receiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new receiverFrame("kashan").setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(receiverFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(receiverFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ipTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField rcvrTxt;
    // End of variables declaration//GEN-END:variables
}
