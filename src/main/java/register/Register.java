/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package register;

import config.SupabaseUsers;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.security.KeyPair;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import register.WalletData;


/**
 *
 * @author 62877
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static String generateRandomHex(int length) {
        String chars = "0123456789abcdef";
        StringBuilder hex = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            hex.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return hex.toString();
    }
    
    public static String generateBackupPhrase() {
        String[] words = {"apple", "banana", "car", "dog", "echo", "fish", "goat", "hat", "ice", "jungle", "kite", "lemon"};
        StringBuilder phrase = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            phrase.append(words[rand.nextInt(words.length)]).append(" ");
        }
        return phrase.toString().trim();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        panel1 = new login.Panel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nicknameField = new login.TextField();
        jPanel4 = new javax.swing.JPanel();
        accWallet = new login.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(242, 245, 255));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(400, 350));
        panel1.setRoundBottomLeft(35);
        panel1.setRoundBottomRight(35);
        panel1.setRoundTopLeft(35);
        panel1.setRoundTopRight(35);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel1.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 69, 194));
        jLabel1.setText("Voltix");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        panel1.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(388, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Create Your Wallet");

        jLabel3.setText("Never share your keystore with anyone.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(37, 37, 37))
        );

        panel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(388, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Enter your nickname");

        nicknameField.setPreferredSize(new java.awt.Dimension(25, 45));
        nicknameField.setRound(5);
        nicknameField.setShadowColor(new java.awt.Color(28, 69, 194));
        nicknameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nicknameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addGap(0, 241, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nicknameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(388, 100));

        accWallet.setForeground(new java.awt.Color(28, 69, 194));
        accWallet.setText("Next");
        accWallet.setShadowColor(new java.awt.Color(28, 69, 194));
        accWallet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accWalletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accWalletMouseExited(evt);
            }
        });
        accWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accWalletActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accWallet, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accWallet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        panel1.add(jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accWalletActionPerformed
     String nickname = nicknameField.getText().trim();

    if (nickname.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nickname tidak boleh kosong.");
        return;
    }

    try {
        // 1. Generate wallet dari WalletGenerator
        KeyPair keyPair = WalletGenerator.generateKeyPair();

        String privateKey = WalletGenerator.getPrivateKeyHex(keyPair.getPrivate());
        String publicKey = WalletGenerator.getPublicKeyHex(keyPair.getPublic());
        String walletAddress = WalletGenerator.generateWalletAddress(keyPair.getPublic());
        String backupPhrase = WalletGenerator.generateBackupPhrase();

        // 2. Simpan sementara ke WalletData
        WalletData.nickname = nickname;
        WalletData.privateKey = privateKey;
        WalletData.publicKey = publicKey;
        WalletData.walletAddress = walletAddress;
        WalletData.backupPhrase = backupPhrase;

        // 3. Panggil service simpan user + wallet
        try {
            SupabaseUsers.registerWallet(); // method penting!
            System.out.println("✅ Register sukses!");

            // Coba ambil private_key kembali untuk verifikasi
            String retrievedPrivateKey = SupabaseUsers.getPrivateKeyFromUser();
            System.out.println("🔐 Retrieved Private Key: " + retrievedPrivateKey);
        } catch (Exception e) {
            e.printStackTrace(); // tampilkan stack trace error di konsol
            JOptionPane.showMessageDialog(this, "Gagal menyimpan wallet: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return; // stop eksekusi jika gagal simpan wallet
        }

        // 4. Buka form Phrase jika semua berhasil
        Phrase phrase = new Phrase();
        phrase.setVisible(true);
        this.dispose();

    } catch (Exception ex) {
        ex.printStackTrace(); // error dari proses di atas
        JOptionPane.showMessageDialog(this, "Gagal register: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }  
    }//GEN-LAST:event_accWalletActionPerformed

    private void nicknameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknameFieldActionPerformed
    String nickname = nicknameField.getText().trim();

    if (nickname.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nickname tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    Phrase phrase = new Phrase(nickname);
    phrase.setVisible(true);
    this.dispose();    
    }//GEN-LAST:event_nicknameFieldActionPerformed

    private void accWalletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accWalletMouseEntered
        // TODO add your handling code here:
        
        
        accWallet.setBackground(Color.decode("#1C45C2"));
        accWallet.setForeground(Color.WHITE);
    }//GEN-LAST:event_accWalletMouseEntered

    private void accWalletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accWalletMouseExited
              accWallet.setBackground(Color.decode("#FFFFFF"));
        accWallet.setForeground(Color.decode("#1C45C2"));
    }//GEN-LAST:event_accWalletMouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.Button accWallet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private login.TextField nicknameField;
    private login.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
