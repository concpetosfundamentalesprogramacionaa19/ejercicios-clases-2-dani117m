/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Miejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // este método es el principal de mi proyecto
        // No olvidar el imgrese de valores
        
        String nombre;
        String apellido;
        String ciudad;
        int edad;
        int nota1;
        int nota2;
        int promedio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresar sus nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingresar sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingresar su edad");
        edad = entrada.nextInt();
        entrada.nextLine();//limpieza de buffer de entrada de datos
        
        System.out.println("Por favor ingrese su Pais");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese la nota 1");
        nota1 = entrada.nextInt();
        entrada.nextLine();//lipeza
        System.out.println("Ingrese la nota 2");
        nota2 = entrada.nextInt();
        
        promedio = (nota1+nota2)/2;
        
        System.out.println("Su nombre y apedillos: "+nombre
                +" "+apellido+"\nEdad: "+edad+"\nPais: "+ciudad
                +"\nSu notas: "+nota1+","+nota2+"\nPromedio es: "+promedio); 
        /**
        System.out.printf("Su nombre y apellido es %s%s,\nedad %s"
                ,"\nCiudad %s \nSus notas fueron de %s \nSu promedio fue %s"
                ,nombre,apellido,edad,ciudad,nota1,nota2,promedio);
        Necesito una sugerencia en que sale mal aquie no me mostraba los valores ingresados solo las "%s"
        */
    }
    
}

