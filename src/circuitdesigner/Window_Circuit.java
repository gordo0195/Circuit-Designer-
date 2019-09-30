/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitdesigner;

/**
 *
 * @author Marco 
 * INSTITUTO TECNOLÓGICO DE COSTA RICA
 * INGENIERÍA DE COMPUTADORES 
 * ALGORITMOS Y ESTRUCTURAS DE BASES DE DATOS I 
 * 
 * PRIMER PROYECTO PROGRAMADO 
 * CIRCUIT DESIGNER 
 * PROFESOR ANTONIO TORRES 
 * ALUMNO MARCO PICADO M.
 * SEGUNDO SEMESTRE 2019
 * 
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import java.awt.MouseInfo;
import java.awt.Point;


public class Window_Circuit extends javax.swing.JFrame {

    private JLabel ImgTemp;

    /**
     * Creates new form Window_Circuit
     * AQUI SE INICIAN LA VENTANA 
     */
    public Window_Circuit() {
        initComponents();
    }

    /**
     * Entradas: Llamada desde Window.java 
     * Salidas: Formulario JFrame de Window_Circuit
     * Restricciones: No posee restricciones de llamar a nungún metodo o clase de toda la aplicación
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Canva_circuit = new javax.swing.JPanel();
        Abort_circuit = new javax.swing.JButton();
        Probar_Boton = new javax.swing.JButton();
        Etiq_Pallete = new javax.swing.JLabel();
        Pallete_Canva = new javax.swing.JLayeredPane();
        LabelAND = new javax.swing.JLabel();
        LabelNAND = new javax.swing.JLabel();
        LabelOR = new javax.swing.JLabel();
        LabelNOR = new javax.swing.JLabel();
        LabelXOR = new javax.swing.JLabel();
        LabelXNOR = new javax.swing.JLabel();
        LabelNOT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(110, 700));

        Canva_circuit.setBackground(new java.awt.Color(243, 253, 252));
        Canva_circuit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Circuit Designer by Marco Picado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(6, 4, 237))); // NOI18N
        Canva_circuit.setPreferredSize(new java.awt.Dimension(110, 700));

        Abort_circuit.setBackground(new java.awt.Color(30, 9, 9));
        Abort_circuit.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        Abort_circuit.setForeground(new java.awt.Color(169, 25, 25));
        Abort_circuit.setText("Salir");
        Abort_circuit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 29, 29), 3, true));
        Abort_circuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abort_circuitActionPerformed(evt);
            }
        });

        Probar_Boton.setBackground(new java.awt.Color(32, 11, 11));
        Probar_Boton.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        Probar_Boton.setForeground(new java.awt.Color(73, 84, 196));
        Probar_Boton.setText("Probar");
        Probar_Boton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 62, 184), 3, true));

        Etiq_Pallete.setBackground(new java.awt.Color(68, 208, 184));
        Etiq_Pallete.setFont(new java.awt.Font("Dyuthi", 1, 36)); // NOI18N
        Etiq_Pallete.setForeground(new java.awt.Color(1, 1, 1));
        Etiq_Pallete.setText("  PALLETE");

        Pallete_Canva.setBackground(new java.awt.Color(166, 236, 229));
        Pallete_Canva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 174, 221), 3, true));
        Pallete_Canva.setForeground(new java.awt.Color(159, 149, 149));
        Pallete_Canva.setAutoscrolls(true);

        LabelAND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circuitdesigner/images/and.png"))); // NOI18N
        LabelAND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PressInAnd(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LabelANDMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedAND(evt);
            }
        });

        LabelNAND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circuitdesigner/images/nand.png"))); // NOI18N
        LabelNAND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelNANDMouseClicked(evt);
            }
        });

        LabelOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circuitdesigner/images/or.png"))); // NOI18N
        LabelOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelORMouseClicked(evt);
            }
        });

        LabelNOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circuitdesigner/images/nor.png"))); // NOI18N
        LabelNOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelNORMouseClicked(evt);
            }
        });

        LabelXOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circuitdesigner/images/xor.png"))); // NOI18N
        LabelXOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelXORMouseClicked(evt);
            }
        });

        LabelXNOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circuitdesigner/images/xnor.png"))); // NOI18N
        LabelXNOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelXNORMouseClicked(evt);
            }
        });

        LabelNOT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circuitdesigner/images/not.png"))); // NOI18N
        LabelNOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelNOTMouseClicked(evt);
            }
        });

        Pallete_Canva.setLayer(LabelAND, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pallete_Canva.setLayer(LabelNAND, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pallete_Canva.setLayer(LabelOR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pallete_Canva.setLayer(LabelNOR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pallete_Canva.setLayer(LabelXOR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pallete_Canva.setLayer(LabelXNOR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pallete_Canva.setLayer(LabelNOT, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Pallete_CanvaLayout = new javax.swing.GroupLayout(Pallete_Canva);
        Pallete_Canva.setLayout(Pallete_CanvaLayout);
        Pallete_CanvaLayout.setHorizontalGroup(
            Pallete_CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pallete_CanvaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pallete_CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelNOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelXNOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelXOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNAND, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pallete_CanvaLayout.createSequentialGroup()
                        .addComponent(LabelAND)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Pallete_CanvaLayout.setVerticalGroup(
            Pallete_CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pallete_CanvaLayout.createSequentialGroup()
                .addComponent(LabelAND, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNAND)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelOR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNOR, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelXOR, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelXNOR, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Canva_circuitLayout = new javax.swing.GroupLayout(Canva_circuit);
        Canva_circuit.setLayout(Canva_circuitLayout);
        Canva_circuitLayout.setHorizontalGroup(
            Canva_circuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Canva_circuitLayout.createSequentialGroup()
                .addComponent(Abort_circuit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 769, Short.MAX_VALUE)
                .addComponent(Probar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pallete_Canva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Canva_circuitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Etiq_Pallete, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Canva_circuitLayout.setVerticalGroup(
            Canva_circuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Canva_circuitLayout.createSequentialGroup()
                .addComponent(Etiq_Pallete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Pallete_Canva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Canva_circuitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Canva_circuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Probar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Abort_circuit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Canva_circuit, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Canva_circuit, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Abort_circuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abort_circuitActionPerformed
        /**BOTON QUE CIERRA LA VENTANA*/
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_Abort_circuitActionPerformed

    private void LabelNANDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelNANDMouseClicked
        /**EVENTO QUE SE GENERA AL PRESIONAR LA ETIQUETA NAND*/
        
        LabelNAND.addMouseListener(MouseL);
        LabelNAND.setTransferHandler(new TransferHandler("icon"));
        
        //Point puntoNAND = MouseInfo.getPointerInfo().getLocation(); 
    }//GEN-LAST:event_LabelNANDMouseClicked

    private void LabelORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelORMouseClicked
       /**EVENTO QUE SE GENERA AL PRESIONAR LA ETIQUETA OR */
        
        LabelOR.addMouseListener(MouseL);
       LabelOR.setTransferHandler(new TransferHandler("icon"));
       
       Point puntoOR = MouseInfo.getPointerInfo().getLocation(); //SE GENRERA UN PUNTO QUE NOS VA A SERVIR PARA DARLE LOCACIÓN A NUESTRA NUEVA ETIQUETA
    }//GEN-LAST:event_LabelORMouseClicked

    private void LabelNORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelNORMouseClicked
        /**EVENTO QUE SE GENERA AL PRESIONAR LA ETIQUETA NOR */
        LabelNOR.addMouseListener(MouseL);
        LabelNOR.setTransferHandler(new TransferHandler("icon"));
        
    }//GEN-LAST:event_LabelNORMouseClicked

    private void LabelXORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelXORMouseClicked
        /**EVENTO QUE SE GENERA AL PRESIONAR LA ETIQUETA XOR */
        
        LabelXOR.addMouseListener(MouseL);
        LabelXOR.setTransferHandler(new TransferHandler("icon"));
    }//GEN-LAST:event_LabelXORMouseClicked

    private void LabelXNORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelXNORMouseClicked
        /**EVENTO QUE SE GENERA AL PRESIONAR LA ETIQUETA XNOR */
        LabelXNOR.addMouseListener(MouseL);
        LabelXNOR.setTransferHandler(new TransferHandler("icon"));
    }//GEN-LAST:event_LabelXNORMouseClicked

    private void LabelNOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelNOTMouseClicked
        /** EVENTO QUE SE GENERA AL PRESIONAR LA ETIQUETA NOT */
        LabelNOT.addMouseListener(MouseL);
        LabelNOT.setTransferHandler(new TransferHandler("icon"));
    }//GEN-LAST:event_LabelNOTMouseClicked

    private void LabelANDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelANDMouseReleased
        
        // EVENTO QUE SE GENERA AL SOLTAR EL MOUSE DE LA ETIQUETA  AND 
        
        /**LabelAND.addMouseListener(MouseL);
        ImgTemp.setSize(50, 50);
        
        ImgTemp.addMouseListener(MouseL);
        ImgTemp.setTransferHandler(new TransferHandler("icon"));
        Point puntoAND = MouseInfo.getPointerInfo().getLocation();
        ImgTemp.setLocation(puntoAND);
        Canva_circuit.add(ImgTemp);
        ImgTemp.setVisible(true);*/
        
        
        
    }//GEN-LAST:event_LabelANDMouseReleased

    private void PressInAnd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PressInAnd
       /**EVENTO QUE SE GENERA AL PRESIONAR EL MOUSE DE LA ETIQUETA  AND*/
       LabelAND.addMouseListener(MouseL);
       LabelAND.setTransferHandler(new TransferHandler("icon"));
       
       
    }//GEN-LAST:event_PressInAnd

    private void ExitedAND(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitedAND
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitedAND
    MouseListener MouseL = new MouseListener(){
        
        /**EVENTO QUE SE DA Y SE TOMA COMO BASE PARA TODAS LAS VECES QUE SE CLICKEA SOBRE UNA ETIQUETA*/
        

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
            JComponent jc = (JComponent)e.getSource();//SE OBTIENE EL COMPONENTE FUENTE A COPIAR
            TransferHandler th = jc.getTransferHandler();// SE ALMACENA EN UN TRANSFERHANDLER 
            th.exportAsDrag(jc, e, TransferHandler.COPY); // SE INICIA EL COPIADO DE LA ETIQUETA
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
               
                //
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        
   
    
    
    
    
    /**
     * SE INICIAN TODOS LOS COMPONENTES DE NUESTRA VENTANA 
     * ENTRADAS: SE TOMA LA LLAMADA DESDE WINDOW.JAVA
     * SALIDAS: SE DIBUJA NUESTRA VENTANA 
     * RESTRICCIONES: SOLO SE EJECUTA AL RECIBIR LA LLAMADA DESDE LA CLASE 
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
            java.util.logging.Logger.getLogger(Window_Circuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_Circuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_Circuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_Circuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window_Circuit().setVisible(true);      

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abort_circuit;
    private javax.swing.JPanel Canva_circuit;
    private javax.swing.JLabel Etiq_Pallete;
    private javax.swing.JLabel LabelAND;
    private javax.swing.JLabel LabelNAND;
    private javax.swing.JLabel LabelNOR;
    private javax.swing.JLabel LabelNOT;
    private javax.swing.JLabel LabelOR;
    private javax.swing.JLabel LabelXNOR;
    private javax.swing.JLabel LabelXOR;
    private javax.swing.JLayeredPane Pallete_Canva;
    private javax.swing.JButton Probar_Boton;
    // End of variables declaration//GEN-END:variables

}
