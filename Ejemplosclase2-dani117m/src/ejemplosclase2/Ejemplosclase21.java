/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejemplosclase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // este método es el principal de mi proyecto
        // No olvidar el imgrese de valores
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresar sus nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingresar sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido es: "
                +apellido); 
    }
    
}
