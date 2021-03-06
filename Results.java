
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author project
 */
public class Results extends javax.swing.JFrame {
   
    JFrame frame=new JFrame();
  Connection con=null;
ResultSet re=null;
PreparedStatement pst =null;
    /**
     * Creates new form Results
     */
    public Results() {
        
        initComponents();
        frame.setTitle("Estimation Softwer Tool");
        con =sql_estool.ConnectDB();
    }

  public void close(){
        WindowEvent winColsingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winColsingEvent);
        
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
        jPanel2 = new javax.swing.JPanel();
        Back1 = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrblu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setMaximumSize(new java.awt.Dimension(1322, 964));
        jLabel1.setMinimumSize(new java.awt.Dimension(1322, 964));
        jLabel1.setPreferredSize(new java.awt.Dimension(140, 440));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(470, 110));

        Back1.setBackground(new java.awt.Color(204, 204, 255));
        Back1.setText("Back");
        Back1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.SystemColor.activeCaption, java.awt.SystemColor.control));
        Back1.setPreferredSize(new java.awt.Dimension(90, 33));
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        Display.setBackground(new java.awt.Color(204, 204, 255));
        Display.setText("Display");
        Display.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.SystemColor.activeCaption, java.awt.SystemColor.inactiveCaption));
        Display.setPreferredSize(new java.awt.Dimension(90, 33));
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        Display.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DisplayKeyPressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(204, 204, 255));
        Exit.setText("Exit");
        Exit.setMaximumSize(new java.awt.Dimension(55, 23));
        Exit.setPreferredSize(new java.awt.Dimension(90, 33));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.setMaximumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 330));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel2.setText("Name of your project :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel3.setText("Size of your project =");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel4.setText("The Salary of Your Team=  $");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel5.setText("The Effort of Your Project  =   Person-months");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel6.setText("The Schedule of Your Project =  Months");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel7.setText("The Cost of Your Project = $");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 631, 483);
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
            CostDrivers cost = new CostDrivers();
close();
cost.setVisible(true);

    }//GEN-LAST:event_Back1ActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
      
        
        double costdr=0;
        double    effort=0;
  double     schedule=0;
 double neffort=0; 
 double sxaldr=0;
 double sxaldr2=0;
  double sxaldr3=0;
 double sced=0;
 double schedulepowr=0;
double cost =0;
    try {
        String upsql=("SELECT projectname,salary,sloc,sdr,cdr,sced from estool where  idnum = (select max(idnum) from estool)");
 pst=con.prepareStatement(upsql);
 re=pst.executeQuery();
 if(re.next()){
   String   nameofproject=re.getString("projectname");
    int salaryteam=Integer.parseInt(re.getString("salary"));
   double ksloc =Double.parseDouble(re.getString("sloc"));
      sxaldr =re.getDouble("sdr");
      costdr=re.getDouble("cdr");
      sced=re.getDouble("sced");
      sxaldr2=1.01+0.01*(sxaldr);
      neffort=Math.pow(ksloc, sxaldr2);
     effort= 2.94*neffort* costdr;
         sxaldr3=0.33+0.2*(sxaldr);
      schedulepowr=Math.pow(effort, sxaldr3);
    schedule=(3.67*schedulepowr)*(sced/100);
      cost=effort*salaryteam;
      jLabel2.setText("Name of your project :"+nameofproject);
      jLabel3.setText("Size of your project = "+ksloc*1000);
      jLabel4.setText("The Salary of Your Team ="+salaryteam+ "$");
      jLabel5.setText("The Effort of Your Project  = "+effort+ "Person-months");
      jLabel6.setText("The Schedule of Your Project = "+schedule+ "Months");
      jLabel7.setText("The Cost of Your Project = "+cost+ "$");
      
     
 pst.close();
 } 
 upsql="UPDATE estool set effort='"+effort+"',schedule='"+schedule+"' WHERE idnum=(select max(idnum) From estool)";
  pst=con.prepareStatement(upsql); 
pst.execute(); 
pst.close();

     

    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
  

    

        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void DisplayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DisplayKeyPressed
              
        double costdr=0;
        double    effort=0;
  double     schedule=0;
 double neffort=0; 
 double sxaldr=0;
 double sxaldr2=0;
  double sxaldr3=0;
 double sced=0;
 double schedulepowr=0;
double cost =0;
    try {
        String upsql=("SELECT projectname,salary,sloc,sdr,cdr,sced from estool where  idnum = (select max(idnum) from estool)");
 pst=con.prepareStatement(upsql);
 re=pst.executeQuery();
 if(re.next()){
   String   nameofproject=re.getString("projectname");
    int salaryteam=Integer.parseInt(re.getString("salary"));
   double ksloc =Double.parseDouble(re.getString("sloc"));
      sxaldr =re.getDouble("sdr");
      costdr=re.getDouble("cdr");
      sced=re.getDouble("sced");
      sxaldr2=1.01+0.01*(sxaldr);
      neffort=Math.pow(ksloc, sxaldr2);
     effort= 2.94*neffort* costdr;
         sxaldr3=0.33+0.2*(sxaldr);
      schedulepowr=Math.pow(effort, sxaldr3);
    schedule=(3.67*schedulepowr)*(sced/100);
      cost=effort*salaryteam;
      jLabel2.setText("Name of your project :"+nameofproject);
      jLabel3.setText("Size of your project = "+ksloc*1000);
      jLabel4.setText("The Salary of Your Team ="+salaryteam+ "$");
      jLabel5.setText("The Effort of Your Project  = "+effort+ "Person-months");
      jLabel6.setText("The Schedule of Your Project = "+schedule+ "Months");
      jLabel7.setText("The Cost of Your Project = "+cost+ "$");
      
     
 pst.close();
 } 
 upsql="UPDATE estool set effort='"+effort+"',schedule='"+schedule+"' WHERE idnum=(select max(idnum) From estool)";
  pst=con.prepareStatement(upsql); 
pst.execute(); 
pst.close();

     

    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
 
    }//GEN-LAST:event_DisplayKeyPressed

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Display;
    private javax.swing.JButton Exit;
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
