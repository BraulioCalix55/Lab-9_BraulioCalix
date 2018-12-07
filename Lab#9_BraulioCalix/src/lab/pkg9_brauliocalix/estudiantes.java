/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_brauliocalix;

/**
 *
 * @author User
 */
public class estudiantes {
    private String nombre;
    private int edad;
    private long cuenta;
    private parada parad;

    public estudiantes(String nombre, int edad, long cuenta, parada parad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
        this.parad = parad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public parada getParad() {
        return parad;
    }

    public void setParad(parada parad) {
        this.parad = parad;
    }

    @Override
    public String toString() {
        return "estudiantes{" + "nombre=" + nombre + ", edad=" + edad + ", parad=" + parad + '}';
    }
    
    
}
