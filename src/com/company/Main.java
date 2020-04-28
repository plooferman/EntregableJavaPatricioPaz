package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Alumno> listaAlumno = new ArrayList<>();
        List<Curso> listaCurso = new ArrayList<>();
        List<Profesor> listaProfesor = new ArrayList<>();
        List<Inscripcion>listaInscripcion = new ArrayList<>();
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager(listaAlumno, listaCurso, listaProfesor, listaInscripcion);

        digitalHouseManager.altaProfesorTitular("Leopoldo", "Cantina", 101, "Android");
        digitalHouseManager.altaProfesorTitular("Rolo", "Rossini", 102, "FullStack");
        digitalHouseManager.altaProfesorAdjunto("Milton", "Tonazo", 103, 3);
        digitalHouseManager.altaProfesorAdjunto("Roberto", "Sanchez", 104, 5);

        digitalHouseManager.altaCurso("Full Stack", 20001, 3);
        digitalHouseManager.altaCurso("Android", 20002, 2);

        digitalHouseManager.asignarProfesores(20001, 102, 103);
        digitalHouseManager.asignarProfesores(20002, 101, 104);

        digitalHouseManager.altaAlumno("Nick", "Riviera", 10001);
        digitalHouseManager. altaAlumno("Rita", "Turdero", 10002);
        digitalHouseManager.altaAlumno("María", "Tambussi", 10003);

        digitalHouseManager.inscribirAlumno(10001, 20001);
        digitalHouseManager.inscribirAlumno(10002, 20001);

        digitalHouseManager.inscribirAlumno(10001, 20002);
        digitalHouseManager.inscribirAlumno(10002, 20002);
        digitalHouseManager.inscribirAlumno(10003, 20002);
        
        digitalHouseManager.bajaProfesor(102);
        digitalHouseManager.bajaCurso(20001);


    }
}
