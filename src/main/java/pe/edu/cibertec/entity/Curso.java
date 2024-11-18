package pe.edu.cibertec.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    private String idCurso;
    private String nombre;
    private String especialidad;

    @ManyToMany(mappedBy = "cursos")
    private List<Estudiante> estudiantes;


    public Curso() {
    }

    public Curso(String idCurso, String nombre, String especialidad, List<Estudiante> estudintes) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.estudiantes = estudintes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso='" + idCurso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudintes) {
        this.estudiantes = estudintes;
    }
}
