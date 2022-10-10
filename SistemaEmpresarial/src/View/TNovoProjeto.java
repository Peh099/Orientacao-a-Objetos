/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProjetoControll;
import Model.Gerente;
import Model.Projeto;
import TableModel.ProjetoTM;
import Util.ValidaData;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * A classe TNovoProjeto estende as caracter�sticas de javax.swing.JFrame, portanto ela � uma classe de interface
 * gr�fica com intera��o com o usuario e � respons�vel por receber os dados que v�o ser atr�butos a cada novo
 * Projeto criado, editar ou excluir projetos j� instanciados.
 * @author Pedro Henrique 
 * @version 3.0 (nov. 2020)
 */
public class TNovoProjeto extends javax.swing.JFrame {
	//atributos
    private String data;
    private ValidaData hoje= new ValidaData();
    public static int index;
    public static int flag; 
    private ArrayList<Projeto> ListaProj;
    private String a;
    private ProjetoTM Modelo1;
   
    /**
     * O metodo LoadTableProj atualiza a tabela de projetos a cada nova altera��o que ocorrer.
     */
    public void LoadTableProj(){    	
         Modelo1= new ProjetoTM(ProjetoControll.getProjetos());
         jTableProj.setModel(Modelo1);   
         LoadCBGeren();
     }
    /**
     * O metodo LoadCBGeren preenche o ComboBox de gerentes com o nome de todos os gerentes que j� foram 
     * instanciados anteriormente
     */  
    public void LoadCBGeren() {
    	jComboBoxGerent.removeAllItems();      	
    	List<Gerente> listaDeGerentes=Gerente.getGerentes();
    	for(Gerente gerentes: listaDeGerentes) {   	
    	jComboBoxGerent.addItem(gerentes.toString());   	
    	}    	
    }
    /**
     * O m�todo Botoes � respons�vel por atribuir a visibilidade de cada um dos bot�es existentes dentro da classe.
     * 
     * @param N Botao Novo	
     * @param E Botao Editar
     * @param R Botao Excluir 
     * @param S Botao Salvar
     * @param C Botao Cancelar
     */   
    public void Botoes(boolean N, boolean E, boolean R, boolean S, boolean C){
        jButtonNovo.setEnabled(N);
        jButtonEditar.setEnabled(E);
        jButtonExcluir.setEnabled(R);
        jButtonSalvar.setEnabled(S);
        jButtonCancelar.setEnabled(C);        
    }
    /**
     * Creates new form TNovoProjeto
     */
    public TNovoProjeto() {
        initComponents();
        jComboBoxGerent.removeAll();
        //ListaGeren=new ArrayList();
        setLocationRelativeTo(null);
        LoadTableProj();
        LoadCBGeren();
        Botoes(true,false,false,false,false);
        jTextFieldAtividadesP.setEnabled(false);    
        jTextFieldCodigoProjeto.setEnabled(false);
        jTextFieldDataI.setEnabled(false);
        jTextFieldDataF.setEnabled(false);
        jTextFieldHistoricoP.setEnabled(false);
        jTextFieldNomeP.setEnabled(false);
        jTextFieldProdutosEntreguesP.setEnabled(false);
        jTextFieldStakeHoldersP.setEnabled(false);
        jComboBoxGerent.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelNomeP = new javax.swing.JLabel();
        jLabelAtividadesP = new javax.swing.JLabel();
        jLabelStakeHolderP = new javax.swing.JLabel();
        jLabelDataInicioP = new javax.swing.JLabel();
        jLabelDataFinalizacaoP = new javax.swing.JLabel();
        jLabelHistoricoP = new javax.swing.JLabel();
        jLabelProdutosEntreguesP = new javax.swing.JLabel();
        jLabelStatusP = new javax.swing.JLabel();
        jLabelGerenteProjetoP = new javax.swing.JLabel();
        jTextFieldNomeP = new javax.swing.JTextField();
        jTextFieldAtividadesP = new javax.swing.JTextField();
        jTextFieldStakeHoldersP = new javax.swing.JTextField();
        jTextFieldHistoricoP = new javax.swing.JTextField();
        jTextFieldProdutosEntreguesP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelCodigoProjeto = new javax.swing.JLabel();
        jTextFieldCodigoProjeto = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProj = new javax.swing.JTable();
        jComboBoxGerent = new javax.swing.JComboBox<>();
        jButtonFin = new javax.swing.JButton();
        jComboBoxStats = new javax.swing.JComboBox<>();
        jTextFieldDataF = new javax.swing.JFormattedTextField();
        jTextFieldDataI = new javax.swing.JFormattedTextField();
        Fundao = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Projeto");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelNomeP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNomeP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeP.setText("Nome do projeto:");
        getContentPane().add(jLabelNomeP);
        jLabelNomeP.setBounds(130, 90, 124, 20);

        jLabelAtividadesP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAtividadesP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAtividadesP.setText("Atividades a serem desenvolvidas:");
        getContentPane().add(jLabelAtividadesP);
        jLabelAtividadesP.setBounds(20, 200, 250, 50);

        jLabelStakeHolderP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelStakeHolderP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStakeHolderP.setText("Stakeholders:");
        getContentPane().add(jLabelStakeHolderP);
        jLabelStakeHolderP.setBounds(160, 260, 95, 17);

        jLabelDataInicioP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDataInicioP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataInicioP.setText("Data de Incio:");
        getContentPane().add(jLabelDataInicioP);
        jLabelDataInicioP.setBounds(160, 140, 100, 17);

        jLabelDataFinalizacaoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDataFinalizacaoP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataFinalizacaoP.setText("Data de Finaliza��o:");
        getContentPane().add(jLabelDataFinalizacaoP);
        jLabelDataFinalizacaoP.setBounds(120, 180, 140, 17);

        jLabelHistoricoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHistoricoP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHistoricoP.setText("Hist�rico:");
        getContentPane().add(jLabelHistoricoP);
        jLabelHistoricoP.setBounds(520, 40, 70, 17);

        jLabelProdutosEntreguesP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProdutosEntreguesP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProdutosEntreguesP.setText("Produtos Entregues:");
        getContentPane().add(jLabelProdutosEntreguesP);
        jLabelProdutosEntreguesP.setBounds(440, 90, 144, 17);

        jLabelStatusP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelStatusP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStatusP.setText("Status:");
        getContentPane().add(jLabelStatusP);
        jLabelStatusP.setBounds(540, 130, 50, 17);

        jLabelGerenteProjetoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGerenteProjetoP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGerenteProjetoP.setText("Gerente do projeto:");
        getContentPane().add(jLabelGerenteProjetoP);
        jLabelGerenteProjetoP.setBounds(450, 170, 138, 17);

        jTextFieldNomeP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNomeP.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNomeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeP);
        jTextFieldNomeP.setBounds(260, 90, 160, 30);

