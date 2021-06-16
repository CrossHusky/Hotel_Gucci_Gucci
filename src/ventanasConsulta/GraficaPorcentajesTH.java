
package ventanasConsulta;

import java.awt.Toolkit;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficaPorcentajesTH extends javax.swing.JFrame {

    private int S,D,T;
    
    public GraficaPorcentajesTH() {
        initComponents();
        this.S=5;
        this.D=6;
        this.T=3;
        DibujarGrafica();
        setLocationRelativeTo(null);// Posicionar pantalla en el centro.
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/login/Icono.png")));// Cambiar icono de ventana.
    }
    
    public GraficaPorcentajesTH(int S, int D,int T) {
        initComponents();
        this.S=S;
        this.D=D;
        this.T=T;
        DibujarGrafica();
        setLocationRelativeTo(null);// Posicionar pantalla en el centro.
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/login/Icono.png")));// Cambiar icono de ventana.
    }
    
    private void DibujarGrafica(){
        DefaultCategoryDataset Datos = new DefaultCategoryDataset();
        
        int Ocupados[] = new int[3];
        Ocupados[0]=S;
        Ocupados[1]=D;
        Ocupados[2]=T;
        Datos.setValue(Ocupados[0], "Habitaciones Simples       ","");
        Datos.setValue(Ocupados[1], "Habitaciones Dobles        ","");
        Datos.setValue(Ocupados[2], "Habitaciones Triples       ","");
        
        JFreeChart Chart = ChartFactory.createBarChart3D("Porcentajes de ocupación por tipo de habitación", "", "Habitaciones Ocupadas", Datos);
        
        ChartPanel oPanel = new ChartPanel(Chart);
        this.jPanelGrafica.setLayout(new java.awt.BorderLayout());
        this.jPanelGrafica.add(oPanel);
        this.jPanelGrafica.validate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBarra = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanelGrafica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelBarra.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setBackground(new java.awt.Color(223, 25, 25));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarraLayout = new javax.swing.GroupLayout(jPanelBarra);
        jPanelBarra.setLayout(jPanelBarraLayout);
        jPanelBarraLayout.setHorizontalGroup(
            jPanelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBarraLayout.createSequentialGroup()
                .addGap(0, 733, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBarraLayout.setVerticalGroup(
            jPanelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1)
        );

        javax.swing.GroupLayout jPanelGraficaLayout = new javax.swing.GroupLayout(jPanelGrafica);
        jPanelGrafica.setLayout(jPanelGraficaLayout);
        jPanelGraficaLayout.setHorizontalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGraficaLayout.setVerticalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();// cierra la venta y no el sistema completo.
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GraficaPorcentajesTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaPorcentajesTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaPorcentajesTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaPorcentajesTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaPorcentajesTH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JPanel jPanelGrafica;
    // End of variables declaration//GEN-END:variables
}
