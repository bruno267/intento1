/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author bruno
 */
public class tiempoM extends Empleado {
     public int Dvacaciones;
    public tiempoM(String id, String nombre, String departamento, double salario, int dvacaciones) {
        super(id, nombre, departamento, salario,0);
        this.Dvacaciones= dvacaciones;
    }
    
     @Override
    public void mostrarD(){
    
    }}
