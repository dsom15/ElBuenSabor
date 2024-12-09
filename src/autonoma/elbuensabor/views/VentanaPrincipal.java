
package autonoma.elbuensabor.views;

import autonoma.elbuensabor.models.Restaurante;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Dsoch
 */
public class VentanaPrincipal extends javax.swing.JFrame {
     private Restaurante restaurante;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Restaurante restaurante) {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/ElBuenSabor/images/restautante.png")).getImage());
        }catch (Exception e){
            
        }
        this.restaurante= restaurante;
        this.lblNombreRestaurante.setText(this.restaurante.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblNombreRestaurante = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarPlato = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMostrarPlato = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarPlato = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 350));

        jPanel2.setBackground(new java.awt.Color(239, 44, 26));

        lblNombreRestaurante.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        lblNombreRestaurante.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreRestaurante.setText("nombre restaurante");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarPlato.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPlatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarPlatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarPlatoMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/elbuensabor/images/agregar.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setText("Agregar Plato");

        javax.swing.GroupLayout btnAgregarPlatoLayout = new javax.swing.GroupLayout(btnAgregarPlato);
        btnAgregarPlato.setLayout(btnAgregarPlatoLayout);
        btnAgregarPlatoLayout.setHorizontalGroup(
            btnAgregarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarPlatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarPlatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnAgregarPlatoLayout.setVerticalGroup(
            btnAgregarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarPlatoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnMostrarPlato.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarPlatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarPlatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarPlatoMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/elbuensabor/images/mostrar.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        jLabel5.setText("Mostrar Menu");

        javax.swing.GroupLayout btnMostrarPlatoLayout = new javax.swing.GroupLayout(btnMostrarPlato);
        btnMostrarPlato.setLayout(btnMostrarPlatoLayout);
        btnMostrarPlatoLayout.setHorizontalGroup(
            btnMostrarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarPlatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnMostrarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        btnMostrarPlatoLayout.setVerticalGroup(
            btnMostrarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarPlatoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscarPlato.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPlatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarPlatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarPlatoMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/elbuensabor/images/buscar.png"))); // NOI18N
        jLabel6.setText("jLabel2");

        jLabel7.setText("Buscar Plato");

        javax.swing.GroupLayout btnBuscarPlatoLayout = new javax.swing.GroupLayout(btnBuscarPlato);
        btnBuscarPlato.setLayout(btnBuscarPlatoLayout);
        btnBuscarPlatoLayout.setHorizontalGroup(
            btnBuscarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarPlatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnBuscarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBuscarPlatoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        btnBuscarPlatoLayout.setVerticalGroup(
            btnBuscarPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarPlatoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnAgregarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnMostrarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnBuscarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarPlato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBuscarPlato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarPlato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/elbuensabor/images/restaurante.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lblNombreRestaurante)
                .addGap(146, 146, 146))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblNombreRestaurante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPlatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPlatoMouseEntered
        this.mouseEntered(btnAgregarPlato);
    }//GEN-LAST:event_btnAgregarPlatoMouseEntered

    private void btnAgregarPlatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPlatoMouseExited
        this.mouseExited(btnAgregarPlato);
    }//GEN-LAST:event_btnAgregarPlatoMouseExited

    private void btnMostrarPlatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarPlatoMouseEntered
        this.mouseEntered(btnMostrarPlato);
    }//GEN-LAST:event_btnMostrarPlatoMouseEntered

    private void btnMostrarPlatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarPlatoMouseExited
        this.mouseExited(btnMostrarPlato);
    }//GEN-LAST:event_btnMostrarPlatoMouseExited

    private void btnBuscarPlatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPlatoMouseEntered
        this.mouseEntered(btnBuscarPlato);
    }//GEN-LAST:event_btnBuscarPlatoMouseEntered

    private void btnBuscarPlatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPlatoMouseExited
        this.mouseExited(btnBuscarPlato);
    }//GEN-LAST:event_btnBuscarPlatoMouseExited

    private void btnAgregarPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPlatoMouseClicked
        AgregarPlato VentanaAgregarPlato = new AgregarPlato(this, true, this.restaurante,this);
        VentanaAgregarPlato.setVisible(true);
    }//GEN-LAST:event_btnAgregarPlatoMouseClicked

    private void btnMostrarPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarPlatoMouseClicked
        MostrarPlato ventanaMostrarPlato = new MostrarPlato(this, true, this.restaurante, this);
        ventanaMostrarPlato.setVisible(true);
    }//GEN-LAST:event_btnMostrarPlatoMouseClicked

    private void btnBuscarPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPlatoMouseClicked
        BuscarPlato ventanaBuscarPlato = new BuscarPlato(this, true, this.restaurante, this);
        ventanaBuscarPlato.setVisible(true);
    }//GEN-LAST:event_btnBuscarPlatoMouseClicked
    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color (248,242,241) );
    }
    
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color (255,255,255) );
    }
   
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarPlato;
    private javax.swing.JPanel btnBuscarPlato;
    private javax.swing.JPanel btnMostrarPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNombreRestaurante;
    // End of variables declaration//GEN-END:variables
}
