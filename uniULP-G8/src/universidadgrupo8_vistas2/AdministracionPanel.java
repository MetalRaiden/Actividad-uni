package universidadgrupo8_vistas2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo8.accesoADatos.Conexion;
import universidadgrupo8.accesoADatos.InscripcionData;
import universidadgrupo8.entidades.Alumno;
import universidadgrupo8.entidades.Materia;
import java.util.List;
import universidadgrupo8.accesoADatos.AlumnoData;
import universidadgrupo8.accesoADatos.MateriaData;
import universidadgrupo8.entidades.Inscripcion;

/**
 *
 * @author Gonz@_
 */
public class AdministracionPanel extends javax.swing.JPanel {
      private DefaultTableModel modelo = new DefaultTableModel();
      private Connection con = null;
      private InscripcionData inscripcionData;
      private AlumnoData alumnoData;
      private MateriaData materiaData;
    /**
     * Creates new form AdministraacionPanel
     */
    public AdministracionPanel() {
        initComponents();
        con = Conexion.getconexion();
        inscripcionData = new InscripcionData();
        alumnoData = new AlumnoData();
        materiaData = new MateriaData();
        agregarAlumnos();
        cabecera();
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
        jTabbedPane_Alumno = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jComboBoxCargaNotas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel_fondo_alumno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRBMateriasNoInsc = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBInscribir = new javax.swing.JButton();
        jBAnularInsc = new javax.swing.JButton();
        jComboBox_inscripciones_alumnos = new javax.swing.JComboBox<>();
        jRBMateriasInsc = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableManejoInsc = new javax.swing.JTable();

        setBackground(new java.awt.Color(25, 23, 38));
        setMinimumSize(new java.awt.Dimension(912, 500));
        setPreferredSize(new java.awt.Dimension(912, 500));

        jPanel1.setBackground(new java.awt.Color(7, 6, 30));
        jPanel1.setMinimumSize(new java.awt.Dimension(912, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(912, 500));

        jTabbedPane_Alumno.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane_Alumno.setForeground(new java.awt.Color(25, 23, 38));
        jTabbedPane_Alumno.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(7, 6, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Carga de Notas");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Selecciones un Alumno:");

        jButton8.setBackground(new java.awt.Color(18, 29, 64));
        jButton8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setText("Guardar");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jComboBoxCargaNotas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jComboBoxCargaNotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Noota"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(340, 340, 340))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addGap(97, 97, 97)
                                .addComponent(jComboBoxCargaNotas, 0, 231, Short.MAX_VALUE)
                                .addGap(60, 60, 60)))
                        .addGap(45, 45, 45)))
                .addGap(69, 69, 69))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(357, 357, 357))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCargaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane_Alumno.addTab("Manipulacion de notas", jPanel3);

        jPanel_fondo_alumno.setBackground(new java.awt.Color(7, 6, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Inscripciónes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Selecciones un Alumno:");

        jRBMateriasNoInsc.setBackground(new java.awt.Color(7, 6, 30));
        jRBMateriasNoInsc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jRBMateriasNoInsc.setForeground(new java.awt.Color(204, 204, 204));
        jRBMateriasNoInsc.setText("Materias No inscriptas");
        jRBMateriasNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasNoInscActionPerformed(evt);
            }
        });

        jBInscribir.setBackground(new java.awt.Color(18, 29, 64));
        jBInscribir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBInscribir.setForeground(new java.awt.Color(204, 204, 204));
        jBInscribir.setText("Inscribir");
        jBInscribir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnularInsc.setBackground(new java.awt.Color(18, 29, 64));
        jBAnularInsc.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBAnularInsc.setForeground(new java.awt.Color(204, 204, 204));
        jBAnularInsc.setText("Anular Inscripcion");
        jBAnularInsc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscActionPerformed(evt);
            }
        });

        jComboBox_inscripciones_alumnos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jComboBox_inscripciones_alumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos" }));
        jComboBox_inscripciones_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_inscripciones_alumnosActionPerformed(evt);
            }
        });

        jRBMateriasInsc.setBackground(new java.awt.Color(7, 6, 30));
        jRBMateriasInsc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jRBMateriasInsc.setForeground(new java.awt.Color(204, 204, 204));
        jRBMateriasInsc.setText("Materias inscriptas");
        jRBMateriasInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasInscActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado de Materias");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTableManejoInsc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTableManejoInsc);

        javax.swing.GroupLayout jPanel_fondo_alumnoLayout = new javax.swing.GroupLayout(jPanel_fondo_alumno);
        jPanel_fondo_alumno.setLayout(jPanel_fondo_alumnoLayout);
        jPanel_fondo_alumnoLayout.setHorizontalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                        .addGap(225, 225, 225))
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88)
                        .addComponent(jComboBox_inscripciones_alumnos, 0, 226, Short.MAX_VALUE)
                        .addGap(133, 133, 133))
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jBInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addGap(127, 127, 127)
                                .addComponent(jBAnularInsc, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addGap(147, 147, 147))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(345, 345, 345))
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jRBMateriasInsc, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(289, 289, 289)
                .addComponent(jRBMateriasNoInsc, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(93, 93, 93))
        );
        jPanel_fondo_alumnoLayout.setVerticalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_inscripciones_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMateriasNoInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBMateriasInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane_Alumno.addTab("Manejo de Inscripciónes", jPanel_fondo_alumno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_Alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_Alumno)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRBMateriasNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasNoInscActionPerformed
     actualizarMateriasNoInsc();      
    }//GEN-LAST:event_jRBMateriasNoInscActionPerformed

    private void jRBMateriasInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasInscActionPerformed
        actualizarMateriasInsc();
    }//GEN-LAST:event_jRBMateriasInscActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
       int filaSeleccionada = jTableManejoInsc.getSelectedRow();
       int columnaSeleccionada = -1;
       int idMateria = -1;
       
       if(filaSeleccionada != -1){
           columnaSeleccionada = jTableManejoInsc.getSelectedColumn();
       
       if(columnaSeleccionada == 0){
       if(columnaSeleccionada != -1){
        Object valorCelda = jTableManejoInsc.getValueAt(filaSeleccionada, columnaSeleccionada);
        if (valorCelda instanceof Integer) {
        idMateria = (int) valorCelda;
    } else if (valorCelda instanceof String) {
        try {
            idMateria = Integer.parseInt((String) valorCelda);
        } catch (NumberFormatException e) {
            // Manejar la excepción si el valor no se puede convertir a entero
            JOptionPane.showMessageDialog(this, "El valor en la celda no es un número válido");
        }
    }
        String elementoSeleccionado = (String) jComboBox_inscripciones_alumnos.getSelectedItem();
        if(elementoSeleccionado != null){
          int dniSeleccionado = obtenerDNISeleccionado(elementoSeleccionado);
            int idAlumno = obtenerIDAlumnoPorDNI(dniSeleccionado);
               if(idAlumno != -1){
                   Inscripcion insc = new Inscripcion();
                   insc.setAlumno(alumnoData.getAlumnoPorId(idAlumno));
                   insc.setAnioMateria(true);
                   insc.setMateria(materiaData.getMateriaPorId(idMateria));
                   insc.setIdInscripcion(1);
                   inscripcionData.guardarInscripciones(insc);
                   actualizarMateriasInsc();
               }
        }
       } else{
           JOptionPane.showMessageDialog(this, "Por favor selecciona una fila antes");
       }
       } else{
           JOptionPane.showMessageDialog(this, "Por favor selecciona una columna ID para inscribir");
       }
       }else{
           JOptionPane.showMessageDialog(this, "Por favor selecciona una fila antes");
       }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jComboBox_inscripciones_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_inscripciones_alumnosActionPerformed
        borrarFilas();
        if(jRBMateriasInsc.isSelected()){
                  actualizarMateriasInsc();
        
        } else if(jRBMateriasNoInsc.isSelected()){
                actualizarMateriasNoInsc();
        } 
    }//GEN-LAST:event_jComboBox_inscripciones_alumnosActionPerformed

    private void jBAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscActionPerformed
       int filaSeleccionada = jTableManejoInsc.getSelectedRow();
       int columnaSeleccionada = -1;
       int idMateria = -1;
       
       if(filaSeleccionada != -1){
           columnaSeleccionada = jTableManejoInsc.getSelectedColumn();
       
       if(columnaSeleccionada == 0){
       if(columnaSeleccionada != -1){
        Object valorCelda = jTableManejoInsc.getValueAt(filaSeleccionada, columnaSeleccionada);
        if (valorCelda instanceof Integer) {
        idMateria = (int) valorCelda;
    } else if (valorCelda instanceof String) {
        try {
            idMateria = Integer.parseInt((String) valorCelda);
        } catch (NumberFormatException e) {
            // Manejar la excepción si el valor no se puede convertir a entero
            JOptionPane.showMessageDialog(this, "El valor en la celda no es un número válido");
        }
    }
        String elementoSeleccionado = (String) jComboBox_inscripciones_alumnos.getSelectedItem();
        if(elementoSeleccionado != null){
          int dniSeleccionado = obtenerDNISeleccionado(elementoSeleccionado);
            int idAlumno = obtenerIDAlumnoPorDNI(dniSeleccionado);
               if(idAlumno != -1){
                   inscripcionData.borrarInscripcionMateriaAlumno(idAlumno, idMateria);
                   actualizarMateriasNoInsc();
               }
        }
       } else{
           JOptionPane.showMessageDialog(this, "Por favor selecciona una fila antes");
       }
       } else{
           JOptionPane.showMessageDialog(this, "Por favor selecciona una columna ID para anular inscripcion");
       }
       }else{
           JOptionPane.showMessageDialog(this, "Por favor selecciona una fila antes");
       }
    }//GEN-LAST:event_jBAnularInscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBAnularInsc;
    public javax.swing.JButton jBInscribir;
    public javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBoxCargaNotas;
    private javax.swing.JComboBox<String> jComboBox_inscripciones_alumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_fondo_alumno;
    private javax.swing.JRadioButton jRBMateriasInsc;
    private javax.swing.JRadioButton jRBMateriasNoInsc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTabbedPane jTabbedPane_Alumno;
    public javax.swing.JTable jTable2;
    public javax.swing.JTable jTableManejoInsc;
    // End of variables declaration//GEN-END:variables

 private void cabecera(){
     modelo.addColumn("ID");
     modelo.addColumn("Nombre");
     modelo.addColumn("Año");
     jTableManejoInsc.setModel(modelo);
     
 } 
    
    
