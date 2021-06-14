package clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

public class Informacion extends javax.swing.JFrame {
    
    Imagen logo = new Imagen();
    
    public Informacion() {
        initComponents();
        this.setContentPane(logo);
        Configuracion();
    }
    
    private void Configuracion(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/informacion/IconoInf.png")));
        setResizable(false);
        setLocationRelativeTo(null);// Posicionar ventana en el centro.
        setLocation(getLocation().x-430, getLocation().y+25);// Posicionar ventana en el centro.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    class Imagen extends javax.swing.JPanel {// Manipulacion de la clase Graphics para dibujas la ventana informacion, con imagenes y texto.

        private Image Logo,Logo2,Fondo,Fondo2,extra;
        @Override
        public void paint(Graphics grafico){
                Dimension height = getSize();

                Fondo = new ImageIcon(getClass().getResource("/imagenes/informacion/fondo.jpg")).getImage();
                grafico.drawImage(Fondo, 0, 0, height.width, height.height,this);
                
                Logo = new ImageIcon(getClass().getResource("/imagenes/informacion/UAA.png")).getImage();
                grafico.drawImage(Logo, (height.width/2)-100, (height.height/2)-250, 200, 100,this);
                
                Fondo2 = new ImageIcon(getClass().getResource("/imagenes/informacion/fondo2.jpg")).getImage();
                grafico.drawImage(Fondo2, 20, (height.height/2)-125, height.width-40, height.height-170,this);
                
                Logo2 = new ImageIcon(getClass().getResource("/imagenes/informacion/Logo 4.png")).getImage();
                grafico.drawImage(Logo2, height.width-100, (height.height/2)-125, 100, 70,this);
                
                grafico.drawRect(20, (height.height/2)-125, height.width-40, height.height-170);
                grafico.drawLine(30, 240, 370, 240);
                
                Graphics2D text = (Graphics2D) grafico;
                
                text.setColor(Color.WHITE);
                text.setFont(new Font("Nirmala UI",1,16));
                text.drawString("Carrera:", 28, 180);
                text.drawString("Materia:", 28, 200);
                text.drawString("Profesora:", 28, 220);
                
                text.setFont(new Font("Nirmala UI",PLAIN,14));
                text.drawString("Ing. Sistemas Computacionales.", 110, 180);
                text.drawString("Programacion 3 (Java).", 110, 200);
                text.drawString("Georgina Salazar Partida.", 110, 220);


                text.setFont(new Font("Nirmala UI",1,18));
                text.drawString("Programadores: ", 28, 280);
                text.setFont(new Font("Consolas",PLAIN,13));
                text.drawString("♣ Carlos Luevano Santillan 206520.", 30, 300);
                text.drawString("♠ Francisco Samael Martinez Contreras 234741.", 30, 320);
                //text.drawString("♦ Isidro Hernandez Guel 224964.", 30, 340);
                
                text.setColor(Color.GRAY);
                text.drawString("Fecha de inicio: 3/05/2021", 28, 490);
                text.drawString("Fecha de entrega: 16/06/2021", 28, 510);
                java.util.Date fecha = new Date();
                SimpleDateFormat Formato = new SimpleDateFormat("dd/MM/YYYY");
                text.drawString("Hoy: "+Formato.format(fecha), 250, 510);
                
                setOpaque(false);
                super.paint(grafico);
        }
    }
}

