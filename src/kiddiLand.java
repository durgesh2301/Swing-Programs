/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sfs
 */
public class kiddiLand extends javax.swing.JFrame {

    /**
     * Creates new form kiddiLand
     */
    public kiddiLand() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        billtf = new javax.swing.JTextField();
        addoftf = new javax.swing.JTextField();
        nettf = new javax.swing.JTextField();
        offtf = new javax.swing.JTextField();
        plarb = new javax.swing.JRadioButton();
        silrb = new javax.swing.JRadioButton();
        gorb = new javax.swing.JRadioButton();
        disbtn = new javax.swing.JButton();
        amtbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 24)); // NOI18N
        jLabel1.setText("KIDDI  LAND");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jLabel2.setText("NAME OF CUSTOMER");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jLabel3.setText("BILL AMOUNT");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jLabel4.setText("MODE OF PAYMENT");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jLabel5.setText("OFFER");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jLabel6.setText("ADDITIONAL OFFER");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jLabel7.setText("NET AMOUNT");

        nametf.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });

        billtf.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N

        addoftf.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N

        nettf.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N

        offtf.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N

        buttonGroup1.add(plarb);
        plarb.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        plarb.setText("PLATINUM");
        plarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plarbActionPerformed(evt);
            }
        });

        buttonGroup1.add(silrb);
        silrb.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        silrb.setText("SILVER");

        buttonGroup1.add(gorb);
        gorb.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        gorb.setText("GOLD");
        gorb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorbActionPerformed(evt);
            }
        });

        disbtn.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        disbtn.setText("Calculate Discount");
        disbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disbtnActionPerformed(evt);
            }
        });

        amtbtn.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        amtbtn.setText("Calculate Net Amount");
        amtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtbtnActionPerformed(evt);
            }
        });

        exitbtn.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(317, 317, 317))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addComponent(plarb)
                                .addGap(18, 18, 18)
                                .addComponent(silrb))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(disbtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amtbtn)
                            .addComponent(addoftf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billtf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gorb)
                            .addComponent(offtf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nettf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(billtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plarb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silrb))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gorb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(offtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addoftf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nettf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disbtn)
                    .addComponent(amtbtn))
                .addGap(18, 18, 18)
                .addComponent(exitbtn)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametfActionPerformed

    private void gorbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gorbActionPerformed

    private void disbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disbtnActionPerformed
      double dis = 0;
      double amt = Double.parseDouble(billtf.getText());
      if (plarb.isSelected()==true)
       dis = amt*0.02;
       else
          if(silrb.isSelected())
              dis = amt * 0.15;
      else
        dis = amt * 0.10;
      offtf.setText(" "+dis);
      double add = 0;
      if (amt > 25000)
              add = amt * 0.05 ;
      addoftf.setText(" "+ add);
      amtbtn.setEnabled(true);
      
      
        
        
        
        
        
    }//GEN-LAST:event_disbtnActionPerformed

    private void amtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtbtnActionPerformed
      double  totalcost = Double .parseDouble(billtf.getText());
      double offer = Double.parseDouble(offtf.getText());
      double additionaloffer = Double.parseDouble(addoftf.getText());
      double netamount = totalcost-offer-additionaloffer;
      nettf.setText(" "+ netamount);
        
        
        
        
    }//GEN-LAST:event_amtbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
     System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void plarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plarbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plarbActionPerformed

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
            java.util.logging.Logger.getLogger(kiddiLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kiddiLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kiddiLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kiddiLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kiddiLand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addoftf;
    private javax.swing.JButton amtbtn;
    private javax.swing.JTextField billtf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton disbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JRadioButton gorb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField nettf;
    private javax.swing.JTextField offtf;
    private javax.swing.JRadioButton plarb;
    private javax.swing.JRadioButton silrb;
    // End of variables declaration//GEN-END:variables
}
