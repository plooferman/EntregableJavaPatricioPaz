package com.company;

public class ProfesorTitular extends Profesor {

    private String especialidadProfesor;

    public ProfesorTitular(String nombreProfesor, String apellidoProfesor, Integer codigoProfesor, String especialidadProfesor) {
        super(nombreProfesor, apellidoProfesor, codigoProfesor);
    }

    public String getEspecialidadProfesor() {
        return especialidadProfesor;
    }

    public void setEspecialidadProfesor(String especialidadProfesor) {
        this.especialidadProfesor = especialidadProfesor;
    }
}
