package com.company;

import java.util.List;

public class DigitalHouseManager {

    private List <Alumno> listaAlumno;
    private List <Curso> listaCurso;
    private List <Profesor> listaProfesor;
    private List <Inscripcion> listaInscripcion;

    public DigitalHouseManager(List<Alumno> listaAlumno, List<Curso> listaCurso, List<Profesor> listaProfesor, List<Inscripcion> listaInscripcion) {
        this.listaAlumno = listaAlumno;
        this.listaCurso = listaCurso;
        this.listaProfesor = listaProfesor;
        this.listaInscripcion = listaInscripcion;
    }

    public List<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(List<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Profesor> getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(List<Profesor> listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public List<Inscripcion> getListaInscripcion() {
        return listaInscripcion;
    }

    public void setListaInscripcion(List<Inscripcion> listaInscripcion) {
        this.listaInscripcion = listaInscripcion;
    }
}
