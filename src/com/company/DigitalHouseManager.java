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

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){

        Curso cursoNuevo = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);
        listaCurso.add(cursoNuevo);
        System.out.println("El curso " + cursoNuevo.getNombreCurso() + " ha sido registrado exitosamente.");
    }

    public void bajaCurso(Integer codigoCurso) {
        Curso cursoAEliminar = buscarCurso(codigoCurso);
        listaCurso.remove(cursoAEliminar);
        System.out.println("El curso " + cursoAEliminar.getNombreCurso() + " ha sido eliminado exitosamente.");
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {

        ProfesorAdjunto profesorAdjuntoNuevo = new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras);
        profesorAdjuntoNuevo.setAntiguedadProfesor(0);
        listaProfesor.add(profesorAdjuntoNuevo);
        System.out.println("El Profesor Adjunto " + profesorAdjuntoNuevo.getNombreProfesor() + " " + profesorAdjuntoNuevo.getApellidoProfesor() + " ha sido registrado exitosamente.");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {

        ProfesorTitular profesorTitularNuevo = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        profesorTitularNuevo.setAntiguedadProfesor(0);
        listaProfesor.add(profesorTitularNuevo);
        System.out.println("El Profesor Titular " + profesorTitularNuevo.getNombreProfesor() + " " + profesorTitularNuevo.getApellidoProfesor() + " ha sido registrado exitosamente.");
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorAEliminar = buscarProfesor(codigoProfesor);
        listaProfesor.remove(profesorAEliminar);
        System.out.println("El Profesor " + profesorAEliminar.getNombreProfesor() + " " + profesorAEliminar.getApellidoProfesor() + " ha sido eliminado exitosamente.");

    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno alumnoNuevo = new Alumno(nombre, apellido, codigoAlumno);
        listaAlumno.add(alumnoNuevo);
        System.out.println("El alumno " + alumnoNuevo.getNombreAlumno() + " " + alumnoNuevo.getApellidoAlumno() + " ha sido agregado exitosamente.");
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {

        Curso cursoParaInscribir = buscarCurso(codigoCurso);
        Alumno alumnoParaInscribir = buscarAlumno(codigoAlumno);

        if (cursoParaInscribir.agregarUnAlumno(alumnoParaInscribir)) {
            Inscripcion inscripcionNueva = new Inscripcion(alumnoParaInscribir, cursoParaInscribir);
            listaInscripcion.add(inscripcionNueva);
            System.out.println("El alumno " + alumnoParaInscribir.getNombreAlumno() + " " + alumnoParaInscribir.getApellidoAlumno() + " se ha inscripto exitosamente en el curso " + cursoParaInscribir.getNombreCurso());
        } else {
            System.out.println("No se puede realizar la inscripción porque el cupo de " + cursoParaInscribir.getCupoAlumnos() + " ya ha sido completado.");
        }
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {

        Curso cursoParaAsignar = buscarCurso(codigoCurso);
        Profesor profesorTitularAAsignar = buscarProfesor(codigoProfesorTitular);
        Profesor profesorAdjuntoAAsignar = buscarProfesor(codigoProfesorAdjunto);

        if (profesorTitularAAsignar instanceof ProfesorTitular) {
            ProfesorTitular profesorTitular = (ProfesorTitular) profesorTitularAAsignar;
            cursoParaAsignar.setProfesorTitular(profesorTitular);
        } else {
            System.out.println("El código no pertenece a un Profesor Titular.");
        }

        if (profesorAdjuntoAAsignar instanceof ProfesorAdjunto) {
            ProfesorAdjunto profesorAdjunto = (ProfesorAdjunto) profesorAdjuntoAAsignar;
            cursoParaAsignar.setProfesorAdjunto(profesorAdjunto);
        } else {
            System.out.println("El código no pertenece a un Profesor Adjunto.");
        }

    }










    private Curso buscarCurso (Integer codigoCurso) {
        Curso cursoABuscar = null;

        for (Curso curso : this.listaCurso) {
            if (curso.getCodigoCurso().equals(codigoCurso)) {
                cursoABuscar = curso;
                break;
            }
        }

        return cursoABuscar;
    }

    private Profesor buscarProfesor (Integer codigoProfesor) {
        Profesor profesorABuscar = null;

        for (Profesor profesor : this.listaProfesor) {
            if (profesor.getCodigoProfesor().equals(codigoProfesor)) {
                profesorABuscar = profesor;
                break;
            }
        }

        return profesorABuscar;
    }

    private Alumno buscarAlumno (Integer codigoAlumno) {
        Alumno alumnoABuscar = null;

        for (Alumno alumno : this.listaAlumno) {
            if (alumno.getCodigoAlumno().equals(codigoAlumno)){
                alumnoABuscar = alumno;
                break;
            }
        }
        return alumnoABuscar;
    }
}
