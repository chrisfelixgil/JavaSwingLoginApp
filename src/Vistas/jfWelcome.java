package Vistas;

/**
 *
 * @author chris
 */
public class jfWelcome extends javax.swing.JFrame {

    /**
     * Creates new form jfWelcome
     */
    public jfWelcome() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpWelcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btSingup = new javax.swing.JButton();
        btSingin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpWelcome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Empieza tu viaje");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Regístrate o Inicia sesión para comenzar.");

        btSingup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSingup.setText("Regístrate");
        btSingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSingupActionPerformed(evt);
            }
        });

        btSingin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSingin.setText("Inicia sesión");
        btSingin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSinginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nubes.png"))); // NOI18N

        javax.swing.GroupLayout jpWelcomeLayout = new javax.swing.GroupLayout(jpWelcome);
        jpWelcome.setLayout(jpWelcomeLayout);
        jpWelcomeLayout.setHorizontalGroup(
            jpWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpWelcomeLayout.createSequentialGroup()
                .addGroup(jpWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpWelcomeLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jpWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jpWelcomeLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jpWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSingin)
                            .addComponent(btSingup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpWelcomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpWelcomeLayout.setVerticalGroup(
            jpWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpWelcomeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSingup)
                .addGap(18, 18, 18)
                .addComponent(btSingin)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSingupActionPerformed
        
        //Abre la ventana para registrar
        jfRegister register = new jfRegister();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_btSingupActionPerformed

    private void btSinginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSinginActionPerformed
        
        //Abre la ventana para el login
        jfLogin login = new jfLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
        this.dispose();
        
        
    }//GEN-LAST:event_btSinginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        jfWelcome welcome = new jfWelcome();
        welcome.setVisible(true);
        welcome.setLocationRelativeTo(null);

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSingin;
    private javax.swing.JButton btSingup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpWelcome;
    // End of variables declaration//GEN-END:variables
}
