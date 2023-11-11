package universidadgrupo8_vistas2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo8.accesoADatos.AlumnoData;
import universidadgrupo8.accesoADatos.Conexion;
import universidadgrupo8.entidades.Alumno;

/**
 *
 * @author Gonz@_
 */
public class AlumnoPanel extends javax.swing.JPanel {

    private Connection con = null;
    private AlumnoData alumnoData;
    Alumno alumno;
    private final Principal principal;
    private boolean alumnoDuplicadoDandera = false; // indica si hay un alumno al usar boton buscar

    /**
     * Creates new form AlumnoPanel
     *
     * @param principal
     */
    public AlumnoPanel(Principal principal) {
        con = Conexion.getconexion();
        this.principal = principal;
        initComponents();

        alumnoData = new AlumnoData();
        alumno = new Alumno();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_bg_alumno = new javax.swing.JPanel();
        jTabbedPane_Alumno = new javax.swing.JTabbedPane();
        jPanel_fondo_alumno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        check_alumno_estado = new javax.swing.JRadioButton();
        txt_alumno_documento = new javax.swing.JTextField();
        txt_alumno_apellido = new javax.swing.JTextField();
        txt_alumno_nommbre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_alumno_nuevo = new javax.swing.JButton();
        btn_alumno_eliminar = new javax.swing.JButton();
        btn_alumno_guardar = new javax.swing.JButton();
        btn_alumno_buscar = new javax.swing.JButton();
        calendario_alumno_fechaNacim = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(25, 23, 38));
        setMinimumSize(new java.awt.Dimension(912, 500));
        setPreferredSize(new java.awt.Dimension(912, 500));

        jPanel_bg_alumno.setBackground(new java.awt.Color(7, 6, 30));

        jTabbedPane_Alumno.setBackground(new java.awt.Color(7, 6, 30));
        jTabbedPane_Alumno.setForeground(new java.awt.Color(7, 6, 30));
        jTabbedPane_Alumno.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTabbedPane_Alumno.setPreferredSize(new java.awt.Dimension(1211, 555));

        jPanel_fondo_alumno.setBackground(new java.awt.Color(7, 6, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Alumno");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Documento: ");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre: ");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Fecha Nacimiento:");
        jLabel6.setPreferredSize(new java.awt.Dimension(130, 20));

