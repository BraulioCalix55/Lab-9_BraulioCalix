/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_brauliocalix;

import javax.swing.JProgressBar;

/**
 *
 * @author User
 */
public class Hilo extends Thread{

    private JProgressBar barra;
    private boolean avance;
    private boolean vive;
    //private ArrayList

    public Hilo(JProgressBar barra) {
        this.barra = barra;
        this.avance = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvance() {
        return avance;
    }

    public void setAvance(boolean avance) {
        this.avance = avance;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (avance) {            
            //barra.setValue();
        }
    }
    

}
