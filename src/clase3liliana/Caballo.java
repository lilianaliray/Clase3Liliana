/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3liliana;

/**
 *
 * @author LAB04
 */
public class Caballo 

{
    String altura;
    String color;
    String peso;
    String raza;
    int patas=4, edad;
    
    //Etodo constructor
    public Caballo(String nuevoNombre)
    {
        
     raza=nuevoNombre;
     
    }
    //Metodos get de la clase
    public void relinchar()
    {
        
    }
    //Metodo para obtener raza del caballo
    public String obtenerRaza()
    {
        //Sentencias obligatoria de retorno
        return raza;
    }
    
        //Sentencias obligatoria de retorno
    public int obtenerEdad()
    {
      return edad; 
      
    }       
}
