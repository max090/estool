
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author project
 */
public class Size extends javax.swing.JFrame {
    JFrame frame=new JFrame();
Connection con=null;
ResultSet re=null;
PreparedStatement pst =null;
    /**
     * Creates new form Info
     */
    public Size() {
        initComponents();
        con =sql_estool.ConnectDB();
         frame.setTitle("Estimation Softwer Tool");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SLOC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SalaryinMonth = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Back2 = new javax.swing.JButton();
        Neaxt2 = new javax.swing.JButton();
        Exit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setMaximumSize(new java.awt.Dimension(614, 450));
        setMinimumSize(new java.awt.Dimension(620, 450));
        setPreferredSize(new java.awt.Dimension(614, 450));
        setSize(new java.awt.Dimension(614, 450));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrblu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setMaximumSize(new java.awt.Dimension(1322, 964));
        jLabel1.setMinimumSize(new java.awt.Dimension(1322, 964));
        jLabel1.setPreferredSize(new java.awt.Dimension(140, 420));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 140, 440);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 330));

        SLOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SLOCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setText("Enter Estimated Size in Source Lines of code (SLOC)");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jLabel3.setText("This wizard deals in SLOC .");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jLabel4.setText("The SLOC counting rules are simple : count logical lines (not physical lines ).");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jLabel5.setText("Exclude comments and blank lines , exclude machine -generated lines .");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setText("What is the size(SLOC) of your project ?");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel7.setText("How much monthly salary for developers ?");

        SalaryinMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryinMonthActionPerformed(evt);
            }
        });
        SalaryinMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SalaryinMonthKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(59, 59, 59)
                                .addComponent(SalaryinMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SLOC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SLOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SalaryinMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 0, 470, 330);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setMinimumSize(new java.awt.Dimension(470, 110));

        Back2.setText("Back");
        Back2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.SystemColor.activeCaption, java.awt.SystemColor.control));
        Back2.setPreferredSize(new java.awt.Dimension(90, 33));
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        Neaxt2.setText("Next");
        Neaxt2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.SystemColor.activeCaption, java.awt.SystemColor.inactiveCaption));
        Neaxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Neaxt2ActionPerformed(evt);
            }
        });
        Neaxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Neaxt2KeyPressed(evt);
            }
        });

        Exit2.setBackground(new java.awt.Color(204, 204, 255));
        Exit2.setText("EXit");
        Exit2.setMaximumSize(new java.awt.Dimension(55, 23));
        Exit2.setMinimumSize(new java.awt.Dimension(55, 23));
        Exit2.setPreferredSize(new java.awt.Dimension(90, 33));
        Exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Neaxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(Exit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Neaxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 330, 470, 110);

        setBounds(150, 100, 631, 483);
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     */
    public void close(){
        WindowEvent winColsingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winColsingEvent);
        
    }
    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
EstmitForm form =new EstmitForm();
form.setVisible(true);
close(); 
// TODO add your handling code here:
    }//GEN-LAST:event_Back2ActionPerformed

    private void Exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_Exit2ActionPerformed

    private void SLOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SLOCActionPerformed
       this.SLOC.getText(); // TODO add your handling code here:
    }//GEN-LAST:event_SLOCActionPerformed

    private void Neaxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Neaxt2ActionPerformed
try{
 double v1=Double.parseDouble(SLOC.getText());
  int v2=Integer.parseInt(SalaryinMonth.getText());
  String upsql="UPDATE estool set sloc='"+v1/1000+"',salary='"+v2+"' WHERE idnum=(select max(idnum) From estool)";
  pst=con.prepareStatement(upsql);
  pst.execute();
  pst.close();
    ScaleDrivers scale =new ScaleDrivers();
scale.setVisible(true);
close();

}
catch(Exception e){
  JOptionPane.showMessageDialog(null, e);
    
}
 

// TODO add your handling code here:
    }//GEN-LAST:event_Neaxt2ActionPerformed

    private void SalaryinMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryinMonthActionPerformed
       this.SalaryinMonth.getText(); // TODO add your handling code here:
    }//GEN-LAST:event_SalaryinMonthActionPerformed

    private void Neaxt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Neaxt2KeyPressed
   // TODO add your handling code here:
    }//GEN-LAST:event_Neaxt2KeyPressed

    private void SalaryinMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryinMonthKeyPressed
      if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
          try{
 double v1=Double.parseDouble(SLOC.getText());
  int v2=Integer.parseInt(SalaryinMonth.getText());
  String upsql="UPDATE estool set sloc='"+v1/1000+"',salary='"+v2+"' WHERE idnum=(select max(idnum) From estool)";
  pst=con.prepareStatement(upsql);
  pst.execute();
  pst.close();
    ScaleDrivers scale =new ScaleDrivers();
scale.setVisible(true);
close();

}
catch(Exception e){
  JOptionPane.showMessageDialog(null, e);
    
}
 
      }  // TODO add your handling code here:
    }//GEN-LAST:event_SalaryinMonthKeyPressed

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
            java.util.logging.Logger.getLogger(Size.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Size.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Size.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Size.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Size().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back2;
    private javax.swing.JButton Exit2;
    private javax.swing.JButton Neaxt2;
    private javax.swing.JTextField SLOC;
    private javax.swing.JTextField SalaryinMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}