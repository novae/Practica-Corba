
import javax.swing.ImageIcon;
 
public class VentanaServidor extends javax.swing.JFrame {
    public static int operacion;
    
    public VentanaServidor() {
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Calculadora2.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Mensajes = new javax.swing.JLabel();
        numero1 = new javax.swing.JLabel();
        numero2 = new javax.swing.JLabel();
        imgoperacion = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidor Calculadora");
        setResizable(false);

        Mensajes.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        Mensajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensajes.setText("El servidor de Nombres ha estado esperando por este momento");
        Mensajes.setPreferredSize(new java.awt.Dimension(400, 25));
        Mensajes.setBounds(50, 25, 500, 30);
        jLayeredPane1.add(Mensajes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        numero1.setFont(new java.awt.Font("Candara", 1, 32)); // NOI18N
        numero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero1.setBounds(65, 105, 88, 45);
        jLayeredPane1.add(numero1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        numero2.setFont(new java.awt.Font("Candara", 1, 32)); // NOI18N
        numero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero2.setBounds(245, 105, 88, 45);
        jLayeredPane1.add(numero2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        imgoperacion.setBounds(178, 105, 45, 45);
        jLayeredPane1.add(imgoperacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        resultado.setFont(new java.awt.Font("Candara", 1, 32)); // NOI18N
        resultado.setBounds(398, 105, 150, 45);
        jLayeredPane1.add(resultado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        fondo.setBounds(0, 0, 600, 260);
        jLayeredPane1.add(fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
       
             try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaServidor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensajes;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imgoperacion;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel numero1;
    private javax.swing.JLabel numero2;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
