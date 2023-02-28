/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Meteorolog;
import domen.Prognoza;
import domen.PrognozaRegion;
import domen.Region;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import konstante.Operacije;
import kontroler.Komunikacija;
import modeli.ModelTabeleKlijent;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Stefan
 */
public class KlijentskaForma extends javax.swing.JFrame {
    private Meteorolog ulogovani;
    /**
     * Creates new form KlijentskaForma
     */
    public KlijentskaForma() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Klijentska forma");
        tblPrognoze.setModel(new ModelTabeleKlijent());
        popuniRegione();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOpis = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbRegion = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbMeteoAlarm = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbPojava = new javax.swing.JComboBox<>();
        btnDodajZaRegion = new javax.swing.JButton();
        btnObrisiZaRegion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrognoze = new javax.swing.JTable();
        btnSacuvajZaDan = new javax.swing.JButton();
        txtDan = new javax.swing.JFormattedTextField();
        txtTemperatura = new javax.swing.JFormattedTextField();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dan (dd.MM.yyyy):");

        jLabel2.setText("Opis:");

        txtOpis.setColumns(20);
        txtOpis.setRows(5);
        txtOpis.setText("Prognoza za dan 28.02.2023");
        jScrollPane1.setViewportView(txtOpis);

        jLabel3.setText("Temperatura:");

        jLabel4.setText("Region:");

        cmbRegion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Meteo alarm:");

        cmbMeteoAlarm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zeleni", "Zuti", "Narandzasti", "Crveni" }));

        jLabel6.setText("Pojava:");

        cmbPojava.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nema", "Vetar", "Kisa", "Sneg/Led", "Grmljavina", "Magla", "Sumski pozari", "Ekstremno visoke temperature", "Ekstremno niske temperature" }));

