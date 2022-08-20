package examen1p2lab_rigobertobarahona;

import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    
    public NewJFrame() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Pass_ApexLegends = new javax.swing.JLabel();
        Pass_LoginTitle = new javax.swing.JLabel();
        Pass_Username = new javax.swing.JLabel();
        Pass_UsernameInput = new javax.swing.JFormattedTextField();
        Pass_Password = new javax.swing.JLabel();
        Pass_PasswordInput = new javax.swing.JFormattedTextField();
        Pass_Button = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Pass_ApexLegends.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pass_ApexLegends.setForeground(new java.awt.Color(255, 102, 0));
        Pass_ApexLegends.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pass_ApexLegends.setText("APEX LEGENDS");

        Pass_LoginTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Pass_LoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pass_LoginTitle.setText("LOGIN");

        Pass_Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pass_Username.setText("USERNAME");

        Pass_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pass_Password.setText("Password");

        Pass_Button.setBackground(new java.awt.Color(255, 153, 0));
        Pass_Button.setText("LOGIN");
        Pass_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pass_Button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        Pass_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pass_ButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pass_ButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pass_ApexLegends)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pass_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pass_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pass_UsernameInput)
                            .addComponent(Pass_PasswordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                .addGap(252, 252, 252))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(Pass_LoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(Pass_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Pass_ApexLegends)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pass_LoginTitle)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pass_Username)
                    .addComponent(Pass_UsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass_Password)
                    .addComponent(Pass_PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(Pass_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LOGIN", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pass_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pass_ButtonMouseClicked

        String US_Input, Pass_Input;
        US_Input = String.valueOf(Pass_UsernameInput.getText() );
        Pass_Input = String.valueOf(Pass_PasswordInput.getText() );
         // String validar = ( (Usuario) usuarios.get() ).getPass();
        JOptionPane.showMessageDialog(this, "Login Exitoso, Bienvenido a Apex Legends");
    }//GEN-LAST:event_Pass_ButtonMouseClicked

    private void Pass_ButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pass_ButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pass_ButtonMousePressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList<Arma> armas = new ArrayList();
        ArrayList<Personaje> personajes = new ArrayList();
        
        String nameA = "Inferno";
        int dano = 100;
        int precision = 100;

        armas.add(new Arma(nameA, dano, precision));
        ArrayList<Arma> arma = new ArrayList();
        
        
        String nameP = "Cinder";
        int vida = 180;
        int escudo = 120;
        
        personajes.add( new Rastreador(nameP, vida, escudo, arma) );
        ( (Rastreador) personajes.get(0) ).getArma().add( (Arma) armas.get(0) );
        ArrayList<Personaje> personaje = new ArrayList();
        
        String nameU = "Mateo Eliseo";
        int ID = 8888;
        String pass = "80085";
        
        usuarios.add( new Usuario( nameU, ID, pass, personaje) );
        ( (Usuario) usuarios.get(0) ).getPersonaje().add( (Rastreador) personajes.get(0) );
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pass_ApexLegends;
    private javax.swing.JButton Pass_Button;
    private javax.swing.JLabel Pass_LoginTitle;
    private javax.swing.JLabel Pass_Password;
    private javax.swing.JFormattedTextField Pass_PasswordInput;
    private javax.swing.JLabel Pass_Username;
    private javax.swing.JFormattedTextField Pass_UsernameInput;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
