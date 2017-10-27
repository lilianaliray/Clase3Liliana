/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3liliana;
//import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB04
 */
public class impuestosGUI
{
    
public static void main(String[] args)
  
{ 
  int sueldo;
  
//Scanner escaner = new Scanner(System.in);  
//System.out.println("ingrese su salario:");
sueldo = Integer.parseInt(JOptionPane.showInputDialog("ingrese su salario"));
//sueldo = escaner.nextInt();

    if (sueldo>600000)
    {
      //System.out.println("Debe Pagar Impuestos:");  
        JOptionPane.showMessageDialog(null, "debe pagar impuesto");
    }
 }

}