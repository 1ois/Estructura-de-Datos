
package ventanas;

import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame
{

    public FrmPrincipal() 
    {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    public void mostrar(int i)  // método recursivo
    {
        if(i > 0)
        {
            txaResultado.append(i + "\n");
            mostrar(i-1);
        }
    }
    
    public int sumar(int i)     // método recursivo
    {
        if(i <= 0)
            return 0;
        else
            return i + sumar(i-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        btnMostrarIterativo = new javax.swing.JButton();
        btnMostrarRecursivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSumarIterativo = new javax.swing.JButton();
        btnSumarRecursivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recursividad");

        jLabel1.setText("n =");

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        btnMostrarIterativo.setText("Iterativo");
        btnMostrarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIterativoActionPerformed(evt);
            }
        });

        btnMostrarRecursivo.setText("Recursivo");
        btnMostrarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecursivoActionPerformed(evt);
            }
        });

        jLabel2.setText("MOSTRAR");

        btnSumarIterativo.setText("Iterativo");
        btnSumarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarIterativoActionPerformed(evt);
            }
        });

        btnSumarRecursivo.setText("Recursivo");
        btnSumarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarRecursivoActionPerformed(evt);
            }
        });

        jLabel3.setText("SUMAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(btnMostrarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSumarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(btnSumarRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIterativo)
                            .addComponent(btnSumarIterativo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarRecursivo)
                            .addComponent(btnSumarRecursivo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIterativoActionPerformed
        // TODO add your handling code here:
        int i , n;
        txaResultado.setText("");
        n=Integer.parseInt(txtNro.getText());
        for(i=1;i<=n;i++){
            txaResultado.append(i+ " \n");
            
        }
    }//GEN-LAST:event_btnMostrarIterativoActionPerformed
    
    private void btnMostrarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecursivoActionPerformed
     int n;
     txaResultado.setText("");
     n=Integer.parseInt(txtNro.getText());
     mostrar(n);
        
    }//GEN-LAST:event_btnMostrarRecursivoActionPerformed

    private void btnSumarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarIterativoActionPerformed
        int i , n
              ,acum=0;
        txaResultado.setText("");
        
        n=Integer.parseInt(txtNro.getText())
        ;txtNro.setText("");
        for(i=1;i<=n;i++)
             acum=acum+i;
        
        txaResultado.append(acum+ "");
         JOptionPane.showMessageDialog(this, "suma interactiva :"+ acum);
        
        
        
    }//GEN-LAST:event_btnSumarIterativoActionPerformed
    
    private void btnSumarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarRecursivoActionPerformed
        int n ,s;
     
         n=Integer.parseInt(txtNro.getText());
         txtNro.setText("");
         s= sumar(n);
         
        JOptionPane.showMessageDialog(this, "suma interactiva :"+ s);
         
        
    }//GEN-LAST:event_btnSumarRecursivoActionPerformed
    
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarIterativo;
    private javax.swing.JButton btnMostrarRecursivo;
    private javax.swing.JButton btnSumarIterativo;
    private javax.swing.JButton btnSumarRecursivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtNro;
    // End of variables declaration//GEN-END:variables
}
