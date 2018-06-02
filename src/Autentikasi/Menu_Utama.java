/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autentikasi;

import Config.koneksi;
import java.sql.*;

/**
 *
 * @author Muhammad Iqbal
 */
public class Menu_Utama extends javax.swing.JFrame {
    
    koneksi db = new koneksi();
    
    private String _username;
    
    protected Boolean _is_grant = false;

    /**
     * Creates new form Menu_Utama
     */
    public Menu_Utama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l_status = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        l_user = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        l_tanggal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_file = new javax.swing.JMenu();
        submenu_pengguna = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        submenu_rekening = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        submenu_persetujuan = new javax.swing.JMenuItem();
        m_laporan = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        m_transaksi = new javax.swing.JMenu();
        m_pembentukan_dana = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        m_pengeluaran = new javax.swing.JMenuItem();
        m_keluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI KAS KACIL - PT. Exlayer Teknologi Indonesia");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(2, 47, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rancang Bangun Sistem Pengeluaran Kas Kecil");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PT. Exlayer Teknologi Indonesia");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" Intiland Tower - Annex, ");

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("8th Floor. Jl. Jend. Sudirman Kav 32,");

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Jakarta 10220\t");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Telepon");

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("(021) -57853468 ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Aplikasi Kas Kecil - PT. Exlayer Teknologi Indonesia");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Status : ");

        l_status.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        l_status.setForeground(new java.awt.Color(0, 204, 0));
        l_status.setText("-");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Login Info : ");

        l_user.setForeground(new java.awt.Color(255, 153, 0));
        l_user.setText("-");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tanggal : ");

        l_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        l_tanggal.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_status, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_user, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(l_status)
                    .addComponent(jLabel13)
                    .addComponent(l_user)
                    .addComponent(jLabel15)
                    .addComponent(l_tanggal))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(64, 30));

        m_file.setText("File");
        m_file.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        submenu_pengguna.setText("Pengguna");
        submenu_pengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_penggunaActionPerformed(evt);
            }
        });
        m_file.add(submenu_pengguna);
        m_file.add(jSeparator3);

        submenu_rekening.setText("Rekening");
        submenu_rekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_rekeningActionPerformed(evt);
            }
        });
        m_file.add(submenu_rekening);
        m_file.add(jSeparator4);

        submenu_persetujuan.setText("Persetujuan ( 0 )");
        submenu_persetujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_persetujuanActionPerformed(evt);
            }
        });
        m_file.add(submenu_persetujuan);

        jMenuBar1.add(m_file);

        m_laporan.setText("Laporan");
        m_laporan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem6.setText("Data Jurnal Umum");
        m_laporan.add(jMenuItem6);
        m_laporan.add(jSeparator2);

        jMenuItem1.setText("Register & Rekapitulasi Pengeluaran Kas Kecil");
        m_laporan.add(jMenuItem1);

        jMenuBar1.add(m_laporan);

        m_transaksi.setText("Transaksi");
        m_transaksi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        m_pembentukan_dana.setText("Pembentukan Dana Kas Kecil");
        m_pembentukan_dana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_pembentukan_danaActionPerformed(evt);
            }
        });
        m_transaksi.add(m_pembentukan_dana);
        m_transaksi.add(jSeparator5);

        m_pengeluaran.setText("Pengeluaran Dana Kas Kecil");
        m_pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_pengeluaranActionPerformed(evt);
            }
        });
        m_transaksi.add(m_pengeluaran);

        jMenuBar1.add(m_transaksi);

        m_keluar.setText("Keluar");
        m_keluar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        m_keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_keluarMouseClicked(evt);
            }
        });
        jMenuBar1.add(m_keluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this._check_permission();
        this._check_persetujuan();
        l_status.setText(db._status);
        l_tanggal.setText(koneksi.get_date_with_format("YYYY-mm-dd"));
        try {
            String query = "SELECT jabatan FROM sessions WHERE username = '"+this._username+"'";
            ResultSet check = db.runQuery(query);
            if(check.next()){
                if("Admin".equals(check.getString("jabatan"))){
                    m_transaksi.setVisible(false);
                } else {
                    m_file.setVisible(false);
                    m_laporan.setVisible(false);
                }
            }
            
        } catch (SQLException err) { koneksi.print(err.getMessage()); }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            db.runQueryUpdate("DELETE FROM sessions WHERE username = '"+this._username+"'");
            koneksi.popup_message("Anda Telah Logout");
            new Login().setVisible(true);
        } catch (SQLException err) { koneksi.print(err.getMessage()); }
    }//GEN-LAST:event_formWindowClosing

    private void m_keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_keluarMouseClicked
        try {
            db.runQueryUpdate("DELETE FROM sessions WHERE username = '"+this._username+"'");
            koneksi.popup_message("Anda Telah Logout");
            new Login().setVisible(true);
        } catch (SQLException err) { koneksi.print(err.getMessage()); }
        this.dispose();
    }//GEN-LAST:event_m_keluarMouseClicked

    private void submenu_penggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_penggunaActionPerformed
       Admin.Menu_Pengguna portal = new Admin.Menu_Pengguna();
       portal.grant_permission(true);
       portal.setVisible(true);
    }//GEN-LAST:event_submenu_penggunaActionPerformed

    private void submenu_rekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_rekeningActionPerformed
        Admin.Menu_Rekening portal = new Admin.Menu_Rekening();
        portal.setVisible(true);
    }//GEN-LAST:event_submenu_rekeningActionPerformed

    private void submenu_persetujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_persetujuanActionPerformed
        Admin.Menu_Persetujuan portal = new Admin.Menu_Persetujuan();
        portal.grant_permission(true);
        portal.setVisible(true);
    }//GEN-LAST:event_submenu_persetujuanActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this._check_persetujuan();
    }//GEN-LAST:event_formWindowGainedFocus

    private void m_pembentukan_danaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_pembentukan_danaActionPerformed
        Keuangan.Menu_Pembentukan portal = new Keuangan.Menu_Pembentukan();
        portal.grant_permission(true);
        portal.setVisible(true);
    }//GEN-LAST:event_m_pembentukan_danaActionPerformed

    private void m_pengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_pengeluaranActionPerformed
        Keuangan.Menu_Pengeluaran portal = new Keuangan.Menu_Pengeluaran();
        portal.grant_permission(true);
        portal.setVisible(true);
    }//GEN-LAST:event_m_pengeluaranActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_Utama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel l_status;
    private javax.swing.JLabel l_tanggal;
    private javax.swing.JLabel l_user;
    private javax.swing.JMenu m_file;
    private javax.swing.JMenu m_keluar;
    private javax.swing.JMenu m_laporan;
    private javax.swing.JMenuItem m_pembentukan_dana;
    private javax.swing.JMenuItem m_pengeluaran;
    private javax.swing.JMenu m_transaksi;
    private javax.swing.JMenuItem submenu_pengguna;
    private javax.swing.JMenuItem submenu_persetujuan;
    private javax.swing.JMenuItem submenu_rekening;
    // End of variables declaration//GEN-END:variables

    
    // PUBLIC CLASS
    //////////////////////////////////////////////////////////////////////////////////////
    public void set_user(String _username, String _name){
        this._username = _username;
        l_user.setText(_name+" ("+_username+")");
    }
    
    //---------------------------------------------------------------------------------//
    
    public void grant_permission(Boolean _grant){
        this._is_grant = _grant;
    }
    
    
    
    // PROTECTED CLASS
    //////////////////////////////////////////////////////////////////////////////////////
    protected void _check_permission(){
        if(this._is_grant.equals(false)) {
            
            koneksi.popup_message("Anda tidak memiliki izin!");
            this.dispose();
            
        }
    }
    
    //---------------------------------------------------------------------------------//
    
    protected void _check_persetujuan(){
        try {
            
            ResultSet result = db.runQuery("SELECT COUNT(status) FROM data_pengajuan "
                                         + "WHERE status = 'Belum Di Setujui'");
            if(result.next()) submenu_persetujuan.setText("Persetujuan ( "+result.getString(1)+" )");
            
        } catch (SQLException err) { koneksi.print(err.getMessage()); }
    }
    
    
    
    
    // PRIVATE CLASS
    //////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    // END OF CLASS DECLARATION
}