private void borrarFilas(){
    DefaultTableModel model = (DefaultTableModel) jTableManejoInsc.getModel();
    model.setRowCount(0);
    }

private void agregarAlumnos(){
   String sql = "SELECT * FROM alumno WHERE estado=1";                      
        try {    
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
              String nombre = rs.getString("nombre");
              String apellido = rs.getString("apellido");
              int dni = rs.getInt("dni");
              jComboBox_inscripciones_alumnos.addItem(dni+" "+apellido+" "+nombre);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno"+ex);
        }
    }

private int obtenerDNISeleccionado(String elementoSeleccionado) {
    String[] partes = elementoSeleccionado.split(" ");
    if (partes.length > 0) {
        try {
            return Integer.parseInt(partes[0]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    return -1;
}



private int obtenerIDAlumnoPorDNI(int dni) {
   Alumno alumno = alumnoData.buscarAlumnoPorDni(dni);
   if(alumno != null){
    int idAlumno = alumno.getIdAlumno();
    return idAlumno;
   } else{
       return -1;
   }
}

private void actualizarMateriasNoInsc(){
    borrarFilas();
        if(jRBMateriasInsc.isSelected()){
            jRBMateriasInsc.setSelected(false);
        }
        String elementoSeleccionado = (String) jComboBox_inscripciones_alumnos.getSelectedItem();
        if(elementoSeleccionado != null){
            int dniSeleccionado = obtenerDNISeleccionado(elementoSeleccionado);
            int idAlumno = obtenerIDAlumnoPorDNI(dniSeleccionado);
               if(idAlumno != -1){
                   List<Materia> materiasCursadas = inscripcionData.obtenerMateriasNoCursadas(idAlumno);
                   borrarFilas();
                   for(Materia mat:materiasCursadas){
                       if(!mat.isActivo()){
                           continue;
                       } else{
                        modelo.addRow(new Object[]{
                        mat.getIdMateria(),
                        mat.getNombre(),
                        mat.getAnioMateria()
                        
                    });
                       } 
                   }
                  
            
            
        }
        }
    }

private void actualizarMateriasInsc(){
     borrarFilas();
        if(jRBMateriasNoInsc.isSelected()){
            jRBMateriasNoInsc.setSelected(false);
        }
    String elementoSeleccionado = (String) jComboBox_inscripciones_alumnos.getSelectedItem();
        if(elementoSeleccionado != null){
            int dniSeleccionado = obtenerDNISeleccionado(elementoSeleccionado);
            int idAlumno = obtenerIDAlumnoPorDNI(dniSeleccionado);
               if(idAlumno != -1){
                   List<Materia> materiasCursadas = inscripcionData.obtenerMateriasCursadas(idAlumno);
                   borrarFilas();
                   for(Materia mat:materiasCursadas){
                       if(!mat.isActivo()){
                           continue;
                       } else{
                        modelo.addRow(new Object[]{
                        mat.getIdMateria(),
                        mat.getNombre(),
                        mat.getAnioMateria()
                        
                    });
                       } 
                   }
                  
                }
        }
}

}