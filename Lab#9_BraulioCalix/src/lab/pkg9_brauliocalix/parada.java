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
public class parada {

    private String nombre;
    private double distancia;
    private double angulo;
    private double cordx;
    private double cordy;

    public parada() {
    }

    public parada(String nombre, double distancia, double angulo, double cordx, double cordy) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.angulo = angulo;
        this.cordx = cordx;
        this.cordy = cordy;
    }

    public double getCordx() {
        return cordx;
    }

    public void setCordx(double cordx) {
        this.cordx = cordx;
    }

    public double getCordy() {
        return cordy;
    }

    public void setCordy(double cordy) {
        this.cordy = cordy;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public void setx() {
        this.cordx = distancia * Math.cos(angulo);
    }

    public void sety() {
        this.cordy = distancia * Math.sin(angulo);
    }

    @Override
    public String toString() {
        return nombre ;
    }

}
