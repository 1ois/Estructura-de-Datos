/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

/**
 *
 * @author LMA106-14
 */
public class FrmPrincipal extends javax.swing.JFrame {

   
 int matriculados[][]={{16,24,20},{24,30,26}};
  int fil,col;
  
    public FrmPrincipal() {
        
        initComponents();
        fil=matriculados.length;
        col=matriculados[0].length;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostrar = new javax.swing.JButton();
        btnMostrarT = new javax.swing.JButton();
        btnMostrarL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaPorTurno = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaPorLocal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnMostrarT.setText("Mostrar Turno");
        btnMostrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTActionPerformed(evt);
            }
        });

        btnMostrarL.setText("Mostrar Local");
        btnMostrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLActionPerformed(evt);
            }
        });

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        txaPorTurno.setColumns(20);
        txaPorTurno.setRows(5);
        jScrollPane2.setViewportView(txaPorTurno);

        txaPorLocal.setColumns(20);
        txaPorLocal.setRows(5);
        jScrollPane3.setViewportView(txaPorLocal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(btnMostrar)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarT)
                .addGap(36, 36, 36)
                .addComponent(btnMostrarL)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnMostrarT)
                    .addComponent(btnMostrarL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       
        int i,j;
      
        txaResultado.setText(""); // PRAR QUE  SE REFRESQUE LOS DATOS Y NO SE REPITAN
        
        for(i=0;i<fil;i++){
              for(j=0;j<col;j++)
                  txaResultado.append(matriculados[i][j]+ "\t");
         txaResultado.append("\n\n"); 
         
        
        }
          
                
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnMostrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTActionPerformed
       
           int i,j;
        int acum;
        txaResultado.setText(""); // PRAR QUE  SE REFRESQUE LOS DATOS Y NO SE REPITAN
        
        for(i=0;i<fil;i++){
              acum=0;
              for(j=0;j<col;j++){
                   acum=matriculados[i][j]+acum;
                
              }
              txaPorTurno.append(acum +"\n\n");     
        
        }


    }//GEN-LAST:event_btnMostrarTActionPerformed

    private void btnMostrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLActionPerformed

      
         int i,j;
        int acum;
        txaResultado.setText(""); // PRAR QUE  SE REFRESQUE LOS DATOS Y NO SE REPITAN
       
         for(j=0;j<col;j++){
              acum=0;
              for(i=0;i<fil;i++)
                   acum=matriculados[i][j]+acum;
                    
              
                txaPorLocal.append(acum +"\t");  
        
        }

    }//GEN-LAST:event_btnMostrarLActionPerformed

    
    
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
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarL;
    private javax.swing.JButton btnMostrarT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txaPorLocal;
    private javax.swing.JTextArea txaPorTurno;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables
}
