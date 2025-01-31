package view;

import bean.Album;
import dao.AlbumDAO;
import java.util.List;


/**
 *
 * @author vodka
 */
public class Mbc_JDlgAlbumPesquisa extends javax.swing.JDialog {

    private Mbc_JDlgAlbum jDlgAlbum;
    ControllerAlbum controllerAlbum;

    public Mbc_JDlgAlbumPesquisa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Pequisar em Album");
        setLocationRelativeTo(null);
        
        controllerAlbum = new ControllerAlbum();
        AlbumDAO albumDAO = new AlbumDAO();
        List lista = albumDAO.listAll();
        controllerAlbum.setLista(lista);
        jTable1.setModel(controllerAlbum); 
    }
    
    public void setTelaAnterior(Mbc_JDlgAlbum jDlgAlbum){
        this.jDlgAlbum = jDlgAlbum;
    }

    public Mbc_JDlgAlbumPesquisa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jBtnConcluir.setText("Concluir");
        jBtnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConcluirActionPerformed
        // TODO add your handling code here:
        if (controllerAlbum == null) {
            System.out.println("controllerUsuarios não foi inicializado.");
            return;
        }

        if (jTable1.getModel() == null) {
            System.out.println("Modelo da tabela não foi configurado.");
            return;
        }
        
        
        int rowSel= jTable1.getSelectedRow(); // Obtém o objeto Album da linha selecionada
        Album album = controllerAlbum.getBean(rowSel); // Chama o método de atualização na tela principal
        jDlgAlbum.beanView(album); 
        
        // Torna a janela de pesquisa invisível após a seleção
        jDlgAlbum.setVisible(true); // Certifique-se de que esta ação está fazendo a janela principal visível novamente

        // Fecha a janela de pesquisa
        this.setVisible(false);  // Fecha a janela de pesquisa (Mbc_JDlgAlbumPesquisa)
    }//GEN-LAST:event_jBtnConcluirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mbc_JDlgAlbumPesquisa dialog = new Mbc_JDlgAlbumPesquisa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
