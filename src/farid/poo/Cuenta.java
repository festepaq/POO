/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farid.poo;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class Cuenta {
    
String dueño ;
float clave, numero, saldo;

public Cuenta(String d, float c, float n, float s){
  this.clave= c;
  this.dueño=d;
  this.numero= n;
  this.saldo =s;
    
}

public void retirar(float dinero){

    this.saldo= this.saldo - dinero;     
}
public void consignar(float di){
  this.saldo= this.saldo + di;   
}
public void cambio(){
    Scanner lector= new Scanner(System.in);
  
  System.out.println("Ingrese nueva clave");
    this.clave= lector.nextInt();
}
public void consulta(){
  System.out.println(this.saldo);
}
          
}
