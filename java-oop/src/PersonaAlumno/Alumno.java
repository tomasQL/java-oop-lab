package PersonaAlumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Alumno extends Persona{

    private int codigo;

    public Alumno() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void ingresarAlumno(ArrayList<Alumno> listaAlumno) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String respuesta;
        do{
            Alumno estudiante = new Alumno();
            System.out.println("Igrese el nombre del alumno ");
            estudiante.setNombre(leer.readLine());
            System.out.println("Igrese el apellido del alumno ");
            estudiante.setApellido(leer.readLine());
            System.out.println("Igrese la edad del alumno ");
            estudiante.setEdad(Byte.parseByte(leer.readLine()));
            System.out.println("Ingrese el codigo del alumno ");
            estudiante.setCodigo(Integer.parseInt(leer.readLine()));

            do {
                System.out.println("Continuar ingrsando alumnos? si/no");
                respuesta = leer.readLine();
            }
            while(!(respuesta.equals("si")||respuesta.equals("no")));
        }
        while (respuesta.equals("si"));
    }

    public void imprimir(ArrayList<Alumno> listaAlumno) {
        for (Alumno x:listaAlumno){
            System.out.println("Listado de alumnos: ");
            System.out.println("Nombre y apellidos del alumno: "+x.getNombre()+" "+x.getApellido()+"\n");
            System.out.println("tiene "+x.getEdad()+" años y su código es "+x.getCodigo());
        }
    }
}