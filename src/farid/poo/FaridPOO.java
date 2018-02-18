/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farid.poo;
import java.util.Scanner;



public class FaridPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
   java.util.Scanner teclado=
           new java.util.Scanner(System.in);
 
  
  Cuenta usuario1= new Cuenta("magdalena Sanchez", 1234, 1012, 0);
  Cuenta usuario2= new Cuenta("Joselito Perez",9876,1013,500000);
  
   usuario1.consulta();
   float a= 100000;
   
   usuario1.consignar(a);
    usuario1.consulta();
    
          
    
   usuario2.cambio();
   
  System.out.println(usuario2.clave);
  
   
    }
    
}
