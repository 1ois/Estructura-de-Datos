
package ventanas;

import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame
{

    public FrmPrincipal()
    {
        initComponents();
        setLocationRelativeTo(this);
    }
    
  public  int f(int a,int b)
  {
        if(a==2)
          return 5;
        else{
                if(a<=b)
                { return f(a+2,b-3)+4;}
                else{ return f(a-3,b+4)-2;}
            }
  }
   

    
    public void mostrar(int i)  // método recursivo
    {
        if(i >= 20)
        {
            if(i%3 == 0)
            {
                txaResultado.append(i + "\n");
                mostrar(i-1);
            }
            else
                mostrar(i-1);
        }
    }
    
    public int contar(int i)     // método recursivo
    {
        if(i < 20)
            return 0;
        else
            if(i%3 == 0)
                return 1 + contar(i-1);
            else
                return contar(i-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        btnMostrarIterativo = new javax.swing.JButton();
        btnMostrarRecursivo = new javax.swing.JButton();
        btnContarIterativo = new javax.swing.JButton();
        btnContarRecursivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recursividad");

        jLabel2.setText("MOSTRAR");

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

        btnContarIterativo.setText("Iterativo");
        btnContarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarIterativoActionPerformed(evt);
            }
        });

        btnContarRecursivo.setText("Recursivo");
        btnContarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarRecursivoActionPerformed(evt);
            }
        });

        jLabel1.setText("CONTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(btnMostrarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarRecursivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnContarRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIterativo)
                            .addComponent(btnContarIterativo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarRecursivo)
                            .addComponent(btnContarRecursivo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIterativoActionPerformed
       int i;
          txaResultado.setText("");
            for(i=20;i<=30;i++){  
                if(i%3==0)
                    txaResultado.append(i+"\n");
            }
             
        
    }//GEN-LAST:event_btnMostrarIterativoActionPerformed

    private void btnMostrarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecursivoActionPerformed
           int i=30;
          txaResultado.setText("");
          mostrar(i);
    }//GEN-LAST:event_btnMostrarRecursivoActionPerformed

    private void btnContarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarIterativoActionPerformed
           int i, acum=0;
           txaResultado.setText("");
             for(i=20;i<=30;i++){  
                if(i%3==0)
                    acum++;
             }
           txaResultado.append(acum+" ");
                
    }//GEN-LAST:event_btnContarIterativoActionPerformed
        
    private void btnContarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarRecursivoActionPerformed
       int i=30, s;
       txaResultado.setText("");
       s=contar(30);
       
          txaResultado.append(s+" ");
      
        
    }//GEN-LAST:event_btnContarRecursivoActionPerformed
    
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
    private javax.swing.JButton btnContarIterativo;
    private javax.swing.JButton btnContarRecursivo;
    private javax.swing.JButton btnMostrarIterativo;
    private javax.swing.JButton btnMostrarRecursivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables
}
