/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tarea9a.Metodos.Serializando;


/**
 *
 * @author jose
 */
public class Clientes implements Serializable {

 String DNI;
 String Nome;
 String  Teléfono;
 String dirección;
 String debeda;

    public Clientes(String DNI, String Nome, String Teléfono, String dirección, String debeda) {
        this.DNI = DNI;
        this.Nome = Nome;
        this.Teléfono = Teléfono;
        this.dirección = dirección;
        this.debeda = debeda;
    }

    @Override
    public String toString() {
        return "Clientes{" + "DNI=" + DNI + ", Nome=" + Nome + ", Tel\u00e9fono=" + Teléfono + ", direcci\u00f3n=" + dirección + ", debeda=" + debeda + '}';
    }

    public String getDNI() {
        return DNI;
    }

    public String getNome() {
        return Nome;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public String getDirección() {
        return dirección;
    }

    public String getDebeda() {
        return debeda;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setDebeda(String debeda) {
        this.debeda = debeda;
    }
    /*Añadir cliente*/
    public static void addCliente( Clientes[] ar_Clientes){
              
        ObjectOutputStream escribiendo_fichero = null;
        try {
            escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jose\\Desktop\\cliente.dat"));
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            escribiendo_fichero.writeObject(ar_Clientes);
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
        try {
            escribiendo_fichero.close();
        } catch (IOException ex) {
            Logger.getLogger(Serializando.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
/*Listar Clientes*/
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
    }
   /*Buscar cliente*/
 public static void buscarCliente(String p_dni) throws IOException, ClassNotFoundException {
            
           
     Clientes[] array_clientes;            
     try (ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:\\Users\\jose\\Desktop\\cliente.dat"))) {
         array_clientes = (Clientes[]) recuperando_fichero.readObject();
     
            
            for(Clientes e : array_clientes){            
                
                if (e.Nome == null ? p_dni == null : e.Nome.equals(p_dni)){
                
                    System.out.println("+"+e.Nome);
                }
            }
                
     }catch(NullPointerException e) {
     		System.out.println("NullPointerException thrown!");
     }         
 }
 /*Borrar Fichero*/
 public static void rmFichero() throws IOException, ClassNotFoundException {
            
           
    File fichero = new File("C:\\Users\\jose\\Desktop\\cliente.dat");
    if (fichero.delete())
       System.out.println("El fichero ha sido borrado satisfactoriamente");
    else
       System.out.println("El fichero no puede ser borrado");
 }
}