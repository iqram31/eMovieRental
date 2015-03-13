/*
 * DILARANG MENGHAPUS ATAU MENGEDIT COPYRIGHT INI.
 * 
 * Copyright 2008 echo.khannedy@gmail.com. 
 * All rights reserved.
 * 
 * Semua isi dalam file ini adalah hak milik dari echo.khannedy@gmail.com
 * Anda tak diperkenankan untuk menggunakan file atau mengubah file
 * ini kecuali anda tidak menghapus atau merubah lisence ini.
 * 
 * File ini dibuat menggunakan :
 * IDE        : NetBeans
 * NoteBook   : Acer Aspire 5920G
 * OS         : Windows Vista
 * Java       : Java 1.6
 * 
 */
package usu.rental.film.admin;

import java.awt.event.ActionListener;
import java.sql.Date;

/**
 *
 * @author  usu
 */
public class PanelSaringPengembalian extends javax.swing.JPanel {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    /** Creates new form PanelSaringPeminjaman */
    public PanelSaringPengembalian() {
        initComponents();
    }

    public void addActionListenerBatal(ActionListener l) {
        buttonBatal.addActionListener(l);
    }

    public void addActionListenerSaring(ActionListener l) {
        buttonSaring.addActionListener(l);
    }

    public String getIdOperator() {
        if (textIdOperator.isEnabled()) {
            return textIdOperator.getText();
        }
        return null;
    }

    public Date getTanggalDari() {
        if (textTanggalDari.isEnabled()) {
            return new Date(((java.util.Date) textTanggalDari.getValue()).getTime());
        }
        return null;
    }

    public Date getTanggalSampai() {
        if (textTanggalSampai.isEnabled()) {
            return new Date(((java.util.Date) textTanggalSampai.getValue()).getTime());
        }
        return null;
    }

    public Integer getDenda() {
        if (textDenda.isEnabled()) {
            return new Integer(textDenda.getValue().toString());
        }
        return null;
    }

    public Integer getTotalTerlambat() {
        if (textTotalKeterlambatan.isEnabled()) {
            return new Integer(textTotalKeterlambatan.getValue().toString());
        }
        return null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonSaring = new usu.rental.film.widget.Button();
        buttonBatal = new usu.rental.film.widget.Button();
        usu.widget.glass.PanelGlass panelGlass1 = new usu.widget.glass.PanelGlass();
        usu.rental.film.widget.Label label3 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label6 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label4 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label5 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label1 = new usu.rental.film.widget.Label();
        textIdOperator = new usu.rental.film.widget.TextBox();
        textTanggalDari = new usu.rental.film.widget.FormatterBox();
        textTanggalSampai = new usu.rental.film.widget.FormatterBox();
        textTotalKeterlambatan = new usu.rental.film.widget.FormatterBox();
        textDenda = new usu.rental.film.widget.FormatterBox();
        javax.swing.JCheckBox jCheckBox1 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox2 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox3 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox4 = new javax.swing.JCheckBox();
        javax.swing.JCheckBox jCheckBox5 = new javax.swing.JCheckBox();

        setOpaque(false);

        buttonSaring.setMnemonic('G');
        buttonSaring.setText("saring");

        buttonBatal.setMnemonic('B');
        buttonBatal.setText("batal");

        panelGlass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelGlass1.setOpaqueImage(false);
        panelGlass1.setRound(false);

        label3.setDisplayedMnemonic('O');
        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("id operator :");

        label6.setDisplayedMnemonic('L');
        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("tanggal pengembalian dari :");

        label4.setDisplayedMnemonic('H');
        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("total hari terlambat :");

        label5.setDisplayedMnemonic('D');
        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("denda keterlambatan :");

        label1.setDisplayedMnemonic('P');
        label1.setText("tanggal pengembalian sampai");

        textIdOperator.setFocusAccelerator('O');
        textIdOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdOperatorActionPerformed(evt);
            }
        });

        textTanggalDari.setFocusAccelerator('L');
        textTanggalDari.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        textTanggalDari.setValue(new java.util.Date());
        textTanggalDari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTanggalDariActionPerformed(evt);
            }
        });

        textTanggalSampai.setFocusAccelerator('P');
        textTanggalSampai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        textTanggalSampai.setValue(new java.util.Date());
        textTanggalSampai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTanggalSampaiActionPerformed(evt);
            }
        });

        textTotalKeterlambatan.setFocusAccelerator('H');
        textTotalKeterlambatan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textTotalKeterlambatan.setValue(new Integer(0));
        textTotalKeterlambatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTotalKeterlambatanActionPerformed(evt);
            }
        });

        textDenda.setFocusAccelerator('D');
        textDenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textDenda.setValue(new Integer(0));
        textDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDendaActionPerformed(evt);
            }
        });

        jCheckBox1.setFocusable(false);
        jCheckBox1.setOpaque(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textIdOperator, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox2.setFocusable(false);
        jCheckBox2.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textTanggalDari, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox2, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox3.setFocusable(false);
        jCheckBox3.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textTanggalSampai, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox3, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox4.setFocusable(false);
        jCheckBox4.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textTotalKeterlambatan, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox4, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox5.setFocusable(false);
        jCheckBox5.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, textDenda, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCheckBox5, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDenda, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(textTotalKeterlambatan, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(textTanggalSampai, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(textTanggalDari, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(textIdOperator, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addContainerGap())
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalKeterlambatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSaring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSaring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

private void textIdOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdOperatorActionPerformed
    textTanggalDari.requestFocusInWindow();
}//GEN-LAST:event_textIdOperatorActionPerformed

private void textTanggalDariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTanggalDariActionPerformed
    textTanggalSampai.requestFocusInWindow();
}//GEN-LAST:event_textTanggalDariActionPerformed

private void textTanggalSampaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTanggalSampaiActionPerformed
    textTotalKeterlambatan.requestFocusInWindow();
}//GEN-LAST:event_textTanggalSampaiActionPerformed

private void textTotalKeterlambatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalKeterlambatanActionPerformed
    textDenda.requestFocusInWindow();
}//GEN-LAST:event_textTotalKeterlambatanActionPerformed

private void textDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDendaActionPerformed
    buttonSaring.requestFocusInWindow();
}//GEN-LAST:event_textDendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    usu.rental.film.widget.Button buttonBatal;
    usu.rental.film.widget.Button buttonSaring;
    usu.rental.film.widget.FormatterBox textDenda;
    usu.rental.film.widget.TextBox textIdOperator;
    usu.rental.film.widget.FormatterBox textTanggalDari;
    usu.rental.film.widget.FormatterBox textTanggalSampai;
    usu.rental.film.widget.FormatterBox textTotalKeterlambatan;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}