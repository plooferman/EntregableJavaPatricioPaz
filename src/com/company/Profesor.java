package com.company;

public class Profesor {

    private String nombreProfesor;
    private String apellidoProfesor;
    private Integer antiguedadProfesor;
    private Integer codigoProfesor;

    public Profesor(String nombreProfesor, String apellidoProfesor, Integer codigoProfesor) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.codigoProfesor = codigoProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public Integer getAntiguedadProfesor() {
        return antiguedadProfesor;
    }

    public void setAntiguedadProfesor(Integer antiguedadProfesor) {
        this.antiguedadProfesor = antiguedadProfesor;
    }

    public Integer getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(Integer codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }
}