        jTextFieldAtividadesP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldAtividadesP.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jTextFieldAtividadesP);
        jTextFieldAtividadesP.setBounds(260, 210, 160, 30);

        jTextFieldStakeHoldersP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldStakeHoldersP.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jTextFieldStakeHoldersP);
        jTextFieldStakeHoldersP.setBounds(260, 250, 160, 30);

        jTextFieldHistoricoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldHistoricoP.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jTextFieldHistoricoP);
        jTextFieldHistoricoP.setBounds(590, 40, 170, 30);

        jTextFieldProdutosEntreguesP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldProdutosEntreguesP.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jTextFieldProdutosEntreguesP);
        jTextFieldProdutosEntreguesP.setBounds(590, 80, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone-empresa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(830, 0, 210, 204);

        jLabelCodigoProjeto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCodigoProjeto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoProjeto.setText("Codigo Projeto:");
        getContentPane().add(jLabelCodigoProjeto);
        jLabelCodigoProjeto.setBounds(150, 50, 110, 20);

        jTextFieldCodigoProjeto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCodigoProjeto.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCodigoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoProjetoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigoProjeto);
        jTextFieldCodigoProjeto.setBounds(260, 50, 50, 30);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(630, 330, 80, 23);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(940, 270, 80, 23);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(850, 270, 80, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(940, 310, 80, 23);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(540, 330, 70, 23);

        jTableProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Data Inicio", "Data Finalia��o", "Atividades", "StakeHolders", "Historico", "Produtos", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProjMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProj);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 380, 1020, 160);

        getContentPane().add(jComboBoxGerent);
        jComboBoxGerent.setBounds(590, 170, 170, 20);

        jButtonFin.setText("FinalizarProjeto");
        jButtonFin.setEnabled(false);
        jButtonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFin);
        jButtonFin.setBounds(20, 350, 130, 20);

        jComboBoxStats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));
        jComboBoxStats.setEnabled(false);
        getContentPane().add(jComboBoxStats);
        jComboBoxStats.setBounds(590, 130, 170, 20);

        try {
            jTextFieldDataF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextFieldDataF);
        jTextFieldDataF.setBounds(260, 170, 160, 30);

        try {
            jTextFieldDataI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextFieldDataI);
        jTextFieldDataI.setBounds(260, 130, 160, 30);

        Fundao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fundao.setForeground(new java.awt.Color(255, 255, 255));
        Fundao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tumblr_static_background.jpg"))); // NOI18N
        getContentPane().add(Fundao);
        Fundao.setBounds(0, -460, 1060, 1260);


        setSize(new java.awt.Dimension(1058, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jTextFieldNomePActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTextFieldCodigoProjetoActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       
    /**
     * O evento do bot�o novo � respons�vel por limpar todos os campos e atribuir as visibilidades necess�rias. 
     * @param evt Evento do Botao Novo
     */
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {                                            
         // TODO add your handling code here:
        flag=1;
        jTextFieldCodigoProjeto.setText("");
         jTextFieldNomeP.setText("");
         jTextFieldAtividadesP.setText("");
         jTextFieldStakeHoldersP.setText("");
         jTextFieldDataI.setText("");
         jTextFieldDataF.setText("");
         jTextFieldHistoricoP.setText("");
         jTextFieldProdutosEntreguesP.setText("");
         jTextFieldAtividadesP.setEnabled(true);    
         jTextFieldCodigoProjeto.setEnabled(false);
         jTextFieldDataI.setEnabled(true);
         jTextFieldHistoricoP.setEnabled(true);
         jTextFieldNomeP.setEnabled(true);
         jTextFieldProdutosEntreguesP.setEnabled(true);
         jTextFieldStakeHoldersP.setEnabled(true);
         jComboBoxGerent.setEnabled(true);
        Botoes(false,false,false,true,true);    
    }                                           
    /**
     * O evento do botao cancelar � respons�vel por limpar todos os campos necessarios.
     * @param evt
     */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                                
         // TODO add your handling code here:
         jTextFieldCodigoProjeto.setText("");
         jTextFieldNomeP.setText("");
         jTextFieldAtividadesP.setText("");
         jTextFieldStakeHoldersP.setText("");
         jTextFieldDataI.setText("");
         jTextFieldDataF.setText("");
         jTextFieldHistoricoP.setText("");
         jTextFieldProdutosEntreguesP.setText("");
         //jTextFieldStatusP.setText(""); 
       Botoes(true,false,false,false,false);    
    }                                               
    /**
     * O evento do bot�o salvar � respons�vel por instanciar novos projetos e salva-l�s conforme as informa��es 
     * passadas pelo usu�rio ou editar projetos que j� foram instanciados anteriormente. Ele tamb�m verifica se
     * a data de inicio fornecida pelo usu�rio � menor ou igual a data atual, caso seja menor ou igual a edi��o
     * ou o salvamento � permitido. Para fazer isso � invocado o m�todo SalvarProjeto da camada Controller.Ap�s
     * realizada as opera��es todos os campos s�o limpos e desabilitados.
     * @param evt Evento do bot�o salvar
     */
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                              
           // TODO add your handling code here: this.codigoProjeto=json.getInt("codigoProjeto");
           data=jTextFieldDataI.getText();
           ValidaData c = new ValidaData(data, ValidaData.BarraSemHora);
          
          if(flag==1/*&& hoje.getTimestamp().getTime()>c.getTimestamp().getTime()*/){
          if (ProjetoControll.SalvarProjeto(Modelo1.getRowCount(),jTextFieldNomeP.getText(),
                jTextFieldDataI.getText(),
               jTextFieldDataF.getText(), jTextFieldAtividadesP.getText(), jTextFieldStakeHoldersP.getText(),
               jTextFieldHistoricoP.getText(),jTextFieldProdutosEntreguesP.getText(),
               (String) jComboBoxGerent.getSelectedItem(), 
               (String) jComboBoxStats.getSelectedItem())){
           this.LoadTableProj();
           JOptionPane.showMessageDialog(this, "projeto salvo com sucesso!");      
       }              
       else
           JOptionPane.showMessageDialog(this, "Erro ao salvar aluno!");
          }else
              if(flag==2/*&& hoje.getTimestamp().getTime()>c.getTimestamp().getTime()*/){
           if(ProjetoControll.SalvarProjeto(Integer.parseInt(jTextFieldCodigoProjeto.getText()),jTextFieldNomeP.getText(),
                jTextFieldDataI.getText(),
               jTextFieldDataF.getText(), jTextFieldAtividadesP.getText(), jTextFieldStakeHoldersP.getText(),
               jTextFieldHistoricoP.getText(),jTextFieldProdutosEntreguesP.getText(),
               (String) jComboBoxGerent.getSelectedItem(), 
               (String) jComboBoxStats.getSelectedItem())){
                    this.LoadTableProj();
           JOptionPane.showMessageDialog(this, "projeto salvo com sucesso!");      
       }              
       else
           JOptionPane.showMessageDialog(this, "Erro ao salvar aluno!");
          }
                            
         
        jTextFieldCodigoProjeto.setText("");
         jTextFieldNomeP.setText("");
         jTextFieldAtividadesP.setText("");
         jTextFieldStakeHoldersP.setText("");
         jTextFieldDataI.setText("");
         jTextFieldDataF.setText("");
         jTextFieldHistoricoP.setText("");
         jTextFieldProdutosEntreguesP.setText("");
        // jTextFieldStatusP.setText(""); 
        jComboBoxGerent.setEnabled(false);
        jTextFieldAtividadesP.setEnabled(false);    
        jTextFieldCodigoProjeto.setEnabled(false);
        jTextFieldDataI.setEnabled(false);
        jTextFieldDataF.setEnabled(false);
        jTextFieldHistoricoP.setEnabled(false);
        jTextFieldNomeP.setEnabled(false);
        jTextFieldProdutosEntreguesP.setEnabled(false);
        jTextFieldStakeHoldersP.setEnabled(false);
        jComboBoxStats.setEnabled(false);
        jButtonFin.setEnabled(false);
        Botoes(true,false,false,false,false);
        
    }
    /**
     * O evento do bot�o editar � respons�vel por atribuir as visibilidades dos campos conforme a necessidade.
     * @param evt Evento do Botao Editar
     */

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        flag=2;
        jComboBoxGerent.setEnabled(true);
        jTextFieldAtividadesP.setEnabled(true);    
        jTextFieldCodigoProjeto.setEnabled(false);
        jTextFieldDataI.setEnabled(true);
        jTextFieldHistoricoP.setEnabled(true);
        jTextFieldNomeP.setEnabled(true);
        jTextFieldProdutosEntreguesP.setEnabled(true);
        jTextFieldStakeHoldersP.setEnabled(true);
        jComboBoxStats.setEnabled(false);
        jButtonFin.setEnabled(false);
        Botoes(false,false,false,true,true);
    }   
    /**
     * O evento do bot�o excluir � respons�vel por excluir algum Projeto que j� tenha sido anteriormente 
     * instanciado. Para isso ele invoca o metodo SalvarProjeto da camada Controller. Ap�s exclu�-lo o evento
     * atualiza a tabela com a respectiva a��o.
     * @param evt Evento do Botao Excluir
     */

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                               
         // TODO add your handling code here:
         flag=3;
         if (ProjetoControll.SalvarProjeto(Modelo1.getRowCount(),jTextFieldNomeP.getText(),
                jTextFieldDataI.getText(),
               jTextFieldDataF.getText(), jTextFieldAtividadesP.getText(), jTextFieldStakeHoldersP.getText(),
               jTextFieldHistoricoP.getText(),jTextFieldProdutosEntreguesP.getText(),
               (String) jComboBoxGerent.getSelectedItem(), 
               (String) jComboBoxStats.getSelectedItem())){
           this.LoadTableProj();
           JOptionPane.showMessageDialog(this, "projeto Exclu�do com sucesso!"); 
         }
         jTextFieldCodigoProjeto.setText("");
         jTextFieldNomeP.setText("");
         jTextFieldAtividadesP.setText("");
         jTextFieldStakeHoldersP.setText("");
         jTextFieldDataI.setText("");
         jTextFieldDataF.setText("");
         jTextFieldHistoricoP.setText("");
         jTextFieldProdutosEntreguesP.setText("");
         Botoes(true,false,false,true,false);
    }                                              
    
    
    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    /**
     * O evento do jTableProjMouseClicked � respons�vel por carregar as informa��es da tabela nos respectivos
     * campos.
     * @param evt evento mouse clicked da tabela
     */
    
    private void jTableProjMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        Botoes(true,true,true,false,false);
        flag=3;
        index = jTableProj.getSelectedRow();
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
            jComboBoxGerent.setSelectedItem(temp[8]);
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
    } 
    /**
     * O evento do bot�o jButtonFinActionPerformed � respons�vel por dar a caracter�stica de projeto finalizado
     * a algum projeto que j� tenha sido instanciado. Para isso ele atribu� falso ao status do Projeto e marca
     * a data de finaliza��o como a data atual.
     * @param evt Evento Botao jButtonFinActionPerformed
     */

    private void jButtonFinActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:        
        flag=2;
        ValidaData d= new ValidaData();
        jTextFieldDataF.setText(d.getDataString());
        int index = jTableProj.getSelectedRow();
         if(index>=0 && index<Modelo1.getRowCount()){
             Modelo1.setValueAt(false, index, 9);           
        }       
        jComboBoxStats.setSelectedIndex(1);
        Botoes(false,false,false,true,false);
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
            java.util.logging.Logger.getLogger(TNovoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TNovoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TNovoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TNovoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TNovoProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Fundao;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFin;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxGerent;
    private javax.swing.JComboBox<String> jComboBoxStats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAtividadesP;
    private javax.swing.JLabel jLabelCodigoProjeto;
    private javax.swing.JLabel jLabelDataFinalizacaoP;
    private javax.swing.JLabel jLabelDataInicioP;
    private javax.swing.JLabel jLabelGerenteProjetoP;
    private javax.swing.JLabel jLabelHistoricoP;
    private javax.swing.JLabel jLabelNomeP;
    private javax.swing.JLabel jLabelProdutosEntreguesP;
    private javax.swing.JLabel jLabelStakeHolderP;
    private javax.swing.JLabel jLabelStatusP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableProj;
    private javax.swing.JTextField jTextFieldAtividadesP;
    private javax.swing.JTextField jTextFieldCodigoProjeto;
    private javax.swing.JFormattedTextField jTextFieldDataF;
    private javax.swing.JFormattedTextField jTextFieldDataI;
    private javax.swing.JTextField jTextFieldHistoricoP;
    private javax.swing.JTextField jTextFieldNomeP;
    private javax.swing.JTextField jTextFieldProdutosEntreguesP;
    private javax.swing.JTextField jTextFieldStakeHoldersP;
    // End of variables declaration                   
} 