/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6p2_josueham;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author skxka
 */
public class Principal extends javax.swing.JFrame {

    administrarUsuarios ap = new administrarUsuarios("./usuarios.txt");

    public Principal() throws IOException {
        initComponents();
        ap.cargarArchivo();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DiaRegistrarse = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_pass = new javax.swing.JLabel();
        rbt_artista = new javax.swing.JRadioButton();
        rbtn_cliente = new javax.swing.JRadioButton();
        lb_tipo = new javax.swing.JLabel();
        BtnIr = new javax.swing.JButton();
        lb_nomArt = new javax.swing.JLabel();
        FieldNomArtista = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        FieldContra = new javax.swing.JTextField();
        lb_crearUsuario = new javax.swing.JLabel();
        lb_Username = new javax.swing.JLabel();
        FieldUsername = new javax.swing.JTextField();
        lb_Edad = new javax.swing.JLabel();
        SpinnerEdad = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        btnGroup_tipoUsuario = new javax.swing.ButtonGroup();
        DiaArtistas = new javax.swing.JDialog();
        BtnCrearCancion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DiaSignIn = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        lb_iniciosesion = new javax.swing.JLabel();
        lb_userLogIn = new javax.swing.JLabel();
        FieldUserLogIn = new javax.swing.JTextField();
        lb_passwordLogIn = new javax.swing.JLabel();
        BtnTurn = new javax.swing.JButton();
        BtnIngresar = new javax.swing.JButton();
        FieldContraLogIn = new javax.swing.JTextField();
        DiaCrearCanciones = new javax.swing.JDialog();
        panelCanciones = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FieldDuracion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lb_tituloSong = new javax.swing.JLabel();
        FieldTituloSong = new javax.swing.JTextField();
        PanelLogIn = new javax.swing.JPanel();
        BtnRegistrarse = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnSignIn = new javax.swing.JButton();
        lb_Spotify = new javax.swing.JLabel();
        lb_imagen = new javax.swing.JLabel();

        DiaRegistrarse.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));

        lb_pass.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_pass.setForeground(new java.awt.Color(255, 255, 255));
        lb_pass.setText("Contraseña");

        btnGroup_tipoUsuario.add(rbt_artista);
        rbt_artista.setText("Artista");

        btnGroup_tipoUsuario.add(rbtn_cliente);
        rbtn_cliente.setText("Cliente");

        lb_tipo.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_tipo.setForeground(new java.awt.Color(255, 255, 255));
        lb_tipo.setText("Tipo de Usuario");

        BtnIr.setText("->");
        BtnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIrActionPerformed(evt);
            }
        });

        lb_nomArt.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_nomArt.setForeground(new java.awt.Color(255, 255, 255));
        lb_nomArt.setText("Nombre Artistico");

        BtnGuardar.setText("Guardar Usuario");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnIr)
                .addGap(192, 192, 192))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_pass)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(FieldNomArtista, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_nomArt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(FieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbt_artista)
                        .addGap(18, 18, 18)
                        .addComponent(rbtn_cliente))
                    .addComponent(lb_tipo))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbt_artista)
                        .addComponent(rbtn_cliente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_pass)
                            .addComponent(lb_tipo))
                        .addGap(18, 18, 18)
                        .addComponent(FieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BtnIr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_nomArt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldNomArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lb_crearUsuario.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_crearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_crearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6p2_josueham/Lagarto.png"))); // NOI18N
        lb_crearUsuario.setText("Crear Usuario");

        lb_Username.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_Username.setForeground(new java.awt.Color(255, 255, 255));
        lb_Username.setText("Username");

        lb_Edad.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        lb_Edad.setForeground(new java.awt.Color(255, 255, 255));
        lb_Edad.setText("Edad");

        SpinnerEdad.setModel(new javax.swing.SpinnerNumberModel(12, 12, 100, 1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6p2_josueham/turn-back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_Username)
                    .addComponent(lb_crearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FieldUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Edad)
                            .addComponent(SpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_crearUsuario)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Username)
                    .addComponent(lb_Edad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SpinnerEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(FieldUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DiaRegistrarse.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        DiaArtistas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCrearCancion.setText("Crear Cancion");
        BtnCrearCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearCancionActionPerformed(evt);
            }
        });
        DiaArtistas.getContentPane().add(BtnCrearCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6p2_josueham/istockphoto-1199243596-170667a.jpg"))); // NOI18N
        DiaArtistas.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        lb_iniciosesion.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_iniciosesion.setForeground(new java.awt.Color(255, 255, 255));
        lb_iniciosesion.setText("Inicio de Sesion");

        lb_userLogIn.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        lb_userLogIn.setForeground(new java.awt.Color(255, 255, 255));
        lb_userLogIn.setText("Username");

        FieldUserLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lb_passwordLogIn.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        lb_passwordLogIn.setForeground(new java.awt.Color(255, 255, 255));
        lb_passwordLogIn.setText("Contraseña");

        BtnTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6p2_josueham/turn-back.png"))); // NOI18N
        BtnTurn.setBorder(null);
        BtnTurn.setOpaque(false);
        BtnTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTurnActionPerformed(evt);
            }
        });

        BtnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnTurn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(BtnIngresar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_passwordLogIn)
                            .addComponent(lb_userLogIn)
                            .addComponent(lb_iniciosesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldUserLogIn)
                            .addComponent(FieldContraLogIn))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BtnTurn)
                .addGap(18, 18, 18)
                .addComponent(lb_iniciosesion)
                .addGap(52, 52, 52)
                .addComponent(lb_userLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldUserLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lb_passwordLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldContraLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnIngresar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DiaSignInLayout = new javax.swing.GroupLayout(DiaSignIn.getContentPane());
        DiaSignIn.getContentPane().setLayout(DiaSignInLayout);
        DiaSignInLayout.setHorizontalGroup(
            DiaSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DiaSignInLayout.setVerticalGroup(
            DiaSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DiaCrearCanciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCanciones.setBackground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel3.setText("Duracion");

        FieldDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDuracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(FieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(FieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6p2_josueham/musica.png"))); // NOI18N
        jLabel2.setText("Crear Canciones");
        jLabel2.setOpaque(true);

        lb_tituloSong.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_tituloSong.setText("Titulo de la cancion");

        javax.swing.GroupLayout panelCancionesLayout = new javax.swing.GroupLayout(panelCanciones);
        panelCanciones.setLayout(panelCancionesLayout);
        panelCancionesLayout.setHorizontalGroup(
            panelCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCancionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_tituloSong)
                    .addComponent(jLabel2)
                    .addComponent(FieldTituloSong, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        panelCancionesLayout.setVerticalGroup(
            panelCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCancionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(lb_tituloSong)
                .addGap(18, 18, 18)
                .addComponent(FieldTituloSong, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DiaCrearCanciones.getContentPane().add(panelCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegistrarse.setBackground(new java.awt.Color(0, 0, 0));
        BtnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrarse.setText("Registrarse");
        BtnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });
        PanelLogIn.add(BtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 190, 90));

        BtnSalir.setBackground(new java.awt.Color(0, 0, 0));
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("Salir");
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        PanelLogIn.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 190, 80));

        BtnSignIn.setBackground(new java.awt.Color(0, 0, 0));
        BtnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        BtnSignIn.setText("Iniciar Sesión");
        BtnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSignInActionPerformed(evt);
            }
        });
        PanelLogIn.add(BtnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 90));

        lb_Spotify.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        lb_Spotify.setForeground(new java.awt.Color(0, 0, 0));
        lb_Spotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6p2_josueham/musical-note.png"))); // NOI18N
        lb_Spotify.setText("Spotify");
        PanelLogIn.add(lb_Spotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lb_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6p2_josueham/871b97868656b633f3332240555e4a85.jpg"))); // NOI18N
        PanelLogIn.add(lb_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        BtnSalir.setForeground(Color.red);
        BtnSalir.setBackground(Color.white);
        JOptionPane.showMessageDialog(this, "Saliendo del programa...");
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed
        abrir_registrarse();
    }//GEN-LAST:event_BtnRegistrarseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DiaRegistrarse.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIrActionPerformed
        if (rbt_artista.isSelected()) {
            lb_nomArt.setVisible(true);
            FieldNomArtista.setVisible(true);
        } else if (rbtn_cliente.isSelected()) {
            lb_nomArt.setVisible(false);
            FieldNomArtista.setVisible(false);
        }
    }//GEN-LAST:event_BtnIrActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        try {
            String username = FieldUsername.getText();
            String password = FieldContra.getText();
            String strEdad = SpinnerEdad.getValue().toString();
            int edad = Integer.parseInt(strEdad);
            String tipo = "";
            if (rbt_artista.isSelected()) {
                tipo = "Artista";
            } else if (rbtn_cliente.isSelected()) {
                tipo = "Cliente";
            }

            Usuario u = new Usuario(edad, username, password, tipo);
            ap.getListaUsuarios().add(u);
            ap.escribirArchivo();
            ap.getListaUsuarios().add(new Usuario(edad, username, password, tipo));
        } catch (Exception e) {
            e.getMessage();
        }

        JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente");
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSignInActionPerformed
        abrir_SignIn();
    }//GEN-LAST:event_BtnSignInActionPerformed

    private void BtnTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTurnActionPerformed
        this.setVisible(true);
        DiaSignIn.setVisible(false);
    }//GEN-LAST:event_BtnTurnActionPerformed

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        String username = FieldContraLogIn.getText();
        String pass = FieldContraLogIn.getText();
        boolean type = false;
        
        for (Usuario  u: ap.getListaUsuarios()) {
            if (u.getUsername().equals(username) || (u.getPassword() == pass)) {
                abrir_artistas();
            }
        }
