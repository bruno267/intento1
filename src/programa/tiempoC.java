/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author Usuario
 */
public class tiempoC extends Empleado {
    public int HtrabajadasS;
    public tiempoC(String id, String nombre, String departamento, double salario, int htrabajadass) {
        super(id, nombre, departamento, salario, 1);
        this.HtrabajadasS=htrabajadass;
    }
    @Override
    public void mostrarD(){
}}
