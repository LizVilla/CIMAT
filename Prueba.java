    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author lizvi
 */
class Empleado11
{
  // Datos de la clase
     protected String nombreEmp;
     protected String deptoEmp;
     protected String puestoEmp;

  // Metodos de entrada de datos -setters-

     public void establecerNombreEmp(String nom)
     {
        nombreEmp = nom;    
     }

     public void establecerDeptoEmp(String dep)
     {
        deptoEmp = dep;    
     }

     public void establecerPuestoEmp(String pue)
     {
        puestoEmp = pue;    
     }
 
  // Metodos de acceso a los datos -getters-

     public String obtenerNombreEmp()
     {
        return nombreEmp;
     }

     public String obtenerDeptoEmp()
     {
        return deptoEmp;
     }

     public String obtenerPuestoEmp()
     {
        return puestoEmp;
     }
}
