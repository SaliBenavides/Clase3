/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;
import java.util.*;

/**
 *
 * @author Sali
 * @version 1
 * @since 08/08/2017
 * Ejercicio aplicación funciones arreglos
 */
public class Clase3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner flujoEntrada = new Scanner (System.in);
        //Declaración de variables
        String nombre = null;//Como string es objeto se suele inicializar en null
        int numeroHoras = 0;
        double valorHora = 0;
        double totalSalario = 0;
        
        System.out.println("Nombre: ");
        nombre = flujoEntrada.next();
        
        System.out.println("Horas: ");
        numeroHoras = flujoEntrada.nextInt();
        
        System.out.println("Valor: ");
        valorHora = flujoEntrada.nextDouble();
        
        totalSalario = calcularSalario(numeroHoras,valorHora);
        System.out.println("Nombre: "+nombre+". Salario: "+totalSalario);
    }
    
    /**
     * Función que permite calcular el salario de un trabajador
     * basado en el número de horas y valor de la hora.
     * @param horas cantidad de horas trabajadas semanalmente
     * @param valor Número double que indica el valor de la hora
     * @return Número double que indica el valor total a pagar
     */
    public static double calcularSalario (int horas, double valor){
        double totalSalario = 0;
        int horasExtra = 0;
        if(horas > 40){
            horasExtra = horas - 40;
            if(horasExtra <= 8){
                totalSalario = 40*valor + horasExtra*2*valor;
            }
            else if (horasExtra > 8){
                totalSalario = 40*valor + 16*valor + (horasExtra-8)*3*valor;
            }
        }
        else{
            totalSalario = horas*valor;
        }
        
        return totalSalario;
    }      
        
    
}
