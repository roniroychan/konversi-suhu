/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konveresi_suhu;

/**
 *
 * @author LENOVO
 */
public class apk_suhu extends javax.swing.JFrame {
    public apk_suhu() {
        initComponents();
        reset();
    }
    void reset(){
        tSuhuAsal.setText("");
        vHasil.setText("");   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();
        bClose = new javax.swing.JButton();
        bKonversi = new javax.swing.JButton();
        tSuhuAsal1 = new javax.swing.JPanel();
        tSkalaAsal = new javax.swing.JComboBox<>();
        tSuhuAsal = new javax.swing.JTextField();
        tSkalaTujuan1 = new javax.swing.JPanel();
        tSkalaTujuan = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        vHasil = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KONVERSI SUHU");

        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bClose.setText("CLOSE");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        bKonversi.setText("KONVERSI");
        bKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKonversiActionPerformed(evt);
            }
        });

        tSuhuAsal1.setBorder(javax.swing.BorderFactory.createTitledBorder("SUHU AWAL"));

        tSkalaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CELCIUS", "KELVIN", "FAHRENHEIT", " " }));
        tSkalaAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSkalaAsalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tSuhuAsal1Layout = new javax.swing.GroupLayout(tSuhuAsal1);
        tSuhuAsal1.setLayout(tSuhuAsal1Layout);
        tSuhuAsal1Layout.setHorizontalGroup(
            tSuhuAsal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tSuhuAsal1Layout.createSequentialGroup()
                .addGroup(tSuhuAsal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tSkalaAsal, 0, 173, Short.MAX_VALUE)
                    .addComponent(tSuhuAsal))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        tSuhuAsal1Layout.setVerticalGroup(
            tSuhuAsal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tSuhuAsal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSuhuAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tSkalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        tSkalaTujuan1.setBorder(javax.swing.BorderFactory.createTitledBorder("SUHU TUJUAN"));

        tSkalaTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CELCIUS", "KELVIN", "FAHRENHEIT" }));

        javax.swing.GroupLayout tSkalaTujuan1Layout = new javax.swing.GroupLayout(tSkalaTujuan1);
        tSkalaTujuan1.setLayout(tSkalaTujuan1Layout);
        tSkalaTujuan1Layout.setHorizontalGroup(
            tSkalaTujuan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tSkalaTujuan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        tSkalaTujuan1Layout.setVerticalGroup(
            tSkalaTujuan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tSkalaTujuan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tSkalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL"));
        jPanel3.setToolTipText("");
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setFocusCycleRoot(true);
        jPanel3.setLayout(new java.awt.BorderLayout());

        vHasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vHasil.setText("jLabel2");
        jPanel3.add(vHasil, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tSkalaTujuan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSuhuAsal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(bReset)
                            .addGap(101, 101, 101)
                            .addComponent(bClose))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tSuhuAsal1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tSkalaTujuan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bKonversi)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bClose)
                    .addComponent(bReset))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void tSkalaAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSkalaAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSkalaAsalActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKonversiActionPerformed
        // TODO add your handling code here:
        double suhuasal = Double.parseDouble(tSuhuAsal.getText());
        String skalaasal = tSkalaAsal.getSelectedItem().toString();
        String skalatujuan = tSkalaTujuan.getSelectedItem().toString();
        double hasil = 0 ;
        if (skalaasal.equals("CELCIUS") && skalatujuan.equals("CELCIUS")) {
            hasil = suhuasal;
           
        } else if (skalaasal.equals("CELCIUS") && skalatujuan.equals("KELVIN")) {
            hasil = suhuasal + 273.15;
        }else if (skalaasal.equals("CELCIUS") && skalatujuan.equals("FAHRENHEIT")) {
            hasil = suhuasal * 9/5+32;
        }else if (skalaasal.equals("KELVIN") && skalatujuan.equals("CELCIUS")) {
            hasil = suhuasal - 273.15;
        }else if (skalaasal.equals("KELVIN") && skalatujuan.equals("KELVIN")) {
            hasil = suhuasal;
        }else if (skalaasal.equals("KELVIN") && skalatujuan.equals("FAHRENHEIT")) {
            hasil = (suhuasal-273.15)*9/5+32;
        }else if (skalaasal.equals("FAHRENHEIT") && skalatujuan.equals("CELCIUS")) {
            hasil = (suhuasal-32)*5/9;   
        }else if (skalaasal.equals("FAHRENHEIT") && skalatujuan.equals("KELVIN")) {
            hasil = (suhuasal-32)*5/9 + 273.15;
        }else if (skalaasal.equals("FAHRENHEIT") && skalatujuan.equals("FAHRENHEIT")) {
            hasil = suhuasal;    
        }   { 
            String skala = skalatujuan.substring(0,1);
            vHasil.setText(String.format("%.2f", hasil)+"\u00B0"+ skala);
        }   
    }//GEN-LAST:event_bKonversiActionPerformed
    
    /**
     *
     * @param args
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(apk_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apk_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apk_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apk_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apk_suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bKonversi;
    private javax.swing.JButton bReset;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> tSkalaAsal;
    private javax.swing.JComboBox<String> tSkalaTujuan;
    private javax.swing.JPanel tSkalaTujuan1;
    private javax.swing.JTextField tSuhuAsal;
    private javax.swing.JPanel tSuhuAsal1;
    private javax.swing.JLabel vHasil;
    // End of variables declaration//GEN-END:variables
}