        check_alumno_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_alumno_estadoActionPerformed(evt);
            }
        });

        txt_alumno_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alumno_documentoActionPerformed(evt);
            }
        });

        btn_alumno_nuevo.setBackground(new java.awt.Color(18, 29, 64));
        btn_alumno_nuevo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_alumno_nuevo.setForeground(new java.awt.Color(204, 204, 204));
        btn_alumno_nuevo.setText("Agregar");
        btn_alumno_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_alumno_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumno_nuevoActionPerformed(evt);
            }
        });

        btn_alumno_eliminar.setBackground(new java.awt.Color(18, 29, 64));
        btn_alumno_eliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_alumno_eliminar.setForeground(new java.awt.Color(204, 204, 204));
        btn_alumno_eliminar.setText("Eliminar");
        btn_alumno_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_alumno_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumno_eliminarActionPerformed(evt);
            }
        });

        btn_alumno_guardar.setBackground(new java.awt.Color(18, 29, 64));
        btn_alumno_guardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_alumno_guardar.setForeground(new java.awt.Color(204, 204, 204));
        btn_alumno_guardar.setText("Modificar");
        btn_alumno_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_alumno_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumno_guardarActionPerformed(evt);
            }
        });

        btn_alumno_buscar.setBackground(new java.awt.Color(18, 29, 64));
        btn_alumno_buscar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_alumno_buscar.setForeground(new java.awt.Color(204, 204, 204));
        btn_alumno_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo8/vistas/img/lupa.png"))); // NOI18N
        btn_alumno_buscar.setText("Buscar ");
        btn_alumno_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_alumno_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumno_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_fondo_alumnoLayout = new javax.swing.GroupLayout(jPanel_fondo_alumno);
        jPanel_fondo_alumno.setLayout(jPanel_fondo_alumnoLayout);
        jPanel_fondo_alumnoLayout.setHorizontalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(315, 315, 315))
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jSeparator1)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_alumno_documento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                    .addComponent(txt_alumno_nommbre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                    .addComponent(check_alumno_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_alumno_apellido)
                                    .addComponent(calendario_alumno_fechaNacim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addComponent(btn_alumno_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                                .addComponent(btn_alumno_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addGap(152, 152, 152)
                                .addComponent(btn_alumno_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addGap(147, 147, 147)
                                .addComponent(btn_alumno_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addGap(39, 39, 39)))))
                .addGap(60, 60, 60))
        );
        jPanel_fondo_alumnoLayout.setVerticalGroup(
            jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_fondo_alumnoLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_alumno_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_alumno_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_alumno_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_alumno_nommbre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(check_alumno_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(calendario_alumno_fechaNacim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel_fondo_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alumno_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alumno_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alumno_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane_Alumno.addTab("Formulario Alumno", jPanel_fondo_alumno);

        javax.swing.GroupLayout jPanel_bg_alumnoLayout = new javax.swing.GroupLayout(jPanel_bg_alumno);
        jPanel_bg_alumno.setLayout(jPanel_bg_alumnoLayout);
        jPanel_bg_alumnoLayout.setHorizontalGroup(
            jPanel_bg_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_Alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        jPanel_bg_alumnoLayout.setVerticalGroup(
            jPanel_bg_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_Alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void check_alumno_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_alumno_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_alumno_estadoActionPerformed

    private void btn_alumno_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumno_guardarActionPerformed
        int dni;
        try {
            dni = Integer.parseInt(txt_alumno_documento.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser solo números!.   ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String apellido = txt_alumno_apellido.getText().trim();
        String nombre = txt_alumno_nommbre.getText().trim();
        LocalDate fechaNacimiento = calendario_alumno_fechaNacim.getDate() != null
                ? calendario_alumno_fechaNacim.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                : null;

        boolean estado = check_alumno_estado.isSelected();

        if (apellido.isEmpty() || nombre.isEmpty() || fechaNacimiento == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, complete todos los datos!.   ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de apellido y nombre (letras, espacios, 'ñ', 'Ñ' y acentos)
        if (!apellido.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\s]+$") || !nombre.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\s]+$")) {
            JOptionPane.showMessageDialog(this, "El nombre y apellido solo deben tener letras!.    ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de fecha de nacimiento (no vacía)
        if (fechaNacimiento == null) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento es obligatoria. Por favor, seleccione una fecha!.   ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscando al alumno por su DNI
        Alumno alumno = alumnoData.buscarAlumnoPorDni(dni);

        if (alumno == null) {
            JOptionPane.showMessageDialog(this, "No se encontró un alumno con ese número de documento!.    ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Modificación de datos del alumno y llamada al método para modificar
        alumno.setApellido(apellido);
        alumno.setNombre(nombre);
        alumno.setFechaNacimiento(fechaNacimiento);
        alumno.setActivo(estado);

        // Llamar al método para modificar el alumno
        alumnoData.modificarAlumno(alumno);
        JOptionPane.showMessageDialog(this, "Alumno modificado.");

        limpiarCampos();
    }//GEN-LAST:event_btn_alumno_guardarActionPerformed

    //BOTON NUEVO
    private void btn_alumno_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumno_nuevoActionPerformed
        int dni;
        try {
            dni = Integer.parseInt(txt_alumno_documento.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser solo números!.   ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // valida alumno duplicado
        Alumno alumnoExistente = alumnoData.buscarAlumnoPorDni(dni);
        if (alumnoExistente != null) {
            JOptionPane.showMessageDialog(this, "El alumno ya existe!.  ⚠", "", JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
            return;
        }
        String apellido = txt_alumno_apellido.getText().trim();
        String nombre = txt_alumno_nommbre.getText().trim();
        LocalDate fechaNacimiento = calendario_alumno_fechaNacim.getDate() != null
                ? calendario_alumno_fechaNacim.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                : null;

        boolean estado = check_alumno_estado.isSelected();

        if (apellido.isEmpty() || nombre.isEmpty() || fechaNacimiento == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, complete todos los datos!.   ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el apellido y nombre 
        if (!apellido.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\s]+$") || !nombre.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\s]+$")) {
            JOptionPane.showMessageDialog(this, "El apellido y nombre deben contener solo letras!.  ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Es un alumno nuevo, guardar en la base de datos
        Alumno alumnoNuevo = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
        alumnoData.guardarAlumno(alumnoNuevo);
        JOptionPane.showMessageDialog(this, "Alumno agregado.");

        limpiarCampos();
    }//GEN-LAST:event_btn_alumno_nuevoActionPerformed

    //BOTON ELIMINAR
    private void btn_alumno_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumno_eliminarActionPerformed

        // obtenemos un el DNI del campo de texto
        int dniAlumnoInput = Integer.parseInt(txt_alumno_documento.getText());

        // obtenido el DNI, buscamos el ID
        Alumno idAlumnoinput = alumnoData.buscarAlumnoPorDni(dniAlumnoInput);

        //validamos campos nulos
        if (idAlumnoinput != null) {
            alumnoData.eliminarAlumno(idAlumnoinput.getIdAlumno());
            check_alumno_estado.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Alumno Inexistente! ⚠️");
        }

        limpiarCampos();
    }//GEN-LAST:event_btn_alumno_eliminarActionPerformed

    //BOTON BUSCAR
    private void btn_alumno_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumno_buscarActionPerformed

        /*  // obtenermos del campo de texto, convertimos a un int  y gurdamos el DNI del alumno a buscar 
        int dniBuscar = Integer.parseInt(txt_alumno_documento.getText());

        // buscamos y guardamos al alumno por DNI
        Alumno alumnoEncontrado = alumnoData.buscarAlumnoPorDni(dniBuscar);

        // se   verificar si se encontró el alumno
        if (alumnoEncontrado != null) {
            // mostramos los datos del alumno en los campos de texto
            txt_alumno_apellido.setText(alumnoEncontrado.getApellido());
            txt_alumno_nommbre.setText(alumnoEncontrado.getNombre());
            calendario_alumno_fechaNacim.setDate(java.sql.Date.valueOf(alumnoEncontrado.getFechaNacimiento()));
            check_alumno_estado.setSelected(alumnoEncontrado.isActivo()); //si esta o no activo el Check
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no encontrado! ⚠️");
        }*/
        int dniBuscar;
        try {
            dniBuscar = Integer.parseInt(txt_alumno_documento.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser solo números!.   ⚠", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar al alumno por su DNI
        Alumno alumnoEncontrado = alumnoData.buscarAlumnoPorDni(dniBuscar);

        if (alumnoEncontrado != null) {
            // Mostramos los datos del alumno en los campos de texto
            txt_alumno_apellido.setText(alumnoEncontrado.getApellido());
            txt_alumno_nommbre.setText(alumnoEncontrado.getNombre());
            calendario_alumno_fechaNacim.setDate(java.sql.Date.valueOf(alumnoEncontrado.getFechaNacimiento()));
            check_alumno_estado.setSelected(alumnoEncontrado.isActivo());
            alumnoDuplicadoDandera = true; // Corrección: No debería ser así, es un error
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no encontrado!.    ⚠", "", JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
        }
    }//GEN-LAST:event_btn_alumno_buscarActionPerformed

    private void txt_alumno_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alumno_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alumno_documentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_alumno_buscar;
    public javax.swing.JButton btn_alumno_eliminar;
    public javax.swing.JButton btn_alumno_guardar;
    public javax.swing.JButton btn_alumno_nuevo;
    public com.toedter.calendar.JDateChooser calendario_alumno_fechaNacim;
    public javax.swing.JRadioButton check_alumno_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel_bg_alumno;
    private javax.swing.JPanel jPanel_fondo_alumno;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTabbedPane jTabbedPane_Alumno;
    public javax.swing.JTextField txt_alumno_apellido;
    public javax.swing.JTextField txt_alumno_documento;
    public javax.swing.JTextField txt_alumno_nommbre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txt_alumno_documento.setText("");
        txt_alumno_apellido.setText("");
        txt_alumno_nommbre.setText("");
        calendario_alumno_fechaNacim.setDate(null);
        check_alumno_estado.setSelected(false);
    }
}