package escuela;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ventana extends javax.swing.JFrame {
    
    // campos de clase para referenciar la conexion a la BD
    private String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    private String user = "root";
    private String pass = "admin";
    // conexion de la bd funcionando
    //private Connection conexion;
    // campos para ejecutar las consultas a la BD
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Ventana() {
        initComponents();
        this.setTitle("CRUD Escuela");
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        txt_clave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        txt_clave2 = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        options_genero = new javax.swing.JComboBox<>();
        btn_insertar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_domicilio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Clave:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Domicilio:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Género:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Email:");

        options_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Actualizar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Id:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_domicilio))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nombre))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(txt_clave)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_clave2))))
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fecha))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_celular))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(options_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email)
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_clave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(options_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_insertar))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_eliminar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Funcion para buscar una persona dentro de la BD al pulsar el boton buscar
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Connection conexion = getConnection();
        String clave = txt_clave.getText();
        String query = "SELECT * FROM persona WHERE clave='"+clave+"'";
        
        try{
            ps = conexion.prepareCall(query);
            rs = ps.executeQuery();
            
            if(rs.next()){
                txt_id.setText(rs.getString("idPersona"));
                txt_clave2.setText(clave);
                txt_nombre.setText(rs.getString("nombre"));
                txt_domicilio.setText(rs.getString("domicilio"));
                txt_celular.setText(rs.getString("celular"));
                txt_email.setText(rs.getString("email"));
                txt_fecha.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                
                if(rs.getString("genero").equals("Masculino")){
                    //options_genero.getItemAt(1);
                    options_genero.setSelectedIndex(1);
                }else{
                    options_genero.setSelectedIndex(2);
                }
                
                txt_clave.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "La clave ingresada no existe");
                txt_clave.setText("");
            }   
        }
        catch(Exception ex){
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
    
    // limpiamos los campos o el formulario con el boton limpiar
    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_id.setText("");
        txt_clave2.setText("");
        txt_nombre.setText("");
        txt_domicilio.setText("");
        txt_celular.setText("");
        txt_email.setText("");
        txt_fecha.setText("");
        options_genero.setSelectedIndex(0);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    // metodo para insertar nuevos alumnos en la BD
    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        Connection conexion = null;
        
        if(txt_clave2.getText().equals("") || txt_nombre.getText().equals("") || txt_domicilio.getText().equals("")
                || txt_celular.getText().equals("") || txt_email.getText().equals("") || txt_fecha.getText().equals("")
                || options_genero.getSelectedItem().equals(0)){
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos");
        }
        else{
            String clave = txt_clave2.getText();
            String nombre = txt_nombre.getText();
            String domicilio = txt_domicilio.getText();
            String celular = txt_celular.getText();
            String email = txt_email.getText();
            String fecha = txt_fecha.getText();
            String genero = (String) options_genero.getSelectedItem();
            String query = "INSERT INTO persona (clave,nombre,domicilio,celular,email,fecha_nacimiento,genero) VALUES('"+clave+
                    "','"+nombre+"','"+domicilio+"','"+celular+"','"+email+"','"+Date.valueOf(fecha)+"','"+genero+"');";
            try{
                conexion = getConnection();
                ps = conexion.prepareStatement(query);
                int result = ps.executeUpdate();

                if(result > 0){
                    JOptionPane.showMessageDialog(null, "Se ha registrado correctamente");
                    txt_clave2.setText("");
                    txt_nombre.setText("");
                    txt_domicilio.setText("");
                    txt_celular.setText("");
                    txt_email.setText("");
                    txt_fecha.setText("");
                    options_genero.setSelectedIndex(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo registrar");
                }

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "No se pudo insertar en la BD");
                System.err.println("Error: "+ex);
            }
            //System.out.println(clave+ nombre + domicilio + celular + email + fecha+ genero);
        }
    }//GEN-LAST:event_btn_insertarActionPerformed

    // meotdo para eliminar un registro de la BD
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Connection conexion = null;
        String id;
        try{
            conexion = getConnection();
            if(txt_id.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingresa una clave");
            }
            else{
                int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer eliminar este registro?");
                
                if(resp == 0){
                   id = txt_id.getText();
                    ps = conexion.prepareStatement("DELETE FROM persona WHERE idPersona='"+id+"'");
                    int result = ps.executeUpdate();
                    if(result > 0){
                        JOptionPane.showMessageDialog(null, "Registro eliminado");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El registro no ha podido ser eliminado");
                    } 
                }
            }
        }catch(Exception ex){
            System.err.println("Error: "+ex);
        }
        
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    // metodo para actualizar un regostro de la BD
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        Connection conexion = null;
        
        if(txt_clave2.getText().equals("") || txt_nombre.getText().equals("") || txt_domicilio.getText().equals("")
                || txt_celular.getText().equals("") || txt_email.getText().equals("") || txt_fecha.getText().equals("")
                || options_genero.getSelectedItem().equals(0)){
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos");
        }
        else{
            String id = txt_id.getText();
            String clave = txt_clave2.getText();
            String nombre = txt_nombre.getText();
            String domicilio = txt_domicilio.getText();
            String celular = txt_celular.getText();
            String email = txt_email.getText();
            String fecha = txt_fecha.getText();
            String genero = (String) options_genero.getSelectedItem();
            String query = "UPDATE persona SET clave='"+clave+"', nombre='"+nombre+"',domicilio='"+domicilio
                    +"',celular='"+celular+"', email='"+email+"',fecha_nacimiento='"+Date.valueOf(fecha)+"',genero='"+genero+"' "
                    + "WHERE idPersona='"+id+"'"; 
            try{
                conexion = getConnection();
                ps = conexion.prepareStatement(query);
                int result = ps.executeUpdate();

                if(result > 0){
                    JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente");
                    txt_clave2.setText("");
                    txt_nombre.setText("");
                    txt_domicilio.setText("");
                    txt_celular.setText("");
                    txt_email.setText("");
                    txt_fecha.setText("");
                    options_genero.setSelectedIndex(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar");
                }

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "No se pudo actualizar en la BD");
                System.err.println("Error: "+ex);
            }
        }
    }//GEN-LAST:event_btn_modificarActionPerformed
    
    // creamos la conexion oon la BD
    private Connection getConnection(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, user, pass);
            //System.out.println("BD conectada");
        }catch(Exception ex){
            System.err.println("Error: "+ex); 
        }
        return conexion;
    }
    
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> options_genero;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_clave2;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
