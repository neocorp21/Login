/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import rojeru_san.complementos.RSUtilities;
import rojeru_san.efectos.ValoresEnum;

/**
 *
 * @author Alberto
 */
public class Logu extends javax.swing.JFrame {

    int valor=0;
    public Logu() {
    initComponents();
          this.setExtendedState(MAXIMIZED_BOTH);//Se ejecuta maximizado 
       RSUtilities.setOpaqueWindow(this, false);
       RSUtilities.setOpacityComponent(this, 1);
       RSUtilities.setOpacityComponent(this.Contenedor, 130);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Contenedor2 = new RSMaterialComponent.RSPanelMaterial();
        txtTitulo = new javax.swing.JLabel();
        txtFoto = new rojerusan.RSButtonCircleIcon();
        btn_ingresar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_cerrar1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        rSPanelRound3 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelIcon4 = new RSMaterialComponent.RSLabelIcon();
        btnVerClave = new RSMaterialComponent.RSButtonIconUno();
        txtclave = new RSMaterialComponent.RSPasswordMaterial();
        rSPanelRound1 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelIcon1 = new RSMaterialComponent.RSLabelIcon();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterial();
        mensaje_Correo = new javax.swing.JLabel();
        mensaje_Correo1 = new javax.swing.JLabel();
        btn_cerrar2 = new RSMaterialComponent.RSButtonMaterialIconDos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        Contenedor.setBackground(new java.awt.Color(204, 204, 0));

        Contenedor2.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor2.setRound(30);
        Contenedor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(204, 0, 0));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Iniciar sesi??n");
        Contenedor2.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 240, 38));

        txtFoto.setColorBorde(new java.awt.Color(0, 0, 0));
        txtFoto.setImagen(new javax.swing.ImageIcon(getClass().getResource("/login/imagen.png"))); // NOI18N
        Contenedor2.add(txtFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, 110));

        btn_ingresar.setBackground(new java.awt.Color(0, 0, 153));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBackgroundHover(new java.awt.Color(102, 102, 102));
        btn_ingresar.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btn_ingresar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INPUT);
        btn_ingresar.setPadding(10);
        btn_ingresar.setRound(40);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        Contenedor2.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 320, 60));

        btn_cerrar1.setBackground(new java.awt.Color(204, 0, 0));
        btn_cerrar1.setBackgroundHover(new java.awt.Color(153, 0, 0));
        btn_cerrar1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REMOVE);
        btn_cerrar1.setRound(50);
        btn_cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar1ActionPerformed(evt);
            }
        });
        Contenedor2.add(btn_cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 40));

        rSPanelRound3.setColorBackground(new java.awt.Color(255, 255, 255));
        rSPanelRound3.setColorBorde(new java.awt.Color(255, 255, 255));

        rSLabelIcon4.setBackground(new java.awt.Color(0, 0, 0));
        rSLabelIcon4.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelIcon4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);

        btnVerClave.setBackground(new java.awt.Color(255, 255, 255));
        btnVerClave.setForeground(new java.awt.Color(0, 0, 0));
        btnVerClave.setBackgroundHover(new java.awt.Color(255, 255, 255));
        btnVerClave.setForegroundHover(new java.awt.Color(0, 0, 0));
        btnVerClave.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVerClave.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VISIBILITY_OFF);
        btnVerClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClaveActionPerformed(evt);
            }
        });

        txtclave.setForeground(new java.awt.Color(0, 0, 0));
        txtclave.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtclave.setPhColor(new java.awt.Color(109, 109, 109));
        txtclave.setPlaceholder("Clave");
        txtclave.setSelectionColor(new java.awt.Color(109, 109, 109));

        javax.swing.GroupLayout rSPanelRound3Layout = new javax.swing.GroupLayout(rSPanelRound3);
        rSPanelRound3.setLayout(rSPanelRound3Layout);
        rSPanelRound3Layout.setHorizontalGroup(
            rSPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        rSPanelRound3Layout.setVerticalGroup(
            rSPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(rSPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnVerClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSLabelIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Contenedor2.add(rSPanelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 359, 60));

        rSPanelRound1.setColorBackground(new java.awt.Color(255, 255, 255));
        rSPanelRound1.setColorBorde(new java.awt.Color(255, 255, 255));

        rSLabelIcon1.setBackground(new java.awt.Color(0, 0, 0));
        rSLabelIcon1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EMAIL);

        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtBuscar.setPhColor(new java.awt.Color(153, 153, 153));
        txtBuscar.setPlaceholder("Email");
        txtBuscar.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout rSPanelRound1Layout = new javax.swing.GroupLayout(rSPanelRound1);
        rSPanelRound1.setLayout(rSPanelRound1Layout);
        rSPanelRound1Layout.setHorizontalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        rSPanelRound1Layout.setVerticalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Contenedor2.add(rSPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 60));

        mensaje_Correo.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        mensaje_Correo.setForeground(new java.awt.Color(204, 0, 0));
        mensaje_Correo.setText("Clave *");
        Contenedor2.add(mensaje_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 250, -1));

        mensaje_Correo1.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        mensaje_Correo1.setForeground(new java.awt.Color(204, 0, 0));
        mensaje_Correo1.setText("Email *");
        Contenedor2.add(mensaje_Correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 250, -1));

        btn_cerrar2.setBackground(new java.awt.Color(204, 0, 0));
        btn_cerrar2.setBackgroundHover(new java.awt.Color(153, 0, 0));
        btn_cerrar2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btn_cerrar2.setRound(50);
        btn_cerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar2ActionPerformed(evt);
            }
        });
        Contenedor2.add(btn_cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 40));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(Contenedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Contenedor);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
 
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar1ActionPerformed
    RSUtilities.setMinimized(this);
    }//GEN-LAST:event_btn_cerrar1ActionPerformed

    private void btnVerClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClaveActionPerformed

        if(valor==0){
            btnVerClave.setIcons(ValoresEnum.ICONS.VISIBILITY) ;

            txtclave.setEchoChar('\000');

            valor=1;
        }else {
            btnVerClave.setIcons(ValoresEnum.ICONS.VISIBILITY_OFF) ;

            txtclave.setEchoChar('\u25cf');
            valor=0;
        }
    }//GEN-LAST:event_btnVerClaveActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btn_cerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar2ActionPerformed
this.dispose();
    }//GEN-LAST:event_btn_cerrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Logu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private RSMaterialComponent.RSPanelMaterial Contenedor2;
    private RSMaterialComponent.RSButtonIconUno btnVerClave;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_cerrar1;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_cerrar2;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_ingresar;
    private javax.swing.JLabel mensaje_Correo;
    private javax.swing.JLabel mensaje_Correo1;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon1;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon4;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound1;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound3;
    private RSMaterialComponent.RSTextFieldMaterial txtBuscar;
    private rojerusan.RSButtonCircleIcon txtFoto;
    private javax.swing.JLabel txtTitulo;
    private RSMaterialComponent.RSPasswordMaterial txtclave;
    // End of variables declaration//GEN-END:variables
}
