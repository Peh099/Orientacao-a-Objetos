/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GerenteControll;
import Controller.OperarioControll;
import Controller.ProjetoControll;
import Model.Operario;
import TableModel.DependentesGerentesTM;
import TableModel.DependentesOperariosTM;
import TableModel.OperarioHabilidadesTM;
import TableModel.ProjetoGerenteTM;
import TableModel.ProjetoTM;

/**
 *
 * @author pedro
 */
public class TRelatorios extends javax.swing.JFrame {
     
    ProjetoTM Modelo5;
    OperarioHabilidadesTM Modelo6;
    ProjetoGerenteTM Modelo7;
    DependentesOperariosTM Modelo8;
    DependentesGerentesTM Modelo9;
    /**
     * Creates new form Relatorio
     */
    public TRelatorios() {        
        initComponents();
        jTextFieldConti.setEnabled(false);
        this.LoadTableProj();
        this.LoadTableOp(); 
        this.LoadTableGerenteProjs();
        this.LoadTableDependentesOp();
        this.LoadTableDependentesGe();
        jTextFieldConti.setText(Integer.toString(OperarioControll.getOperarios().size()+GerenteControll.getGerentes().size()));
    }
    public void LoadTableProj(){    	
         Modelo5= new ProjetoTM(ProjetoControll.getProjetos());
         jTableProjs.setModel(Modelo5);   
     }
    public void LoadTableOp(){
        Modelo6=new OperarioHabilidadesTM(OperarioControll.getOperarios2());
        jTableOps.setModel(Modelo6);       
    }
    
    public void LoadTableGerenteProjs(){
         Modelo7= new ProjetoGerenteTM(ProjetoControll.getProjetos2());
         jTableGerenteProjs.setModel(Modelo7);     
    }
    
    public void LoadTableDependentesOp(){
       Modelo8= new  DependentesOperariosTM(OperarioControll.getOperariosDependentes());
       jTableDepOperarios.setModel(Modelo8);
    }
    public void LoadTableDependentesGe(){
        Modelo9= new DependentesGerentesTM(GerenteControll.getDependentesGerente());
       jTableDepsGer.setModel(Modelo9);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextFieldConti = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelFundo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProjs = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOps = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGerenteProjs = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableDepOperarios = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDepsGer = new javax.swing.JTable();
        FUNDO1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextFieldConti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContiActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldConti);
        jTextFieldConti.setBounds(250, 30, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número total de funcionários:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 40, 190, 15);

        jTabbedPane1.setName(""); // NOI18N

        jTableProjs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableProjs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProjsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProjs);

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Projetos Criados", jPanelFundo);

        jTableOps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableOps);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Habilidades de cada funcionário", jPanel1);

        jTableGerenteProjs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableGerenteProjs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gerente de cada projeto", jPanel2);

        jTableDepOperarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableDepOperarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Dependentes Operarios", jPanel3);

        jTableDepsGer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableDepsGer);

        jTabbedPane1.addTab("Dependentes Gerentes", jScrollPane4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 80, 1120, 230);

        FUNDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tumblr_static_background.jpg"))); // NOI18N
        getContentPane().add(FUNDO1);
        FUNDO1.setBounds(0, -40, 1170, 880);

        setSize(new java.awt.Dimension(1169, 369));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jTextFieldContiActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTableProjsMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        /*
        index = jTableProjs.getSelectedRow();
        if(index>=0 && index<Modelo1.getRowCount()){
            String temp[] = Modelo1.getProjetos(index);
            jTextFieldCodigoProjeto.setText(temp[0]);
            jTextFieldNomeP.setText(temp[1]);
            jTextFieldDataI.setText(temp[2]);
            jTextFieldDataF.setText(temp[3]);
            jTextFieldAtividadesP.setText(temp[4]);
            jTextFieldStakeHoldersP.setText(temp[5]);
            jTextFieldHistoricoP.setText(temp[6]);
            jTextFieldProdutosEntreguesP.setText(temp[7]);
            jComboBoxStats.setSelectedItem(temp[9]);
        }
        jComboBoxGerent.setEnabled(false);
        jTextFieldAtividadesP.setEnabled(false);
        jTextFieldCodigoProjeto.setEnabled(false);
        jTextFieldDataI.setEnabled(false);
        jTextFieldDataF.setEnabled(false);
        jTextFieldHistoricoP.setEnabled(false);
        jTextFieldNomeP.setEnabled(false);
        jTextFieldProdutosEntreguesP.setEnabled(false);
        jTextFieldStakeHoldersP.setEnabled(false);
        jButtonFin.setEnabled(true);
        Botoes(true,true,true,false,false);
        */
    }                                        

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel FUNDO1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableDepOperarios;
    private javax.swing.JTable jTableDepsGer;
    private javax.swing.JTable jTableGerenteProjs;
    private javax.swing.JTable jTableOps;
    private javax.swing.JTable jTableProjs;
    private javax.swing.JTextField jTextFieldConti;
    // End of variables declaration                   
}
