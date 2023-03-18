package PersonaAlumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// TODO: arreglar esta wea
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Alumno> listadoAlumnos = new ArrayList<>();
        Alumno objAlumno = new Alumno();
        objAlumno.ingresarAlumno(listadoAlumnos);
        objAlumno.imprimir(listadoAlumnos);
    }
}
