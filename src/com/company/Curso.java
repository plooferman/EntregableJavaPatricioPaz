package com.company;

import java.awt.*;
import java.util.List;

public class Curso {

    private String nombreCurso;
    private Integer codigoCurso;

    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoAlumnos;
    private List<Alumno> listaAlumnos;

    public Curso(String nombreCurso, Integer codigoCurso, Integer cupoAlumnos) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.cupoAlumnos = cupoAlumnos;
    }

    public Curso(String nombreCurso, Integer codigoCurso, ProfesorTitular profesorTitular, ProfesorAdjunto profesorAdjunto, Integer cupoAlumnos, List<Alumno> listaAlumnos) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;
        this.cupoAlumnos = cupoAlumnos;
        this.listaAlumnos = listaAlumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public Integer getCupoAlumnos() {
        return cupoAlumnos;
    }

    public void setCupoAlumnos(Integer cupoAlumnos) {
        this.cupoAlumnos = cupoAlumnos;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno) {

        return listaAlumnos.size() < cupoAlumnos;
    }

    public void eliminarAlumno(Alumno unAlumno) {

        this.listaAlumnos.remove(unAlumno);

    }
}
