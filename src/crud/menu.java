/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohmat
 */
public class menu extends javax.swing.JFrame {

    String getNama,Sql;
    int getUsia,getID;
    PreparedStatement stm;
    Statement st;
    ResultSet rs;
    
    public menu() {
        initComponents();
        awal();
    }

    public void awal()
    {
        nama.requestFocusInWindow();
        usia.setEnabled(false);
        loadData();
        mahasiswa_id.setEnabled(false); 
    }
    public void loadData()
    {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA MAHASISWA");
        model.addColumn("USIA");
        try{
            String sql = "SELECT * FROM mahasiswa";            
            koneksi conn = new koneksi();
            Connection getkoneksi = conn.konek();
            if(getkoneksi==null){
                JOptionPane.showMessageDialog(null, "KOneksi gagal ! periksa server");
            }
            st = getkoneksi.createStatement();
            rs = st.executeQuery(sql);
            //menampilkan ke table
            while(rs.next()){
             model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
            tabel_mahasiswa.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        mahasiswa_id = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_mahasiswa = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAMA MAHSISWA");

        jLabel2.setText("USIA");

        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaKeyPressed(evt);
            }
        });

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tabel_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_mahasiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(simpan)
                                .addGap(30, 30, 30)
                                .addComponent(update)
                                .addGap(28, 28, 28)
                                .addComponent(hapus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(mahasiswa_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(usia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mahasiswa_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(hapus)
                    .addComponent(simpan))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        boolean valid =true;
        if(nama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama Harus di isi");
            valid =false;
            nama.requestFocusInWindow();
        }else if(usia.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Usia Harus di isi");
            valid = false;
            usia.requestFocusInWindow();
        }
        
        if(valid ==true){
            getNama = nama.getText();
            getUsia= Integer.parseInt(usia.getText());
        
        Sql = "INSERT INTO mahasiswa (nama , usia) VALUES (?,?)";
        koneksi conn = new koneksi();
           try (Connection getkoneksi = conn.konek()) {
               if(getkoneksi == null){
                   JOptionPane.showMessageDialog(null,"Koneksi gagal ! check server"); 
                   System.exit(0);
               }     
               stm= getkoneksi.prepareStatement(Sql);
               stm.setString(1,getNama);
               stm.setInt(2,getUsia);
               stm.executeUpdate();
               JOptionPane.showMessageDialog(null,"Berhasil");
               nama.setText("");
               usia.setText("");
               awal();
            }catch(SQLException e){
                    System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         boolean valid =true;
        if(nama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama harus di isi");
            valid = false;
            nama.requestFocusInWindow();
        }else if(usia.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Usia harus di isi");
             valid = false;
            usia.requestFocusInWindow();
        }
        
        
        if(valid == true){
            try{
                getID =Integer.parseInt( mahasiswa_id.getText());
                getNama = nama.getText();
                getUsia = Integer.parseInt(usia.getText());
                String str ="UPDATE mahasiswa SET nama =?,usia = ? WHERE id = ? ";                    
                koneksi conn = new koneksi();
                try (Connection getkoneksi = conn.konek()) {
                    if(getkoneksi == null){
                        JOptionPane.showMessageDialog(null,"Koneksi gagal ! check server");
                        System.exit(0);
                    }
 
                    stm =getkoneksi.prepareStatement(str);               
 
                    stm.setString(1,getNama);  
                    stm.setInt(2, getUsia);
                    stm.setInt(3,getID);
                    stm.execute();
                    JOptionPane.showMessageDialog(null,"Update Berhasil");
                    nama.setText("");
                    usia.setText("");
                    mahasiswa_id.setText("");
                    awal();
                    getkoneksi.close();
                }
            }catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null,"gagal "+e.getMessage());
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        boolean valid =true;
        
       if(nama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Pilih data terlebih dahulu");
            valid= false;
            nama.requestFocusInWindow();
        }else if(usia.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Pilih data terlebih dahulu");
            valid= false;
            usia.requestFocusInWindow();
        }
        
        if(valid == true){
            try{
                getID = Integer.parseInt(mahasiswa_id.getText());
                Sql = "DELETE FROM mahasiswa where id= ?";
                koneksi conn = new koneksi();
                    try (Connection getkoneksi = conn.konek()) {
                        stm =getkoneksi.prepareStatement(Sql);
                        stm.setInt(1,getID);
                        stm.execute();
                        //System.out.println(stm);
                        JOptionPane.showMessageDialog(null,getNama +"Di hapus");
                        nama.setText("");
                        usia.setText("");
                        mahasiswa_id.setText("");
                        awal();
                    }
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyPressed
        int key = evt.getKeyChar();
        if(key ==evt.VK_ENTER){
            usia.setEnabled(true);
            usia.requestFocusInWindow();
        }
    }//GEN-LAST:event_namaKeyPressed

    private void tabel_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_mahasiswaMouseClicked
        int Index = tabel_mahasiswa.getSelectedRow();
        getID = Integer.parseInt(tabel_mahasiswa.getValueAt(Index,0).toString());
        getNama = tabel_mahasiswa.getValueAt(Index,1).toString();
        getUsia = Integer.parseInt(tabel_mahasiswa.getValueAt(Index,2).toString());
        
        mahasiswa_id.setText(Integer.toString(getID));
        nama.setText(getNama);
        usia.setText(Integer.toString(getUsia));
        usia.setEnabled(true);
    }//GEN-LAST:event_tabel_mahasiswaMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mahasiswa_id;
    private javax.swing.JTextField nama;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel_mahasiswa;
    private javax.swing.JButton update;
    private javax.swing.JTextField usia;
    // End of variables declaration//GEN-END:variables
}
