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
package usu.rental.film.operator;

import java.awt.event.ActionListener;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import usu.rental.film.data.template.Pesan;
import usu.rental.film.widget.Table;
import usu.rental.film.widget.table.TableModelPesan;
import usu.rental.film.widget.table.render.DefaultTableCellRender;

/**
 *
 * @author  usu
 */
public class PanelPesan extends javax.swing.JPanel {

    private static final long serialVersionUID = -1;
    private TableModelPesan tableModel;

    /** Creates new form PanelPesan */
    public PanelPesan() {
        initVariables();
        initComponents();
        initFinals();
        initActions();
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        textCari.setEnabled(enabled);
        textIsiPesan.setEnabled(enabled);
        textJudulPesan.setEnabled(enabled);
        textPengirim.setEnabled(enabled);
        textWaktuPengiriman.setEnabled(enabled);
        buttonBalas.setEnabled(enabled);
        buttonHapus.setEnabled(enabled);
        buttonKirim.setEnabled(enabled);
        buttonRIncian.setEnabled(enabled);
        buttonSegarkan.setEnabled(enabled);
    }

    public void addActionListenerBalas(ActionListener l) {
        buttonBalas.addActionListener(l);
    }

    public void addActionListenerHapus(ActionListener l) {
        buttonHapus.addActionListener(l);
    }

    public void addActionListenerKirim(ActionListener l) {
        buttonKirim.addActionListener(l);
    }

    public void addActionListenerRincian(ActionListener l) {
        buttonRIncian.addActionListener(l);
    }

    public void addActionListenerSegarkan(ActionListener l) {
        buttonSegarkan.addActionListener(l);
    }

    public void reset() {
        textCari.setText("");
        textIsiPesan.setText("");
        textJudulPesan.setText("");
        textPengirim.setText("");
        textWaktuPengiriman.setText("");
    }

    private void initActions() {
        textCari.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                filterTable(textCari.getText());
            }

            public void removeUpdate(DocumentEvent e) {
                filterTable(textCari.getText());
            }

            public void changedUpdate(DocumentEvent e) {
                filterTable(textCari.getText());
            }
        });

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            private Pesan temp;

            public void valueChanged(ListSelectionEvent e) {
                try {
                    int i = table.convertRowIndexToModel(table.getSelectedRow());
                    temp = tableModel.get(i);
                    textIsiPesan.setText(temp.getIsiPesan());
                    textJudulPesan.setText(temp.getJudulPesan());
                    textPengirim.setText(temp.getOperatorPengirim());
                    textWaktuPengiriman.setText(temp.getWaktuPengiriman().toString());
                } catch (IndexOutOfBoundsException ex) {
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    public void filterTable(String text) {
        if (text.trim().equals("")) {
            ((TableRowSorter<TableModel>) table.getRowSorter()).setRowFilter(null);
        } else {
            ((TableRowSorter<TableModel>) table.getRowSorter()).setRowFilter(RowFilter.regexFilter(text));
        }
    }

    public Table getTable() {
        return table;
    }

    public TableModelPesan getTableModel() {
        return tableModel;
    }

    public String getPengirim() {
        return textPengirim.getText();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usu.rental.film.widget.Label label1 = new usu.rental.film.widget.Label();
        textCari = new usu.rental.film.widget.TextBox();
        usu.rental.film.widget.ScrollPane scrollPane1 = new usu.rental.film.widget.ScrollPane();
        table = new usu.rental.film.widget.Table();
        usu.widget.glass.PanelGlass panelGlass1 = new usu.widget.glass.PanelGlass();
        usu.rental.film.widget.Label label2 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label3 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label4 = new usu.rental.film.widget.Label();
        usu.rental.film.widget.Label label5 = new usu.rental.film.widget.Label();
        textPengirim = new usu.rental.film.widget.TextBox();
        textWaktuPengiriman = new usu.rental.film.widget.TextBox();
        textJudulPesan = new usu.rental.film.widget.TextBox();
        buttonRIncian = new usu.rental.film.widget.Button();
        usu.rental.film.widget.ScrollPane scrollPane2 = new usu.rental.film.widget.ScrollPane();
        textIsiPesan = new usu.rental.film.widget.TextArea();
        buttonSegarkan = new usu.rental.film.widget.Button();
        buttonHapus = new usu.rental.film.widget.Button();
        buttonBalas = new usu.rental.film.widget.Button();
        buttonKirim = new usu.rental.film.widget.Button();

        setOpaque(false);

        label1.setDisplayedMnemonic('C');
        label1.setText("cari (case sensitive) :");

        textCari.setText("cari");
        textCari.setFocusAccelerator('C');

        scrollPane1.setViewportView(table);

        panelGlass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGlass1.setOpaqueImage(false);
        panelGlass1.setRound(false);

        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("pengirim :");

        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("waktu pengiriman");

        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("judul pesan :");

        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("isi pesan :");

        textPengirim.setEditable(false);
        textPengirim.setText("pengirim");

        textWaktuPengiriman.setEditable(false);
        textWaktuPengiriman.setText("waktu pengiriman");

        textJudulPesan.setEditable(false);
        textJudulPesan.setText("judul pesan");

        buttonRIncian.setText("rincian");

        textIsiPesan.setColumns(20);
        textIsiPesan.setEditable(false);
        textIsiPesan.setRows(5);
        scrollPane2.setViewportView(textIsiPesan);

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(textPengirim, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRIncian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textWaktuPengiriman, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(textJudulPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRIncian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textWaktuPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJudulPesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap())
        );

        buttonSegarkan.setMnemonic('S');
        buttonSegarkan.setText("segarkan");

        buttonHapus.setMnemonic('H');
        buttonHapus.setText("hapus");

        buttonBalas.setMnemonic('B');
        buttonBalas.setText("balas");

        buttonKirim.setMnemonic('K');
        buttonKirim.setText("kirim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(panelGlass1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCari, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonSegarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                        .addComponent(buttonKirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSegarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonKirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    usu.rental.film.widget.Button buttonBalas;
    usu.rental.film.widget.Button buttonHapus;
    usu.rental.film.widget.Button buttonKirim;
    usu.rental.film.widget.Button buttonRIncian;
    usu.rental.film.widget.Button buttonSegarkan;
    usu.rental.film.widget.Table table;
    usu.rental.film.widget.TextBox textCari;
    usu.rental.film.widget.TextArea textIsiPesan;
    usu.rental.film.widget.TextBox textJudulPesan;
    usu.rental.film.widget.TextBox textPengirim;
    usu.rental.film.widget.TextBox textWaktuPengiriman;
    // End of variables declaration//GEN-END:variables

    private void initFinals() {
        table.setModel(tableModel);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRender());
        }
    }
    // End of variables declaration

    private void initVariables() {
        tableModel = new TableModelPesan();
    }
}