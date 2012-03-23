
import javax.swing.ImageIcon;




public class VentanaCliente extends javax.swing.JFrame {

  
    public VentanaCliente() {
       this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Calculadora2.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        enviar = new javax.swing.JButton();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        enviar.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        enviar.setText("Enviar");
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        enviar.setBounds(170, 145, 79, 25);
        jLayeredPane1.add(enviar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        num1.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num1KeyTyped(evt);
            }
        });
        num1.setBounds(130, 48, 100, 30);
        jLayeredPane1.add(num1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        num2.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num2KeyTyped(evt);
            }
        });
        num2.setBounds(130, 100, 100, 30);
        jLayeredPane1.add(num2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-cliente.png"))); // NOI18N
        fondo2.setBounds(0, 0, 260, 180);
        jLayeredPane1.add(fondo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarActionPerformed

    private void num1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num1KeyTyped
      char c = evt.getKeyChar();
         if (!Character.getName(c).equals("FULL STOP") &&Character.isDigit(c)==false) {
        evt.consume();
    }
    }//GEN-LAST:event_num1KeyTyped

    private void num2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num2KeyTyped
       char c = evt.getKeyChar();
         if (!Character.getName(c).equals("FULL STOP") &&Character.isDigit(c)==false) {
        evt.consume();
    }
    }//GEN-LAST:event_num2KeyTyped

 
    public static void main(String args[]) {
   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    // End of variables declaration//GEN-END:variables
}
