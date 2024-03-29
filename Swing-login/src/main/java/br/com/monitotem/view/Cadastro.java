package br.com.monitotem.view;

import br.com.monitotem.entities.Usuario;
import br.com.monitotem.dao.UserDao;
import br.com.monitotem.dao.TotemDAO;
import br.com.monitotem.service.ConnectionFactorySQL;
import br.com.monitotem.service.Slack;
import br.com.monitotem.entities.Totem;
import br.com.monitotem.service.ConnectionFactoryMySQL;
import br.com.monitotem.test.TestSelect;
import com.github.britooo.looca.api.core.Looca;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.net.InetAddress;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PICHAU
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * // Creates new form
     */
    public Cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblemailUsuario = new javax.swing.JTextField();
        lblsenhaUsuario = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtResultado = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 105, 225));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/totemCerto-2.png"))); // NOI18N
        jLabel5.setName("lblTotem"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(95, 95, 95))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblemailUsuario.setBorder(null);
        lblemailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblemailUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(lblemailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 231, 30));

        lblsenhaUsuario.setBorder(null);
        lblsenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsenhaUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(lblsenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 231, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 220, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 190, 60));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 40));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 220, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lock-20.png"))); // NOI18N
        jLabel1.setName("lblPass"); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user-20.png"))); // NOI18N
        jLabel2.setName("lblUser"); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 40));

        btnLogin.setBackground(new java.awt.Color(51, 51, 255));
        btnLogin.setFont(new java.awt.Font("JetBrains Mono", 1, 15)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, 40));

        txtResultado.setBackground(new java.awt.Color(0, 0, 0));
        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtResultado.setMaximumSize(new java.awt.Dimension(30, 50));
        txtResultado.setMinimumSize(new java.awt.Dimension(12, 26));
        jPanel2.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 330, 40));
        jPanel2.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        lblSenha.setBackground(new java.awt.Color(0, 0, 0));
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha");
        jPanel2.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lblSenha1.setBackground(new java.awt.Color(0, 0, 0));
        lblSenha1.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha1.setText("E-mail");
        jPanel2.add(lblSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblemailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblemailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblemailUsuarioActionPerformed

    private void lblsenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsenhaUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String emailUser = lblemailUsuario.getText();
        String senhaUser = lblsenhaUsuario.getText();

        Usuario usuario = new Usuario(emailUser, senhaUser);
        UserDao userDao = new UserDao();

        InetAddress inetAddress;
        TestSelect ts = new TestSelect();
        Slack slack = new Slack();

        try {
            System.out.println(usuario);

            Usuario validar = userDao.validarLogin(usuario);
            System.out.println(validar);

            System.out.println("O retorno disso é " + validar);

            if (validar.getEmailUsuario() != null && validar.getSenhaUsuario() != null) {
                ts.Reinicia();

                try {
                    slack.sendNewUser(usuario);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("Login efetuado com sucesso !");

                try {
                    String infoMaquina = InetAddress.getLocalHost().toString();
                    String ip = InetAddress.getLocalHost().getHostAddress().toString();

                    Looca looca = new Looca();

                    Totem prod = new Totem(looca, infoMaquina, ip);

                    try ( java.sql.Connection con = new ConnectionFactorySQL().recuperarConexao()) {
                        TotemDAO totemDao = new TotemDAO(con);
                        totemDao.salvar(prod, validar.getIdEmpresa());
                    }
                    try ( java.sql.Connection con = new ConnectionFactoryMySQL().recuperarConexao()) {
                        TotemDAO totemDao = new TotemDAO(con);
                        totemDao.salvar(prod, validar.getIdEmpresa());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            } else {
                txtResultado.setForeground(Color.red);
                txtResultado.setText("Usuário ou senha inválido ...");
                System.out.println("Login inválido tente novamnte");
            }
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println("error em");
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JTextField lblemailUsuario;
    private javax.swing.JPasswordField lblsenhaUsuario;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
