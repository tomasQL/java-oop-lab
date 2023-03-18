/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VuelosApp;

import static VuelosApp.Pasajero.cont;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author tomasQL
 */
public class Vuelo {
    private String codigoVuelo;
    private String horaSalida;
    private short fDia, fMes, fYear;
    private String horaLlegada;
    private String ciudadOrigen;
    private String ciudadDestino;
    private ArrayList<Pasajero> ListaPasajero;

    public short getfDia() {
        return fDia;
    }

    public void setfDia(short fDia) {
        this.fDia = fDia;
    }

    public short getfMes() {
        return fMes;
    }

    public void setfMes(short fMes) {
        this.fMes = fMes;
    }

    public short getfYear() {
        return fYear;
    }

    public void setfYear(short fYear) {
        this.fYear = fYear;
    }

    public ArrayList<Pasajero> getListaPasajero() {
        return ListaPasajero;
    }

    public void setListaPasajero(ArrayList<Pasajero> ListaPasajero) {
        this.ListaPasajero = ListaPasajero;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void ingresoVuelo(ArrayList<Vuelo> lstVuelo) throws IOException
    {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String loopVuelos;
        do 
        {
            Vuelo c=new Vuelo();
            System.out.println("Ingrese numero de su vuelo: ");
            c.setCodigoVuelo(leer.readLine());
            System.out.println("Ingrese el horario de salida ");
            c.setHoraSalida(leer.readLine());
            System.out.println("Ingrese la fecha del vuelo");
            do{
                System.out.println("Día: ");
                c.setfDia(Short.parseShort(leer.readLine()));
            }while(!(c.getfDia()>0&&c.getfDia()<=31)); 
            do{
                System.out.println("Mes: ");
                c.setfMes(Short.parseShort(leer.readLine()));
            }while (!(c.getfMes()>0&&c.getfMes()<=12));
            do{
                System.out.println("Año: ");
                c.setfYear(Short.parseShort(leer.readLine()));
            }while (!(c.getfYear()>2000&&c.getfYear()<=2050));
            System.out.println("Ingrese el horario de llegada ");
            c.setHoraLlegada(leer.readLine());
            System.out.println("Ingrese la ciudad de origen: ");
            c.setCiudadOrigen(leer.readLine());
            System.out.println("Ingrese la ciudad de destino: ");
            c.setCiudadDestino(leer.readLine());
            Pasajero pasaj= new Pasajero();
            ArrayList<Pasajero> listaPasajero=new ArrayList<>();
            pasaj.ingresoPasajero(listaPasajero);
            c.setListaPasajero(listaPasajero);
            lstVuelo.add(c);
            do
            {
                System.out.println("Continuar ingresando vuelos? si/no");
                loopVuelos=leer.readLine();
            }
            while (!(loopVuelos.equals("si")||loopVuelos.equals("no")));
        }
        while(loopVuelos.equals("si"));
    }

    public void imprimir(ArrayList<Vuelo> lstVuelo)
    {
        System.out.println("Listado de vuelos y sus datos");
        for(Vuelo x:lstVuelo)
        {
            System.out.println("N° del vuelo "+x.getCodigoVuelo());
            System.out.println("La cantidad de pasajeros es de: "+cont);
            System.out.println("El horario de salida es: "+x.getHoraSalida()+" en la fecha: "+x.getfDia()+"/"+x.getfMes()+"/"+x.getfYear()+ " con horario de llegada: "+x.getHoraLlegada());
            System.out.println("La ciudad de origen del vuelo es: "+x.getCiudadOrigen()+" y la ciudad de destino: "+x.getCiudadDestino());
               
        for(Pasajero i:x.getListaPasajero())
            {
                System.out.println("Listado de los pasajeros del respectivo Vuelo:");
                System.out.println("N° de pasaporte "+i.getNumPasaporte());
                System.out.println("Nombres y apellidos: "+i.getPrimerNombre()+" "+i.getSegundoNombre()+" "+i.getApellidoPaterno()+" "+i.getApellidoMaterno());
                System.out.println("Nacionalidad del pasajero "+i.getNacionalidad());
            }
        }
    }

    
}
