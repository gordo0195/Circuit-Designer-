package circuitdesigner;

/**
 *
 * @author Marco
 *  Instituto Tecnológico de Costa Rica.
    Algoritmos y Estructuras de Datos I.
    Proyecto Programado Uno: Circuit Designer.
    Profesor: Antonio Torres.
    Alumno: Marco Picado M.
    Versión:  0.5.5
    Segundo semestre 2019.
 */
public class Window extends javax.swing.JFrame {
    /**
     * clase padre de la ventana raíz. 
     * Entradas: N/A
     * Salidas: Se genera la base a completitud de la clase padre Window 
     * Restricciones: Esta clase no tiene restricción a interactuar con ninguna otra clase de toda la aplicación.
     * 
     */
    public  Window() {
        /**SE INICIALIZAN TODOS LOS COMPONENTES DE NUESTRA VENTANA RAIZ
         Entradas: Esta clase no tiene entradas
         * Salidas: llamada a todas las instancias y metodos de la aplicación
         * Restricciones: este método no posee restricciones para iniciar cualquier otro de la aplicación 
         
         */
        initComponents();
        
    }

    /**
     * Codigo Necesario para optimizar una correcta llamada de la forma JFrame.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Canva_inicio = new javax.swing.JPanel();
        Etiqueta_TItuloRaíz = new javax.swing.JLabel();
        boton_acerca = new javax.swing.JButton();
        boton_crear = new javax.swing.JButton();
        Botón_SalidaPrincip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Canva_inicio.setBackground(new java.awt.Color(127, 174, 220));

        Etiqueta_TItuloRaíz.setFont(new java.awt.Font("M+ 1c black", 0, 36)); // NOI18N
        Etiqueta_TItuloRaíz.setForeground(new java.awt.Color(226, 235, 254));
        Etiqueta_TItuloRaíz.setText("  CIRCUIT DESIGNER ");

        boton_acerca.setBackground(new java.awt.Color(12, 21, 21));
        boton_acerca.setFont(new java.awt.Font("Garuda", 1, 14)); // NOI18N
        boton_acerca.setForeground(new java.awt.Color(255, 133, 0));
        boton_acerca.setText("Acerca de:");
        boton_acerca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 108, 7), 3, true));
        boton_acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_acercaActionPerformed(evt);
            }
        });

        boton_crear.setBackground(new java.awt.Color(34, 25, 25));
        boton_crear.setFont(new java.awt.Font("Garuda", 3, 14)); // NOI18N
        boton_crear.setForeground(new java.awt.Color(54, 255, 0));
        boton_crear.setText("Crear");
        boton_crear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 160, 49), 3, true));
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });

        Botón_SalidaPrincip.setBackground(new java.awt.Color(33, 14, 14));
        Botón_SalidaPrincip.setFont(new java.awt.Font("Garuda", 3, 14)); // NOI18N
        Botón_SalidaPrincip.setForeground(new java.awt.Color(255, 24, 0));
        Botón_SalidaPrincip.setText("Salir");
        Botón_SalidaPrincip.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 37, 40), 3, true));
        Botón_SalidaPrincip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botón_SalidaPrincipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Canva_inicioLayout = new javax.swing.GroupLayout(Canva_inicio);
        Canva_inicio.setLayout(Canva_inicioLayout);
        Canva_inicioLayout.setHorizontalGroup(
            Canva_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Canva_inicioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Canva_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Canva_inicioLayout.createSequentialGroup()
                        .addComponent(Etiqueta_TItuloRaíz, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(Canva_inicioLayout.createSequentialGroup()
                        .addComponent(boton_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botón_SalidaPrincip, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        Canva_inicioLayout.setVerticalGroup(
            Canva_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Canva_inicioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Etiqueta_TItuloRaíz, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(Canva_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_acerca)
                    .addComponent(boton_crear)
                    .addComponent(Botón_SalidaPrincip))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Canva_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Canva_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_acercaActionPerformed
        // este botón nos lleva a la ventana ACERCA DE ESTE SOFTWARE
        Info_Window Info = new Info_Window();
        Info.setVisible(true);
        
    }//GEN-LAST:event_boton_acercaActionPerformed

    private void Botón_SalidaPrincipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botón_SalidaPrincipActionPerformed
        /**ESTE BOTON NOS SACA DE LA VENTANA PRINCIPAL */
        this.setVisible(false);
        
        this.dispose();
    }//GEN-LAST:event_Botón_SalidaPrincipActionPerformed

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed
        /**BOTON QUE INICIALIZA LA VENTANA DE CREACIÓN DE CIRCUITOS */
        Window_Circuit Circuit = new Window_Circuit();
        Circuit.setVisible(true);
    }//GEN-LAST:event_boton_crearActionPerformed

    
    public static void main(String args[]) {
        /***Aquí se inicia la ventana maestra: */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botón_SalidaPrincip;
    private javax.swing.JPanel Canva_inicio;
    private javax.swing.JLabel Etiqueta_TItuloRaíz;
    private javax.swing.JButton boton_acerca;
    private javax.swing.JButton boton_crear;
    // End of variables declaration//GEN-END:variables
}
