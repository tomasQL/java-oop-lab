/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VuelosApp;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author tomasQL
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        ArrayList<Vuelo> listadoVuelo=new ArrayList<>();
        Vuelo objVuelo=new Vuelo();
        objVuelo.ingresoVuelo(listadoVuelo);
        objVuelo.imprimir(listadoVuelo);
        short menor;
        Pasajero objPasajero=new Pasajero();
        menor=objPasajero.buscarMenor(listadoVuelo);
        objPasajero.imprimirMenor(listadoVuelo, menor);
  
    }
    }