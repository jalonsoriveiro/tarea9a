/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9a.interfaz;


import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import tarea9a.Clientes;
import static tarea9a.Clientes.addCliente;      

/**
 *
 * @author jose
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        
        // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"ID","Nombre","Apellido","Edad","DNI","Telefono","Email"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
    
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);
        
        // create JTextFields
        JTextField textId = new JTextField("ID");
        JTextField textFname = new JTextField("Nombre");
        JTextField textLname = new JTextField("Apellidos");
        JTextField textAge = new JTextField("Edad");
        JTextField textDni = new JTextField("DNI");
        JTextField textTelefon = new JTextField("Telefono");
        JTextField textEmail= new JTextField("Email");
                
        
        
		        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");     
        JButton btnRefres = new JButton("Refrescar");
        
        textId.setBounds(500, 10, 100, 25);
        textFname.setBounds(100, 10, 100, 25);
        textLname.setBounds(100, 40, 100, 25);
        textAge.setBounds(100,70,100, 25);
        textDni.setBounds(100,100, 100, 25);
        textTelefon.setBounds(400, 10, 100, 25);
        textEmail.setBounds(400, 40, 100, 25);


        btnAdd.setBounds(750, 20, 100, 25);
        btnUpdate.setBounds(750, 50, 100, 25); 
        btnDelete.setBounds(750, 80, 100, 25);
        btnRefres.setBounds(750, 110, 100, 25);
        textId.setEditable(false);
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(10, 140,850, 500);
        
        frame.setLayout(null);          
        frame.add(pane);
        
        frame.add(textId);
        frame.add(textFname);
        frame.add(textLname);
        frame.add(textAge);
        frame.add(textDni);
        frame.add(textTelefon);
        frame.add(textEmail);
 
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnRefres);
        
        // create an array of objects to set the row data
        Object[] row = new Object[7];
        
        // button add row
            btnRefres.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                  Clientes[] ar_Clientes = new Clientes[3];      
                    row[1] = textFname.getText();
                    row[2] = textLname.getText();                    
                    row[3] = textAge.getText();                    
                    row[4] = textDni.getText();
                    row[5] = textTelefon.getText();
                    row[6] = textEmail.getText();
                    
                    ar_Clientes[0]= new Clientes(textFname.getText(),textFname.getText(),textFname.getText(),textFname.getText(),textFname.getText());
                   addCliente(ar_Clientes);
                    // add row to the model                    
                    model.addRow(row);    
                
              
            }            
        });                                  
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Clientes[] ar_Clientes = new Clientes[3];      
                    row[1] = textFname.getText();
                    row[2] = textLname.getText();                    
                    row[3] = textAge.getText();                    
                    row[4] = textDni.getText();
                    row[5] = textTelefon.getText();
                    row[6] = textEmail.getText();
                    
                    ar_Clientes[0]= new Clientes(textFname.getText(),textFname.getText(),textFname.getText(),textFname.getText(),textFname.getText());
                   addCliente(ar_Clientes);
                    // add row to the model                    
                    model.addRow(row);    
                         
            }            
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              

            }
        });
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
    
                    int i = table.getSelectedRow();                
                textId.setText(model.getValueAt(i, 0).toString());
                textFname.setText(model.getValueAt(i, 1).toString());
                textLname.setText(model.getValueAt(i, 2).toString());
                textAge.setText(model.getValueAt(i, 3).toString());
                textDni.setText(model.getValueAt(i, 4).toString());
                textTelefon.setText(model.getValueAt(i, 5).toString()); 
                textEmail.setText(model.getValueAt(i, 6).toString());
                   
                   
                                         
            
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {             
              
            }
        });        
        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
}       

    