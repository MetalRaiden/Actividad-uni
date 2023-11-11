
package universidadgrupo8.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo8.entidades.Alumno;
import universidadgrupo8.entidades.Inscripcion;
import universidadgrupo8.entidades.Materia;

public class InscripcionData {
    private Connection con = null;
    
    
    public InscripcionData(){
    con = Conexion.getconexion();           
}
    
    MateriaData matData;
    AlumnoData aluData;
    
    public void guardarInscripciones(Inscripcion insc){
        String sql="INSERT INTO inscripcion(idAlumno, idMateria, estado)"
                + " VALUES(?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, insc.getIdAlumno());
            ps.setInt(2, insc.getIDMateria());
            ps.setInt(3, 1);
         int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Inscripción guardada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la inscripción");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion: " + ex.getMessage());
    }
    }
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> insc = new ArrayList<Inscripcion>();
        try {
        String sql = "SELECT * FROM `inscripcion` WHERE 1";           
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            AlumnoData alumnoData = new AlumnoData();
            MateriaData materiaData = new MateriaData();
            while(rs.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                int idAlumno = rs.getInt("idAlumno");
                Alumno alumno = alumnoData.getAlumnoPorId(idAlumno);
                inscripcion.setAlumno(alumno);
                int idMateria = rs.getInt("idMateria");
                Materia materia = materiaData.getMateriaPorId(idMateria);
                inscripcion.setMateria(materia);
                inscripcion.setAnioMateria(rs.getBoolean("estado"));
                insc.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
        return insc;
        
    }
    
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        List<Inscripcion> insc = new ArrayList<Inscripcion>();
        try {
        String sql = "SELECT * FROM `inscripcion` "
                + "WHERE inscripcion.idAlumno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Inscripcion inscripcion;
            AlumnoData alumnoData = new AlumnoData();
            MateriaData materiaData = new MateriaData();
            while(rs.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                int idAlumno = rs.getInt("idAlumno");
                Alumno alumno = alumnoData.getAlumnoPorId(idAlumno);
                inscripcion.setAlumno(alumno);
                int idMateria = rs.getInt("idMateria");
                Materia materia = materiaData.getMateriaPorId(idMateria);
                inscripcion.setMateria(materia);
                inscripcion.setAnioMateria(rs.getBoolean("estado"));
                insc.add(inscripcion);
            }
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
       return insc;
        
    }
    
 
    
    public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        try {
        String sql = "SELECT m.nombre, m.anio, m.estado, m.idMateria FROM materia AS m\n" +
                    "INNER JOIN inscripcion AS i ON m.idMateria = i.idMateria\n" +
                    "WHERE i.idAlumno = ? AND i.estado = 1";
                
        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
        return materias;
        
    }
    
     public List<Materia> obtenerMateriasNoCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        try {
        String sql = "SELECT m.nombre, m.anio, m.estado, m.idMateria\n" +
                    "FROM materia AS m\n" +
                    "LEFT JOIN inscripcion AS i ON m.idMateria = i.idMateria AND i.idAlumno = ?\n" +
                    "WHERE i.idMateria IS NULL OR (i.estado = 0 AND i.idAlumno = ?)";
                
        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones."+ex.getMessage());
        }
        return materias;
        
    }
     
     
     public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
         try{
          String sql = "UPDATE inscripcion SET estado= 0 "
                  + "WHERE idAlumno = ? AND idMateria = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, idAlumno);
          ps.setInt(2, idMateria);
         
       int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Inscripción borrada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo borrar la inscripción");
        }

        ps.close();
         }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion: " + ex.getMessage());
    }
}

     
     
     void actualizarNota(int idAlumno, int idMateria, double nota){
         try{
          String sql = "UPDATE `inscripcion` "
                  + "SET `nota`='?' "
                  + "WHERE idAlumno = ? AND idMateria = ? ";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, (int) nota);
          ps.setInt(2, idAlumno);
          ps.setInt(3, idMateria);
         }
         catch (SQLException ex){
             JOptionPane.showMessageDialog(null, "Error al eliminar la inscripcion, revise que el id del alumno y de la materia sean correctos"+ex.getMessage());
         }
     }
     
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        List<Alumno> alumnos = new ArrayList<Alumno>();
        try{
            String sql = "SELECT a.dni, a.apellido, a.nombre, a.idAlumno, a.estado\n" +
                         "FROM alumno AS a\n" +
                        "INNER JOIN inscripcion AS i ON a.idAlumno = i.idAlumno\n" +
                        "INNER JOIN materia AS m ON m.idMateria = i.idMateria\n" +
                        "WHERE i.idMateria = ? AND i.estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            while(rs.next()){
                alumno = new Alumno();
                alumno.setActivo(rs.getBoolean("estado"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumnos.add(alumno);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener alumno por materia"+ex.getMessage());
        }
        return alumnos;
    }
}
