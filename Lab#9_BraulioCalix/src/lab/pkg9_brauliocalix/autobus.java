/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_brauliocalix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class autobus {
    private String id;
    private String placa;
    private String Color;
    private double velocidad;
    private ArrayList<estudiantes> estud= new ArrayList();

    public autobus(String id, String placa, String Color, double velocidad) {
        this.id = id;
        this.placa = placa;
        this.Color = Color;
        this.velocidad = velocidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<estudiantes> getEstud() {
        return estud;
    }

    public void setEstud(ArrayList<estudiantes> estud) {
        this.estud = estud;
    }

    @Override
    public String toString() {
        return " id: "+id + " placa: " + placa ;
    }

}