        btnDodajZaRegion.setText("Dodaj prognozu za region");
        btnDodajZaRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajZaRegionActionPerformed(evt);
            }
        });

        btnObrisiZaRegion.setText("Obrisi prognozu za region");
        btnObrisiZaRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiZaRegionActionPerformed(evt);
            }
        });

        tblPrognoze.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblPrognoze);

        btnSacuvajZaDan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSacuvajZaDan.setText("Sacuvaj prognozu za dan");
        btnSacuvajZaDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajZaDanActionPerformed(evt);
            }
        });

        txtDan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));
        txtDan.setText("28.02.2023");

        txtTemperatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtTemperatura.setText("25");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                        .addComponent(cmbMeteoAlarm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbPojava, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDan)
                                        .addComponent(txtTemperatura))
                                    .addComponent(cmbRegion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSacuvajZaDan))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajZaRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisiZaRegion)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbMeteoAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPojava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajZaRegion)
                    .addComponent(btnObrisiZaRegion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSacuvajZaDan)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajZaRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajZaRegionActionPerformed
        if(txtTemperatura.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Niste uneli temperaturu!");
            return;
        }
        
        Region region=(Region) cmbRegion.getSelectedItem();
        PrognozaRegion pr=new PrognozaRegion(null, -1, Double.parseDouble(txtTemperatura.getText()), (String)cmbMeteoAlarm.getSelectedItem(), (String)cmbPojava.getSelectedItem(), region);
        
        
        if(pr.getTemperatura()<-50 || pr.getTemperatura()>50){
            JOptionPane.showMessageDialog(this, "Temperatura mora biti u intervalu od -50 do 50!");
            return;
        }
        
        ModelTabeleKlijent mt=(ModelTabeleKlijent) tblPrognoze.getModel();
        if(mt.postojiRegion(region)){
            JOptionPane.showMessageDialog(this, "Vec ste uneli prgonozu za taj region!");
            return;
        }
        mt.dodajPrognozuRegion(pr);  
    }//GEN-LAST:event_btnDodajZaRegionActionPerformed

    private void btnObrisiZaRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiZaRegionActionPerformed
        int row=tblPrognoze.getSelectedRow();
        
        if(row!=-1){
            ModelTabeleKlijent mt=(ModelTabeleKlijent) tblPrognoze.getModel();
            mt.obrisiPrognozu(row);
        }
    }//GEN-LAST:event_btnObrisiZaRegionActionPerformed

    private void btnSacuvajZaDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajZaDanActionPerformed
        if(txtDan.getText().isEmpty() || txtOpis.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Niste uneli dan ili opis!");
            return;
        }
        if(daLiJeMeteorologUneoTajDan()){
            JOptionPane.showMessageDialog(this, "Vec ste uneli prognozu za taj dan!");
            return;
        }
        
        try {
            ModelTabeleKlijent mt=(ModelTabeleKlijent) tblPrognoze.getModel();
            
            if(mt.getLista().size()!=cmbRegion.getItemCount()){
                JOptionPane.showMessageDialog(this, "Morate uneti prognozu za svaki region!");
                return;
            }
            
            SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
            Prognoza prognoza=new Prognoza(-1, sdf.parse(txtDan.getText()), txtOpis.getText(), ulogovani, mt.getLista());
            
            KlijentskiZahtev kz=new KlijentskiZahtev();
            kz.setParametar(prognoza);
            kz.setOperacija(Operacije.SACUVAJ_PROGNOZU);
            
            Komunikacija.getInstance().posaljiZahtev(kz);
            ServerskiOdgovor so=Komunikacija.getInstance().primiOdgovor();
            
            boolean uspesno=(boolean) so.getOdgovor();
            
            if(uspesno){
                JOptionPane.showMessageDialog(this, "Prognoza za dan uspesno sacuvana!");
                return;
            }
            JOptionPane.showMessageDialog(this, "Greska prilikom cuvanja prognoze za dan!!!");
            
        } catch (ParseException ex) {
            Logger.getLogger(KlijentskaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSacuvajZaDanActionPerformed

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
            java.util.logging.Logger.getLogger(KlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KlijentskaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajZaRegion;
    private javax.swing.JButton btnObrisiZaRegion;
    private javax.swing.JButton btnSacuvajZaDan;
    private javax.swing.JComboBox<String> cmbMeteoAlarm;
    private javax.swing.JComboBox<String> cmbPojava;
    private javax.swing.JComboBox cmbRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPrognoze;
    private javax.swing.JFormattedTextField txtDan;
    private javax.swing.JTextArea txtOpis;
    private javax.swing.JFormattedTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables

    public void setUlogovani(Meteorolog ulogovani) {
        this.ulogovani = ulogovani;
    }

    private void popuniRegione() {
        
        KlijentskiZahtev kz=new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_REGIONE);
        
        Komunikacija.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so=Komunikacija.getInstance().primiOdgovor();
        
        ArrayList<Region> listaRegiona=(ArrayList<Region>) so.getOdgovor();
        
        if(listaRegiona.size()==0){
            JOptionPane.showMessageDialog(this, "Niste uneli nijedan region!");
            return;
        }
        
        cmbRegion.removeAllItems();
        for(Region r : listaRegiona){
            cmbRegion.addItem(r);
        }
    }

    private boolean daLiJeMeteorologUneoTajDan() {
        
            SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
            HashMap<Integer,Object> mapa=new HashMap<>();
            mapa.put(1, ulogovani.getMeteorologID());
        try {
            mapa.put(2, sdf.parse(txtDan.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(KlijentskaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            KlijentskiZahtev kz=new KlijentskiZahtev();
            kz.setParametar(mapa);
            kz.setOperacija(Operacije.POSTOJI_DAN_U_BAZI);
            
            Komunikacija.getInstance().posaljiZahtev(kz);
            ServerskiOdgovor so=Komunikacija.getInstance().primiOdgovor();
            
            boolean uspesno=(boolean) so.getOdgovor();
            
            return uspesno;
            
       
    }
}
