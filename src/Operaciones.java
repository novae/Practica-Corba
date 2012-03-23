
import javax.swing.ImageIcon;


public class Operaciones extends javax.swing.JFrame {

  
    public Operaciones() {
     this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Calculadora2.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnsuma1.png"))); // NOI18N
        suma.setBorderPainted(false);
        suma.setContentAreaFilled(false);
        suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnsuma2.png"))); // NOI18N
        suma.setBounds(23, 40, 90, 33);
        jLayeredPane1.add(suma, javax.swing.JLayeredPane.DEFAULT_LAYER);

        resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btmresta1.png"))); // NOI18N
        resta.setBorderPainted(false);
        resta.setContentAreaFilled(false);
        resta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btmresta2.png"))); // NOI18N
        resta.setBounds(23, 75, 90, 33);
        jLayeredPane1.add(resta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnmulti1.png"))); // NOI18N
        multiplicacion.setBorderPainted(false);
        multiplicacion.setContentAreaFilled(false);
        multiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnmulti2.png"))); // NOI18N
        multiplicacion.setBounds(23, 110, 90, 33);
        jLayeredPane1.add(multiplicacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btndiv1.png"))); // NOI18N
        division.setBorderPainted(false);
        division.setContentAreaFilled(false);
        division.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btndiv2.png"))); // NOI18N
        division.setBounds(23, 145, 90, 33);
        jLayeredPane1.add(division, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-operaciones.png"))); // NOI18N
        fondo3.setBounds(0, 0, 135, 200);
        jLayeredPane1.add(fondo3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
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
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton division;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