//        for (int i = 0; i < ap.getListaUsuarios().size(); i++) {
//            if (ap.getListaUsuarios().get(i).getTipo().equals("Artista")) {
//                type = true;
//            } else {
//                type = false;
//            }
//            
//            if (ap.getListaUsuarios().get(i).toString().equals(username)) {
//                if (type == true) {
//                    abrir_artistas();
//                }
//            } else if (type == false){
//                abrir_oyentes();
//                System.out.println("cagada");
//            }
//        }

    }//GEN-LAST:event_BtnIngresarMouseClicked

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnCrearCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearCancionActionPerformed
        abrir_crearSongs();
    }//GEN-LAST:event_BtnCrearCancionActionPerformed

    private void FieldDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDuracionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void abrir_registrarse() {
        this.setVisible(false);
        DiaRegistrarse.pack();
        DiaRegistrarse.setLocationRelativeTo(this);
        FieldNomArtista.setVisible(false);
        lb_nomArt.setVisible(false);
        DiaRegistrarse.setVisible(true);
    }

    public void abrir_SignIn() {
        this.setVisible(false);
        DiaSignIn.pack();
        DiaSignIn.setLocationRelativeTo(this);
        DiaSignIn.setVisible(true);
    }

    public void abrir_artistas() {
        this.setVisible(false);
        DiaArtistas.pack();
        DiaArtistas.setLocationRelativeTo(this);
        DiaArtistas.setVisible(true);
    }
    
    public void abrir_oyentes(){
        this.setVisible(false);
        }
    
    public void abrir_crearSongs(){
       DiaArtistas.setVisible(false);
       DiaCrearCanciones.pack();
       DiaCrearCanciones.setLocationRelativeTo(this);
       DiaCrearCanciones.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearCancion;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnIr;
    private javax.swing.JButton BtnRegistrarse;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSignIn;
    private javax.swing.JButton BtnTurn;
    private javax.swing.JDialog DiaArtistas;
    private javax.swing.JDialog DiaCrearCanciones;
    private javax.swing.JDialog DiaRegistrarse;
    private javax.swing.JDialog DiaSignIn;
    private javax.swing.JTextField FieldContra;
    private javax.swing.JTextField FieldContraLogIn;
    private javax.swing.JTextField FieldDuracion;
    private javax.swing.JTextField FieldNomArtista;
    private javax.swing.JTextField FieldTituloSong;
    private javax.swing.JTextField FieldUserLogIn;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JPanel PanelLogIn;
    private javax.swing.JSpinner SpinnerEdad;
    private javax.swing.ButtonGroup btnGroup_tipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_Edad;
    private javax.swing.JLabel lb_Spotify;
    private javax.swing.JLabel lb_Username;
    private javax.swing.JLabel lb_crearUsuario;
    private javax.swing.JLabel lb_imagen;
    private javax.swing.JLabel lb_iniciosesion;
    private javax.swing.JLabel lb_nomArt;
    private javax.swing.JLabel lb_pass;
    private javax.swing.JLabel lb_passwordLogIn;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JLabel lb_tituloSong;
    private javax.swing.JLabel lb_userLogIn;
    private javax.swing.JPanel panelCanciones;
    private javax.swing.JRadioButton rbt_artista;
    private javax.swing.JRadioButton rbtn_cliente;
    // End of variables declaration//GEN-END:variables
}
