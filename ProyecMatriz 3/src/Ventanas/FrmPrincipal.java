/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import javax.swing.JOptionPane;


public class FrmPrincipal extends javax.swing.JFrame {

int notas[][];
int fil,col;
    public FrmPrincipal() {
        initComponents();
        fil=10;
        col=3;
        notas=new int[fil][col];
               
    }
public void generar(){
    
                                              
       int i,j,limpInf=5,limSup=20;
       for(i=0;i<fil;i++)
           for(j=0;j<col;j++)
               notas[i][j]= (int)(Math.random()*(limSup-limpInf+1))+limpInf;
       
       
        JOptionPane.showMessageDialog(this,"Notas almaenados en la Matriz");
}
public void Mostrar(){
     int i,j;
     txaResultado.setText("");
       for(i=0;i<fil;i++){
           
       
            for(j=0;j<col;j++)
               txaResultado.append(notas[i][j]+ "\t");
       
          txaResultado.append("\n\n");
               
}
               }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnGenerar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnPromedio = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaPromedio = new javax.swing.JTextArea();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnPromedio.setText("Promedio");
        btnPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioActionPerformed(evt);
            }
        });

        btnFinal.setText("E.Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        txaPromedio.setColumns(20);
        txaPromedio.setRows(5);
        jScrollPane3.setViewportView(txaPromedio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerar)
                        .addGap(37, 37, 37)
                        .addComponent(btnMostrar)
                        .addGap(26, 26, 26)
                        .addComponent(btnPromedio)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(btnMostrar)
                    .addComponent(btnPromedio)
                    .addComponent(btnFinal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
 generar();
 Mostrar();
            
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
      
  
         
        
     
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioActionPerformed
    int i,j,acum;
        double prom;
        txaPromedio.setText(""); // PRAR QUE  SE REFRESQUE LOS DATOS Y NO SE REPITAN
       
         for(i=0;i<fil;i++){
              acum=0;
          
                for(j=0;j<col;j++)
                   acum=notas[i][j]+acum;
                prom=(double)acum/col;
                prom=Math.round(prom);
                  
                    
              
                txaPromedio.append(prom +"\n\n");  
        
        }

    }//GEN-LAST:event_btnPromedioActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
int i ,conta=0;
for( i=0;i<fil;i++)
    if(notas[i][2]>=13)
        conta++;
        
        JOptionPane.showMessageDialog(this,"Aprobados en E.final: "+ conta);
          // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalActionPerformed

    
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
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnPromedio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea txaPromedio;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables
}
