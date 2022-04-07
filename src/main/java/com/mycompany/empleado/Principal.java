/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;


import java.util.Scanner;

/**
 *
 * @author ealex
 */
public class Principal {
    public static void main(String[] args) {

       var empleado1 = new Empleado();
       empleado1.nombre= "0";
       empleado1.horasTrabajadas= 0;
       empleado1.costoHoras= (0);
       empleado1.yearincome= 0;
       System.out.println("Introduzca el nombre del empleado: ");
       String entradaTeclado="";
       Scanner entradaEscaner=new Scanner(System.in);
       entradaTeclado = entradaEscaner.nextLine();
       System.out.println( ( entradaTeclado ));
       System.out.println(empleado1.nombre+" | "+
                          empleado1.horasTrabajadas+" | "+
                          empleado1.costoHoras+" | "+
                          empleado1.yearincome+" | ");
       var empleado2 = new Empleado();
       empleado2.nombre= "Gabriela";
       empleado2.horasTrabajadas= 100;
       empleado2.costoHoras= (9);
       empleado2.yearincome= 2010;
       System.out.println(empleado2.nombre+" | "+
                          empleado2.horasTrabajadas+" | "+
                          empleado2.costoHoras+" | "+
                          empleado2.yearincome+" | ");
System.out.println("Usted a trabajado desde "+ empleado1.yearincome+ " por lo tanto su salirio es: "+ empleado1.calcularIngresos());
       
    }
    
}
