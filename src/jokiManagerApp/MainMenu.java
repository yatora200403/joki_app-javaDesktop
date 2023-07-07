/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokiManagerApp;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.ImageIcon;

/**
 *
 * @author Yatora
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    Packets pack = new Packets();
    int max,qty,num;
    private static final String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String phonePattern = "^\\d{3}-\\d{3}-\\d{4}$";
    public MainMenu() {
        initComponents();
        
        this.num = num;
        
        String pathIcon = System.getProperty("user.dir") + "/src/icon/logo-jokiinaja.jpeg";
        ImageIcon icon = new ImageIcon(pathIcon);
        setIconImage(icon.getImage());
        
        pnlOrderList.setVisible(true);
        pnlOrderPacket.setVisible(false);
        
        tblOrder.getTableHeader().setReorderingAllowed(false);
        txtProcess.setEnabled(false);
        txtProcess.setText("waktu pengerjaan");
        
        for (String item:Packets.getCbPackets()){
            cbPackets.addItem(item);
        }
    }
    private void mouseEnter(JButton btn){
        btn.setBackground(Color.WHITE);
        btn.setForeground(Color.BLACK);
    }
    private void mouseExit(JButton btn){
        btn.setBackground(new Color(0,51,51));
        btn.setForeground(Color.WHITE);
    }
    private void cleanForm(){
        placeholderTextField(txtCustomer, "Customer Name");
        placeholderTextField(txtConfirmAddress, "Confirmation Method");
        placeholderTextField(txtAccountName, "Account Name");
        placeholderTextArea(txtRequest, "Customer Request");
        lblStartRank.setText("empty");
        lblEndRank.setText("empty");
        cbPayment.removeAllItems();
        cbConfirm.removeAllItems();
        cbStart.removeAllItems();
        cbEnd.removeAllItems();
        cbPackets.setSelectedIndex(0);
        lblTotal.setText("0");
        txtProcess.setText("empty");
    }
    private void activateForm(){
        txtCustomer.setEnabled(true);
        txtAccountName.setEnabled(true);
        txtRequest.setEnabled(true);
        cbPayment.setEnabled(true);
        cbConfirm.setEnabled(true);
        txtConfirmAddress.setEnabled(true);
        btnOrder.setEnabled(true);
        btnCancel.setEnabled(true);
        
        for(String item:Packets.getCbPaymentMethod()){
            cbPayment.addItem(item);
        }
        for(String item:Packets.getCbConfimationMethod()){
            cbConfirm.addItem(item);
        }
    }
    private void nonactiveForm(){
        txtCustomer.setEnabled(false);
        txtAccountName.setEnabled(false);
        cbStart.setEnabled(false);
        cbEnd.setEnabled(false);
        cbEnd.setEditable(false);
        txtRequest.setEnabled(false);
        cbPayment.setEnabled(false);
        cbConfirm.setEnabled(false);
        txtConfirmAddress.setEnabled(false);
        btnOrder.setEnabled(false);
        btnCancel.setEnabled(false);
        lblTotal.setText("0");
    }
    public static void setPenjoki(String penjokiName,int selectedRow){
        DefaultTableModel model = (DefaultTableModel)tblOrder.getModel();
        model.setValueAt(penjokiName, selectedRow, 11);
        
    }
    private void placeholderTextField(JTextField textField, String placeholder){
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(textField.getText().equals(placeholder)){
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(textField.getText().isEmpty()){
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
            
        });
    }
    private void placeholderTextArea(JTextArea textArea, String placeholder){
        textArea.setText(placeholder);
        textArea.setForeground(Color.GRAY);
        textArea.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(textArea.getText().equals(placeholder)){
                    textArea.setText("");
                    textArea.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(textArea.getText().isEmpty()){
                    textArea.setText(placeholder);
                    textArea.setForeground(Color.GRAY);
                }
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlOrderList = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnRemoveOrder = new javax.swing.JButton();
        btnWip = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        pnlOrderPacket = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtConfirmAddress = new javax.swing.JTextField();
        cbConfirm = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbPayment = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblEndRank = new javax.swing.JLabel();
        lblStartRank = new javax.swing.JLabel();
        cbStart = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtRequest = new javax.swing.JTextArea();
        txtCustomer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAccountName = new javax.swing.JTextField();
        cbEnd = new javax.swing.JComboBox<>();
        txtProcess = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnOrder = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbPackets = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnPS = new javax.swing.JButton();
        btnOrderList = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Joki-In Aja");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(255, 255, 0));
        pnlMenu.setMinimumSize(new java.awt.Dimension(630, 340));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOrderList.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrderList.setPreferredSize(new java.awt.Dimension(630, 273));
        pnlOrderList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Customer", "Akun", "Paket", "Pembayaran", "Kontak Konfirmasi", "Start Rank", "End Rank", "Waktu pengerjaan", "Total Harga", "Request", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblOrder.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(tblOrder);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 260));

        btnRemoveOrder.setText("Hapus Order");
        btnRemoveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderActionPerformed(evt);
            }
        });
        jPanel7.add(btnRemoveOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnWip.setText("WIP");
        btnWip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWipActionPerformed(evt);
            }
        });
        jPanel7.add(btnWip, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 100, -1));

        btnDone.setText("Selesai");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel7.add(btnDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 100, -1));

        pnlOrderList.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 570, 320));

        pnlMenu.add(pnlOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 640, 380));

        pnlOrderPacket.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrderPacket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("0");
        jPanel4.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 80, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Rp.");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        txtConfirmAddress.setText("jTextField2");
        jPanel4.add(txtConfirmAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, -1));

        cbConfirm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cbConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConfirmActionPerformed(evt);
            }
        });
        jPanel4.add(cbConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, -1));

        jLabel6.setText("Kontak Konfirmasi");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        cbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jPanel4.add(cbPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, -1));

        jLabel5.setText("Metode Pembayaran");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlOrderPacket.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 250, 260));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEndRank.setText("empty");
        jPanel5.add(lblEndRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        lblStartRank.setText("empty");
        jPanel5.add(lblStartRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        cbStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cbStart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStartItemStateChanged(evt);
            }
        });
        cbStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbStartKeyPressed(evt);
            }
        });
        jPanel5.add(cbStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, -1));

        jLabel3.setText("Waktu Pengerjaan");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtRequest.setColumns(20);
        txtRequest.setRows(5);
        txtRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(txtRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, 60));

        txtCustomer.setText("jTextField1");
        jPanel5.add(txtCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, -1));

        jLabel4.setText("Nama Kustomer");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel7.setText("Akun");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtAccountName.setText("jTextField1");
        jPanel5.add(txtAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 270, -1));

        cbEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        cbEnd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEndItemStateChanged(evt);
            }
        });
        cbEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbEndKeyPressed(evt);
            }
        });
        jPanel5.add(cbEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 110, -1));

        txtProcess.setText("jTextField1");
        jPanel5.add(txtProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 270, -1));

        pnlOrderPacket.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 290, 320));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanel6.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 100, 30));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel6.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 11, 100, 30));

        pnlOrderPacket.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 250, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("ADD ORDER");
        pnlOrderPacket.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        cbPackets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cbPackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPacketsActionPerformed(evt);
            }
        });
        pnlOrderPacket.add(cbPackets, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, -1));

        pnlMenu.add(pnlOrderPacket, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 630, 380));

        jPanel1.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 590, 380));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.setBorder(null);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU");

        btnPS.setBackground(new java.awt.Color(0, 51, 51));
        btnPS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPS.setForeground(new java.awt.Color(255, 255, 255));
        btnPS.setText("JOKI");
        btnPS.setBorder(null);
        btnPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPSMouseExited(evt);
            }
        });
        btnPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPSActionPerformed(evt);
            }
        });

        btnOrderList.setBackground(new java.awt.Color(0, 51, 51));
        btnOrderList.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnOrderList.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderList.setText("ORDER LIST");
        btnOrderList.setBorder(null);
        btnOrderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrderListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrderListMouseExited(evt);
            }
        });
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnPS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 380));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setText("Joki-In Aja");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPSMouseEntered
        // TODO add your handling code here:
        mouseEnter(btnPS); 
    }//GEN-LAST:event_btnPSMouseEntered

    private void btnPSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPSMouseExited
        // TODO add your handling code here:
        mouseExit(btnPS);
    }//GEN-LAST:event_btnPSMouseExited

    private void btnOrderListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderListMouseEntered
        // TODO add your handling code here:
        mouseEnter(btnOrderList);
    }//GEN-LAST:event_btnOrderListMouseEntered

    private void btnOrderListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderListMouseExited
        // TODO add your handling code here:
        btnOrderList.setBackground(new Color(0,51,51));
        btnOrderList.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnOrderListMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        mouseEnter(btnExit);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(new Color(204,0,0));
        btnExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        // TODO add your handling code here:
        pnlOrderList.setVisible(true);
        pnlOrderPacket.setVisible(false);

    }//GEN-LAST:event_btnOrderListActionPerformed

    private void btnPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPSActionPerformed
        // TODO add your handling code here:
        pnlOrderList.setVisible(false);
        pnlOrderPacket.setVisible(true);
        cleanForm();
        nonactiveForm();
    }//GEN-LAST:event_btnPSActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Are you sure ? ", "Confirm", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            dispose();
        }else{
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbPacketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPacketsActionPerformed
        // TODO add your handling code here:
        int packetIndex = cbPackets.getSelectedIndex();
        activateForm();  
        switch (packetIndex) {
            case 1:
            {
                cbPackets.setEnabled(false);
                cbStart.setEnabled(true);
                lblStartRank.setText("Choose Rank");
                lblEndRank.setText("Star/Point");
                for(String item:Packets.getCbRankSP()){
                    cbStart.addItem(item);
                }   
                break;
            }
            case 2:
            {
                cbPackets.setEnabled(false);
                cbStart.setEnabled(true);
                cbEnd.setEnabled(false);
                cbEnd.addItem("default empty");
                lblStartRank.setText("Paket Rank");
                lblEndRank.setText("empty");
                for(String item:Packets.getCbRankPR()){
                    cbStart.addItem(item);
                }
                break;
            }

            case 3:
            {
                cbPackets.setEnabled(false);
                cbStart.setEnabled(true);
                cbEnd.setEnabled(true);
                lblStartRank.setText("Category");
                lblEndRank.setText("Matches");
                for(String item:Packets.getCbOther()){
                    cbStart.addItem(item);
                }   
                break;
            }
            default:
                cbPackets.setEnabled(true);
                nonactiveForm();
                cleanForm();
                break;
        }
    }//GEN-LAST:event_cbPacketsActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        cbPackets.setEnabled(true);
        nonactiveForm();
        cleanForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbStartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStartItemStateChanged
        // TODO add your handling code here:
        
        switch (cbPackets.getSelectedIndex()) {           
            case 1:
            {
                cbEnd.removeAllItems();
                cbEnd.setEnabled(true);
                cbEnd.setEditable(true);
                int startIndex = cbStart.getSelectedIndex();
               
                if(startIndex == 0){
                    max = Integer.parseInt(Packets.getTemplateStarSP()[0]);
                    cbEnd.getEditor().setItem(max);
                    txtProcess.setText("1 hari pengerjaan");
                }else if(startIndex <= 2){
                    max = Integer.parseInt(Packets.getTemplateStarSP()[1]);
                    cbEnd.getEditor().setItem(max);
                    txtProcess.setText("3 hari pengerjaaan");
                }else if(startIndex <= 5){
                    max = Integer.parseInt(Packets.getTemplateStarSP()[2]);
                    cbEnd.getEditor().setItem(max);
                    txtProcess.setText("5 hari pengerjaan");
                }else{
                    max = Integer.parseInt(Packets.getTemplateStarSP()[3]);
                    cbEnd.getEditor().setItem(max);
                    if(qty <= 20){
                        txtProcess.setText("5 hari pengerjaan");
                    }else{
                        txtProcess.setText("7 hari pengerjaan");
                    }         
                }
                break;
            }
                
            case 2:
            {
                break;
            }
            case 3:
            {
                cbEnd.removeAllItems();
                cbEnd.setEnabled(true);
                cbEnd.setEditable(true);
                txtProcess.setText("0 hari pengerjaan");
                break;
            }
            default:
                cleanForm();
                nonactiveForm();
                break;
        }
        
    }//GEN-LAST:event_cbStartItemStateChanged

    private void cbEndItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEndItemStateChanged
        // TODO add your handling code here:      
        switch(cbPackets.getSelectedIndex()){
            case 1:
            {
                qty = Integer.parseInt(cbEnd.getEditor().getItem().toString());
                if(qty > max){
                    JOptionPane.showMessageDialog(null, "qty tidak boleh lebih dari max","Warning",JOptionPane.OK_OPTION);
                    cbEnd.getEditor().setItem(max);
                }
                int result = pack.getHargaPS(qty, cbStart.getSelectedItem().toString());
                lblTotal.setText(Integer.toString(result));
            }
            case 2: 
            {
                break;
            }
            case 3:
            {
                qty = Integer.parseInt(cbEnd.getEditor().getItem().toString());
                int result = pack.getHargaOther(qty, cbStart.getSelectedItem().toString());
                lblTotal.setText(Integer.toString(result));
                break;
            }
            default:
                cleanForm();
                nonactiveForm();
                break;
            }
    }//GEN-LAST:event_cbEndItemStateChanged

    private void cbEndKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbEndKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            int qty =(int)cbEnd.getEditor().getItem();
            int result = pack.getHargaPS(qty, cbStart.getSelectedItem().toString());
            lblTotal.setText(Integer.toString(result));
        }
    }//GEN-LAST:event_cbEndKeyPressed

    private void cbConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbConfirmActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        this.num +=1;
        
        DefaultTableModel model = (DefaultTableModel)tblOrder.getModel();
        model.addRow(new Object[]{
            this.num,
            txtCustomer.getText(),
            txtAccountName.getText(),
            cbPackets.getSelectedItem().toString(),
            cbPayment.getSelectedItem().toString(),
            txtConfirmAddress.getText(),
            cbStart.getEditor().getItem().toString(),
            cbEnd.getEditor().getItem().toString(),
            txtProcess.getText(),
            lblTotal.getText(),
            txtRequest.getText(),
            "belum dikerjakan"
        });
        cleanForm();
        nonactiveForm();
        pnlOrderList.setVisible(true);
        pnlOrderPacket.setVisible(false);    
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnWipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWipActionPerformed
        // TODO add your handling code here:
        int row = tblOrder.getSelectedRow();
        penjokiForm pf = new penjokiForm(row);
        pf.setVisible(true);
        pf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnWipActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblOrder.getModel();
        model.setValueAt("Selesai Dikerjakan", selectedRow, 11);
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnRemoveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblOrder.getModel();
        int selectedRow = tblOrder.getSelectedRow();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_btnRemoveOrderActionPerformed

    private void cbStartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbStartKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            int result  = pack.getHargaPR(cbStart.getSelectedItem().toString());
            lblTotal.setText(Integer.toString(result));
        }
    }//GEN-LAST:event_cbStartKeyPressed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JButton btnPS;
    private javax.swing.JButton btnRemoveOrder;
    private javax.swing.JButton btnWip;
    private javax.swing.JComboBox<String> cbConfirm;
    private javax.swing.JComboBox<String> cbEnd;
    private javax.swing.JComboBox<String> cbPackets;
    private javax.swing.JComboBox<String> cbPayment;
    private javax.swing.JComboBox<String> cbStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEndRank;
    private javax.swing.JLabel lblStartRank;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlOrderList;
    private javax.swing.JPanel pnlOrderPacket;
    private static javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtAccountName;
    private javax.swing.JTextField txtConfirmAddress;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtProcess;
    private javax.swing.JTextArea txtRequest;
    // End of variables declaration//GEN-END:variables

    private URL URL(String pathIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
