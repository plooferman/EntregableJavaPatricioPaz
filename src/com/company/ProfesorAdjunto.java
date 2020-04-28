package com.company;

public class ProfesorAdjunto extends Profesor {

    private Integer horasConsulta;

    public ProfesorAdjunto(String nombreProfesor, String apellidoProfesor, Integer codigoProfesor, Integer horasConsulta) {
        super(nombreProfesor, apellidoProfesor, codigoProfesor);
    }

    public Integer getHorasConsulta() {
        return horasConsulta;
    }

    public void setHorasConsulta(Integer horasConsulta) {
        this.horasConsulta = horasConsulta;
    }
}
