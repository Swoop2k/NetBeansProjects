/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author swoop
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
    public void fechaNacimiento(){
        System.out.println("dia, mes año de nacimiento");
       int dia = leer.nextInt();
       int mes = leer.nextInt();
       int anio = leer.nextInt();
       Date fechaString = new Date(dia, mes, anio);
       String descripcionfecha = fechaString.toString();
        System.out.println(descripcionfecha);
       
    }
    public void fechaActual(){
    Date fechaHoy = new Date(); 
        System.out.println(fechaHoy);
    }
    public void diferencia(){
    
    }
    
}
