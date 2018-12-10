/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class Start extends javax.swing.JFrame {
    Ingreso ingre = new Ingreso (this,true);
    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWelcome = new javax.swing.JLabel();
        lbJerry = new javax.swing.JLabel();
        lbMaria = new javax.swing.JLabel();
        lbRoibin = new javax.swing.JLabel();
        btIngresar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        lbWelcome.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 24)); // NOI18N
        lbWelcome.setForeground(new java.awt.Color(0, 0, 0));
        lbWelcome.setText("BIENVENIDO AL JUEGO ");

        lbJerry.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        lbJerry.setForeground(new java.awt.Color(0, 0, 0));
        lbJerry.setText("Jerry Rivera ");

        lbMaria.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        lbMaria.setForeground(new java.awt.Color(0, 0, 0));
        lbMaria.setText("Maria Rodriguez");

        lbRoibin.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        lbRoibin.setForeground(new java.awt.Color(0, 0, 0));
        lbRoibin.setText("Roibin Elizondo");

        btIngresar.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 18)); // NOI18N
        btIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        btSalir.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(0, 0, 0));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("<CRUCIGRAMA>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(157, 157, 157)
                            .addComponent(btIngresar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addComponent(jLabel1))))
                .addGap(60, 96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRoibin)
                    .addComponent(lbMaria)
                    .addComponent(lbJerry))
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(lbJerry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRoibin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIngresar)
                    .addComponent(btSalir))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
     

           
           dispose ();
        
    }//GEN-LAST:event_btSalirActionPerformed

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
       Ingreso ingre = new Ingreso(this, true);
       ingre.setVisible(true);
        
        
    }//GEN-LAST:event_btIngresarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIngresar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbJerry;
    private javax.swing.JLabel lbMaria;
    private javax.swing.JLabel lbRoibin;
    private javax.swing.JLabel lbWelcome;
    // End of variables declaration//GEN-END:variables
}
