/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_brauliocalix;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Guiprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Guiprincipal
     */
    public Guiprincipal() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear_bus = new javax.swing.JDialog();
        bus_id = new javax.swing.JTextField();
        bus_placa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonBus = new javax.swing.JButton();
        bus_color = new javax.swing.JTextField();
        bus_volo = new javax.swing.JSpinner();
        crear_estudiante = new javax.swing.JDialog();
        alum_nombre = new javax.swing.JTextField();
        alum_edad = new javax.swing.JSpinner();
        alum_cuenta = new javax.swing.JTextField();
        alum_parada = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        alum_crea = new javax.swing.JButton();
        crear_parada = new javax.swing.JDialog();
        parada_nom = new javax.swing.JTextField();
        parada_dis = new javax.swing.JSpinner();
        parada_angulo = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        creacion = new javax.swing.JButton();
        simulacion = new javax.swing.JDialog();
        jProgressBar1 = new javax.swing.JProgressBar();
        inicio = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        agregalumno = new javax.swing.JDialog();
        enelbus = new javax.swing.JComboBox<>();
        agregabus = new javax.swing.JButton();
        alumo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        creabus = new javax.swing.JButton();
        alumnos = new javax.swing.JButton();
        Alumnos_dispo1 = new javax.swing.JLabel();
        combo_bus = new javax.swing.JComboBox<>();
        crearparada = new javax.swing.JButton();

        jLabel1.setText("ID");

        jLabel2.setText("PLACA");

        jLabel3.setText("COLOR");

        jLabel4.setText("VELOCIDAD");

        BotonBus.setText("crear");
        BotonBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBusMouseClicked(evt);
            }
        });

        bus_volo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout crear_busLayout = new javax.swing.GroupLayout(crear_bus.getContentPane());
        crear_bus.getContentPane().setLayout(crear_busLayout);
        crear_busLayout.setHorizontalGroup(
            crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_busLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bus_id)
                    .addComponent(bus_placa)
                    .addComponent(bus_color)
                    .addComponent(bus_volo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addGap(82, 82, 82)
                .addGroup(crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_busLayout.createSequentialGroup()
                        .addGroup(crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(crear_busLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(BotonBus)
                        .addGap(48, 48, 48))))
        );
        crear_busLayout.setVerticalGroup(
            crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_busLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bus_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bus_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bus_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BotonBus)
                    .addComponent(bus_volo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel5.setText("nombre");

        jLabel6.setText("parada");

        jLabel7.setText("edad");

        jLabel8.setText("cuenta");

        alum_crea.setText("crear esudidante");
        alum_crea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alum_creaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crear_estudianteLayout = new javax.swing.GroupLayout(crear_estudiante.getContentPane());
        crear_estudiante.getContentPane().setLayout(crear_estudianteLayout);
        crear_estudianteLayout.setHorizontalGroup(
            crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crear_estudianteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crear_estudianteLayout.createSequentialGroup()
                        .addComponent(alum_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(crear_estudianteLayout.createSequentialGroup()
                            .addComponent(alum_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGroup(crear_estudianteLayout.createSequentialGroup()
                            .addComponent(alum_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alum_crea)
                    .addGroup(crear_estudianteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alum_parada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        crear_estudianteLayout.setVerticalGroup(
            crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_estudianteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alum_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alum_parada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(67, 67, 67)
                .addGroup(crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alum_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(55, 55, 55)
                .addGroup(crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alum_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alum_crea)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        parada_angulo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 360, 1));

        jLabel9.setText("angulo");

        jLabel10.setText("distancia");

        jLabel11.setText("nombre");

        creacion.setText("crear parada");
        creacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crear_paradaLayout = new javax.swing.GroupLayout(crear_parada.getContentPane());
        crear_parada.getContentPane().setLayout(crear_paradaLayout);
        crear_paradaLayout.setHorizontalGroup(
            crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_paradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(parada_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parada_dis, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(parada_nom))
                .addGap(30, 30, 30)
                .addGroup(crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_paradaLayout.createSequentialGroup()
                        .addGroup(crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(crear_paradaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(68, 203, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crear_paradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(creacion)
                .addGap(34, 34, 34))
        );
        crear_paradaLayout.setVerticalGroup(
            crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_paradaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parada_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(64, 64, 64)
                .addGroup(crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parada_dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addComponent(creacion)
                .addGap(6, 6, 6)
                .addGroup(crear_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parada_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        inicio.setText("jLabel12");

        destino.setText("jLabel13");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "parada", "tiempo", "estudiantes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("iniciar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("agregar alumno al bus");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout simulacionLayout = new javax.swing.GroupLayout(simulacion.getContentPane());
        simulacion.getContentPane().setLayout(simulacionLayout);
        simulacionLayout.setHorizontalGroup(
            simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simulacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(inicio))
                .addGroup(simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simulacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destino)
                        .addGap(132, 132, 132))
                    .addGroup(simulacionLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(63, 63, 63))))
        );
        simulacionLayout.setVerticalGroup(
            simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simulacionLayout.createSequentialGroup()
                .addGroup(simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(simulacionLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(simulacionLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inicio)
                            .addComponent(destino))))
                .addGroup(simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(simulacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(simulacionLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(72, Short.MAX_VALUE))
                            .addGroup(simulacionLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(122, 122, 122))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simulacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(128, 128, 128))))
        );

        enelbus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        agregabus.setText("agregar alumno");
        agregabus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregabusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout agregalumnoLayout = new javax.swing.GroupLayout(agregalumno.getContentPane());
        agregalumno.getContentPane().setLayout(agregalumnoLayout);
        agregalumnoLayout.setHorizontalGroup(
            agregalumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregalumnoLayout.createSequentialGroup()
                .addGroup(agregalumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregalumnoLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(enelbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(agregalumnoLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(agregabus)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        agregalumnoLayout.setVerticalGroup(
            agregalumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregalumnoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(enelbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(agregabus)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("simulacion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        creabus.setText("crear buses");
        creabus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creabusMouseClicked(evt);
            }
        });

        alumnos.setText("crear alumnos");
        alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alumnosMouseClicked(evt);
            }
        });

        Alumnos_dispo1.setText("seleccione un bus antes de la simulacion");

        crearparada.setText("crear parada");
        crearparada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearparadaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Alumnos_dispo1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(alumo)
                        .addGap(46, 46, 46))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crearparada)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(creabus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(combo_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(alumnos)
                .addGap(52, 52, 52)
                .addComponent(crearparada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(creabus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Alumnos_dispo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(alumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alumnosMouseClicked
        // TODO add your handling code here:
        if (para.size() == 0) {
            JOptionPane.showMessageDialog(this, "no se puede ingresar sin crear paradas antes");
        } else {
            crear_estudiante.setModal(true);
            crear_estudiante.pack();
            crear_estudiante.setVisible(true);
        }
    }//GEN-LAST:event_alumnosMouseClicked

    private void creabusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creabusMouseClicked
        crear_bus.setModal(true);
        crear_bus.pack();
        crear_bus.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_creabusMouseClicked

    private void BotonBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBusMouseClicked
        // TODO add your handling code here:
        String id = bus_id.getText();
        bus_id.setText("");
        String placa = bus_placa.getText();
        bus_placa.setText("");
        String color = bus_color.getText();
        bus_color.setText("");
        Integer velo;
        velo = (Integer) bus_volo.getValue();
        double eldoub = velo.doubleValue();
        //velo=Math.toRadians(velo);
        try {
            bus.add(new autobus(id, placa, color, eldoub));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(crear_bus, "hubo un problema al crear el bus");
        }
        JOptionPane.showMessageDialog(crear_bus, "se creo de dorma correcta");
        crear_bus.dispose();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(bus.toArray());
        combo_bus.setModel(modelo);
    }//GEN-LAST:event_BotonBusMouseClicked

    private void alum_creaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alum_creaMouseClicked
        // TODO add your handling code here:
        String nombre = alum_nombre.getText();
        int edad = (int) alum_edad.getValue();
        String n_cuenta = alum_cuenta.getText();
        estu.add(new estudiantes(nombre, edad, edad, para.get(alum_parada.getSelectedIndex())));
        alum_nombre.setText("");
        alum_cuenta.setText("");
        alumo.setText("hay " + estu.size() + " alumnos");
        crear_estudiante.dispose();
    }//GEN-LAST:event_alum_creaMouseClicked

    private void creacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creacionMouseClicked
        // TODO add your handling code here:
        String nom = parada_nom.getText();
        double distancia = (double) parada_dis.getValue();
        double angulo = (double) parada_angulo.getValue();
        double angulorad = Math.toRadians(angulo);
        double x = distancia * Math.cos(angulorad);
        double y = distancia * Math.sin(angulorad);
        para.add(new parada(nom, distancia, angulo, x, y));
        crear_parada.dispose();
    }//GEN-LAST:event_creacionMouseClicked

    private void crearparadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearparadaMouseClicked
        crear_parada.setModal(true);
        crear_parada.pack();
        crear_parada.setVisible(true);
    }//GEN-LAST:event_crearparadaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (estu.size() == 0) {
            JOptionPane.showMessageDialog(this, "se deben crear alumnos para que el bus salga");
        }
        if (bus.size() == 0) {
            JOptionPane.showMessageDialog(this, "no se han creado buses para la simulacion");
        } else {
            if (combo_bus.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "no se ha seleccionado ningun bus");
            } else {
                int posicion = combo_bus.getSelectedIndex();
                JOptionPane.showMessageDialog(this, "el bus de placa: " + bus.get(posicion).getPlaca() + "va a salir con todos los alumnos");
                seleccionado = bus.get(posicion);
            }

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(estu.toArray());
        enelbus.setModel(modelo);
        agregalumno.setModal(true);
        agregalumno.pack();
        agregalumno.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void agregabusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregabusMouseClicked
        // TODO add your handling code here:

        int posicion = enelbus.getSelectedIndex();
        temp.add(estu.get(posicion));
        estu.remove(posicion);
        JOptionPane.showMessageDialog(simulacion, "se agrego de forma correcta");
        agregalumno.dispose();

    }//GEN-LAST:event_agregabusMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if (temp.size()>0) {
            JOptionPane.showMessageDialog(simulacion, "la simulacion empezara");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Guiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guiprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guiprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alumnos_dispo1;
    private javax.swing.JButton BotonBus;
    private javax.swing.JButton agregabus;
    private javax.swing.JDialog agregalumno;
    private javax.swing.JButton alum_crea;
    private javax.swing.JTextField alum_cuenta;
    private javax.swing.JSpinner alum_edad;
    private javax.swing.JTextField alum_nombre;
    private javax.swing.JComboBox<String> alum_parada;
    private javax.swing.JButton alumnos;
    private javax.swing.JLabel alumo;
    private javax.swing.JTextField bus_color;
    private javax.swing.JTextField bus_id;
    private javax.swing.JTextField bus_placa;
    private javax.swing.JSpinner bus_volo;
    private javax.swing.JComboBox<String> combo_bus;
    private javax.swing.JButton creabus;
    private javax.swing.JButton creacion;
    private javax.swing.JDialog crear_bus;
    private javax.swing.JDialog crear_estudiante;
    private javax.swing.JDialog crear_parada;
    private javax.swing.JButton crearparada;
    private javax.swing.JLabel destino;
    private javax.swing.JComboBox<String> enelbus;
    private javax.swing.JLabel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner parada_angulo;
    private javax.swing.JSpinner parada_dis;
    private javax.swing.JTextField parada_nom;
    private javax.swing.JDialog simulacion;
    // End of variables declaration//GEN-END:variables
    ArrayList<autobus> bus = new ArrayList();
    ArrayList<estudiantes> estu = new ArrayList();
    ArrayList<estudiantes> paracombo = estu;
    ArrayList<parada> para = new ArrayList<>();
    //calcular tiempo entre las paradas
    ArrayList<estudiantes> temp = new ArrayList<>();
    autobus seleccionado;
}