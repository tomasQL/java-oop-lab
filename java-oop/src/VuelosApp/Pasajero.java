/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VuelosApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author tomasQL
 */
public class Pasajero 
{   
    private String numPasaporte;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nacionalidad;
    static byte cont;

    public static byte getCont() {
        return cont;
    }

    public static void setCont(byte cont) {
        Pasajero.cont = cont;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public void ingresoPasajero(ArrayList<Pasajero> lstPasajero) throws IOException
    {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String r;
        cont=0;
        do
        {
            Pasajero a=new Pasajero();
            System.out.println("Datos del pasajero...");
            System.out.println("Ingrese el n° de pasaporte: ");
            a.setNumPasaporte(leer.readLine());
            System.out.println("Ingrese el primer nombre del pasajero: ");
            a.setPrimerNombre(leer.readLine());
            System.out.println("Ingrese el segundo nombre del pasajero: ");
            a.setSegundoNombre(leer.readLine());
            System.out.println("Ingrese el apellido paterno del pasajero: ");
            a.setApellidoPaterno(leer.readLine());
            System.out.println("Ingrese el apellido materno del pasajero: ");
            a.setApellidoMaterno(leer.readLine());
            System.out.println("Ingrese la nacionalidad del pasajero: ");
            a.setNacionalidad(leer.readLine());
            lstPasajero.add(a);
            cont=(byte) (cont+1);
            do
            {
                System.out.println("Continuar ingresando pasajeros? si/no");
                r=leer.readLine();
            }
            while (!(r.equals("si")||r.equals("no")));
        }
        while (r.equals("si"));
    }
        public short buscarMenor(ArrayList<Vuelo> lst){
        byte vueloMenor=Pasajero.getCont();
        for (Vuelo i:lst)
        {
            if(Pasajero.getCont()<vueloMenor)
            {
                vueloMenor=Pasajero.getCont();
            }
        }
        return vueloMenor;
        }
        public void imprimirMenor(ArrayList<Vuelo> lst, short vMenor){
        for (Vuelo i:lst)
        {
        if (vMenor==Pasajero.getCont())
        {
            System.out.println("Los datos de(del) vuelo(s) con menor cantidad de pasajeros es:"+Pasajero.getCont());
            System.out.println("El código de vuelo es: "+i.getCodigoVuelo());
            System.out.println("La hora de salida: "+i.getHoraSalida()+" la fecha: "+i.getfDia()+"/"+i.getfMes()+"/"+i.getfYear());
            System.out.println("La hora de llegada: "+i.getHoraLlegada()+" al destino "+i.getCiudadDestino()+" desde "+i.getCiudadOrigen());
        }
        }
    }
}
