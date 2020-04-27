package com.company;

public class ProfesorTitular extends Profesor {

    private String especialidadProfesor;

    public ProfesorTitular(String nombreProfesor, String apellidoProfesor, Integer antiguedadProfesor, Integer codigoProfesor, String especialidadProfesor) {
        super(nombreProfesor, apellidoProfesor, antiguedadProfesor, codigoProfesor);
    }

    public String getEspecialidadProfesor() {
        return especialidadProfesor;
    }

    public void setEspecialidadProfesor(String especialidadProfesor) {
        this.especialidadProfesor = especialidadProfesor;
    }
}
