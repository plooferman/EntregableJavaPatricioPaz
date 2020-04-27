package com.company;

import java.util.Date;

public class Inscripcion {

    private Alumno inscripcionAlumno;
    private Curso inscripcionCurso;
    private Date inscripcionFecha;

    public Inscripcion(Alumno inscripcionAlumno, Curso inscripcionCurso) {
        this.inscripcionAlumno = inscripcionAlumno;
        this.inscripcionCurso = inscripcionCurso;
        this.inscripcionFecha = new Date();
    }

    public Alumno getInscripcionAlumno() {
        return inscripcionAlumno;
    }

    public void setInscripcionAlumno(Alumno inscripcionAlumno) {
        this.inscripcionAlumno = inscripcionAlumno;
    }

    public Curso getInscripcionCurso() {
        return inscripcionCurso;
    }

    public void setInscripcionCurso(Curso inscripcionCurso) {
        this.inscripcionCurso = inscripcionCurso;
    }
}
