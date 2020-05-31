/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9a.Metodos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import tarea9a.Clientes;

/**
 *
 * @author jose
 */
public class Serializando implements Serializable {
    
    
    /*public static void addCliente(Clientes cli){
              
        ObjectOutputStream escribiendo_fichero = null;
        try {
            escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jose\\Desktop\\cliente.dat"));
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            escribiendo_fichero.writeObject(cli);
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
        try {
            escribiendo_fichero.close();
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void getCliente(){
     
        try {
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:\\Users\\jose\\Desktop\\cliente.dat"));            
            Clientes[] array_clientes=(Clientes[]) recuperando_fichero.readObject();            
            recuperando_fichero.close();
            
            for(Clientes e : array_clientes){            
                System.out.println(e);
            
            }
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
 
 
}
