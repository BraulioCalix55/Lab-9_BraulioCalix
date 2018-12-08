/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_brauliocalix;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Hilo extends Thread {
    
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private ArrayList<estudiantes> est = new ArrayList<>();
    private autobus bus = new autobus();
    private JLabel inicio = new JLabel();
    private JLabel destino = new JLabel();
    private JTable tabla = new JTable();
    
    public Hilo(JProgressBar barra) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
    }
    
    public JTable getTabla() {
        return tabla;
    }
    
    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
    
    public JLabel getInicio() {
        return inicio;
    }
    
    public void setInicio(JLabel inicio) {
        this.inicio = inicio;
    }
    
    public JLabel getDestino() {
        return destino;
    }
    
    public void setDestino(JLabel destino) {
        this.destino = destino;
    }
    
    public autobus getBus() {
        return bus;
    }
    
    public void setBus(autobus bus) {
        this.bus = bus;
    }
    
    public ArrayList<estudiantes> getEst() {
        return est;
    }
    
    public void setEst(ArrayList<estudiantes> est) {
        this.est = est;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }
    
    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    public boolean isAvanzar() {
        return avanzar;
    }
    
    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    public boolean isVive() {
        return vive;
    }
    
    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        ArrayList<parada> para = new ArrayList<>();
        int primero = 0;
        double distancia = 9999;
        String dest = "";
        double tiempo = 0;
        parada selec = new parada();
        if (primero == 0) {
            
            for (int i = 0; i < est.size(); i++) {
                if (para.contains(est.get(i).getParad())) {
                    
                } else {
                    para.add(est.get(i).getParad());
                }
                if (est.get(i).getParad().getDistancia() < distancia) {
                    distancia = est.get(i).getParad().getDistancia();
                    selec = est.get(i).getParad();
                    dest = est.get(i).getParad().getNombre();
                }
            }
            
            primero = 2;
            
        }
        
        tiempo = distancia / bus.getVelocidad();
        System.out.println("tiempo " + tiempo);
        
        inicio.setText("unitec");
        destino.setText(dest);
        System.out.println("antes de while");
        distancia = 9999;
        while (vive) {
            if (avanzar) {
                
                System.out.println("valor " + barra.getValue());
                if (barra.getValue() == barra.getMaximum()) {
                    barra.setValue(0);
                    
                    para.remove(selec);
                    for (int i = 0; i < para.size(); i++) {
                        if (est.get(i).getParad().getDistancia() < distancia) {
                            distancia = est.get(i).getParad().getDistancia();
                            selec = est.get(i).getParad();
                            inicio.setText(dest);
                            dest = est.get(i).getParad().getNombre();
                            tiempo = distancia / bus.getVelocidad();
                            int tiem = (int) tiempo;
                            barra.setMaximum(tiem);
                            destino.setText(dest);
                        }
                    }
                    
                }
                tabla.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "parada", "tiempo", "estudiante",}
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
                    };
                    
                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }
                });
                for (estudiantes t : est) {
                    if (t.getParad().getNombre().equals(selec.getNombre())) {
                        Object row[] = {selec.getNombre(), t.getNombre(), tiempo};
                        DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                        m.addRow(row);
                        tabla.setModel(m);
                    }
                    
                }
                barra.setValue(barra.getValue() + 1);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
    
}
