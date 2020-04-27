package com.company;

public class Alumno {

    private String nombreAlumno;
    private String apellidoAlumno;
    private Integer codigoAlumno;

    public Alumno(String nombreAlumno, String apellidoAlumno, Integer codigoAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public Integer getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(Integer codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
}
