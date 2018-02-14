/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farid.poo;

/**
 *
 * @author ESTUDIANTE
 */
public class Cancion {
//variables 
public String titulo;
public String autor;

public Cancion(String nombre){
 this.titulo= nombre;   
}

//metodos

public void sonar(){
System.out.println("Está sonando " + this.titulo +" Autor "+ this.autor );

}


}
